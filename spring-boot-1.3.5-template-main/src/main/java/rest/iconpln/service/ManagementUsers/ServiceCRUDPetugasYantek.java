package rest.iconpln.service.ManagementUsers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceCRUDPetugasYantek {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> GET_PETUGAS_YANTEK(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_USER_YANTEKV2", map);
    }

    // END GET
    // POST
    public Map<String, Object> INPUT_MASTER_PETUGAS_YANTEK(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeFunction("SET_MASTER_PTGS_YANTEK", map);
    }

    // END POST
    // UPDATE
    public Map<String, Object> UPDATE_MASTER_PETUGAS_YANTEK(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("UPDATE_YANTEK_V2", map);
    }

    // END UPDATE
    // DELETE
    public Map<String, Object> DELETE_MASTER_PETUGAS_YANTEK(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("DELETE_YANTEK_V2", map);
    }
    // END DELETE
}
