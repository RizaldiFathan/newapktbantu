package rest.iconpln.rest.LOG;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.LOG.ServiceErrorsProcedure;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/log/")
public class RestErrorsProcedure {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestAutoDispatch.class);
    @Autowired
    private ServiceErrorsProcedure serviceErrorsProcedure;

    // GET
    @RequestMapping(
            value = "/GET_ERRORLOGS_REPORTAPKT",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_ERRORLOGS_REPORTAPKT(
            @RequestParam(value = "P_TGL_AWAL", defaultValue = "") String P_TGL_AWAL,
            @RequestParam(value = "P_TGL_AKHIR", defaultValue = "") String P_TGL_AKHIR
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_TGL_AWAL : " + P_TGL_AWAL + " , "
                    + " P_TGL_AKHIR : " + P_TGL_AKHIR + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_TGL_AWAL", P_TGL_AWAL);
            mIn.put("P_TGL_AKHIR", P_TGL_AKHIR);
            mOut = serviceErrorsProcedure.GET_ERRORLOGS_REPORTAPKT(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_TGL_AWAL : " + P_TGL_AWAL + " | "
                    + " P_TGL_AKHIR : " + P_TGL_AKHIR + " | "
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
                    + " P_TGL_AWAL : " + P_TGL_AWAL + " | "
                    + " P_TGL_AKHIR : " + P_TGL_AKHIR + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/GET_ERRORLOGS_PLNADMIN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_ERRORLOGS_PLNADMIN(
            @RequestParam(value = "P_TGL_AWAL", defaultValue = "") String P_TGL_AWAL,
            @RequestParam(value = "P_TGL_AKHIR", defaultValue = "") String P_TGL_AKHIR
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_TGL_AWAL : " + P_TGL_AWAL + " , "
                    + " P_TGL_AKHIR : " + P_TGL_AKHIR + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_TGL_AWAL", P_TGL_AWAL);
            mIn.put("P_TGL_AKHIR", P_TGL_AKHIR);
            mOut = serviceErrorsProcedure.GET_ERRORLOGS_PLNADMIN(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_TGL_AWAL : " + P_TGL_AWAL + " | "
                    + " P_TGL_AKHIR : " + P_TGL_AKHIR + " | "
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
                    + " P_TGL_AWAL : " + P_TGL_AWAL + " | "
                    + " P_TGL_AKHIR : " + P_TGL_AKHIR + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
}
