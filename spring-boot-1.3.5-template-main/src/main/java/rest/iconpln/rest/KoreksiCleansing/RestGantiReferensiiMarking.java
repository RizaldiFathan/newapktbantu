package rest.iconpln.rest.KoreksiCleansing;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.KoreksiCleansing.ServiceGantiReferensiiMarking;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/koreksi-cleansing/")
public class RestGantiReferensiiMarking {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestGantiReferensiiMarking.class);

    @Autowired
    private ServiceGantiReferensiiMarking serviceGantiReferensiiMarking;

    // GET
    @RequestMapping(
            value = "/GET_ReferensiMarking",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_ReferensiMarking(
            @RequestParam(value = "p_nolaporan", defaultValue = "") String p_nolaporan
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_nolaporan : " + p_nolaporan + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_nolaporan", p_nolaporan);

            mOut = serviceGantiReferensiiMarking.GET_ReferensiMarking(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_nolaporan : " + p_nolaporan + " | " +
                            " OUT = "+ mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error(
                    "===|  OUT FROM = " +
                            " p_nolaporan : " + p_nolaporan + " | " +
                            " OUT = "+ mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_ReferensiMarking",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_ReferensiMarking(
            @RequestParam(value = "p_user", defaultValue = "") String p_user,
            @RequestParam(
                    value = "p_nolaporan_baru",
                    defaultValue = ""
            ) String p_nolaporan_baru,
            @RequestParam(value = "p_nolaporan", defaultValue = "") String p_nolaporan,
            @RequestParam(value = "P_NO_TICKET", defaultValue = "") String P_NO_TICKET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_user : " + p_user + " , " +
                            " p_nolaporan_baru : " + p_nolaporan_baru + " , " +
                            " p_nolaporan : " + p_nolaporan + " , " +
                            " P_NO_TICKET : " + P_NO_TICKET + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_user", p_user);
            mIn.put("p_nolaporan_baru", p_nolaporan_baru);
            mIn.put("p_nolaporan", p_nolaporan);
            mIn.put("P_NO_TICKET", P_NO_TICKET);

            mOut = serviceGantiReferensiiMarking.POST_ReferensiMarking(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_user : " + p_user + " | " +
                            " p_nolaporan_baru : " + p_nolaporan_baru + " | " +
                            " p_nolaporan : " + p_nolaporan + " | " +
                            " P_NO_TICKET : " + P_NO_TICKET + " | " +
                            " OUT = "+ mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error(
                    "===|  OUT FROM = " +
                            " p_user : " + p_user + " | " +
                            " p_nolaporan_baru : " + p_nolaporan_baru + " | " +
                            " p_nolaporan : " + p_nolaporan + " | " +
                            " P_NO_TICKET : " + P_NO_TICKET + " | " +
                            " OUT = "+ mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
    // ATRIBUT
    @RequestMapping(
            value = "/CHEK_MARKING",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> CHEK_MARKING(
            @RequestParam(value = "p_nolaporan", defaultValue = "") String p_nolaporan
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_nolaporan : " + p_nolaporan + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_nolaporan", p_nolaporan);
            mOut = serviceGantiReferensiiMarking.CHEK_MARKING(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_nolaporan : " + p_nolaporan + " | " +
                            " OUT = "+ mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error(
                    "===|  OUT FROM = " +
                            " p_nolaporan : " + p_nolaporan + " | " +
                            " OUT = "+ mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END ATRIBUT
}
