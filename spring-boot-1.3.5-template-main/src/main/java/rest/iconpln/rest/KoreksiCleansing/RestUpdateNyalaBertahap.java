package rest.iconpln.rest.KoreksiCleansing;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.KoreksiCleansing.ServiceUpdateNyalaBertahap;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/koreksi-cleansing/")
public class RestUpdateNyalaBertahap {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestUpdateNyalaBertahap.class);

    @Autowired
    private ServiceUpdateNyalaBertahap serviceUpdateNyalaBertahap;
    // GET
    @RequestMapping(
            value = "/UPDATE_NYALA_BERTAHAP",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> UPDATE_NYALA_BERTAHAP(
            @RequestParam(value = "p_nolapor", defaultValue = "") String p_nolapor
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_nolapor : " + p_nolapor + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_nolapor", p_nolapor);
            mOut = serviceUpdateNyalaBertahap.UPDATE_NYALA_BERTAHAP(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_nolapor : " + p_nolapor + " | " +
                            " OUT = " + mOut +
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
                            " p_nolapor : " + p_nolapor + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // GET
    @RequestMapping(
            value = "/POST_UPDATE_NYALA_BERTAHAP",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_UPDATE_NYALA_BERTAHAP(
            @RequestParam(value = "P_NOLAPORAN", defaultValue = "") String P_NOLAPORAN,
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(value = "P_NO_TICKET", defaultValue = "") String P_NO_TICKET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_NOLAPORAN : " + P_NOLAPORAN + " , " +
                            " P_USERNAME : " + P_USERNAME + " , " +
                            " P_NO_TICKET : " + P_NO_TICKET + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_NOLAPORAN", P_NOLAPORAN);
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("P_NO_TICKET", P_NO_TICKET);
            mOut = serviceUpdateNyalaBertahap.POST_UPDATE_NYALA_BERTAHAP(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_NOLAPORAN : " + P_NOLAPORAN + " | " +
                            " P_USERNAME : " + P_USERNAME + " | " +
                            " P_NO_TICKET : " + P_NO_TICKET + " | " +
                            " OUT = " + mOut +
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
                            " P_NOLAPORAN : " + P_NOLAPORAN + " | " +
                            " P_USERNAME : " + P_USERNAME + " | " +
                            " P_NO_TICKET : " + P_NO_TICKET + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
}
