package rest.iconpln.rest.MasterJaringan;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.MasterJaringan.ServiceInputKVATrafo;

@RestController
@RequestMapping("/master-jaringan/")
public class InputKVATrafo {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(InputKVATrafo.class
    );
    @Autowired

    private ServiceInputKVATrafo serviceInputKVATrafo;

    // GET
    @RequestMapping(
            value = "/GET_DAYA_TRAVO",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> GET_DAYA_TRAVO() {
        Map mOut = null;
        try {
//            logger.info(
//                    "===| PARAM = "
//                    + " GET_DAYA_TRAVO "
//                    + " |==="
//            );
            Map mIn = new HashMap();
            mOut = serviceInputKVATrafo.GET_DAYA_TRAVO(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " GET_DAYA_TRAVO "
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
                    + " GET_DAYA_TRAVO "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_DAYA_TRAVO",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_DAYA_TRAVO(
            @RequestParam(value = "P_daya", defaultValue = "") String P_daya
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_daya : " + P_daya + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_daya", P_daya);
            mOut = serviceInputKVATrafo.POST_DAYA_TRAVO(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_daya : " + P_daya + " | "
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
                    + " P_daya : " + P_daya + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/DEL_DAYA_TRAVO",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> DEL_DAYA_TRAVO(
            @RequestParam(value = "P_daya", defaultValue = "") String P_daya,
            @RequestParam(value = "P_user", defaultValue = "") String P_user
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_daya : " + P_daya + " , "
                    + " P_user : " + P_user + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_daya", P_daya);
            mIn.put("P_user", P_user);
            mOut = serviceInputKVATrafo.DEL_DAYA_TRAVO(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_daya : " + P_daya + " | "
                    + " P_user : " + P_user + " | "
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
                    + " P_daya : " + P_daya + " | "
                    + " P_user : " + P_user + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
