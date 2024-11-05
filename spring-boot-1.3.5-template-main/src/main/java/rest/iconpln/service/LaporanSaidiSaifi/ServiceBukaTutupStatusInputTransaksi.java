package rest.iconpln.service.LaporanSaidiSaifi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceBukaTutupStatusInputTransaksi {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // GET
    public Map<String, Object> Status_Input_Tranasaksi(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_STATUSINPUTTRANSAKSI_V2", map);
    }
    // END GET

    // POST
    public Map<String, Object> Post_Input_Tranasaksi(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("UPDATE_STATUS_INPUT_TRANSAKSI", map);
    }
    // END POST
}
