package rest.iconpln.service.MasterJaringan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceInputMerkTrafo {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> GET_MERK_TRAVO(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_SS_MERK_TRAFO", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_MERK_TRAVO(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_INSRT_MERK_TRAVO", map);
    }

    public Map<String, Object> DEL_MERK_TRAVO(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_DEL_MERK_TRAVO", map);
    }
    // END POST
}
