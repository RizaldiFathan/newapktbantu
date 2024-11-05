package rest.iconpln.service.KoreksiCleansing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceKoreksiWaktuKeluhan {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // GET
    public Map<String, Object> Koreksi_Durasi_Keluhan(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_DURASI_KELUHAN_BY_NO_LPRV2", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_Koreksi_Durasi_Keluhan(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("UPDATE_DURASI_KELUHANV2", map);
    }
    // END POST
}
