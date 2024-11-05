package rest.iconpln.service.MasterJaringan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceUpdateJaringanPerRow {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> UPDATE_DATA_JARINGAN_PER_1_ROW(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_UPD_SSJAR_1ROWV2", map);
    }

    // END GET
    // POST
    public Map<String, Object> POST_UPDATE_DATA_JARINGAN_PER_1_ROW(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_UPDATE_SSJAR_1R_V2", map);
    }
    // END POST
}
