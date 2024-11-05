package rest.iconpln.service.LOG;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceErrorsProcedure {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // GET
    public Map<String, Object> GET_ERRORLOGS_REPORTAPKT(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_ERRORLOGS_REPORTAPKT", map);
    }

    public Map<String, Object> GET_ERRORLOGS_PLNADMIN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_ERRORLOGS_PLNADMIN", map);
    }
    // END GET
}
