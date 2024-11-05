package rest.iconpln.rest.Rantask;

import rest.iconpln.rest.Pencarian.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.Rantask.ServiceRuntask1row;

@RestController
@RequestMapping("/runtask/")
public class Runtask1row {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(Runtask1row.class
    );
    @Autowired

    private ServiceRuntask1row serviceRuntask1row;

    // GET
    @RequestMapping(
            value = "/RUNTASK_1ROW",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> RUNTASK_1ROW(
            @RequestParam(value = "p_nolapor", defaultValue = "") String p_nolapor
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_nolapor : " + p_nolapor + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_nolapor", p_nolapor);

            mOut = serviceRuntask1row.RUNTASK_1ROW(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_nolapor : " + p_nolapor + " | "
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
                    + " p_nolapor : " + p_nolapor + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/GET_Runtask_AFT",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_Runtask_AFT(
            @RequestParam(value = "p_nolapor", defaultValue = "") String p_nolapor
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_nolapor : " + p_nolapor + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_nolapor", p_nolapor);

            mOut = serviceRuntask1row.GET_Runtask_AFT(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_nolapor : " + p_nolapor + " | "
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
                    + " p_nolapor : " + p_nolapor + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_RUNTASK_1ROW",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_RUNTASK_1ROW(
            @RequestParam(value = "P_NOLAPORAN", defaultValue = "") String P_NOLAPORAN,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER,
            @RequestParam(value = "P_NOTICKET", defaultValue = "") String P_NOTICKET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_NOLAPORAN : " + P_NOLAPORAN + " , "
                    + " P_USER : " + P_USER + " , "
                    + " P_NOTICKET : " + P_NOTICKET + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_NOLAPORAN", P_NOLAPORAN);
            mIn.put("P_USER", P_USER);
            mIn.put("P_NOTICKET", P_NOTICKET);
            mOut = serviceRuntask1row.POST_RUNTASK_1ROW(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_NOTICKET : " + P_NOTICKET + " | "
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
                    + " P_NOTICKET : " + P_NOTICKET + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
