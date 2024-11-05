package rest.iconpln.service.Eis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceRekapDashboardInputTime {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> REKAP_DETAIL_INPUT_TIME(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_DTL_INPUT_TIME", map);
    }

    public Map<String, Object> REKAP_INPUT_TIME_SCADA(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_INPUT_TIME_SCDA", map);
    }

    public Map<String, Object> REKAP_INPUT_TIME_MANUAL(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_INPUT_TIME_MANUAL", map);
    }
    // END GET
}
