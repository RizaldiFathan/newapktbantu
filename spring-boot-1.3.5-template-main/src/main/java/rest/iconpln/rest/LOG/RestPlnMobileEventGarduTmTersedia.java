package rest.iconpln.rest.LOG;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.LOG.ServicePlnMobileEventGarduTmTersedia;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/log/")
public class RestPlnMobileEventGarduTmTersedia {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestMonitoringJob.class);
    
    @Autowired
    private ServicePlnMobileEventGarduTmTersedia servicePlnMobileEventGarduTmTersedia;
    // GET
    @RequestMapping(
            value = "/PLN_MOBILE_EVENT_GARDU_TM_TERSEDIA",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> PLN_MOBILE_EVENT_GARDU_TM_TERSEDIA(
            @RequestParam(value = "p_nolapor", defaultValue = "") String p_nolapor
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_nolapor : " + p_nolapor + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_nolapor", p_nolapor);
            mOut = servicePlnMobileEventGarduTmTersedia.PLN_MOBILE_EVENT_GARDU_TM_TERSEDIA(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_nolapor : " + p_nolapor + " | " +
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
                            " p_nolapor : " + p_nolapor + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
}