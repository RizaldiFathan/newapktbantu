package rest.iconpln.rest;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.AmiconService;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/properties/")
public class PropertiesController {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(PropertiesController.class);

    @Autowired
    private AmiconService amiconService;

    // GET DISTRIBUSI
    @RequestMapping(
            value = "/GET_DISTRIBUSI",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> GET_DISTRIBUSI() {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + "GET DISTRIBUSI"
                    + " |==="
            );
            Map mIn = new HashMap();
            mOut = amiconService.GET_DISTRIBUSI(mIn);
            logger.info("===| OUT FROM GET DISTRIBUSI " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM GET DISTRIBUSI " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END GET DISTRIBUSI

    // GET AREA BY DIS
    @RequestMapping(
            value = "/GET_AREA_BY_DIST",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_AREA_BY_DIST(
            @RequestParam(value = "p_code", defaultValue = "") String p_code
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + "p_code : " + p_code + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_code", p_code);

            mOut = amiconService.GET_AREA_BY_DIST(mIn);
            logger.info("===| OUT FROM " + p_code + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_code + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET AREA AREA BY DIS
    // GET POSKO BY AREA
    @RequestMapping(
            value = "/GET_POSKO_BY_AREA",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_POSKO_BY_AREA(
            @RequestParam(
                    value = "p_unitidparent",
                    defaultValue = ""
            ) String p_unitidparent
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + "p_unitidparent : " + p_unitidparent + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_unitidparent", p_unitidparent);

            mOut = amiconService.GET_POSKO_BY_AREA(mIn);
            logger.info("===| OUT FROM " + p_unitidparent + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_unitidparent + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET POSKO BY AREA
    // GET UNIT BY AREA
    @RequestMapping(
            value = "/GET_UNIT_BY_AREA",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_UNIT_BY_AREA(
            @RequestParam(value = "p_unitparent", defaultValue = "") String p_unitparent
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + "p_unitparent : " + p_unitparent + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_unitparent", p_unitparent);

            mOut = amiconService.GET_UNIT_BY_AREA(mIn);
            logger.info("===| OUT FROM " + p_unitparent + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_unitparent + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END GET UNIT BY AREA

    // GET REGIONAL
    @RequestMapping(
            value = "/GET_REGIONAL",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_REGIONAL() {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + "GET REGIONAL "
                    + " |==="
            );
            Map mIn = new HashMap();
            mOut = amiconService.GET_REGIONAL(mIn);
            logger.info("===| OUT GET REGIONAL " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT GET REGIONAL " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/GET_RAYON_BY_AREA",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_RAYON_BY_AREA(
            @RequestParam(value = "p_unitparent", defaultValue = "") String p_unitparent
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + "p_unitparent : " + p_unitparent + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_unitparent", p_unitparent);

            mOut = amiconService.GET_RAYON_BY_AREA(mIn);
            logger.info("===| OUT FROM " + p_unitparent + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_unitparent + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END GET GET_RAYON_BY_AREA
}
