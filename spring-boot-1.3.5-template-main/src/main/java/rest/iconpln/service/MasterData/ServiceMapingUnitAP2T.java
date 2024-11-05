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

public class ServiceMapingUnitAP2T {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // GET
    public Map<String, Object> MAPPING_UNIT_AP2T(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_MAP_UNIT_AP2T_VCC", map);
    }
    // END GET

}
