package rest.iconpln.service.Eis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceRekapDataEIS {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // REKAP EIS GANGGUAN INDIVIDUAL PER BULAN
    // POST
    public Map<String, Object> REKAP_EIS_GANGGUAN_INDIVIDUAL_PER_BULAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_REIS_GG_IN_BULAN", map);
    }
    // END POST
    // END REKAP EIS GANGGUAN INDIVIDUAL PER BULAN

    // REKAP EIS KELUHAN PER BULAN
    // POST
    public Map<String, Object> REKAP_EIS_KELUHAN_PER_BULAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_REIS_KL_PER_BULAN", map);
    }
    // END POST
    // END REKAP EIS KELUHAN PER BULAN

    // REKAP EIS GANGGUAN TM PER BULAN
    // POST
    public Map<String, Object> REKAP_EIS_GANGGUAN_TM_PER_BULAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_REIS_GG_TM_PER_BULAN", map);
    }
    // END POST
    // END REKAP EIS GANGGUAN TM PER BULAN

    // REKAP EIS PEMADAMAN TERENCANA PER BULAN
    // POST
    public Map<String, Object> REKAP_EIS_PEMADAMAN_TERENCANA_PER_BULAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_REIS_PEM_TERENCANATM_BLN", map);
    }
    // END POST
    // END REKAP EIS PEMADAMAN TERENCANA PER BULAN
}
