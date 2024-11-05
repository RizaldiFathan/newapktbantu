package rest.iconpln.service.Eis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceSelisihDataApktEis {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // GET
    public Map<String, Object> SELISIH_DATA_APKT_EIS(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_SELISIH_DATA_APKTEIS", map);
    }
    // END GET
}
