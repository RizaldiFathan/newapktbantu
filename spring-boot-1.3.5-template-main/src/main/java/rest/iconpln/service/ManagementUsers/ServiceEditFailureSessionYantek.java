package rest.iconpln.service.ManagementUsers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceEditFailureSessionYantek {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> GET_EDIT_FAILURE_SESSION(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_EDIT_FAILURE_SESSION", map);
    }

    // END GET
    public Map<String, Object> POST_EDIT_FAILURE_SESSION(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("UPDATE_EDIT_FAILURE_SESSION", map);
    }
    // POST
}
