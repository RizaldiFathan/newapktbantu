package rest.iconpln.service.Eis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceRekapEisPerNomorlapor {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // GET
    public Map<String, Object> GET_EIS(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_REKAP_ULANG_EISV2", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_PER_NOALAP_KL(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_REIS_KL_NOLAPV2", map);
    }

    public Map<String, Object> POST_PER_NOALAP_GG(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_REIS_GG_NOLAPV2", map);
    }
    // END POST
}
