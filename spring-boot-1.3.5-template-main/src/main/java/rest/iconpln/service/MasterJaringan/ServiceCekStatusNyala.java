package rest.iconpln.service.MasterJaringan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceCekStatusNyala {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> STATUS_NYALA(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_STATUS_NYALA", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_STATUS_NYALA(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("UPDATE_STATUS_NYALA", map);
    }
    // EMD POST
}
