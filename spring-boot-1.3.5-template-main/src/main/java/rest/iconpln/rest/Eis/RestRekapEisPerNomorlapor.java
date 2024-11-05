package rest.iconpln.rest.Eis;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.Eis.ServiceRekapEisPerNomorlapor;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/eis/")
public class RestRekapEisPerNomorlapor {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestRekapEisPerNomorlapor.class);

    @Autowired
    private ServiceRekapEisPerNomorlapor serviceRekapEisPerNomorlapor;

    // GET
    @RequestMapping(
            value = "/GET_EIS",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_EIS(
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
            mOut = serviceRekapEisPerNomorlapor.GET_EIS(mIn);
            logger.info("===| OUT FROM " + p_nolapor + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_nolapor + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_PER_NOALAP_KL",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_PER_NOALAP_KL(
            @RequestParam(value = "p_nolapor", defaultValue = "") String p_nolapor,
            @RequestParam(value = "p_user", defaultValue = "") String p_user
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_nolapor : " + p_nolapor + " , " +
                            " p_user : " + p_user + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_nolapor", p_nolapor);
            mIn.put("p_user", p_user);
            mOut = serviceRekapEisPerNomorlapor.POST_PER_NOALAP_KL(mIn);
            logger.info("===| OUT FROM " + p_nolapor + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_nolapor + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/POST_PER_NOALAP_GG",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_PER_NOALAP_GG(
            @RequestParam(value = "p_nolapor", defaultValue = "") String p_nolapor,
            @RequestParam(value = "p_user", defaultValue = "") String p_user
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_nolapor : " + p_nolapor + " , " +
                            " p_user : " + p_user + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_nolapor", p_nolapor);
            mIn.put("p_user", p_user);
            mOut = serviceRekapEisPerNomorlapor.POST_PER_NOALAP_GG(mIn);
            logger.info("===| OUT FROM " + p_nolapor + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_nolapor + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
