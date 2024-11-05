package rest.iconpln.service.ManagementUsers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceSeasonYantek {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

     // SEASON YANTEK
    // GET
    public Map<String, Object> GET_SEASON_YANTEK(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_SESSION_YANTEK", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_SEASON_YANTEK(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("UPDATE_SESSION_YANTEK", map);
    }
    // END POST
    // END SEASON YANTEK

}
