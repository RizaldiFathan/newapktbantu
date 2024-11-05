package rest.iconpln.rest.ManagementUsers;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.ManagementUsers.ServiceEditFailureSessionYantek;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/management-user/")
public class RestEditFailureSessionYantek {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestEditFailureSessionYantek.class);
    @Autowired

    private ServiceEditFailureSessionYantek serviceEditFailureSessionYantek;

    // GET
    @RequestMapping(
            value = "/GET_EDIT_FAILURE_SESSION",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_EDIT_FAILURE_SESSION(
            @RequestParam(
                    value = "P_USERPETUGAS",
                    defaultValue = ""
            ) String P_USERPETUGAS,
            @RequestParam(value = "P_TGLAWAL", defaultValue = "") String P_TGLAWAL,
            @RequestParam(value = "P_TGLAKHIR", defaultValue = "") String P_TGLAKHIR
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_USERPETUGAS : " + P_USERPETUGAS + " , " +
                            " P_TGLAWAL : " + P_TGLAWAL + " , " +
                            " P_TGLAKHIR : " + P_TGLAKHIR + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USERPETUGAS", P_USERPETUGAS);
            mIn.put("P_TGLAWAL", P_TGLAWAL);
            mIn.put("P_TGLAKHIR", P_TGLAKHIR);

            mOut = serviceEditFailureSessionYantek.GET_EDIT_FAILURE_SESSION(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_USERPETUGAS : " + P_USERPETUGAS + " | " +
                            " P_TGLAWAL : " + P_TGLAWAL + " | " +
                            " P_TGLAKHIR : " + P_TGLAKHIR + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.info(
                    "===|  OUT FROM = " +
                            " P_USERPETUGAS : " + P_USERPETUGAS + " | " +
                            " P_TGLAWAL : " + P_TGLAWAL + " | " +
                            " P_TGLAKHIR : " + P_TGLAKHIR + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_EDIT_FAILURE_SESSION",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_EDIT_FAILURE_SESSION(
            @RequestParam(
                    value = "P_USERPETUGAS",
                    defaultValue = ""
            ) String P_USERPETUGAS,
            @RequestParam(
                    value = "P_USERPETUGAS_KOREKSI",
                    defaultValue = ""
            ) String P_USERPETUGAS_KOREKSI,
            @RequestParam(value = "P_TGLAWAL", defaultValue = "") String P_TGLAWAL,
            @RequestParam(value = "P_TGLAKHIR", defaultValue = "") String P_TGLAKHIR
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_USERPETUGAS : " + P_USERPETUGAS + " , " +
                            " P_USERPETUGAS_KOREKSI : " + P_USERPETUGAS_KOREKSI + " , " +
                            " P_TGLAWAL : " + P_TGLAWAL + " , " +
                            " P_TGLAKHIR : " + P_TGLAKHIR + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USERPETUGAS", P_USERPETUGAS);
            mIn.put("P_USERPETUGAS_KOREKSI", P_USERPETUGAS_KOREKSI);
            mIn.put("P_TGLAWAL", P_TGLAWAL);
            mIn.put("P_TGLAKHIR", P_TGLAKHIR);

            mOut = serviceEditFailureSessionYantek.POST_EDIT_FAILURE_SESSION(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_USERPETUGAS : " + P_USERPETUGAS + " | " +
                            " P_USERPETUGAS_KOREKSI : " + P_USERPETUGAS_KOREKSI + " | " +
                            " P_TGLAWAL : " + P_TGLAWAL + " | " +
                            " P_TGLAKHIR : " + P_TGLAKHIR + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.info(
                    "===|  OUT FROM = " +
                            " P_USERPETUGAS : " + P_USERPETUGAS + " | " +
                            " P_USERPETUGAS_KOREKSI : " + P_USERPETUGAS_KOREKSI + " | " +
                            " P_TGLAWAL : " + P_TGLAWAL + " | " +
                            " P_TGLAKHIR : " + P_TGLAKHIR + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
