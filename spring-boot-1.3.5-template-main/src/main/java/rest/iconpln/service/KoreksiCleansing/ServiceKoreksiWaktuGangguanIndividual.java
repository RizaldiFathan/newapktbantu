package rest.iconpln.service.KoreksiCleansing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceKoreksiWaktuGangguanIndividual {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // GET
    public Map<String, Object> Koreksi_Durasi_Gangguan(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_DURASI_GG_BY_NOLAPOR_V2", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_Koreksi_Durasi_Gangguan(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("KOREKSI_DURASI_GG_V2", map);
    }
    // END POST
}
