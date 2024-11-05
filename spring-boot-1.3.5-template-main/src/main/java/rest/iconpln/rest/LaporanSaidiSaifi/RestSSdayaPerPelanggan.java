package rest.iconpln.rest.LaporanSaidiSaifi;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.LaporanSaidiSaifi.ServiceSSdayaPerPelanggan;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/saidi-saifi/")
public class RestSSdayaPerPelanggan {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestSSdayaPerPelanggan.class);

    @Autowired
    private ServiceSSdayaPerPelanggan serviceSSdayaPerPelanggan;

    // GET
    @RequestMapping(
            value = "/GET_SS_DAYA_PER_PELANGGAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_SS_DAYA_PER_PELANGGAN(
            @RequestParam(value = "P_UNIT", defaultValue = "") String P_UNIT,
            @RequestParam(value = "P_THBL", defaultValue = "") String P_THBL
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_UNIT : " + P_UNIT + " , "
                    + " P_THBL : " + P_THBL + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_UNIT", P_UNIT);
            mIn.put("P_THBL", P_THBL);
            mOut = serviceSSdayaPerPelanggan.GET_SS_DAYA_PER_PELANGGAN(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_UNIT : " + P_UNIT + " | "
                    + " P_THBL : " + P_THBL + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error(
                    "===|  OUT FROM = "
                    + " P_UNIT : " + P_UNIT + " | "
                    + " P_THBL : " + P_THBL + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_SS_DAYA_PER_PELANGGAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_SS_DAYA_PER_PELANGGAN(
            @RequestParam(value = "P_JML_PLGN", defaultValue = "") int P_JML_PLGN,
            @RequestParam(value = "P_JML_PLGN_TM", defaultValue = "") int P_JML_PLGN_TM,
            @RequestParam(value = "P_JML_TRAFO", defaultValue = "") int P_JML_TRAFO,
            @RequestParam(
                    value = "P_KAPASITAS_TRAFO",
                    defaultValue = ""
            ) int P_KAPASITAS_TRAFO,
            @RequestParam(
                    value = "P_JML_TRAFO_TM",
                    defaultValue = ""
            ) int P_JML_TRAFO_TM,
            @RequestParam(
                    value = "P_KAPASITAS_TRAFO_TM",
                    defaultValue = ""
            ) int P_KAPASITAS_TRAFO_TM,
            @RequestParam(
                    value = "P_JML_TRAFO_5KVA",
                    defaultValue = ""
            ) int P_JML_TRAFO_5KVA,
            @RequestParam(
                    value = "P_KAPASITAS_TRAFO_5KVA",
                    defaultValue = ""
            ) int P_KAPASITAS_TRAFO_5KVA,
            @RequestParam(
                    value = "P_ASUMSI_PELANGGAN",
                    defaultValue = ""
            ) float P_ASUMSI_PELANGGAN,
            @RequestParam(value = "P_UNIT", defaultValue = "") String P_UNIT,
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(value = "P_THBL", defaultValue = "") String P_THBL
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_JML_PLGN : " + P_JML_PLGN + " , "
                    + " P_JML_PLGN_TM : " + P_JML_PLGN_TM + " , "
                    + " P_JML_TRAFO : " + P_JML_TRAFO + " , "
                    + " P_KAPASITAS_TRAFO : " + P_KAPASITAS_TRAFO + " , "
                    + " P_JML_TRAFO_TM : " + P_JML_TRAFO_TM + " , "
                    + " P_KAPASITAS_TRAFO_TM : " + P_KAPASITAS_TRAFO_TM + " , "
                    + " P_JML_TRAFO_5KVA : " + P_JML_TRAFO_5KVA + " , "
                    + " P_KAPASITAS_TRAFO_5KVA : " + P_KAPASITAS_TRAFO_5KVA + " , "
                    + " P_ASUMSI_PELANGGAN : " + P_ASUMSI_PELANGGAN + " , "
                    + " P_UNIT : " + P_UNIT + " , "
                    + " P_USERNAME : " + P_USERNAME + " , "
                    + " P_THBL : " + P_THBL + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_JML_PLGN", P_JML_PLGN);
            mIn.put("P_JML_PLGN_TM", P_JML_PLGN_TM);
            mIn.put("P_JML_TRAFO", P_JML_TRAFO);
            mIn.put("P_KAPASITAS_TRAFO", P_KAPASITAS_TRAFO);
            mIn.put("P_JML_TRAFO_TM", P_JML_TRAFO_TM);
            mIn.put("P_KAPASITAS_TRAFO_TM", P_KAPASITAS_TRAFO_TM);
            mIn.put("P_JML_TRAFO_5KVA", P_JML_TRAFO_5KVA);
            mIn.put("P_KAPASITAS_TRAFO_5KVA", P_KAPASITAS_TRAFO_5KVA);
            mIn.put("P_ASUMSI_PELANGGAN", P_ASUMSI_PELANGGAN);
            mIn.put("P_UNIT", P_UNIT);
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("P_THBL", P_THBL);
            mOut = serviceSSdayaPerPelanggan.POST_SS_DAYA_PER_PELANGGAN(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_JML_PLGN : " + P_JML_PLGN + " | "
                    + " P_JML_PLGN_TM : " + P_JML_PLGN_TM + " | "
                    + " P_JML_TRAFO : " + P_JML_TRAFO + " | "
                    + " P_KAPASITAS_TRAFO : " + P_KAPASITAS_TRAFO + " | "
                    + " P_JML_TRAFO_TM : " + P_JML_TRAFO_TM + " | "
                    + " P_KAPASITAS_TRAFO_TM : " + P_KAPASITAS_TRAFO_TM + " | "
                    + " P_JML_TRAFO_5KVA : " + P_JML_TRAFO_5KVA + " | "
                    + " P_KAPASITAS_TRAFO_5KVA : " + P_KAPASITAS_TRAFO_5KVA + " | "
                    + " P_ASUMSI_PELANGGAN : " + P_ASUMSI_PELANGGAN + " | "
                    + " P_UNIT : " + P_UNIT + " | "
                    + " P_USERNAME : " + P_USERNAME + " | "
                    + " P_THBL : " + P_THBL + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error(
                    "===|  OUT FROM = "
                    + " P_JML_PLGN : " + P_JML_PLGN + " | "
                    + " P_JML_PLGN_TM : " + P_JML_PLGN_TM + " | "
                    + " P_JML_TRAFO : " + P_JML_TRAFO + " | "
                    + " P_KAPASITAS_TRAFO : " + P_KAPASITAS_TRAFO + " | "
                    + " P_JML_TRAFO_TM : " + P_JML_TRAFO_TM + " | "
                    + " P_KAPASITAS_TRAFO_TM : " + P_KAPASITAS_TRAFO_TM + " | "
                    + " P_JML_TRAFO_5KVA : " + P_JML_TRAFO_5KVA + " | "
                    + " P_KAPASITAS_TRAFO_5KVA : " + P_KAPASITAS_TRAFO_5KVA + " | "
                    + " P_ASUMSI_PELANGGAN : " + P_ASUMSI_PELANGGAN + " | "
                    + " P_UNIT : " + P_UNIT + " | "
                    + " P_USERNAME : " + P_USERNAME + " | "
                    + " P_THBL : " + P_THBL + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
