package rest.iconpln.service.MasterJaringan;

import rest.iconpln.service.MasterData.*;
import rest.iconpln.service.ManagementUsers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceInputKVATrafo {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> GET_DAYA_TRAVO(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_SS_DAYA_TRAFO", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_DAYA_TRAVO(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_INSRT_DAYA_TRAVO", map);
    }

    public Map<String, Object> DEL_DAYA_TRAVO(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_DEL_DAYA_TRAVO", map);
    }
    // END POST
}
