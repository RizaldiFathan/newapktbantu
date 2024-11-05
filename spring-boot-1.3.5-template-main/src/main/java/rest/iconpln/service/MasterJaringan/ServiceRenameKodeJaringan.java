package rest.iconpln.service.MasterJaringan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceRenameKodeJaringan {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // POST
    public Map<String, Object> RENAME_KD_JARINGAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeFunction("F_SET_R_KD_JARINGAN", map);
    }
    // END POST
}
