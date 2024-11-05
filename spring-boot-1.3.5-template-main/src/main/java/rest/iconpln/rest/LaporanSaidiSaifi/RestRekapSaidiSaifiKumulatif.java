package rest.iconpln.rest.LaporanSaidiSaifi;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.LaporanSaidiSaifi.ServiceRekapSaidiSaifiKumulatif;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/saidi-saifi/")
public class RestRekapSaidiSaifiKumulatif {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestRekapSaidiSaifiKumulatif.class);
    @Autowired

    private ServiceRekapSaidiSaifiKumulatif serviceRekapSaidiSaifiKumulatif;
    // POST
    @RequestMapping(
            value = "/POST_SAIDI_KUMULATIF",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_SAIDI_KUMULATIF(
            @RequestParam(value = "P_THBL", defaultValue = "") int P_THBL,
            @RequestParam(value = "P_USER", defaultValue = "") String P_USER
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_THBL : " + P_THBL + " , " +
                            " P_USER : " + P_USER + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_THBL", P_THBL);
            mIn.put("P_USER", P_USER);
            mOut = serviceRekapSaidiSaifiKumulatif.POST_SAIDI_KUMULATIF(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_THBL : " + P_THBL + " | " +
                            " P_USER : " + P_USER + " | " +
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
                            " P_THBL : " + P_THBL + " | " +
                            " P_USER : " + P_USER + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
