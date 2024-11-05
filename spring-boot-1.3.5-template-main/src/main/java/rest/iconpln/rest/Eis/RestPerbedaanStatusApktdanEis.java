package rest.iconpln.rest.Eis;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.Eis.ServicePerbedaanStatusApktdanEis;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/eis/")
public class RestPerbedaanStatusApktdanEis {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestPerbedaanStatusApktdanEis.class);

    @Autowired
    private ServicePerbedaanStatusApktdanEis servicePerbedaanStatusApktdanEis;

    // GET
    @RequestMapping(
            value = "/PERBEDAAN_STATUS_APKT_EIS",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> PERBEDAAN_STATUS_APKT_EIS(
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
            mOut = servicePerbedaanStatusApktdanEis.PERBEDAAN_STATUS_APKT_EIS(mIn);
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
