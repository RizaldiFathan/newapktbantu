package rest.iconpln.service.LOG;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServicePlnMobileJobRequestEvent {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> PLN_MOBILE_JOB_REQUEST_EVENT(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_PLNMO_JOBREQ", map);
    }
    // END GET
}
