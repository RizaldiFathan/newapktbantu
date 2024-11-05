package rest.iconpln.service.MasterJaringan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceUpdateConcatAssetNoAktif {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET ASSETS
    public Map<String, Object> PDATE_CONCAT_ASSET_NONAKTIFU(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_SS_TYPEASSET_V2", map);
    }

    // END GET ASSETS
    // GET
    public Map<String, Object> GET_PDATE_CONCAT_ASSET_NONAKTIFU(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_UPD_CONCAT_ASSETNON_V2", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_PDATE_CONCAT_ASSET_NONAKTIFU(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_UPDATE_CONCAT_ASSET", map);
    }
    // END POST
}
