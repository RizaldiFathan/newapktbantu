package rest.iconpln.rest.MasterData;

import rest.iconpln.rest.ManagementUsers.*;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.MasterData.ServiceMasterQINS;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/master-data/")
public class MasterQINS {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(MasterQINS.class);
    @Autowired

    private ServiceMasterQINS serviceMasterQINS;

    // GET
    @RequestMapping(
            value = "/MASTER_QINS",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> MASTER_QINS() {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " MASTER_QINS "
                    + " |==="
            );
            Map mIn = new HashMap();
            mOut = serviceMasterQINS.MASTER_QINS(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " MASTER_QINS "
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
                    + " MASTER_QINS "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/INPUT_MASTER_QINS",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> INPUT_MASTER_QINS(
            @RequestParam(value = "P_UNIT", defaultValue = "") String P_UNIT
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_UNIT : " + P_UNIT + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_UNIT", P_UNIT);
            mOut = serviceMasterQINS.INPUT_MASTER_QINS(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_UNIT : " + P_UNIT + " | "
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
                    + " P_UNIT : " + P_UNIT + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/DELETE_MASTER_QINS",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> DELETE_MASTER_QINS(
            @RequestParam(value = "P_UNIT", defaultValue = "") String P_UNIT,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_UNIT : " + P_UNIT + " , "
                    + " P_USER : " + P_USER + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_UNIT", P_UNIT);
            mIn.put("P_USER", P_USER);
            mOut = serviceMasterQINS.DELETE_MASTER_QINS(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_UNIT : " + P_UNIT + " | "
                    + " P_USER : " + P_USER + " | "
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
                    + " P_UNIT : " + P_UNIT + " | "
                    + " P_USER : " + P_USER + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
