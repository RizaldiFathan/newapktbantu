package rest.iconpln.service.KoreksiCleansing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceResetBatasKoreksi {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // GET
    public Map<String, Object> RESET_BATAS_KORESI(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_BATAS_KOREKSI", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_RESET_BATAS_KORESI(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RESET_BATAS_KOREKSI_V2", map);
    }
    // END POST
}
