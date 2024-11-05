package rest.iconpln.service.AlihUnit;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import rest.iconpln.db.DatasourceConfiguration;
import rest.iconpln.service.PlsqlServiceAmicon;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Map;

@Service
public class ServiceAlihPoskoKeluhan {
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
    public Map<String, Object> Get_Alih_Posko_Keluhan(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_ALIHPOSKO_KELUHAN", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_Alih_Posko_Keluhan(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("ALIH_POSKO_KELUHAN_V2", map);
    }
    // END POST
}
