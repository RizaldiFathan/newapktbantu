package rest.iconpln.rest.KoreksiCleansing;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.KoreksiCleansing.ServiceResetBatasKoreksi;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/koreksi-cleansing/")
public class RestResetBatasKoreksi {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestResetBatasKoreksi.class);

    @Autowired
    private ServiceResetBatasKoreksi serviceResetBatasKoreksi;

    // GET
    @RequestMapping(
            value = "/RESET_BATAS_KORESI",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> RESET_BATAS_KORESI(
            @RequestParam(value = "P_NO_LAPORAN", defaultValue = "") String P_NO_LAPORAN
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_NO_LAPORAN : " + P_NO_LAPORAN + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_NO_LAPORAN", P_NO_LAPORAN);
            mOut = serviceResetBatasKoreksi.RESET_BATAS_KORESI(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_NO_LAPORAN : " + P_NO_LAPORAN + " | " +
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
                            " P_NO_LAPORAN : " + P_NO_LAPORAN + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_RESET_BATAS_KORESI",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_RESET_BATAS_KORESI(
            @RequestParam(value = "P_NOLAPORAN", defaultValue = "") String P_NOLAPORAN,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER,
            @RequestParam(value = "P_NO_TICKET", defaultValue = "") String P_NO_TICKET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_NOLAPORAN : " + P_NOLAPORAN + " , " +
                            " P_USER : " + P_USER + " , " +
                            " P_NO_TICKET : " + P_NO_TICKET + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_NOLAPORAN", P_NOLAPORAN);
            mIn.put("P_USER", P_USER);
            mIn.put("P_NO_TICKET", P_NO_TICKET);
            mOut = serviceResetBatasKoreksi.POST_RESET_BATAS_KORESI(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_NOLAPORAN : " + P_NOLAPORAN + " | " +
                            " P_USER : " + P_USER + " | " +
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
                            " P_USER : " + P_USER + " | " +
                            " P_NO_TICKET : " + P_NO_TICKET + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
