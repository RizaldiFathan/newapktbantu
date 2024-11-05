package rest.iconpln.service.KoreksiCleansing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceKoreksiKodeGangguan {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // GET
    public Map<String, Object> Koreksi_Kode_Gangguan(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_KODEGANGGUAN_BY_NOLAPOR_V3", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_Koreksi_Kode_Gangguan(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("UPDATE_KODE_GANGGUAN_V2", map);
    }
    // END POST

    // ATRIBUT
    public Map<String, Object> GET_FASILITAS(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_FASILITAS", map);
    }

    public Map<String, Object> GET_SUB_FASILITAS(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_SUBFASILITAS", map);
    }

    public Map<String, Object> GET_EQUIPMENT(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_SS_FIELD5", map);
    }

    public Map<String, Object> GET_EVENTDAMAGE(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_EVENTDAMAGE", map);
    }

    public Map<String, Object> GET_CAUSE(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_CAUSE", map);
    }

    public Map<String, Object> GET_GROUPCAUSE(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_GROUPCAUSE", map);
    }

    public Map<String, Object> GET_WEATHER(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_WEATHER", map);
    }
    // END ATRIBUT
}
