package rest.iconpln.service.KoreksiCleansing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceGantiReferensiiMarking {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> GET_ReferensiMarking(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_GANTIREFMARKING_V2", map);
    }
    // END GET
    // POST
    public Map<String, Object> POST_ReferensiMarking(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("UPDATE_REF_MARKING_V2", map);
    }
    // END POST
    // ATRIBUT
    public Map<String, Object> CHEK_MARKING(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("CEK_REF_MARKING_V2", map);
    }
    // END ATRIBUT
}
