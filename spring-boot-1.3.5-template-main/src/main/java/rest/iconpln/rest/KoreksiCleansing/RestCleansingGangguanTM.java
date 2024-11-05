package rest.iconpln.rest.KoreksiCleansing;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.rest.Eis.RestSelisihDataApktEis;
import rest.iconpln.service.KoreksiCleansing.ServiceCleansingGangguanTM;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/koreksi-cleansing/")
public class RestCleansingGangguanTM {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestCleansingGangguanTM.class);

    @Autowired
    private ServiceCleansingGangguanTM serviceCleansingGangguanTM;
    // GET
    @RequestMapping(
            value = "/CLEANSING_GANGGUAN_TM",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> CLEANSING_GANGGUAN_TM(
            @RequestParam(value = "P_NOLAPORAN", defaultValue = "") String P_NOLAPORAN
    ) {
        Map mOut = null;
        try {
           logger.info(
                    "===| PARAM = " +
                            " P_NOLAPORAN : " + P_NOLAPORAN + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("PI_NOLAPORAN", P_NOLAPORAN);

            mOut = serviceCleansingGangguanTM.CLEANSING_GANGGUAN_TM(mIn);
            logger.info("===| OUT FROM " + P_NOLAPORAN + " = " + mOut);

            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + P_NOLAPORAN + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_CLEANSING_GANGGUAN_TM",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_CLEANSING_GANGGUAN_TM(
            @RequestParam(value = "p_nolaporan", defaultValue = "") String p_nolaporan,
            @RequestParam(value = "p_userid", defaultValue = "") String p_userid,
            @RequestParam(value = "p_notiket", defaultValue = "") String p_notiket
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_nolaporan : " + p_nolaporan + " , " +
                            " p_userid : " + p_userid + " , " +
                            " p_notiket : " + p_notiket + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_nolaporan", p_nolaporan);
            mIn.put("p_userid", p_userid);
            mIn.put("p_notiket", p_notiket);

            mOut = serviceCleansingGangguanTM.POST_CLEANSING_GANGGUAN_TM(mIn);
            logger.info("===| OUT FROM " + p_nolaporan + " | " + p_userid + " | " + p_notiket +" = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.info("===| OUT FROM " + p_nolaporan + " | " + p_userid + " | " + p_notiket +" = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
