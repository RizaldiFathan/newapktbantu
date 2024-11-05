package rest.iconpln.service.Pencarian;

import rest.iconpln.service.MasterJaringan.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import rest.iconpln.service.PlsqlServiceAmicon;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.stereotype.Service;
@Service

public class ServiceNoLaporanGangguanPemadamanTM {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> NO_LAPORAN_GANGGUAN_PEMADAMAN_TM_1(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_NOLAP_GANG_PTM_TAB1", map);
    }

    public Map<String, Object> NO_LAPORAN_GANGGUAN_PEMADAMAN_TM_2(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_NOLAP_GANG_PTM_TAB2", map);
    }
    // END GET
}
