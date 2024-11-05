package rest.iconpln.rest.Eis;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.Eis.ServiceRekapDataEIS;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/eis/")
public class RestRekapDataEIS {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestRekapDataEIS.class);

    @Autowired
    private ServiceRekapDataEIS serviceRekapDataEIS;

    // REKAP EIS GANGGUAN INDIVIDUAL PER BULAN
    @RequestMapping(
            value = "/REKAP_EIS_GANGGUAN_INDIVIDUAL_PER_BULAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_EIS_GANGGUAN_INDIVIDUAL_PER_BULAN(
            @RequestParam(value = "v_tglawal", defaultValue = "") String v_tglawal,
            @RequestParam(value = "v_tglakhir", defaultValue = "") String v_tglakhir
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " v_tglawal : " + v_tglawal + " , " +
                            " v_tglakhir : " + v_tglakhir + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("v_tglawal", v_tglawal);
            mIn.put("v_tglakhir", v_tglakhir);
            mOut = serviceRekapDataEIS.REKAP_EIS_GANGGUAN_INDIVIDUAL_PER_BULAN(mIn);
            logger.info("===| OUT FROM " + v_tglawal + " | " + v_tglakhir + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + v_tglawal + " | " + v_tglakhir + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END REKAP EIS GANGGUAN INDIVIDUAL PER BULAN

    // REKAP EIS KELUHAN PER BULAN
    @RequestMapping(
            value = "/REKAP_EIS_KELUHAN_PER_BULAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_EIS_KELUHAN_PER_BULAN(
            @RequestParam(value = "v_tglawal", defaultValue = "") String v_tglawal,
            @RequestParam(value = "v_tglakhir", defaultValue = "") String v_tglakhir
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " v_tglawal : " + v_tglawal + " , " +
                            " v_tglakhir : " + v_tglakhir + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("v_tglawal", v_tglawal);
            mIn.put("v_tglakhir", v_tglakhir);
            mOut = serviceRekapDataEIS.REKAP_EIS_KELUHAN_PER_BULAN(mIn);
            logger.info("===| OUT FROM " + v_tglawal + " | " + v_tglakhir + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + v_tglawal + " | " + v_tglakhir + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END REKAP EIS KELUHAN PER BULAN

    // REKAP EIS GANGGUAN TM PER BULAN
    @RequestMapping(
            value = "/REKAP_EIS_GANGGUAN_TM_PER_BULAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_EIS_GANGGUAN_TM_PER_BULAN(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "p_user", defaultValue = "") String p_user
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_TGL : " + p_blth + " , " +
                            " p_user : " + p_user + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_blth", p_blth);
            mIn.put("p_user", p_user);
            mOut = serviceRekapDataEIS.REKAP_EIS_GANGGUAN_TM_PER_BULAN(mIn);
            logger.info("===| OUT FROM " + p_blth + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END REKAP EIS GANGGUAN TM PER BULAN

    // REKAP EIS PEMADAMAN TERENCANA PER BULAN
    @RequestMapping(
            value = "/REKAP_EIS_PEMADAMAN_TERENCANA_PER_BULAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_EIS_PEMADAMAN_TERENCANA_PER_BULAN(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "p_user", defaultValue = "") String p_user
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_TGL : " + p_blth + " , " +
                            " p_user : " + p_user + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_blth", p_blth);
            mIn.put("p_user", p_user);
            mOut = serviceRekapDataEIS.REKAP_EIS_PEMADAMAN_TERENCANA_PER_BULAN(mIn);
            logger.info("===| OUT FROM " + p_blth + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END REKAP EIS PEMADAMAN TERENCANA PER BULAN
}
