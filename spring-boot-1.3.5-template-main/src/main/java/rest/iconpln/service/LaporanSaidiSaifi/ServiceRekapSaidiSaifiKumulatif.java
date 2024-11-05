package rest.iconpln.service.LaporanSaidiSaifi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceRekapSaidiSaifiKumulatif {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // POST
    public Map<String, Object> POST_SAIDI_KUMULATIF(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_SAIDI_KUMU_V2", map);
    }
    // END POST
}
