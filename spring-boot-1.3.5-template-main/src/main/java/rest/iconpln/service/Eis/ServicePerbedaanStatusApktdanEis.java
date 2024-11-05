package rest.iconpln.service.Eis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service

public class ServicePerbedaanStatusApktdanEis {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> PERBEDAAN_STATUS_APKT_EIS(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_BEDA_STATUS_APKT_EIS", map);
    }
    // END GET
}
