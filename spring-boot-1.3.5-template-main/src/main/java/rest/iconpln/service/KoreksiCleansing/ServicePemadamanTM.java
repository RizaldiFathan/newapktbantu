package rest.iconpln.service.KoreksiCleansing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServicePemadamanTM {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;
    // GET
    public Map<String, Object> GET_PEMADAMANTM(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeFunction("F_GET_INTEG", map);
    }
    // END GET

    // POST
    public Map<String, Object> POST_PEMADAMANTM(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeFunction("FS_KOREKSI_TM6", map);
    }
    // END POST
}
