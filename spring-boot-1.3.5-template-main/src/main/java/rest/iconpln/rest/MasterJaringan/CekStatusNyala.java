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
import rest.iconpln.service.MasterJaringan.ServiceCekStatusNyala;

@RestController
@RequestMapping("/master-jaringan/")
public class CekStatusNyala {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(CekStatusNyala.class
    );
    @Autowired

    private ServiceCekStatusNyala serviceCekStatusNyala;

    // GET
    @RequestMapping(
            value = "/STATUS_NYALA",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> STATUS_NYALA(
            @RequestParam(value = "p_kodeasset", defaultValue = "") String p_kodeasset
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_kodeasset : " + p_kodeasset + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_kodeasset", p_kodeasset);

            mOut = serviceCekStatusNyala.STATUS_NYALA(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_kodeasset : " + p_kodeasset + " | "
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
                    + " p_kodeasset : " + p_kodeasset + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_STATUS_NYALA",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_STATUS_NYALA(
            @RequestParam(value = "P_KODEASSET", defaultValue = "") String P_KODEASSET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_KODEASSET : " + P_KODEASSET + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_KODEASSET", P_KODEASSET);

            mOut = serviceCekStatusNyala.POST_STATUS_NYALA(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_KODEASSET : " + P_KODEASSET + " | "
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
                    + " P_KODEASSET : " + P_KODEASSET + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
