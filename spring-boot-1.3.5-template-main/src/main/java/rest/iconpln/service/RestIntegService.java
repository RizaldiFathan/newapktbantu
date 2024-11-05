package rest.iconpln.service;

import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import rest.iconpln.db.DatasourceConfiguration;

@Service
public class RestIntegService {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	   

	@Autowired
    private DatasourceConfiguration dataSourceConfig;
	
    @Autowired
    private DataSource dataSource;
    
    @Autowired
    private ObjectMapper objectMapper;
    
    private JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(this.dataSourceConfig.dataSource());
    }
    
    
    @Autowired
    private PlsqlService plsqlService;
    
    public Map<String, Object> insertDataLogStanAmr(Map map) throws SQLException {
        return (Map) plsqlService.executeFunction("FS_ENTRY_STAN_AMR_V2", map);
    }
    

    public Map<String, Object> getDataAmr(Map map) throws SQLException {
        return (Map) plsqlService.executePackage("PKG_AMICON", "FG_KIRIM_ACMT", map);
    }
//    
//    public Map<String, Object> getDataH1ByTgl(Map map) throws SQLException {
//        return (Map) plsqlService.executePackage("PKG_INTEG_ARENA", "getDataH1ByTgl", map);
//    }
//    
//    public Map<String, Object> setDataH0ByTgl(Map map) throws SQLException {
//        return (Map) plsqlService.executePackage("PKG_INTEG_ARENA", "setDataH0ByTgl", map);
//    }
//    
//    public Map<String, Object> setDataH1ByTgl(Map map) throws SQLException {
//        return (Map) plsqlService.executePackage("PKG_INTEG_ARENA", "setDataH1ByTgl", map);
//    }
}
