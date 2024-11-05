package rest.iconpln.rest.KoreksiCleansing;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.KoreksiCleansing.ServiceCleansingIndividual;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/koreksi-cleansing/")
public class RestCleansingIndividual {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestCleansingIndividual.class);

    @Autowired
    private ServiceCleansingIndividual serviceCleansingIndividual;

    // GET
    @RequestMapping(
            value = "/GET_CLEANSING_INDIVIDUAL",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_CLEANSING_INDIVIDUAL(
            @RequestParam(
                    value = "P_REPORTNUMBER",
                    defaultValue = ""
            ) String P_REPORTNUMBER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_REPORTNUMBER : " + P_REPORTNUMBER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_REPORTNUMBER", P_REPORTNUMBER);

            mOut = serviceCleansingIndividual.GET_CLEANSING_INDIVIDUAL(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_REPORTNUMBER : " + P_REPORTNUMBER + " | " +
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
                            " P_REPORTNUMBER : " + P_REPORTNUMBER + " | " +
                            " OUT = "+ mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_CLEANSING_INDIVIDUAL",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_CLEANSING_INDIVIDUAL(
            @RequestParam(
                    value = "P_REPORTNUMBER",
                    defaultValue = ""
            ) String P_REPORTNUMBER,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER,
            @RequestParam(value = "P_NOTICKET", defaultValue = "") String P_NOTICKET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_REPORTNUMBER : " + P_REPORTNUMBER + " , " +
                            " P_USER : " + P_USER + " , " +
                            " P_NOTICKET : " + P_NOTICKET + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_REPORTNUMBER", P_REPORTNUMBER);
            mIn.put("P_USER", P_USER);
            mIn.put("P_NOTICKET", P_NOTICKET);

            mOut = serviceCleansingIndividual.POST_CLEANSING_INDIVIDUAL(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_REPORTNUMBER : " + P_REPORTNUMBER + " | " +
                            " P_USER : " + P_USER + " | " +
                            " P_NOTICKET : " + P_NOTICKET + " | " +
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
                            " P_REPORTNUMBER : " + P_REPORTNUMBER + " | " +
                            " P_USER : " + P_USER + " | " +
                            " P_NOTICKET : " + P_NOTICKET + " | " +
                            " OUT = "+ mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
