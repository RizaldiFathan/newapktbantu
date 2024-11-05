package rest.iconpln.service;

import java.io.IOException;

import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import oracle.jdbc.OracleTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.SqlOutParameter;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;


@Component
public class PlsqlService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> selectedPackage(String _pack, String _func, Map<String, Object> _params) throws SQLException {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withCatalogName(_pack)
                .withFunctionName(_func);

        List retValue = simpleJdbcCall.executeFunction(ArrayList.class, _params);
        return retValue;
    }

    public List<Map<String, Object>> selectedFunction(String _schema, String _func, Map<String, Object> _params) throws SQLException {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withFunctionName(_func);

        List retValue = simpleJdbcCall.executeFunction(ArrayList.class, _params);
        return retValue;
    }

    public Map<String, Object> executePackage(String _pack, String _func, Map<String, Object> _params) throws SQLException {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withCatalogName(_pack)
                .withFunctionName(_func);

        Map<String, Object> retValue = simpleJdbcCall.execute(_params);
        return retValue;
    }

    public Map<String, Object> executePackageWithDeclareParam(String _pack, String _func, Map<String, Object> _parammOutTypes, Map<String, Object> _params) throws SQLException, IOException {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withCatalogName(_pack)
                .withFunctionName(_func)
                .withoutProcedureColumnMetaDataAccess();

        for (Map.Entry<String, Object> entry : _parammOutTypes.entrySet()) {
            try {
                String key = entry.getKey();
                Object value = entry.getValue();
                simpleJdbcCall.addDeclaredParameter(new SqlOutParameter(key, getSqlTypes(value.toString())));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        
        Map<String, Object> retValue = simpleJdbcCall.execute(_params);
        
        return retValue;
    }

    public Map<String, Object> executeFunction(String _func, Map<String, Object> _params) throws SQLException {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withFunctionName(_func);

        Map<String, Object> retValue = simpleJdbcCall.execute(_params);
        
        return retValue;
    }
    
    private int getSqlTypes(String types){
        switch (types) {
            case "CLOB":
                return Types.CLOB;
            case "VARCHAR":
                return Types.VARCHAR;
            case "INTEGER":
                return Types.INTEGER;
            case "CURSOR":
                return OracleTypes.CURSOR;    
            default:
                break;
        }
        
        return Types.VARCHAR;
    }
}
