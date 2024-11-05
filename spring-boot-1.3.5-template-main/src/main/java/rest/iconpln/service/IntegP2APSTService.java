package rest.iconpln.service;

import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class IntegP2APSTService {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    

    @Autowired
    private DataSource dataSource;
    
    @Autowired
    private ObjectMapper objectMapper;
    
    private JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(this.dataSource);
    }
    
    public Map<String, Object> validasiLogin(Map map) throws SQLException {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(getJdbcTemplate())
                .withCatalogName("PKG_INTEG_P2APST")
                .withFunctionName("validasiLogin");

        Map<String, Object> retValue = simpleJdbcCall.execute(map);
        return retValue;
        
    }
}