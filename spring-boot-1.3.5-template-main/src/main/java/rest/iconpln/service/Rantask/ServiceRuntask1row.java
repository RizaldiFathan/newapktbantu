package rest.iconpln.service.Rantask;

import rest.iconpln.service.Pencarian.*;
import rest.iconpln.service.MasterJaringan.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceRuntask1row {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> RUNTASK_1ROW(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GETRUNTASKGG_1ROW", map);
    }

    public Map<String, Object> GET_Runtask_AFT(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GETRUNTASKGG", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_RUNTASK_1ROW(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("UPDATE_RUNTASK_GG_1_ROW", map);
    }
    // END POST
}
