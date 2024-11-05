package rest.iconpln.rest.ManagementUsers;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.ManagementUsers.ServiceCRUDPetugasYantek;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/management-user/")
public class RestCRUDPetugasYantek {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestCekRoleUser.class);
    @Autowired

    private ServiceCRUDPetugasYantek serviceCRUDPetugasYantek;

    // GET
    @RequestMapping(
            value = "/GET_PETUGAS_YANTEK",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_PETUGAS_YANTEK(
            @RequestParam(value = "P_username", defaultValue = "") String P_username
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_username : " + P_username + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_username", P_username);

            mOut = serviceCRUDPetugasYantek.GET_PETUGAS_YANTEK(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_username : " + P_username + " | " +
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
                            " P_username : " + P_username + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/INPUT_MASTER_PETUGAS_YANTEK",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> INPUT_MASTER_PETUGAS_YANTEK(
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(
                    value = "P_EMPLOYEENAME",
                    defaultValue = ""
            ) String P_EMPLOYEENAME,
            @RequestParam(value = "P_NIP", defaultValue = "") String P_NIP,
            @RequestParam(
                    value = "P_COMPANYNAME",
                    defaultValue = ""
            ) String P_COMPANYNAME,
            @RequestParam(value = "P_ADDRESS", defaultValue = "") String P_ADDRESS,
            @RequestParam(value = "P_PHONE", defaultValue = "") String P_PHONE,
            @RequestParam(value = "P_EMAIL", defaultValue = "") String P_EMAIL,
            @RequestParam(value = "P_UNITID", defaultValue = "") String P_UNITID,
            @RequestParam(value = "P_REGUID", defaultValue = "") String P_REGUID,
            @RequestParam(value = "P_CREATEBY", defaultValue = "") String P_CREATEBY,
            @RequestParam(value = "P_NO_TICKET", defaultValue = "") String P_NO_TICKET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_USERNAME : " + P_USERNAME + " , " +
                            " P_EMPLOYEENAME : " + P_EMPLOYEENAME + " , " +
                            " P_NIP : " + P_NIP + " , " +
                            " P_COMPANYNAME : " + P_COMPANYNAME + " , " +
                            " P_ADDRESS : " + P_ADDRESS + " , " +
                            " P_PHONE : " + P_PHONE + " , " +
                            " P_EMAIL : " + P_EMAIL + " , " +
                            " P_UNITID : " + P_UNITID + " , " +
                            " P_REGUID : " + P_REGUID + " , " +
                            " P_CREATEBY : " + P_CREATEBY + " , " +
                            " P_NO_TICKET : " + P_NO_TICKET + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("P_EMPLOYEENAME", P_EMPLOYEENAME);
            mIn.put("P_NIP", P_NIP);
            mIn.put("P_COMPANYNAME", P_COMPANYNAME);
            mIn.put("P_ADDRESS", P_ADDRESS);
            mIn.put("P_PHONE", P_PHONE);
            mIn.put("P_EMAIL", P_EMAIL);
            mIn.put("P_UNITID", P_UNITID);
            mIn.put("P_REGUID", P_REGUID);
            mIn.put("P_CREATEBY", P_CREATEBY);
            mIn.put("P_NO_TICKET", P_NO_TICKET);

            mOut = serviceCRUDPetugasYantek.INPUT_MASTER_PETUGAS_YANTEK(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_USERNAME : " + P_USERNAME + " | " +
                            " P_EMPLOYEENAME : " + P_EMPLOYEENAME + " | " +
                            " P_NIP : " + P_NIP + " | " +
                            " P_COMPANYNAME : " + P_COMPANYNAME + " | " +
                            " P_ADDRESS : " + P_ADDRESS + " | " +
                            " P_PHONE : " + P_PHONE + " | " +
                            " P_EMAIL : " + P_EMAIL + " | " +
                            " P_UNITID : " + P_UNITID + " | " +
                            " P_REGUID : " + P_REGUID + " | " +
                            " P_CREATEBY : " + P_CREATEBY + " | " +
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
                            " P_EMPLOYEENAME : " + P_EMPLOYEENAME + " | " +
                            " P_NIP : " + P_NIP + " | " +
                            " P_COMPANYNAME : " + P_COMPANYNAME + " | " +
                            " P_ADDRESS : " + P_ADDRESS + " | " +
                            " P_PHONE : " + P_PHONE + " | " +
                            " P_EMAIL : " + P_EMAIL + " | " +
                            " P_UNITID : " + P_UNITID + " | " +
                            " P_REGUID : " + P_REGUID + " | " +
                            " P_CREATEBY : " + P_CREATEBY + " | " +
                            " P_NO_TICKET : " + P_NO_TICKET + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
    // UPDATE
    @RequestMapping(
            value = "/UPDATE_MASTER_PETUGAS_YANTEK",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> UPDATE_MASTER_PETUGAS_YANTEK(
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(
                    value = "P_EMPLOYEENAME",
                    defaultValue = ""
            ) String P_EMPLOYEENAME,
            @RequestParam(value = "P_NIP", defaultValue = "") String P_NIP,
            @RequestParam(
                    value = "P_COMPANYNAME",
                    defaultValue = ""
            ) String P_COMPANYNAME,
            @RequestParam(value = "P_ADDRESS", defaultValue = "") String P_ADDRESS,
            @RequestParam(value = "P_PHONE", defaultValue = "") String P_PHONE,
            @RequestParam(value = "P_EMAIL", defaultValue = "") String P_EMAIL,
            @RequestParam(value = "P_UNITID", defaultValue = "") String P_UNITID,
            @RequestParam(value = "P_REGUID", defaultValue = "") String P_REGUID,
            @RequestParam(value = "P_ISACTIVE", defaultValue = "") String P_ISACTIVE,
            @RequestParam(value = "p_user", defaultValue = "") String p_user
            // @RequestParam(value = "p_noticket", defaultValue = "") String p_noticket
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_USERNAME : " + P_USERNAME + " , " +
                            " P_EMPLOYEENAME : " + P_EMPLOYEENAME + " , " +
                            " P_NIP : " + P_NIP + " , " +
                            " P_COMPANYNAME : " + P_COMPANYNAME + " , " +
                            " P_ADDRESS : " + P_ADDRESS + " , " +
                            " P_PHONE : " + P_PHONE + " , " +
                            " P_EMAIL : " + P_EMAIL + " , " +
                            " P_UNITID : " + P_UNITID + " , " +
                            " P_REGUID : " + P_REGUID + " , " +
                            " P_ISACTIVE : " + P_ISACTIVE + " , " +
                            " p_user : " + p_user + " , " +
                            " |==="
            );
            System.out.println("+============== END MASUK DATA ==============+");
            Map mIn = new HashMap();
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("P_EMPLOYEENAME", P_EMPLOYEENAME);
            mIn.put("P_NIP", P_NIP);
            mIn.put("P_COMPANYNAME", P_COMPANYNAME);
            mIn.put("P_ADDRESS", P_ADDRESS);
            mIn.put("P_PHONE", P_PHONE);
            mIn.put("P_EMAIL", P_EMAIL);
            mIn.put("P_UNITID", P_UNITID);
            mIn.put("P_REGUID", P_REGUID);
            mIn.put("P_ISACTIVE", P_ISACTIVE);
            mIn.put("p_user", p_user);

            mOut = serviceCRUDPetugasYantek.UPDATE_MASTER_PETUGAS_YANTEK(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_USERNAME : " + P_USERNAME + " | " +
                            " P_EMPLOYEENAME : " + P_EMPLOYEENAME + " | " +
                            " P_NIP : " + P_NIP + " | " +
                            " P_COMPANYNAME : " + P_COMPANYNAME + " | " +
                            " P_ADDRESS : " + P_ADDRESS + " | " +
                            " P_PHONE : " + P_PHONE + " | " +
                            " P_EMAIL : " + P_EMAIL + " | " +
                            " P_UNITID : " + P_UNITID + " | " +
                            " P_REGUID : " + P_REGUID + " | " +
                            " P_ISACTIVE : " + P_ISACTIVE + " | " +
                            " p_user : " + p_user + " | " +
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
                            " P_EMPLOYEENAME : " + P_EMPLOYEENAME + " | " +
                            " P_NIP : " + P_NIP + " | " +
                            " P_COMPANYNAME : " + P_COMPANYNAME + " | " +
                            " P_ADDRESS : " + P_ADDRESS + " | " +
                            " P_PHONE : " + P_PHONE + " | " +
                            " P_EMAIL : " + P_EMAIL + " | " +
                            " P_UNITID : " + P_UNITID + " | " +
                            " P_REGUID : " + P_REGUID + " | " +
                            " P_ISACTIVE : " + P_ISACTIVE + " | " +
                            " p_user : " + p_user + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END UPDATE
    // DELETE
    @RequestMapping(
            value = "/DELETE_MASTER_PETUGAS_YANTEK",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> DELETE_MASTER_PETUGAS_YANTEK(
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(value = "p_user", defaultValue = "") String p_user
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_USERNAME : " + P_USERNAME + " , " +
                            " p_user : " + p_user + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("p_user", p_user);

            mOut = serviceCRUDPetugasYantek.DELETE_MASTER_PETUGAS_YANTEK(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_USERNAME : " + P_USERNAME + " | " +
                            " p_user : " + p_user + " | " +
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
                            " p_user : " + p_user + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END DELETE
}
