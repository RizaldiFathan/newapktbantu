package rest.iconpln.service.ManagementUsers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceEskalasiEmail {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    public Map<String, Object> GET_ESKALASI_EMAIL(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_ESKALASI_EMAIL", map);
    }

    // END GET ESKALASI EMAIL
    // POST ESKALASI EMAIl
    public Map<String, Object> POST_ESKALASI_EMAIL(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("UPDATE_ESKALASI_EMAIL", map);
    }
    // END POST ESKALASI EMAIl
}
