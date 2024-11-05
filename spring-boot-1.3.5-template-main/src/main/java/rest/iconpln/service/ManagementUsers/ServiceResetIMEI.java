package rest.iconpln.service.ManagementUsers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceResetIMEI {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    public Map<String, Object> RESET_IMEI(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RESET_IMEI_PTGS", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_RESET_IMEI(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RESET_IME_USER", map);
    }

}
