package rest.iconpln.rest.RequestData;

import rest.iconpln.rest.Rantask.*;
import rest.iconpln.rest.Pencarian.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.RequestData.ServiceDownloadData;

@RestController
@RequestMapping("/request-data/")
public class DownloadData {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(DownloadData.class
    );
    @Autowired

    private ServiceDownloadData serviceDownloadData;

    // GANGGUAN PLGN DISJAYA + DISBANTEN CREATED BY CC JKT
    @RequestMapping(
            value = "/GET_RKP_GG_JAYABANTEN_CCJKT",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_RKP_GG_JAYABANTEN_CCJKT(
            @RequestParam(value = "tgl_awal", defaultValue = "") String tgl_awal,
            @RequestParam(value = "tgl_akhir", defaultValue = "") String tgl_akhir
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " tgl_awal : " + tgl_awal + " , "
                    + " tgl_akhir : " + tgl_akhir + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("tgl_awal", tgl_awal);
            mIn.put("tgl_akhir", tgl_akhir);

            mOut = serviceDownloadData.GET_RKP_GG_JAYABANTEN_CCJKT(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " tgl_awal : " + tgl_awal + " | "
                    + " tgl_akhir : " + tgl_akhir + " | "
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
                    + " tgl_awal : " + tgl_awal + " | "
                    + " tgl_akhir : " + tgl_akhir + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GANGGUAN PLGN DISJAYA + DISBANTEN CREATED BY CC JKT
    // KELUHAN PLGN DISJAYA + DISBANTEN CREATED BY CC JKT
    @RequestMapping(
            value = "/GET_RKP_KL_JAYABANTEN_CCJKT",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_RKP_KL_JAYABANTEN_CCJKT(
            @RequestParam(value = "tgl_awal", defaultValue = "") String tgl_awal,
            @RequestParam(value = "tgl_akhir", defaultValue = "") String tgl_akhir
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " tgl_awal : " + tgl_awal + " , "
                    + " tgl_akhir : " + tgl_akhir + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("tgl_awal", tgl_awal);
            mIn.put("tgl_akhir", tgl_akhir);

            mOut = serviceDownloadData.GET_RKP_KL_JAYABANTEN_CCJKT(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " tgl_awal : " + tgl_awal + " | "
                    + " tgl_akhir : " + tgl_akhir + " | "
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
                    + " tgl_awal : " + tgl_awal + " | "
                    + " tgl_akhir : " + tgl_akhir + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END KELUHAN PLGN DISJAYA + DISBANTEN CREATED BY CC JKT
    // GANGGUAN PLGN DISJAYA + DISBANTEN CREATED NOT BY CC JKT
    @RequestMapping(
            value = "/GET_RKP_GG_JAYABANTEN_NOTCCJKT",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_RKP_GG_JAYABANTEN_NOTCCJKT(
            @RequestParam(value = "tgl_awal", defaultValue = "") String tgl_awal,
            @RequestParam(value = "tgl_akhir", defaultValue = "") String tgl_akhir
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " tgl_awal : " + tgl_awal + " , "
                    + " tgl_akhir : " + tgl_akhir + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("tgl_awal", tgl_awal);
            mIn.put("tgl_akhir", tgl_akhir);

            mOut = serviceDownloadData.GET_RKP_GG_JAYABANTEN_NOTCCJKT(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " tgl_awal : " + tgl_awal + " | "
                    + " tgl_akhir : " + tgl_akhir + " | "
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
                    + " tgl_awal : " + tgl_awal + " | "
                    + " tgl_akhir : " + tgl_akhir + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GANGGUAN PLGN DISJAYA + DISBANTEN CREATED NOT BY CC JKT
    // KELUHAN PLGN DISJAYA + DISBANTEN  CREATED NOT BY CC JKT
    @RequestMapping(
            value = "/GET_RKP_KL_JAYABANTEN_NOTCCJKT",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_RKP_KL_JAYABANTEN_NOTCCJKT(
            @RequestParam(value = "tgl_awal", defaultValue = "") String tgl_awal,
            @RequestParam(value = "tgl_akhir", defaultValue = "") String tgl_akhir
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " tgl_awal : " + tgl_awal + " , "
                    + " tgl_akhir : " + tgl_akhir + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("tgl_awal", tgl_awal);
            mIn.put("tgl_akhir", tgl_akhir);

            mOut = serviceDownloadData.GET_RKP_KL_JAYABANTEN_NOTCCJKT(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " tgl_awal : " + tgl_awal + " | "
                    + " tgl_akhir : " + tgl_akhir + " | "
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
                    + " tgl_awal : " + tgl_awal + " | "
                    + " tgl_akhir : " + tgl_akhir + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END KELUHAN PLGN DISJAYA + DISBANTEN  CREATED NOT BY CC JKT

    // ===================================================================== //
    // GET_RKP_SADFI_ENS_AREA_THN
    @RequestMapping(
            value = "/GET_RKP_SADFI_ENS_AREA_THN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_RKP_SADFI_ENS_AREA_THN(
            @RequestParam(value = "P_DIST", defaultValue = "") String P_DIST,
            @RequestParam(value = "P_THN", defaultValue = "") String P_THN
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_DIST: " + P_DIST + " , "
                    + " P_THN: " + P_THN + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_DIST", P_DIST);
            mIn.put("P_THN", P_THN);

            mOut = serviceDownloadData.GET_RKP_SADFI_ENS_AREA_THN(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_DIST : " + P_DIST + " | "
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
                    + " P_DIST : " + P_DIST + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END GET_RKP_SADFI_ENS_AREA_THN

    // GET_RKP_SADFI_ENS_ULP_THN
    @RequestMapping(
            value = "/GET_RKP_SADFI_ENS_ULP_THN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_RKP_SADFI_ENS_ULP_THN(
            @RequestParam(value = "P_DIST", defaultValue = "") String P_DIST,
            @RequestParam(value = "P_THN", defaultValue = "") String P_THN
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_DIST: " + P_DIST + " , "
                    + " P_THN: " + P_THN + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_DIST", P_DIST);
            mIn.put("P_THN", P_THN);

            mOut = serviceDownloadData.GET_RKP_SADFI_ENS_ULP_THN(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_DIST : " + P_DIST + " | "
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
                    + " P_DIST : " + P_DIST + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END GET_RKP_SADFI_ENS_ULP_THN

    // ===================================================================== //
    // DATA USER AKTIF
    @RequestMapping(
            value = "/GET_DATA_USER_AKTF",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_DATA_USER_AKTF(
            @RequestParam(value = "P_DIST", defaultValue = "") String P_DIST
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_DIST: " + P_DIST + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_DIST", P_DIST);

            mOut = serviceDownloadData.GET_DATA_USER_AKTF(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_DIST : " + P_DIST + " | "
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
                    + " P_DIST : " + P_DIST + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END DATA USER AKTIF

    // LOG LOGIN USER
    @RequestMapping(
            value = "/LOG_LOGIN_USER",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> LOG_LOGIN_USER(
            @RequestParam(value = "tgl_awal", defaultValue = "") String tgl_awal,
            @RequestParam(value = "tgl_akhir", defaultValue = "") String tgl_akhir
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " tgl_awal: " + tgl_awal + " , "
                    + " tgl_akhir: " + tgl_akhir + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("tgl_awal", tgl_awal);
            mIn.put("tgl_akhir", tgl_akhir);

            mOut = serviceDownloadData.LOG_LOGIN_USER(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " tgl_awal : " + tgl_awal + " | "
                    + " tgl_akhir : " + tgl_akhir + " | "
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
                    + " tgl_awal : " + tgl_awal + " | "
                    + " tgl_akhir : " + tgl_akhir + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END LOG LOGIN USER
    // ===================================================================== //
    // DATA CICO
    @RequestMapping(
            value = "/GET_DATA_CICO",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_DATA_CICO(
            @RequestParam(value = "P_BLTH", defaultValue = "") String P_BLTH,
            @RequestParam(value = "P_DIST", defaultValue = "") String P_DIST,
            @RequestParam(value = "P_AREA", defaultValue = "") String P_AREA
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_BLTH : " + P_BLTH + " , "
                    + " P_DIST : " + P_DIST + " , "
                    + " P_AREA : " + P_AREA + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_BLTH", P_BLTH);
            mIn.put("P_DIST", P_DIST);
            mIn.put("P_AREA", P_AREA);

            mOut = serviceDownloadData.GET_DATA_CICO(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_BLTH : " + P_BLTH + " | "
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
                    + " P_BLTH : " + P_BLTH + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END DATA CICO

    // REKAP DATA MAINGING
    @RequestMapping(
            value = "/REKAP_DATA_MAINGING",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_DATA_MAINGING(
            @RequestParam(value = "p_dist", defaultValue = "") String p_dist,
            @RequestParam(value = "p_tgl1", defaultValue = "") String p_tgl1,
            @RequestParam(value = "p_tgl2", defaultValue = "") String p_tgl2
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_dist : " + p_dist + " , "
                    + " p_tgl1 : " + p_tgl1 + " , "
                    + " p_tgl2 : " + p_tgl2 + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_dist", p_dist);
            mIn.put("p_tgl1", p_tgl1);
            mIn.put("p_tgl2", p_tgl2);

            mOut = serviceDownloadData.REKAP_DATA_MAINGING(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_dist : " + p_dist + " | "
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
                    + " p_dist : " + p_dist + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END REKAP DATA MAINGING

    // DATA TRANSAKSI TM
    @RequestMapping(
            value = "/DATA_TRANSAKSI_TM",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> DATA_TRANSAKSI_TM(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "p_dist", defaultValue = "") String p_dist,
            @RequestParam(value = "p_area", defaultValue = "") String p_area,
            @RequestParam(value = "p_rayon", defaultValue = "") String p_rayon
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_blth : " + p_blth + " , "
                    + " p_dist : " + p_dist + " , "
                    + " p_area : " + p_area + " , "
                    + " p_rayon : " + p_rayon + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_blth", p_blth);
            mIn.put("p_dist", p_dist);
            mIn.put("p_area", p_area);
            mIn.put("p_rayon", p_rayon);

            mOut = serviceDownloadData.DATA_TRANSAKSI_TM(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_blth : " + p_blth + " | "
                    + " p_dist : " + p_dist + " | "
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
                    + " p_blth : " + p_blth + " | "
                    + " p_dist : " + p_dist + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END DATA TRANSAKSI TM

    // DATA GANGGUAN INDIVIDUAL
    @RequestMapping(
            value = "/DATA_GANGGUAN_INDIVIDUAL",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> DATA_GANGGUAN_INDIVIDUAL(
            @RequestParam(value = "p_dist", defaultValue = "") String p_dist,
            @RequestParam(value = "p_tgl1", defaultValue = "") String p_tgl1,
            @RequestParam(value = "p_tgl2", defaultValue = "") String p_tgl2
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_dist : " + p_dist + " , "
                    + " p_tgl1 : " + p_tgl1 + " , "
                    + " p_tgl2 : " + p_tgl2 + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_dist", p_dist);
            mIn.put("p_tgl1", p_tgl1);
            mIn.put("p_tgl2", p_tgl2);

            mOut = serviceDownloadData.DATA_GANGGUAN_INDIVIDUAL(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_dist : " + p_dist + " | "
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
                    + " p_dist : " + p_dist + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END DATA GANGGUAN INDIVIDUAL

    // DATA TRANSAKSI TM < 5
    @RequestMapping(
            value = "/DATA_TRANSAKSI_TM_U5",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> DATA_TRANSAKSI_TM_U5(
            @RequestParam(value = "p_dist", defaultValue = "") String p_dist,
            @RequestParam(value = "P_BLTH", defaultValue = "") String P_BLTH
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_dist : " + p_dist + " , "
                    + " P_BLTH : " + P_BLTH + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_dist", p_dist);
            mIn.put("P_BLTH", P_BLTH);

            mOut = serviceDownloadData.DATA_TRANSAKSI_TM_U5(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_dist : " + p_dist + " | "
                    + " P_BLTH : " + P_BLTH + " | "
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
                    + " p_dist : " + p_dist + " | "
                    + " P_BLTH : " + P_BLTH + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END DATA TRANSAKSI TM < 5

    // PEMADAMAN TERENCANA
    @RequestMapping(
            value = "/PEMADAMAN_TERENCANA",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> PEMADAMAN_TERENCANA(
            @RequestParam(value = "p_dist", defaultValue = "") String p_dist,
            @RequestParam(value = "P_BLTH", defaultValue = "") String P_BLTH
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_dist : " + p_dist + " , "
                    + " P_BLTH : " + P_BLTH + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_dist", p_dist);
            mIn.put("P_BLTH", P_BLTH);

            mOut = serviceDownloadData.PEMADAMAN_TERENCANA(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_dist : " + p_dist + " | "
                    + " P_BLTH : " + P_BLTH + " | "
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
                    + " p_dist : " + p_dist + " | "
                    + " P_BLTH : " + P_BLTH + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END PEMADAMAN TERENCANA

    // DATA KELUHAN
    @RequestMapping(
            value = "/DATA_KELUHAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> DATA_KELUHAN(
            @RequestParam(value = "p_dist", defaultValue = "") String p_dist,
            @RequestParam(value = "p_tgl1", defaultValue = "") String p_tgl1,
            @RequestParam(value = "p_tgl2", defaultValue = "") String p_tgl2
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_dist : " + p_dist + " , "
                    + " p_tgl1 : " + p_tgl1 + " , "
                    + " p_tgl2 : " + p_tgl2 + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_dist", p_dist);
            mIn.put("p_tgl1", p_tgl1);
            mIn.put("p_tgl2", p_tgl2);

            mOut = serviceDownloadData.DATA_KELUHAN(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_dist : " + p_dist + " | "
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
                    + " p_dist : " + p_dist + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END DATA KELUHAN

    // REKAP CANCEL ORDER
    @RequestMapping(
            value = "/REKAP_CANCEL_ORDER",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_CANCEL_ORDER(
            @RequestParam(value = "p_dist", defaultValue = "") String p_dist,
            @RequestParam(value = "p_tgl1", defaultValue = "") String p_tgl1,
            @RequestParam(value = "p_tgl2", defaultValue = "") String p_tgl2
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_dist : " + p_dist + " , "
                    + " p_tgl1 : " + p_tgl1 + " , "
                    + " p_tgl2 : " + p_tgl2 + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_dist", p_dist);
            mIn.put("p_tgl1", p_tgl1);
            mIn.put("p_tgl2", p_tgl2);

            mOut = serviceDownloadData.REKAP_CANCEL_ORDER(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_dist : " + p_dist + " | "
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
                    + " p_dist : " + p_dist + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END REKAP CANCEL ORDER

    // Rekap Data Gangguan Dan Keluhan
    @RequestMapping(
            value = "/REKAP_DATA_GANGGUAN_DAN_KELUHAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_DATA_GANGGUAN_DAN_KELUHAN(
            @RequestParam(value = "p_tgl_mulai", defaultValue = "") String p_tgl_mulai,
            @RequestParam(
                    value = "p_tgl_selesai",
                    defaultValue = ""
            ) String p_tgl_selesai,
            @RequestParam(value = "p_blth_awal", defaultValue = "") String p_blth_awal,
            @RequestParam(
                    value = "p_blth_selesai",
                    defaultValue = ""
            ) String p_blth_selesai
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_tgl_mulai : " + p_tgl_mulai + " , "
                    + " p_tgl_selesai : " + p_tgl_selesai + " , "
                    + " p_blth_awal : " + p_blth_awal + " , "
                    + " p_blth_selesai : " + p_blth_selesai + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_tgl_mulai", p_tgl_mulai);
            mIn.put("p_tgl_selesai", p_tgl_selesai);
            mIn.put("p_blth_awal", p_blth_awal);
            mIn.put("p_blth_selesai", p_blth_selesai);

            mOut = serviceDownloadData.REKAP_DATA_GANGGUAN_DAN_KELUHAN(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_tgl_mulai : " + p_tgl_mulai + " | "
                    + " p_tgl_selesai : " + p_tgl_selesai + " | "
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
                    + " p_tgl_mulai : " + p_tgl_mulai + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END Rekap Data Gangguan Dan Keluhan

    // ===================================================================== //
}
