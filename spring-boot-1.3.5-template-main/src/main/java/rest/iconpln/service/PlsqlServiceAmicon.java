package rest.iconpln.service;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

import oracle.jdbc.OracleTypes;
import rest.iconpln.db.DaoAmicon;
import rest.iconpln.db.DatasourceConfiguration;

@Component
public class PlsqlServiceAmicon implements DaoAmicon {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Autowired
    private DatasourceConfiguration dataSourceConfig;

    public List<Map<String, Object>> selectedPackage(String _pack, String _func, Map<String, Object> _params) throws SQLException {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(this.dataSourceConfig.dataSource())
                .withCatalogName(_pack)
                .withFunctionName(_func);

        List retValue = simpleJdbcCall.executeFunction(ArrayList.class, _params);
        return retValue;
    }

    public List<Map<String, Object>> selectedFunction(String _schema, String _func, Map<String, Object> _params) throws SQLException {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(this.dataSourceConfig.dataSource())
                .withFunctionName(_func);

        List retValue = simpleJdbcCall.executeFunction(ArrayList.class, _params);
        return retValue;
    }

    public Map<String, Object> executePackage(String _pack, String _func, Map<String, Object> _params) throws SQLException {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(this.dataSourceConfig.dataSource())
                .withCatalogName(_pack)
                .withFunctionName(_func);

        Map<String, Object> retValue = simpleJdbcCall.execute(_params);
        return retValue;
    }

    public Map<String, Object> executePackageWithDeclareParam(String _pack, String _func, Map<String, Object> _parammOutTypes, Map<String, Object> _params) throws SQLException, IOException {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(this.dataSourceConfig.dataSource())
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
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(this.dataSourceConfig.dataSource())
                .withFunctionName(_func);

        
        Map<String, Object> retValue = simpleJdbcCall.execute(_params);
        return retValue;
    }

    public Map<String, Object> executeProc(String _proc, Map<String, Object> _params) throws SQLException {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(this.dataSourceConfig.dataSource())
                .withProcedureName(_proc);
                // .returningResultSet("actors",ParameterizedBeanPropertyRowMapper.newInstance(Actor.class));
        
        Map<String, Object> retValue = simpleJdbcCall.execute(_params);
        return retValue;

        
    }
    
    public String insertLogAmr(String idpel, String blth, Integer status) {
    	this.jdbcTemplate = new JdbcTemplate(this.dataSourceConfig.dataSource());
    //    	System.out.println("insert amicon idpe: "+idpel);
    	String sql = "insert into log_stan_amr (location_code, blth, status) values (?, ?, ?)";
    	this.jdbcTemplate.update(sql, idpel, blth, status);
		return "sukses";
    }
    
    public void updateInteg(String idpel, String blth){
    	this.jdbcTemplate = new JdbcTemplate(this.dataSourceConfig.dataSource());
        String SQL = "update integ_billing_system set send_flag = 'Y', send_date = sysdate where location_code = ? and periode = ? ";
        this.jdbcTemplate.update(SQL, idpel, blth);
        System.out.println("Updated Record with ID = " + idpel + " - " + blth );
        return;
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
