package rest.iconpln.service.RequestData;

import rest.iconpln.service.Rantask.*;
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

public class ServiceRekapDataGGKL {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    public Map<String, Object> REKAP_DATA_GANGGUAN_PLNMOBILE(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_REKAP_GG_PLNMO_V2", map);
    }

    public Map<String, Object> REKAP_DATA_KELUHAN_PLNMOBILE(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_REKAP_KL_PLNMO_V2", map);
    }

    public Map<String, Object> REKAP_DATA_GANGGUAN_CC123(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_REKAP_GG_CC123_V2", map);
    }

    public Map<String, Object> REKAP_DATA_KELUHAN_CC123(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_REKAP_KL_CC123_V2", map);
    }
}
