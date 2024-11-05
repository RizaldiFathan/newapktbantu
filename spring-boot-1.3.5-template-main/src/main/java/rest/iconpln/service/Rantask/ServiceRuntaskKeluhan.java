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

public class ServiceRuntaskKeluhan {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

   // GET
    public Map<String, Object> Runtask_KL(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GETRUNTASKKL", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_RUNTASK_KL(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("UPDATE_RUNTASK_KL_V2", map);
    }
    // END POST
}
