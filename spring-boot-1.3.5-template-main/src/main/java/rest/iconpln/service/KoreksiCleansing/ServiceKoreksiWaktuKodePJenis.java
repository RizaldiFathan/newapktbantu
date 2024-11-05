package rest.iconpln.service.KoreksiCleansing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceKoreksiWaktuKodePJenis {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> KOREKSI_WAKTU_KODE_P_JENIS(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_K_PEM_TEREN_0_1", map);
    }

    // END GET
    // POST
    public Map<String, Object> POST_KOREKSI_WAKTU_KODE_P_JENIS(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_KOR_P_JNS01", map);
    }
    // END POST
}
