package rest.iconpln.service.AlihUnit;

import com.fasterxml.jackson.databind.ObjectMapper;
import oracle.jdbc.OracleTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import rest.iconpln.db.DatasourceConfiguration;
import rest.iconpln.service.PlsqlServiceAmicon;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ServiceAlihPoskoGangguan {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	   

	@Autowired
    private DatasourceConfiguration dataSourceConfig;
	
    @Autowired
    private DataSource dataSource;
    
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(this.dataSourceConfig.dataSource2());
    }

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // GET
    public Map<String, Object> Get_Alih_Posko_Gangguan(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_ALIHPOSKO_GANGGUAN", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_Alih_Posko_Gangguan(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("ALIH_POSKO_GANGGUAN_V2", map);
    }
    // END POST
}
