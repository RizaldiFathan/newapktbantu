package rest.iconpln.service.Eis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceRekapKPI {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // POST REKAP KPI PENURUNAN JUMLAH KOMPLAIN BULANAN
    public Map<String, Object> REKAP_KPI_PENURUNAN_JUMLAH_KOMPLAIN_BULANAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_KPI_PENJUM_KOMBUL", map);
    }
    // END POST REKAP KPI PENURUNAN JUMLAH KOMPLAIN BULANAN

    // POST REKAP KPI PENURUNAN JUMLAH KOMPLAIN KUMULATIF
    public Map<String, Object> REKAP_KPI_PENURUNAN_JUMLAH_KOMPLAIN_KUMULATIF(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_KPI_PENJUM_KUM", map);
    }
    // END POST REKAP KPI PENURUNAN JUMLAH KOMPLAIN KUMULATIF

    // POST REKAP KPI AGING BULANAN
    public Map<String, Object> REKAP_KPI_AGING_BULANAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_KPI_AGING_BLN", map);
    }
    // END POST REKAP KPI AGING BULANAN

    // POST REKAP KPI AGING KUMULATIF
    public Map<String, Object> REKAP_KPI_AGING_KUMULATIF(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_KPI_AGING_KUM", map);
    }
    // END POST REKAP KPI AGING KUMULATIF

    // POST REKAP KPI ENS BULANAN
    public Map<String, Object> REKAP_KPI_ENS_BULANAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_KPI_ENS_BLN", map);
    }
    // END POST REKAP KPI ENS BULANAN

    // POST REKAP KPI ENS KUMULATIF
    public Map<String, Object> REKAP_KPI_ENS_KUMULATIF(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_KPI_ENS_KUM", map);
    }
    // END POST REKAP KPI ENS KUMULATIF

    // POST REKAP KPI KEPATUHAN DAN AKURASI BULANAN
    public Map<String, Object> REKAP_KPI_KEPATUHAN_DAN_AKURASI_BULANAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_KPI_KEPAK_BLN", map);
    }
    // END POST REKAP KPI KEPATUHAN DAN AKURASI BULANAN

    // POST REKAP KPI KEPATUHAN DAN AKURASI KUMULATIF
    public Map<String, Object> REKAP_KPI_KEPATUHAN_DAN_AKURASI_KUMULATIF(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_KPI_KEPAKU_KUM", map);
    }
    // END POST REKAP KPI KEPATUHAN DAN AKURASI KUMULATIF
}
