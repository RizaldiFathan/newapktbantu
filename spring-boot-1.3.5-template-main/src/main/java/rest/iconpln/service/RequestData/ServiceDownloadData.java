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

public class ServiceDownloadData {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GANGGUAN PLGN DISJAYA + DISBANTEN CREATED BY CC JKT
    public Map<String, Object> GET_RKP_GG_JAYABANTEN_CCJKT(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RKP_GG_JAYABANTEN_CCJKT", map);
    }
    // END GANGGUAN PLGN DISJAYA + DISBANTEN CREATED BY CC JKT

    // KELUHAN PLGN DISJAYA + DISBANTEN CREATED BY CC JKT
    public Map<String, Object> GET_RKP_KL_JAYABANTEN_CCJKT(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RKP_KL_JAYABANTEN_CCJKT", map);
    }
    // END KELUHAN PLGN DISJAYA + DISBANTEN CREATED BY CC JKT

    // GANGGUAN PLGN DISJAYA + DISBANTEN CREATED NOT BY CC JKT
    public Map<String, Object> GET_RKP_GG_JAYABANTEN_NOTCCJKT(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RKP_GG_JAYABANTEN_NOTCCJKT", map);
    }
    // END GANGGUAN PLGN DISJAYA + DISBANTEN CREATED NOT BY CC JKT

    // KELUHAN PLGN DISJAYA + DISBANTEN CREATED NOT BY CC JKT
    public Map<String, Object> GET_RKP_KL_JAYABANTEN_NOTCCJKT(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RKP_KL_JAYABANTEN_NOTCCJKT", map);
    }
    // END KELUHAN PLGN DISJAYA + DISBANTEN CREATED NOT BY CC JKT

    // GET_RKP_SADFI_ENS_AREA_THN
    public Map<String, Object> GET_RKP_SADFI_ENS_AREA_THN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RKP_SADFI_ENS_AREA_THN", map);
    }

    // END GET_RKP_SADFI_ENS_AREA_THN
    // GET_RKP_SADFI_ENS_ULP_THN
    public Map<String, Object> GET_RKP_SADFI_ENS_ULP_THN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RKP_SADFI_ENS_ULP_THN", map);
    }
    // END GET_RKP_SADFI_ENS_ULP_THN

    // DATA USER AKTIF
    public Map<String, Object> GET_DATA_USER_AKTF(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_DATA_USER_AKTF", map);
    }
    // END DATA USER AKTIF

    // LOG LOGIN USER
    public Map<String, Object> LOG_LOGIN_USER(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RKP_DTL_LOGIN_USER", map);
    }
    // END LOG LOGIN USER

    // DATA CICO
    public Map<String, Object> GET_DATA_CICO(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RKP_DATA_CICO", map);
    }
    // END DATA CICO

    // REKAP DATA MAINGING
    public Map<String, Object> REKAP_DATA_MAINGING(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_REKAP_DATA_MINING_GGV2", map);
    }
    // END REKAP DATA MAINGING

    // DATA TRANSAKSI TM > 5 JAM
    public Map<String, Object> DATA_TRANSAKSI_TM(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_GANGGUAN_LEBIH_5J_V2", map);
    }
    // END DATA TRANSAKSI TM > 5 JAM

    // DATA TRANSAKSI TM
    public Map<String, Object> DATA_TRANSAKSI_TM_U5(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RKP_DT_GG_TMV2", map);
    }
    // END DATA TRANSAKSI TM

    // DATA GANGGUAN INDIVIDUAL
    public Map<String, Object> DATA_GANGGUAN_INDIVIDUAL(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RKP_DT_GG_INDIV2", map);
    }
    // END DATA GANGGUAN INDIVIDUAL

    // DATA PEMADAMAN TERENCANA
    public Map<String, Object> PEMADAMAN_TERENCANA(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RKP_DT_PADAM_TERV2", map);
    }
    // END DATA PEMADAMAN TERENCANA

    // DATA KELUHAN
    public Map<String, Object> DATA_KELUHAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RKP_DT_KL_V2", map);
    }
    // END DATA KELUHAN

    // REKAP CANCEL ORDER
    public Map<String, Object> REKAP_CANCEL_ORDER(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RKP_CNCL_ORDER_V2", map);
    }
    // END REKAP CANCEL ORDER

    // Rekap Data Gangguan Dan Keluhan
    public Map<String, Object> REKAP_DATA_GANGGUAN_DAN_KELUHAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_REKAP_GG_KEL_PLN", map);
    }
    // END Rekap Data Gangguan Dan Keluhan

}
