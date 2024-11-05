package rest.iconpln.service.LaporanSaidiSaifi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceRekapUlangSaidiSaifiBulanan {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // GET
    public Map<String, Object> GET_BUKATUTUPPENGESAHAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_BUKATUTUPPENGESAHAN", map);
    }

    // END GET
    // POST
    public Map<String, Object> POST_BUKATUTUPPENGESAHAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_SS_OPENCLOSE_BANTU_V2", map);
    }
    // END POST
}
