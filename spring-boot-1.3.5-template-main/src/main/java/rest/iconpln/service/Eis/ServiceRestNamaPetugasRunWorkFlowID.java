package rest.iconpln.service.Eis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service

public class ServiceRestNamaPetugasRunWorkFlowID {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> NAMA_PETUGAS_DAN_RUNWORKFLOWID(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_NAMA_PTGS_USERID_RWF_ID_0", map);
    }
    // END GET
}
