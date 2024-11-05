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

public class ServiceNoLaporanKeluhan {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET
    public Map<String, Object> NO_LAPORAN_KELUHAN(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_NO_LAPORAN_KELUHAN", map);
    }
    // END GET
}
