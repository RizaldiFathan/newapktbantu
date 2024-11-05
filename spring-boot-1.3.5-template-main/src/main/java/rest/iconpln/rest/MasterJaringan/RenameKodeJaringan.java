package rest.iconpln.rest.MasterJaringan;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.MasterJaringan.ServiceRenameKodeJaringan;

@RestController
@RequestMapping("/master-jaringan/")
public class RenameKodeJaringan {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(RenameKodeJaringan.class
    );
    @Autowired

    private ServiceRenameKodeJaringan serviceRenameKodeJaringan;

    // POST
    @RequestMapping(
            value = "/RENAME_KD_JARINGAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> RENAME_KD_JARINGAN(
            @RequestParam(value = "P_KODEASSET", defaultValue = "") String P_KODEASSET,
            @RequestParam(
                    value = "P_KODE_JARINGAN",
                    defaultValue = ""
            ) String P_KODE_JARINGAN,
            @RequestParam(value = "P_KODE_GI", defaultValue = "") String P_KODE_GI,
            @RequestParam(
                    value = "P_KODE_FEEDER",
                    defaultValue = ""
            ) String P_KODE_FEEDER,
            @RequestParam(value = "P_KODE_ZONE", defaultValue = "") String P_KODE_ZONE,
            @RequestParam(
                    value = "P_KODE_SECTION",
                    defaultValue = ""
            ) String P_KODE_SECTION,
            @RequestParam(
                    value = "P_KODE_SEGMENT",
                    defaultValue = ""
            ) String P_KODE_SEGMENT,
            @RequestParam(
                    value = "P_KODE_SUBSEGMENT",
                    defaultValue = ""
            ) String P_KODE_SUBSEGMENT,
            @RequestParam(
                    value = "P_KODE_SUBSUBSEGMENT",
                    defaultValue = ""
            ) String P_KODE_SUBSUBSEGMENT,
            @RequestParam(
                    value = "P_KODE_LATERAL",
                    defaultValue = ""
            ) String P_KODE_LATERAL,
            @RequestParam(
                    value = "P_KODE_SUBLATERAL",
                    defaultValue = ""
            ) String P_KODE_SUBLATERAL,
            @RequestParam(
                    value = "P_KODE_SUBSUBLATERAL",
                    defaultValue = ""
            ) String P_KODE_SUBSUBLATERAL,
            @RequestParam(value = "P_ALAMAT", defaultValue = "") String P_ALAMAT,
            @RequestParam(value = "P_COVERAGE", defaultValue = "") String P_COVERAGE,
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(value = "P_NO_TICKET", defaultValue = "") String P_NO_TICKET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_KODEASSET  : " + P_KODEASSET + " , "
                    + " P_KODE_JARINGAN  : " + P_KODE_JARINGAN + " , "
                    + " P_KODE_GI  : " + P_KODE_GI + " , "
                    + " P_KODE_FEEDER  : " + P_KODE_FEEDER + " , "
                    + " P_KODE_ZONE  : " + P_KODE_ZONE + " , "
                    + " P_KODE_SECTION  : " + P_KODE_SECTION + " , "
                    + " P_KODE_SEGMENT  : " + P_KODE_SEGMENT + " , "
                    + " P_KODE_SUBSEGMENT  : " + P_KODE_SUBSEGMENT + " , "
                    + " P_KODE_SUBSUBSEGMENT  : " + P_KODE_SUBSUBSEGMENT + " , "
                    + " P_KODE_LATERAL  : " + P_KODE_LATERAL + " , "
                    + " P_KODE_SUBLATERAL  : " + P_KODE_SUBLATERAL + " , "
                    + " P_KODE_SUBSUBLATERAL  : " + P_KODE_SUBSUBLATERAL + " , "
                    + " P_ALAMAT  : " + P_ALAMAT + " , "
                    + " P_COVERAGE  : " + P_COVERAGE + " , "
                    + " P_USERNAME  : " + P_USERNAME + " , "
                    + " P_NO_TICKET  : " + P_NO_TICKET + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_KODEASSET", P_KODEASSET);
            mIn.put("P_KODE_JARINGAN", P_KODE_JARINGAN);
            mIn.put("P_KODE_GI", P_KODE_GI);
            mIn.put("P_KODE_FEEDER", P_KODE_FEEDER);
            mIn.put("P_KODE_ZONE", P_KODE_ZONE);
            mIn.put("P_KODE_SECTION", P_KODE_SECTION);
            mIn.put("P_KODE_SEGMENT", P_KODE_SEGMENT);
            mIn.put("P_KODE_SUBSEGMENT", P_KODE_SUBSEGMENT);
            mIn.put("P_KODE_SUBSUBSEGMENT", P_KODE_SUBSUBSEGMENT);
            mIn.put("P_KODE_LATERAL", P_KODE_LATERAL);
            mIn.put("P_KODE_SUBLATERAL", P_KODE_SUBLATERAL);
            mIn.put("P_KODE_SUBSUBLATERAL", P_KODE_SUBSUBLATERAL);
            mIn.put("P_ALAMAT", P_ALAMAT);
            mIn.put("P_COVERAGE", P_COVERAGE);
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("P_NO_TICKET", P_NO_TICKET);

            mOut = serviceRenameKodeJaringan.RENAME_KD_JARINGAN(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_KODEASSET : " + P_KODEASSET + " | "
                    + " P_KODE_JARINGAN : " + P_KODE_JARINGAN + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
