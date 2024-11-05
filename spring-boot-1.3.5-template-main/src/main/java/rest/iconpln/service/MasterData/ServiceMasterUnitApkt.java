package rest.iconpln.service.MasterData;

import rest.iconpln.service.ManagementUsers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceMasterUnitApkt {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> MASTER_UNIT_APKT_REPORTAPKT(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_MASUN_APKT_PLNADMIN", map);
    }

    public Map<String, Object> MASTER_UNIT_APKT_PLNADMIN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_MASUN_APKT_REPORTAPKT", map);
    }

    // END GET
    // POST
    // INPUT
    public Map<String, Object> INPUT_UNIT_APKT_PLNADMIN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_IN_UNITAPKT_PLNADMIN", map);
    }

    public Map<String, Object> INPUT_UNIT_APKT_REPORTAPKT(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_IN_UNITAPKT_REPORTAPKT", map);
    }
    // END INPUT

    // UPDATE
    public Map<String, Object> UPDATE_UNIT_APKT_PLNADMIN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_UNITAPKT_PLNADMIN", map);
    }

    public Map<String, Object> UPDATE_UNIT_APKT_REPORTAPKT(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_UNITAPKT_REPORTAPKT", map);
    }
    // END UPDATE
    //END POST
}
