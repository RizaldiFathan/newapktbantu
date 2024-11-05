package rest.iconpln.rest.Eis;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.Eis.ServiceRekapKPI;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/eis/")
public class RestRekapKPI {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestRekapKPI.class);

    @Autowired
    private ServiceRekapKPI serviceRekapKPI;

    // POST REKAP KPI PENURUNAN JUMLAH KOMPLAIN BULANAN
    @RequestMapping(
            value = "/REKAP_KPI_PENURUNAN_JUMLAH_KOMPLAIN_BULANAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_KPI_PENURUNAN_JUMLAH_KOMPLAIN_BULANAN(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER,
            @RequestParam(value = "p_unitid", defaultValue = "") String p_unitid
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " p_unitid : " + p_unitid + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_blth", p_blth);
            mIn.put("P_USER", P_USER);
            mIn.put("p_unitid", p_unitid);

            mOut = serviceRekapKPI.REKAP_KPI_PENURUNAN_JUMLAH_KOMPLAIN_BULANAN(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST REKAP KPI PENURUNAN JUMLAH KOMPLAIN BULANAN
    // POST REKAP KPI PENURUNAN JUMLAH KOMPLAIN KUMULATIF
    @RequestMapping(
            value = "/REKAP_KPI_PENURUNAN_JUMLAH_KOMPLAIN_KUMULATIF",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_KPI_PENURUNAN_JUMLAH_KOMPLAIN_KUMULATIF(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER,
            @RequestParam(value = "p_unitid", defaultValue = "") String p_unitid
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " p_unitid : " + p_unitid + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_blth", p_blth);
            mIn.put("P_USER", P_USER);
            mIn.put("p_unitid", p_unitid);

            mOut = serviceRekapKPI.REKAP_KPI_PENURUNAN_JUMLAH_KOMPLAIN_KUMULATIF(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST REKAP KPI PENURUNAN JUMLAH KOMPLAIN KUMULATIF
    // POST REKAP KPI AGING BULANAN
    @RequestMapping(
            value = "/REKAP_KPI_AGING_BULANAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_KPI_AGING_BULANAN(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER,
            @RequestParam(value = "p_unitid", defaultValue = "") String p_unitid
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " p_unitid : " + p_unitid + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_blth", p_blth);
            mIn.put("P_USER", P_USER);
            mIn.put("p_unitid", p_unitid);

            mOut = serviceRekapKPI.REKAP_KPI_AGING_BULANAN(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST REKAP KPI AGING BULANAN
    // POST REKAP KPI AGING KUMULATIF
    @RequestMapping(
            value = "/REKAP_KPI_AGING_KUMULATIF",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_KPI_AGING_KUMULATIF(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER,
            @RequestParam(value = "p_unitid", defaultValue = "") String p_unitid
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " p_unitid : " + p_unitid + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);
            mIn.put("p_unitid", p_unitid);

            mOut = serviceRekapKPI.REKAP_KPI_AGING_KUMULATIF(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST REKAP KPI AGING KUMULATIF
    // POST REKAP KPI ENS BULANAN
    @RequestMapping(
            value = "/REKAP_KPI_ENS_BULANAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_KPI_ENS_BULANAN(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER,
            @RequestParam(value = "p_unitid", defaultValue = "") String p_unitid
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " p_unitid : " + p_unitid + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);
            mIn.put("p_unitid", p_unitid);

            mOut = serviceRekapKPI.REKAP_KPI_ENS_BULANAN(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST REKAP KPI ENS BULANAN
    // POST REKAP KPI ENS KUMULATIF
    @RequestMapping(
            value = "/REKAP_KPI_ENS_KUMULATIF",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_KPI_ENS_KUMULATIF(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER,
            @RequestParam(value = "p_unitid", defaultValue = "") String p_unitid
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " p_unitid : " + p_unitid + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);
            mIn.put("p_unitid", p_unitid);

            mOut = serviceRekapKPI.REKAP_KPI_ENS_KUMULATIF(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST REKAP KPI ENS KUMULATIF
    // POST REKAP KPI KEPATUHAN DAN AKURASI BULANAN
    @RequestMapping(
            value = "/REKAP_KPI_KEPATUHAN_DAN_AKURASI_BULANAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_KPI_KEPATUHAN_DAN_AKURASI_BULANAN(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER,
            @RequestParam(value = "p_unitid", defaultValue = "") String p_unitid
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " p_unitid : " + p_unitid + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);
            mIn.put("p_unitid", p_unitid);

            mOut = serviceRekapKPI.REKAP_KPI_KEPATUHAN_DAN_AKURASI_BULANAN(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST REKAP KPI KEPATUHAN DAN AKURASI BULANAN
    // POST REKAP KPI KEPATUHAN DAN AKURASI KUMULATIF
    @RequestMapping(
            value = "/REKAP_KPI_KEPATUHAN_DAN_AKURASI_KUMULATIF",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_KPI_KEPATUHAN_DAN_AKURASI_KUMULATIF(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER,
            @RequestParam(value = "p_unitid", defaultValue = "") String p_unitid
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " p_unitid : " + p_unitid + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);
            mIn.put("p_unitid", p_unitid);

            mOut = serviceRekapKPI.REKAP_KPI_KEPATUHAN_DAN_AKURASI_KUMULATIF(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " | " + p_unitid + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST REKAP KPI KEPATUHAN DAN AKURASI KUMULATIF
}
