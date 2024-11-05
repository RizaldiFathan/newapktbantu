package rest.iconpln.service.KoreksiCleansing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceKoreksiJumlahPelanggan {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // GET
    public Map<String, Object> KoreksiJumlahPelanggan(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_KORJUM_PELANGGAN", map);
    }
    // END GET

    // POST
    public Map<String, Object> POSTKoreksiJumlahPelanggan(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_SS_KOREKSI_JML_PLGN", map);
    }
    // END POST
}
