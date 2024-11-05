package rest.iconpln.rest.LOG;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.LOG.ServiceScada;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/log/")
public class RestScada {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestPlnMobileJobRequestEvent.class);

    @Autowired
    private ServiceScada serviceScada;

    // GET
    @RequestMapping(
            value = "/GET_USER_SCADA2",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> GET_USER_SCADA2() {
        Map mOut = null;
        try {
            logger.info(
                    "===| GET_USER_SCADA2  "
                    + " |==="
            );
            Map mIn = new HashMap();
            mOut = serviceScada.GET_USER_SCADA2(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " GET_USER_SCADA2 |"
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
                    + " GET_USER_SCADA2 |"
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/LOG_SCADA",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> LOG_SCADA(
            @RequestParam(
                    value = "p_user_scada",
                    defaultValue = ""
            ) String p_user_scada,
            @RequestParam(value = "p_tglawal", defaultValue = "") String p_tglawal,
            @RequestParam(value = "p_tglakhir", defaultValue = "") String p_tglakhir
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_user_scada : " + p_user_scada + " , "
                    + " p_tglawal : " + p_tglawal + " , "
                    + " p_tglakhir : " + p_tglakhir + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_user_scada", p_user_scada);
            mIn.put("p_tglawal", p_tglawal);
            mIn.put("p_tglakhir", p_tglakhir);
            mOut = serviceScada.LOG_SCADA(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_user_scada : " + p_user_scada + " | "
                    + " p_tglawal : " + p_tglawal + " | "
                    + " p_tglakhir : " + p_tglakhir + " | "
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
                    + " p_user_scada : " + p_user_scada + " | "
                    + " p_tglawal : " + p_tglawal + " | "
                    + " p_tglakhir : " + p_tglakhir + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
}
