package rest.iconpln.service.Eis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceRekapMonalisa {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GANGGUAN
    // POST JUMLAH KALI GANGGUAN
    public Map<String, Object> JUMLAH_KALI_KELUHAN_GG(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_JML_KALI_GANGGUAN", map);
    }
    // END POST JUMLAH KALI GANGGUAN

    // POST DISPATCHING TIME
    public Map<String, Object> DISPATCHING_TIME_GG(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_DISPAT_TIME", map);
    }
    // END POST DISPATCHING TIME

    // POST RCT (GANGGUAN)
    public Map<String, Object> RCT_GG(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_RCT_GANGGUAN", map);
    }
    // END POST RCT (GANGGUAN)

    // POST RPT (GANGGUAN)
    public Map<String, Object> RPT_GG(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_RPT_GANGGUAN", map);
    }
    // END POST RPT (GANGGUAN)

    // POST REKAPITULASI GANGGUAN PER JENIS GANGGUAN
    public Map<String, Object> REKAPITULASI_GANGGUAN_PER_JENIS_GG(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_PER_J_GG", map);
    }
    // END POST REKAPITULASI GANGGUAN PER JENIS GANGGUAN

    // POST REKAPITULASI LAPOR ULANG GANGGUAN
    public Map<String, Object> REKAPITULASI_LAPOR_ULANG_GG(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_L_UL_GG", map);
    }
    // END POST REKAPITULASI LAPOR ULANG GANGGUAN

    // POST REKAPITULASI ENS GANGGUAN
    public Map<String, Object> REKAPITULASI_ENS_GG(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_ENS_GG", map);
    }
    // END POST REKAPITULASI ENS GANGGUAN

    // POST REKAPITULASI KELUHAN BELUM SELESAI GG
    public Map<String, Object> REKAPITULASI_KELUHAN_BELUM_SELESAI_GG(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_GG_B_SEL", map);
    }
    // END POST REKAPITULASI KELUHAN BELUM SELESAIGG
    // END GANGGUAN

    // KELUHAN
    // POST JUMLAH KALI KELUHAN
    public Map<String, Object> JUMLAH_KALI_KELUHAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_JML_KALI_KELUHAN", map);
    }
    // END POST JUMLAH KALI KELUHAN

    // POST RCT (KELUHAN)
    public Map<String, Object> RCT(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_RCT_KELUHAN", map);
    }
    // END POST RCT (KELUHAN)

    // POST RPT (KELUHAN)
    public Map<String, Object> RPT(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_RPT_KELUHAN", map);
    }
    // END POST RPT (KELUHAN)

    // POST REKAPITULASI KELUHAN PER JENIS KELUHAN
    public Map<String, Object> REKAPITULASI_KELUHAN_PER_JENIS_KELUHAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_PER_J_KEL", map);
    }
    // END POST REKAPITULASI KELUHAN PER JENIS KELUHAN

    // POST REKAPITULASI LAPOR ULANG KELUHAN
    public Map<String, Object> REKAPITULASI_LAPOR_ULANG_KELUHAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_L_UL_KEL", map);
    }
    // END POST REKAPITULASI LAPOR ULANG KELUHAN

    // POST REKAPITULASI KELUHAN BELUM SELESAI
    public Map<String, Object> REKAPITULASI_KELUHAN_BELUM_SELESAI(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("PROC_RKP_KL_B_SEL", map);
    }
    // END POST REKAPITULASI KELUHAN BELUM SELESAI
    // END KELUHAN
}
