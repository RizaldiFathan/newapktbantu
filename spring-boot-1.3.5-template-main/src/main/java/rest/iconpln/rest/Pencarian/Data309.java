package rest.iconpln.rest.Pencarian;

import rest.iconpln.rest.MasterJaringan.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.Pencarian.ServiceData309;

@RestController
@RequestMapping("/pencarian/")
public class Data309 {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(Data309.class
    );
    @Autowired

    private ServiceData309 serviceData309;
    // GET

    @RequestMapping(
            value = "/DATA_309_SS_309_NASIONAL",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> DATA_309_SS_309_NASIONAL(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_blth : " + p_blth + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_blth", p_blth);

            mOut = serviceData309.DATA_309_SS_309_NASIONAL(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_blth : " + p_blth + " | "
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
                    + " p_blth : " + p_blth + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/DATA_309_SS_309_BATAM",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> DATA_309_SS_309_BATAM(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_blth : " + p_blth + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_blth", p_blth);

            mOut = serviceData309.DATA_309_SS_309_BATAM(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_blth : " + p_blth + " | "
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
                    + " p_blth : " + p_blth + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/DATA_309_SS_DAYA_PER_PELANGGAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> DATA_309_SS_DAYA_PER_PELANGGAN(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_blth : " + p_blth + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_blth", p_blth);

            mOut = serviceData309.DATA_309_SS_DAYA_PER_PELANGGAN(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_blth : " + p_blth + " | "
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
                    + " p_blth : " + p_blth + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/DATA_309_SS_REKAP",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> DATA_309_SS_REKAP(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_blth : " + p_blth + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_blth", p_blth);

            mOut = serviceData309.DATA_309_SS_REKAP(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_blth : " + p_blth + " | "
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
                    + " p_blth : " + p_blth + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
}
