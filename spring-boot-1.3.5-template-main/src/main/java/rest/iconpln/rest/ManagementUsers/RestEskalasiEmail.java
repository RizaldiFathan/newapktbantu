package rest.iconpln.rest.ManagementUsers;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.ManagementUsers.ServiceEskalasiEmail;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/management-user/")
public class RestEskalasiEmail {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestEskalasiEmail.class);
    @Autowired

    private ServiceEskalasiEmail serviceEskalasiEmail;

    // GET ESKALASI EMAIL
    @RequestMapping(
            value = "/GET_ESKALASI_EMAIL",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_ESKALASI_EMAIL(
            @RequestParam(value = "P_UNITID", defaultValue = "") String P_UNITID
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_UNITID : " + P_UNITID + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_UNITID", P_UNITID);

            mOut = serviceEskalasiEmail.GET_ESKALASI_EMAIL(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_UNITID : " + P_UNITID + " | " +
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
                            " P_UNITID : " + P_UNITID + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET ESKALASI EMAIL
    // POST ESKALASI EMAIL
    @RequestMapping(
            value = "/POST_ESKALASI_EMAIL",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_ESKALASI_EMAIL(
            @RequestParam(value = "P_UNITID", defaultValue = "") String P_UNITID,
            @RequestParam(
                    value = "P_EMAIL_MULP",
                    defaultValue = ""
            ) String P_EMAIL_MULP,
            @RequestParam(
                    value = "P_EMAIL_SPVPAULP",
                    defaultValue = ""
            ) String P_EMAIL_SPVPAULP,
            @RequestParam(
                    value = "P_EMAIL_SPVTeknikULP",
                    defaultValue = ""
            ) String P_EMAIL_SPVTeknikULP,
            @RequestParam(
                    value = "P_EMAIL_SPVTEULP",
                    defaultValue = ""
            ) String P_EMAIL_SPVTEULP,
            @RequestParam(
                    value = "P_EMAIL_MUP3",
                    defaultValue = ""
            ) String P_EMAIL_MUP3,
            @RequestParam(
                    value = "P_EMAIL_MBJARUP3",
                    defaultValue = ""
            ) String P_EMAIL_MBJARUP3,
            @RequestParam(
                    value = "P_EMAIL_SPVOPUP3",
                    defaultValue = ""
            ) String P_EMAIL_SPVOPUP3,
            @RequestParam(
                    value = "P_EMAIL_MBSARPPUP3",
                    defaultValue = ""
            ) String P_EMAIL_MBSARPPUP3,
            @RequestParam(
                    value = "P_EMAIL_ASMANCC",
                    defaultValue = ""
            ) String P_EMAIL_ASMANCC,
            @RequestParam(
                    value = "P_EMAIL_SRMNIAGAPP",
                    defaultValue = ""
            ) String P_EMAIL_SRMNIAGAPP,
            @RequestParam(
                    value = "P_EMAIL_MSBREVAS",
                    defaultValue = ""
            ) String P_EMAIL_MSBREVAS,
            @RequestParam(value = "P_SRMDIST", defaultValue = "") String P_SRMDIST,
            @RequestParam(value = "P_MSBDALOP", defaultValue = "") String P_MSBDALOP,
            @RequestParam(value = "P_EMAIL_GM", defaultValue = "") String P_EMAIL_GM,
            @RequestParam(
                    value = "P_EMAIL_MBNIAGA",
                    defaultValue = ""
            ) String P_EMAIL_MBNIAGA,
            @RequestParam(
                    value = "P_EMAIL_DIREG",
                    defaultValue = ""
            ) String P_EMAIL_DIREG,
            @RequestParam(
                    value = "P_EMAIL_EVPREG",
                    defaultValue = ""
            ) String P_EMAIL_EVPREG,
            @RequestParam(
                    value = "P_EMAIL_DIRUT",
                    defaultValue = ""
            ) String P_EMAIL_DIRUT,
            @RequestParam(value = "P_USERID", defaultValue = "") String P_USERID
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_UNITID : " + P_UNITID + " , " +
                            " P_EMAIL_MULP : " + P_EMAIL_MULP + " , " +
                            " P_EMAIL_SPVPAULP : " + P_EMAIL_SPVPAULP + " , " +
                            " P_EMAIL_SPVTeknikULP : " + P_EMAIL_SPVTeknikULP + " , " +
                            " P_EMAIL_SPVTEULP : " + P_EMAIL_SPVTEULP + " , " +
                            " P_EMAIL_MUP3 : " + P_EMAIL_MUP3 + " , " +
                            " P_EMAIL_MBJARUP3 : " + P_EMAIL_MBJARUP3 + " , " +
                            " P_EMAIL_SPVOPUP3 : " + P_EMAIL_SPVOPUP3 + " , " +
                            " P_EMAIL_MBSARPPUP3 : " + P_EMAIL_MBSARPPUP3 + " , " +
                            " P_EMAIL_ASMANCC : " + P_EMAIL_ASMANCC + " , " +
                            " P_EMAIL_SRMNIAGAPP : " + P_EMAIL_SRMNIAGAPP + " , " +
                            " P_EMAIL_MSBREVAS : " + P_EMAIL_MSBREVAS + " , " +
                            " P_SRMDIST : " + P_SRMDIST + " , " +
                            " P_MSBDALOP : " + P_MSBDALOP + " , " +
                            " P_EMAIL_GM : " + P_EMAIL_GM + " , " +
                            " P_EMAIL_MBNIAGA : " + P_EMAIL_MBNIAGA + " , " +
                            " P_EMAIL_DIREG : " + P_EMAIL_DIREG + " , " +
                            " P_EMAIL_EVPREG : " + P_EMAIL_EVPREG + " , " +
                            " P_EMAIL_DIRUT : " + P_EMAIL_DIRUT + " , " +
                            " P_USERID : " + P_USERID + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_UNITID", P_UNITID);
            mIn.put("P_EMAIL_MULP", P_EMAIL_MULP);
            mIn.put("P_EMAIL_SPVPAULP", P_EMAIL_SPVPAULP);
            mIn.put("P_EMAIL_SPVTeknikULP", P_EMAIL_SPVTeknikULP);
            mIn.put("P_EMAIL_SPVTEULP", P_EMAIL_SPVTEULP);
            mIn.put("P_EMAIL_MUP3", P_EMAIL_MUP3);
            mIn.put("P_EMAIL_MBJARUP3", P_EMAIL_MBJARUP3);
            mIn.put("P_EMAIL_SPVOPUP3", P_EMAIL_SPVOPUP3);
            mIn.put("P_EMAIL_MBSARPPUP3", P_EMAIL_MBSARPPUP3);
            mIn.put("P_EMAIL_ASMANCC", P_EMAIL_ASMANCC);
            mIn.put("P_EMAIL_SRMNIAGAPP", P_EMAIL_SRMNIAGAPP);
            mIn.put("P_EMAIL_MSBREVAS", P_EMAIL_MSBREVAS);
            mIn.put("P_SRMDIST", P_SRMDIST);
            mIn.put("P_MSBDALOP", P_MSBDALOP);
            mIn.put("P_EMAIL_GM", P_EMAIL_GM);
            mIn.put("P_EMAIL_MBNIAGA", P_EMAIL_MBNIAGA);
            mIn.put("P_EMAIL_DIREG", P_EMAIL_DIREG);
            mIn.put("P_EMAIL_EVPREG", P_EMAIL_EVPREG);
            mIn.put("P_EMAIL_DIRUT", P_EMAIL_DIRUT);
            mIn.put("P_USERID", P_USERID);

            mOut = serviceEskalasiEmail.POST_ESKALASI_EMAIL(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_UNITID : " + P_UNITID + " | " +
                            " P_EMAIL_MULP : " + P_EMAIL_MULP + " | " +
                            " P_EMAIL_SPVPAULP : " + P_EMAIL_SPVPAULP + " | " +
                            " P_EMAIL_SPVTeknikULP : " + P_EMAIL_SPVTeknikULP + " | " +
                            " P_EMAIL_SPVTEULP : " + P_EMAIL_SPVTEULP + " | " +
                            " P_EMAIL_MUP3 : " + P_EMAIL_MUP3 + " | " +
                            " P_EMAIL_MBJARUP3 : " + P_EMAIL_MBJARUP3 + " | " +
                            " P_EMAIL_SPVOPUP3 : " + P_EMAIL_SPVOPUP3 + " | " +
                            " P_EMAIL_MBSARPPUP3 : " + P_EMAIL_MBSARPPUP3 + " | " +
                            " P_EMAIL_ASMANCC : " + P_EMAIL_ASMANCC + " | " +
                            " P_EMAIL_SRMNIAGAPP : " + P_EMAIL_SRMNIAGAPP + " | " +
                            " P_EMAIL_MSBREVAS : " + P_EMAIL_MSBREVAS + " | " +
                            " P_SRMDIST : " + P_SRMDIST + " | " +
                            " P_MSBDALOP : " + P_MSBDALOP + " | " +
                            " P_EMAIL_GM : " + P_EMAIL_GM + " | " +
                            " P_EMAIL_MBNIAGA : " + P_EMAIL_MBNIAGA + " | " +
                            " P_EMAIL_DIREG : " + P_EMAIL_DIREG + " | " +
                            " P_EMAIL_EVPREG : " + P_EMAIL_EVPREG + " | " +
                            " P_EMAIL_DIRUT : " + P_EMAIL_DIRUT + " | " +
                            " P_USERID : " + P_USERID + " | " +
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
                            " P_UNITID : " + P_UNITID + " | " +
                            " P_EMAIL_MULP : " + P_EMAIL_MULP + " | " +
                            " P_EMAIL_SPVPAULP : " + P_EMAIL_SPVPAULP + " | " +
                            " P_EMAIL_SPVTeknikULP : " + P_EMAIL_SPVTeknikULP + " | " +
                            " P_EMAIL_SPVTEULP : " + P_EMAIL_SPVTEULP + " | " +
                            " P_EMAIL_MUP3 : " + P_EMAIL_MUP3 + " | " +
                            " P_EMAIL_MBJARUP3 : " + P_EMAIL_MBJARUP3 + " | " +
                            " P_EMAIL_SPVOPUP3 : " + P_EMAIL_SPVOPUP3 + " | " +
                            " P_EMAIL_MBSARPPUP3 : " + P_EMAIL_MBSARPPUP3 + " | " +
                            " P_EMAIL_ASMANCC : " + P_EMAIL_ASMANCC + " | " +
                            " P_EMAIL_SRMNIAGAPP : " + P_EMAIL_SRMNIAGAPP + " | " +
                            " P_EMAIL_MSBREVAS : " + P_EMAIL_MSBREVAS + " | " +
                            " P_SRMDIST : " + P_SRMDIST + " | " +
                            " P_MSBDALOP : " + P_MSBDALOP + " | " +
                            " P_EMAIL_GM : " + P_EMAIL_GM + " | " +
                            " P_EMAIL_MBNIAGA : " + P_EMAIL_MBNIAGA + " | " +
                            " P_EMAIL_DIREG : " + P_EMAIL_DIREG + " | " +
                            " P_EMAIL_EVPREG : " + P_EMAIL_EVPREG + " | " +
                            " P_EMAIL_DIRUT : " + P_EMAIL_DIRUT + " | " +
                            " P_USERID : " + P_USERID + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST ESKALASI EMAIL
}
