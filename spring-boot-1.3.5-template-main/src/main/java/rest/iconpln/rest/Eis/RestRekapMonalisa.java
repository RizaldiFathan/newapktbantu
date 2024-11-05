package rest.iconpln.rest.Eis;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.Eis.ServiceRekapMonalisa;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/eis/")
public class RestRekapMonalisa {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestRekapMonalisa.class);

    @Autowired
    private ServiceRekapMonalisa serviceRekapMonalisa;

    // GANGGUAN
    // POST JUMLAH KALI GANGGUAN
    @RequestMapping(
            value = "/JUMLAH_KALI_KELUHAN_GG",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> JUMLAH_KALI_KELUHAN_GG(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);

            mOut = serviceRekapMonalisa.JUMLAH_KALI_KELUHAN_GG(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST JUMLAH KALI GANGGUAN
    // POST DISPATCHING TIME
    @RequestMapping(
            value = "/DISPATCHING_TIME_GG",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> DISPATCHING_TIME_GG(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);

            mOut = serviceRekapMonalisa.DISPATCHING_TIME_GG(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST DISPATCHING TIME
    // POST RCT (GANGGUAN)
    @RequestMapping(
            value = "/RCT_GG",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> RCT_GG(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);

            mOut = serviceRekapMonalisa.RCT_GG(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST RCT (GANGGUAN)
    // POST RPT (GANGGUAN)
    @RequestMapping(
            value = "/RPT_GG",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> RPT_GG(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);

            mOut = serviceRekapMonalisa.RPT_GG(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST RPT (GANGGUAN)
    // POST REKAPITULASI GANGGUAN PER JENIS GANGGUAN
    @RequestMapping(
            value = "/REKAPITULASI_GANGGUAN_PER_JENIS_GG",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAPITULASI_GANGGUAN_PER_JENIS_GG(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);

            mOut = serviceRekapMonalisa.REKAPITULASI_GANGGUAN_PER_JENIS_GG(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST REKAPITULASI GANGGUAN PER JENIS GANGGUAN
    // POST REKAPITULASI LAPOR ULANG GANGGUAN
    @RequestMapping(
            value = "/REKAPITULASI_LAPOR_ULANG_GG",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAPITULASI_LAPOR_ULANG_GG(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);

            mOut = serviceRekapMonalisa.REKAPITULASI_LAPOR_ULANG_GG(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST REKAPITULASI LAPOR ULANG GANGGUAN
    // POST REKAPITULASI ENS GANGGUAN
    @RequestMapping(
            value = "/REKAPITULASI_ENS_GG",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAPITULASI_ENS_GG(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);

            mOut = serviceRekapMonalisa.REKAPITULASI_ENS_GG(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST REKAPITULASI ENS GANGGUAN
    // POST REKAPITULASI KELUHAN BELUM SELESAI
    @RequestMapping(
            value = "/REKAPITULASI_KELUHAN_BELUM_SELESAI_GG",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAPITULASI_KELUHAN_BELUM_SELESAI_GG(
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

            mOut = serviceRekapMonalisa.REKAPITULASI_KELUHAN_BELUM_SELESAI_GG(mIn);
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

    // END POST REKAPITULASI KELUHAN BELUM SELESAI
    // END GANGGUAN
    // KELUHAN
    // POST JUMLAH KALI KELUHAN
    @RequestMapping(
            value = "/JUMLAH_KALI_KELUHAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> JUMLAH_KALI_KELUHAN(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);

            mOut = serviceRekapMonalisa.JUMLAH_KALI_KELUHAN(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST JUMLAH KALI KELUHAN
    // POST RCT (KELUHAN)
    @RequestMapping(
            value = "/RCT",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> RCT(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);

            mOut = serviceRekapMonalisa.RCT(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST RCT (KELUHAN)
    // POST RPT (KELUHAN)
    @RequestMapping(
            value = "/RPT",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> RPT(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);

            mOut = serviceRekapMonalisa.RPT(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST RPT (KELUHAN)
    // POST REKAPITULASI KELUHAN PER JENIS KELUHAN
    @RequestMapping(
            value = "/REKAPITULASI_KELUHAN_PER_JENIS_KELUHAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAPITULASI_KELUHAN_PER_JENIS_KELUHAN(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);

            mOut = serviceRekapMonalisa.REKAPITULASI_KELUHAN_PER_JENIS_KELUHAN(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST REKAPITULASI KELUHAN PER JENIS KELUHAN
    // POST REKAPITULASI LAPOR ULANG KELUHAN
    @RequestMapping(
            value = "/REKAPITULASI_LAPOR_ULANG_KELUHAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAPITULASI_LAPOR_ULANG_KELUHAN(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " P_USER : " + P_USER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USER", P_USER);
            mIn.put("p_blth", p_blth);

            mOut = serviceRekapMonalisa.REKAPITULASI_LAPOR_ULANG_KELUHAN(mIn);
            logger.info("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_blth + " | " + P_USER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST REKAPITULASI LAPOR ULANG KELUHAN
    // POST REKAPITULASI KELUHAN BELUM SELESAI
    @RequestMapping(
            value = "/REKAPITULASI_KELUHAN_BELUM_SELESAI",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAPITULASI_KELUHAN_BELUM_SELESAI(
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

            mOut = serviceRekapMonalisa.REKAPITULASI_KELUHAN_BELUM_SELESAI(mIn);
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

    // END POST REKAPITULASI KELUHAN BELUM SELESAI
    // END KELUHAN
}
