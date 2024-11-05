package rest.iconpln.rest.ManagementUsers;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.ManagementUsers.ServiceResetIMEI;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/management-user/")
public class RestResetIMEI {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestResetIMEI.class);
    @Autowired

    private ServiceResetIMEI serviceResetIMEI;

    // GET
    @RequestMapping(
            value = "/RESET_IMEI",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> RESET_IMEI(
            @RequestParam(value = "p_user_ptgs", defaultValue = "") String p_user_ptgs
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_user_ptgs : " + p_user_ptgs + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_user_ptgs", p_user_ptgs);

            mOut = serviceResetIMEI.RESET_IMEI(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_user_ptgs : " + p_user_ptgs + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error(
                    "===|  OUT FROM = " +
                            " p_user_ptgs : " + p_user_ptgs + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_RESET_IMEI",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_RESET_IMEI(
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(
                    value = "P_User_update",
                    defaultValue = ""
            ) String P_User_update,
            @RequestParam(value = "P_NO_TICKET", defaultValue = "") String P_NO_TICKET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_USERNAME : " + P_USERNAME + " , " +
                            " P_User_update : " + P_User_update + " , " +
                            " P_NO_TICKET : " + P_NO_TICKET + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("P_User_update", P_User_update);
            mIn.put("P_NO_TICKET", P_NO_TICKET);

            mOut = serviceResetIMEI.POST_RESET_IMEI(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_USERNAME : " + P_USERNAME + " | " +
                            " P_User_update : " + P_User_update + " | " +
                            " P_NO_TICKET : " + P_NO_TICKET + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error(
                    "===|  OUT FROM = " +
                            " P_USERNAME : " + P_USERNAME + " | " +
                            " P_User_update : " + P_User_update + " | " +
                            " P_NO_TICKET : " + P_NO_TICKET + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
