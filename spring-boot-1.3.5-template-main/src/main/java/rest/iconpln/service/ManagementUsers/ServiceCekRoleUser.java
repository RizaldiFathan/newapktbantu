package rest.iconpln.service.ManagementUsers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class ServiceCekRoleUser {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> GET_USER_BY_USERNAME(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_ROLE_BY_USERNAME", map);
    }

    public Map<String, Object> GET_USER_BY_USERID(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_ROLE_BY_USERID", map);
    }
    // END GET
}
