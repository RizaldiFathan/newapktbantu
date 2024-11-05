package rest.iconpln.rest.ManagementUsers;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.ManagementUsers.ServiceCekRoleUser;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/management-user/")
public class RestCekRoleUser {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestCekRoleUser.class);

    @Autowired
    private ServiceCekRoleUser serviceCekRoleUser;

    // GET
    @RequestMapping(
            value = "/GET_USER_BY_USERNAME",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_USER_BY_USERNAME(
            @RequestParam(value = "p_username", defaultValue = "") String p_username
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_username : " + p_username + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_username", p_username);
            mOut = serviceCekRoleUser.GET_USER_BY_USERNAME(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_username : " + p_username + " | " +
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
                            " p_username : " + p_username + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/GET_USER_BY_USERID",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_USER_BY_USERID(
            @RequestParam(value = "p_userid", defaultValue = "") int p_userid
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_userid : " + p_userid + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_userid", p_userid);

            mOut = serviceCekRoleUser.GET_USER_BY_USERID(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_userid : " + p_userid + " | " +
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
                            " p_userid : " + p_userid + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
}
