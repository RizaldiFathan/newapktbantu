package rest.iconpln.service.Eis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceRekapCicoDwhGangguanYantekAnalitic {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> REKAP_TABEL_CICO(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_TABEL_CICO", map);
    }

    public Map<String, Object> REKAP_TABEL_DWH_GG_YANTEK_ANALITIC(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_DWHGG_YANTEK_ANL", map);
    }
    // END GET
}
