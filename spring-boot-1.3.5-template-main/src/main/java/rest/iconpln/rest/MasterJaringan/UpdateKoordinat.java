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
import rest.iconpln.service.MasterJaringan.ServiceUpdateKoordinat;

@RestController
@RequestMapping("/master-jaringan/")
public class UpdateKoordinat {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(UpdateKoordinat.class
    );
    @Autowired

    private ServiceUpdateKoordinat serviceUpdateKoordinat;

    // POST
    @RequestMapping(
            value = "/UPDATE_KOORDINAT",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> UPDATE_KOORDINAT(
            @RequestParam(value = "P_KODEASSET", defaultValue = "") String P_KODEASSET,
            @RequestParam(value = "P_LONGITUDE", defaultValue = "") String P_LONGITUDE,
            @RequestParam(value = "P_LATITUDE", defaultValue = "") String P_LATITUDE,
            @RequestParam(value = "P_NAMA", defaultValue = "") String P_NAMA,
            @RequestParam(value = "P_NO_TIANG", defaultValue = "") String P_NO_TIANG,
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(value = "P_NO_TICKET", defaultValue = "") String P_NO_TICKET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_KODEASSET : " + P_KODEASSET + " , "
                    + " P_LONGITUDE : " + P_LONGITUDE + " , "
                    + " P_LATITUDE : " + P_LATITUDE + " , "
                    + " P_NAMA : " + P_NAMA + " , "
                    + " P_NO_TIANG : " + P_NO_TIANG + " , "
                    + " P_USERNAME : " + P_USERNAME + " , "
                    + " P_NO_TICKET : " + P_NO_TICKET + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_KODEASSET", P_KODEASSET);
            mIn.put("P_LONGITUDE", P_LONGITUDE);
            mIn.put("P_LATITUDE", P_LATITUDE);
            mIn.put("P_NAMA", P_NAMA);
            mIn.put("P_NO_TIANG", P_NO_TIANG);
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("P_NO_TICKET", P_NO_TICKET);

            mOut = serviceUpdateKoordinat.UPDATE_KOORDINAT(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_KODEASSET : " + P_KODEASSET + " | "
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
                    + " P_KODEASSET : " + P_KODEASSET + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
