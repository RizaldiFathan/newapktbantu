package rest.iconpln.service.LaporanSaidiSaifi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceSSdayaPerPelanggan {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // GET
    public Map<String, Object> GET_SS_DAYA_PER_PELANGGAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_SS_DAYAPERPELANGGAN", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_SS_DAYA_PER_PELANGGAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("UPDATE_SS_DAYAPERPELANGGAN", map);
    }
    // END POST
}
