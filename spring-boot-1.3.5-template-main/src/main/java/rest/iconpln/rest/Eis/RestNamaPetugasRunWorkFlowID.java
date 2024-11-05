package rest.iconpln.rest.Eis;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import rest.iconpln.service.Eis.ServiceRestNamaPetugasRunWorkFlowID;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/eis/")
public class RestNamaPetugasRunWorkFlowID {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestNamaPetugasRunWorkFlowID.class);

    @Autowired
    private ServiceRestNamaPetugasRunWorkFlowID serviceRestNamaPetugasRunWorkFlowID;

    // GET
    @RequestMapping(
            value = "/NAMA_PETUGAS_DAN_RUNWORKFLOWID",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> NAMA_PETUGAS_DAN_RUNWORKFLOWID(
            @RequestParam(value = "P_TGLAWAL", defaultValue = "") String P_TGLAWAL,
            @RequestParam(value = "P_TGLAKHIR", defaultValue = "") String P_TGLAKHIR
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_TGLAWAL : " + P_TGLAWAL + " , "
                    + " P_TGLAKHIR : " + P_TGLAKHIR + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_TGLAWAL", P_TGLAWAL);
            mIn.put("P_TGLAKHIR", P_TGLAKHIR);
            mOut = serviceRestNamaPetugasRunWorkFlowID.NAMA_PETUGAS_DAN_RUNWORKFLOWID(mIn);
            logger.info("===| OUT FROM " + P_TGLAWAL + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + P_TGLAWAL + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
}
