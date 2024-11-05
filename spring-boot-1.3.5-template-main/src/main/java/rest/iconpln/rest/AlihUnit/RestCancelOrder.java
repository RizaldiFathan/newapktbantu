package rest.iconpln.rest.AlihUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.db.DaoAmicon;
import rest.iconpln.service.AlihUnit.ServiceCancelOrder;
import rest.iconpln.service.AmiconService;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
// @CrossOrigin(maxAge = 3600)

@RestController
@RequestMapping("/alih-unit/")
public class RestCancelOrder {

    private static final Logger logger = LoggerFactory.getLogger(RestCancelOrder.class);

    @Autowired
    private ServiceCancelOrder serviceCancelOrder;

    @Autowired
    private AmiconService amiconService;

    @Autowired
    private DaoAmicon daoAmicon;

    public DaoAmicon getDaoAmicon() {
        return daoAmicon;
    }

    public void setDaoAmicon(DaoAmicon daoAmicon) {
        this.daoAmicon = daoAmicon;
    }

    // GET
    @RequestMapping(
            value = "/CANCEL_ORDER",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> CANCEL_ORDER(
            @RequestParam(
                    value = "P_REPORTNUMBER",
                    defaultValue = ""
            ) String P_REPORTNUMBER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_nolaporan : " + P_REPORTNUMBER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_REPORTNUMBER", P_REPORTNUMBER);

            mOut = serviceCancelOrder.CANCEL_ORDER(mIn);
            logger.info("===| OUT FROM " + P_REPORTNUMBER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.info("===| OUT FROM " + P_REPORTNUMBER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/CANCEL_ORDER_V2",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> CANCEL_ORDER_V2(
            @RequestParam(
                    value = "P_REPORTNUMBER",
                    defaultValue = ""
            ) String P_REPORTNUMBER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_nolaporan : " + P_REPORTNUMBER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_REPORTNUMBER", P_REPORTNUMBER);

            mOut = serviceCancelOrder.CANCEL_ORDER_V2(mIn);
            logger.info("===| OUT FROM " + P_REPORTNUMBER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + P_REPORTNUMBER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_CANCEL_ORDER",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_CANCEL_ORDER(
            @RequestParam(
                    value = "P_REPORTNUMBER",
                    defaultValue = ""
            ) String P_REPORTNUMBER,
            @RequestParam(value = "P_NO_TICKET", defaultValue = "") String P_NO_TICKET,
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            "p_nolaporan : " + P_REPORTNUMBER + " , " +
                            "p_dist : " + P_NO_TICKET + " , " +
                            "p_area : " + P_USERNAME + " , " +
                            " |==="
            );

            Map mIn = new HashMap();
            mIn.put("P_REPORTNUMBER", P_REPORTNUMBER);
            mIn.put("P_NO_TICKET", P_NO_TICKET);
            mIn.put("P_USERNAME", P_USERNAME);

            mOut = serviceCancelOrder.POST_CANCEL_ORDER(mIn);
            logger.info("===| OUT FROM " + P_REPORTNUMBER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + P_REPORTNUMBER + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST

}
