package rest.iconpln.rest.Eis;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.Eis.ServiceRekapDashboardInputTime;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/eis/")
public class RestRekapDashboardInputTime {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestRekapDashboardInputTime.class);

    @Autowired
    private ServiceRekapDashboardInputTime serviceRekapDashboardInputTime;
    // GET
    @RequestMapping(
            value = "/REKAP_DETAIL_INPUT_TIME",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_DETAIL_INPUT_TIME(
            @RequestParam(value = "P_TGL", defaultValue = "") String P_TGL,
            @RequestParam(value = "p_user", defaultValue = "") String p_user
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_TGL : " + P_TGL + " , " +
                            " p_user : " + p_user + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_TGL", P_TGL);
            mIn.put("p_user", p_user);

            mOut = serviceRekapDashboardInputTime.REKAP_DETAIL_INPUT_TIME(mIn);
            logger.info("===| OUT FROM " + P_TGL + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + P_TGL + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/REKAP_INPUT_TIME_SCADA",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_INPUT_TIME_SCADA(
            @RequestParam(value = "P_TGL", defaultValue = "") String P_TGL,
            @RequestParam(value = "p_user", defaultValue = "") String p_user
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_TGL : " + P_TGL + " , " +
                            " p_user : " + p_user + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_TGL", P_TGL);
            mIn.put("p_user", p_user);

            mOut = serviceRekapDashboardInputTime.REKAP_INPUT_TIME_SCADA(mIn);
            logger.info("===| OUT FROM " + P_TGL + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + P_TGL + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/REKAP_INPUT_TIME_MANUAL",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_INPUT_TIME_MANUAL(
            @RequestParam(value = "P_TGL", defaultValue = "") String P_TGL,
            @RequestParam(value = "p_user", defaultValue = "") String p_user
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_TGL : " + P_TGL + " , " +
                            " p_user : " + p_user + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_TGL", P_TGL);
            mIn.put("p_user", p_user);

            mOut = serviceRekapDashboardInputTime.REKAP_INPUT_TIME_MANUAL(mIn);
            logger.info("===| OUT FROM " + P_TGL + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + P_TGL + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
}
