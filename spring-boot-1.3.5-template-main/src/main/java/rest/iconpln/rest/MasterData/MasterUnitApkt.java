package rest.iconpln.rest.MasterData;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.MasterData.ServiceMasterUnitApkt;

@RestController
@RequestMapping("/master-data/")
public class MasterUnitApkt {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(
            MasterUnitApkt.class
    );
    @Autowired

    private ServiceMasterUnitApkt serviceMasterUnitApkt;

    // GET
    @RequestMapping(
            value = "/MASTER_UNIT_APKT_REPORTAPKT",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> MASTER_UNIT_APKT_REPORTAPKT() {
        Map mOut = null;
        try {
            logger.info("===| PARAM = "
                    + " MASTER_UNIT_APKT_REPORTAPKT "
                    + " |===");
            Map mIn = new HashMap();
            mOut = serviceMasterUnitApkt.MASTER_UNIT_APKT_REPORTAPKT(mIn);
            System.out.println("+============== KELUAR DATA ==============+");
            System.out.println("MASTER_UNIT_APKT_REPORTAPKT");
            System.out.println("mOut: " + mOut);
            System.out.println("+============== END KELUAR DATA ==============+");
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/MASTER_UNIT_APKT_PLNADMIN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> MASTER_UNIT_APKT_PLNADMIN() {
        Map mOut = null;
        try {
            logger.info("===| PARAM = " + " MASTER_UNIT_APKT_PLNADMIN " + " |===");
            Map mIn = new HashMap();
            mOut = serviceMasterUnitApkt.MASTER_UNIT_APKT_PLNADMIN(mIn);
            System.out.println("+============== KELUAR DATA ==============+");
            System.out.println("MASTER_UNIT_APKT_PLNADMIN");
            System.out.println("mOut: " + mOut);
            System.out.println("+============== END KELUAR DATA ==============+");
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error(
                    "===|  OUT FROM = "
                    + " MASTER_UNIT_APKT_PLNADMIN "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    // INPUT
    @RequestMapping(
            value = "/INPUT_UNIT_APKT_PLNADMIN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> INPUT_UNIT_APKT_PLNADMIN(
            @RequestParam(value = "P_UNITID", defaultValue = "") String P_UNITID,
            @RequestParam(value = "P_UNITCODE", defaultValue = "") String P_UNITCODE,
            @RequestParam(value = "P_UNITNAME", defaultValue = "") String P_UNITNAME,
            @RequestParam(value = "P_UNITTYPEID", defaultValue = "") String P_UNITTYPEID,
            @RequestParam(value = "P_UNITPARENT", defaultValue = "") String P_UNITPARENT,
            @RequestParam(value = "P_ADDRESS", defaultValue = "") String P_ADDRESS,
            @RequestParam(value = "P_CITY", defaultValue = "") String P_CITY,
            @RequestParam(value = "P_PHONE", defaultValue = "") int P_PHONE,
            @RequestParam(value = "P_MOBILE", defaultValue = "") int P_MOBILE,
            @RequestParam(value = "P_EMAIL", defaultValue = "") String P_EMAIL,
            @RequestParam(value = "P_ISACTIVE", defaultValue = "") int P_ISACTIVE
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_UNITID : " + P_UNITID + " , "
                    + " P_UNITCODE : " + P_UNITCODE + " , "
                    + " P_UNITNAME : " + P_UNITNAME + " , "
                    + " P_UNITTYPEID : " + P_UNITTYPEID + " , "
                    + " P_UNITPARENT : " + P_UNITPARENT + " , "
                    + " P_ADDRESS : " + P_ADDRESS + " , "
                    + " P_CITY : " + P_CITY + " , "
                    + " P_PHONE : " + P_PHONE + " , "
                    + " P_MOBILE : " + P_MOBILE + " , "
                    + " P_EMAIL : " + P_EMAIL + " , "
                    + " P_ISACTIVE : " + P_ISACTIVE + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_UNITID", P_UNITID);
            mIn.put("P_UNITCODE", P_UNITCODE);
            mIn.put("P_UNITNAME", P_UNITNAME);
            mIn.put("P_UNITTYPEID", P_UNITTYPEID);
            mIn.put("P_UNITPARENT", P_UNITPARENT);
            mIn.put("P_ADDRESS", P_ADDRESS);
            mIn.put("P_CITY", P_CITY);
            mIn.put("P_PHONE", P_PHONE);
            mIn.put("P_MOBILE", P_MOBILE);
            mIn.put("P_EMAIL", P_EMAIL);
            mIn.put("P_ISACTIVE", P_ISACTIVE);
            mOut = serviceMasterUnitApkt.INPUT_UNIT_APKT_PLNADMIN(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_UNITID : " + P_UNITID + " , "
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
                    + " P_UNITID : " + P_UNITID + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/INPUT_UNIT_APKT_REPORTAPKT",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody

    public ResponseEntity<Object> INPUT_UNIT_APKT_REPORTAPKT(
            @RequestParam(value = "P_UNITID", defaultValue = "") String P_UNITID,
            @RequestParam(value = "P_UNITCODE", defaultValue = "") String P_UNITCODE,
            @RequestParam(value = "P_UNITNAME", defaultValue = "") String P_UNITNAME,
            @RequestParam(value = "P_UNITTYPEID", defaultValue = "") String P_UNITTYPEID,
            @RequestParam(value = "P_UNITPARENT", defaultValue = "") String P_UNITPARENT,
            @RequestParam(value = "P_ADDRESS", defaultValue = "") String P_ADDRESS,
            @RequestParam(value = "P_CITY", defaultValue = "") String P_CITY,
            @RequestParam(value = "P_PHONE", defaultValue = "") int P_PHONE,
            @RequestParam(value = "P_MOBILE", defaultValue = "") int P_MOBILE,
            @RequestParam(value = "P_EMAIL", defaultValue = "") String P_EMAIL,
            @RequestParam(value = "P_ISACTIVE", defaultValue = "") int P_ISACTIVE
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_UNITID : " + P_UNITID + " , "
                    + " P_UNITCODE : " + P_UNITCODE + " , "
                    + " P_UNITNAME : " + P_UNITNAME + " , "
                    + " P_UNITTYPEID : " + P_UNITTYPEID + " , "
                    + " P_UNITPARENT : " + P_UNITPARENT + " , "
                    + " P_ADDRESS : " + P_ADDRESS + " , "
                    + " P_CITY : " + P_CITY + " , "
                    + " P_PHONE : " + P_PHONE + " , "
                    + " P_MOBILE : " + P_MOBILE + " , "
                    + " P_EMAIL : " + P_EMAIL + " , "
                    + " P_ISACTIVE : " + P_ISACTIVE + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_UNITID", P_UNITID);
            mIn.put("P_UNITCODE", P_UNITCODE);
            mIn.put("P_UNITNAME", P_UNITNAME);
            mIn.put("P_UNITTYPEID", P_UNITTYPEID);
            mIn.put("P_UNITPARENT", P_UNITPARENT);
            mIn.put("P_ADDRESS", P_ADDRESS);
            mIn.put("P_CITY", P_CITY);
            mIn.put("P_PHONE", P_PHONE);
            mIn.put("P_MOBILE", P_MOBILE);
            mIn.put("P_EMAIL", P_EMAIL);
            mIn.put("P_ISACTIVE", P_ISACTIVE);
            mOut = serviceMasterUnitApkt.INPUT_UNIT_APKT_REPORTAPKT(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_UNITID : " + P_UNITID + " | "
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
                    + " P_UNITID : " + P_UNITID + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END INPUT
    // UPDATE
    @RequestMapping(
            value = "/UPDATE_UNIT_APKT_PLNADMIN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> UPDATE_UNIT_APKT_PLNADMIN(
            @RequestParam(value = "P_UNITID_OLD", defaultValue = "") String P_UNITID_OLD,
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(value = "P_UNITID", defaultValue = "") String P_UNITID,
            @RequestParam(value = "P_UNITCODE", defaultValue = "") String P_UNITCODE,
            @RequestParam(value = "P_UNITNAME", defaultValue = "") String P_UNITNAME,
            @RequestParam(value = "P_UNITTYPEID", defaultValue = "") String P_UNITTYPEID,
            @RequestParam(value = "P_UNITPARENT", defaultValue = "") String P_UNITPARENT,
            @RequestParam(value = "P_ADDRESS", defaultValue = "") String P_ADDRESS,
            @RequestParam(value = "P_CITY", defaultValue = "") String P_CITY,
            @RequestParam(value = "P_PHONE", defaultValue = "") int P_PHONE,
            @RequestParam(value = "P_MOBILE", defaultValue = "") int P_MOBILE,
            @RequestParam(value = "P_EMAIL", defaultValue = "") String P_EMAIL,
            @RequestParam(value = "P_ISACTIVE", defaultValue = "") int P_ISACTIVE
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_UNITID_OLD : " + P_UNITID_OLD + " , "
                    + " P_USERNAME : " + P_USERNAME + " , "
                    + " P_UNITID : " + P_UNITID + " , "
                    + " P_UNITCODE : " + P_UNITCODE + " , "
                    + " P_UNITNAME : " + P_UNITNAME + " , "
                    + " P_UNITTYPEID : " + P_UNITTYPEID + " , "
                    + " P_UNITPARENT : " + P_UNITPARENT + " , "
                    + " P_ADDRESS : " + P_ADDRESS + " , "
                    + " P_CITY : " + P_CITY + " , "
                    + " P_PHONE : " + P_PHONE + " , "
                    + " P_MOBILE : " + P_MOBILE + " , "
                    + " P_EMAIL : " + P_EMAIL + " , "
                    + " P_ISACTIVE : " + P_ISACTIVE + " , "
                    + " |==="
            );
            System.out.println("+============== END MASUK DATA ==============+");
            Map mIn = new HashMap();
            mIn.put("P_UNITID_OLD", P_UNITID_OLD);
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("P_UNITID", P_UNITID);
            mIn.put("P_UNITCODE", P_UNITCODE);
            mIn.put("P_UNITNAME", P_UNITNAME);
            mIn.put("P_UNITTYPEID", P_UNITTYPEID);
            mIn.put("P_UNITPARENT", P_UNITPARENT);
            mIn.put("P_ADDRESS", P_ADDRESS);
            mIn.put("P_CITY", P_CITY);
            mIn.put("P_PHONE", P_PHONE);
            mIn.put("P_MOBILE", P_MOBILE);
            mIn.put("P_EMAIL", P_EMAIL);
            mIn.put("P_ISACTIVE", P_ISACTIVE);
            mOut = serviceMasterUnitApkt.UPDATE_UNIT_APKT_PLNADMIN(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_UNITID_OLD : " + P_UNITID_OLD + " | "
                    + " P_UNITID : " + P_UNITID + " | "
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
                    + " P_UNITID_OLD : " + P_UNITID_OLD + " | "
                    + " P_UNITID : " + P_UNITID + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/UPDATE_UNIT_APKT_REPORTAPKT",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> UPDATE_UNIT_APKT_REPORTAPKT(
            @RequestParam(value = "P_UNITID_OLD", defaultValue = "") String P_UNITID_OLD,
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(value = "P_UNITID", defaultValue = "") String P_UNITID,
            @RequestParam(value = "P_UNITCODE", defaultValue = "") String P_UNITCODE,
            @RequestParam(value = "P_UNITNAME", defaultValue = "") String P_UNITNAME,
            @RequestParam(value = "P_UNITTYPEID", defaultValue = "") String P_UNITTYPEID,
            @RequestParam(value = "P_UNITPARENT", defaultValue = "") String P_UNITPARENT,
            @RequestParam(value = "P_ADDRESS", defaultValue = "") String P_ADDRESS,
            @RequestParam(value = "P_CITY", defaultValue = "") String P_CITY,
            @RequestParam(value = "P_PHONE", defaultValue = "") int P_PHONE,
            @RequestParam(value = "P_MOBILE", defaultValue = "") int P_MOBILE,
            @RequestParam(value = "P_EMAIL", defaultValue = "") String P_EMAIL,
            @RequestParam(value = "P_ISACTIVE", defaultValue = "") int P_ISACTIVE
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_UNITID_OLD  : " + P_UNITID_OLD + " , "
                    + " P_USERNAME  : " + P_USERNAME + " , "
                    + " P_UNITID  : " + P_UNITID + " , "
                    + " P_UNITCODE  : " + P_UNITCODE + " , "
                    + " P_UNITNAME  : " + P_UNITNAME + " , "
                    + " P_UNITTYPEID  : " + P_UNITTYPEID + " , "
                    + " P_UNITPARENT  : " + P_UNITPARENT + " , "
                    + " P_ADDRESS  : " + P_ADDRESS + " , "
                    + " P_CITY  : " + P_CITY + " , "
                    + " P_PHONE  : " + P_PHONE + " , "
                    + " P_MOBILE  : " + P_MOBILE + " , "
                    + " P_EMAIL  : " + P_EMAIL + " , "
                    + " P_ISACTIVE  : " + P_ISACTIVE + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_UNITID_OLD", P_UNITID_OLD);
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("P_UNITID", P_UNITID);
            mIn.put("P_UNITCODE", P_UNITCODE);
            mIn.put("P_UNITNAME", P_UNITNAME);
            mIn.put("P_UNITTYPEID", P_UNITTYPEID);
            mIn.put("P_UNITPARENT", P_UNITPARENT);
            mIn.put("P_ADDRESS", P_ADDRESS);
            mIn.put("P_CITY", P_CITY);
            mIn.put("P_PHONE", P_PHONE);
            mIn.put("P_MOBILE", P_MOBILE);
            mIn.put("P_EMAIL", P_EMAIL);
            mIn.put("P_ISACTIVE", P_ISACTIVE);
            mOut = serviceMasterUnitApkt.UPDATE_UNIT_APKT_REPORTAPKT(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_UNITID_OLD : " + P_UNITID_OLD + " | "
                    + " P_UNITID : " + P_UNITID + " | "
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
                    + " P_UNITID_OLD : " + P_UNITID_OLD + " | "
                    + " P_UNITID : " + P_UNITID + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END UPDATE
    // END POST
}
