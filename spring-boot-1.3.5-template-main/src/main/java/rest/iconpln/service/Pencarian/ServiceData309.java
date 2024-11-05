package rest.iconpln.service.Pencarian;

import rest.iconpln.service.MasterJaringan.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceData309 {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> DATA_309_SS_309_NASIONAL(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_SS_309_NASIONAL", map);
    }

    public Map<String, Object> DATA_309_SS_309_BATAM(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_SS_309_BATAM", map);
    }

    public Map<String, Object> DATA_309_SS_DAYA_PER_PELANGGAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_SS_DAYA_PER_PELANGGAN", map);
    }

    public Map<String, Object> DATA_309_SS_REKAP(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_SS_REKAP", map);
    }
    // END GET
}
