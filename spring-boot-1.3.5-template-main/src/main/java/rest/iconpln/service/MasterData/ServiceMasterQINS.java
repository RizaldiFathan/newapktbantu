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

public class ServiceMasterQINS {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> MASTER_QINS(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_MAS_QINS", map);
    }

    // END GET
    // POST
    public Map<String, Object> INPUT_MASTER_QINS(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_INSRT_QINS_V2", map);
    }

    public Map<String, Object> DELETE_MASTER_QINS(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_DELL_QINS_V2", map);
    }
    // END POST
}
