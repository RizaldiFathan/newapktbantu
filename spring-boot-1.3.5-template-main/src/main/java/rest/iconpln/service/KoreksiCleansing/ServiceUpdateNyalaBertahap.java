package rest.iconpln.service.KoreksiCleansing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceUpdateNyalaBertahap {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> UPDATE_NYALA_BERTAHAP(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_UPDT_NYALA_BERTAHAP", map);
    }

    // END GET
    // POST
    public Map<String, Object> POST_UPDATE_NYALA_BERTAHAP(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_UPDT_NYALA_BRTHP", map);
    }
    // END POST
}
