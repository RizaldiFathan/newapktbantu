package rest.iconpln.rest.LOG;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.LOG.ServiceMonitoringJob;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/log/")
public class RestMonitoringJob {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestMonitoringJob.class);
    
    @Autowired
    private ServiceMonitoringJob serviceMonitoringJob;
    // GET
    @RequestMapping(
            value = "/MONITORING_JOB",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody

    public ResponseEntity<Object> MONITORING_JOB(
            @RequestParam(value = "p_tglawal", defaultValue = "") String p_tglawal,
            @RequestParam(value = "p_tglakhir", defaultValue = "") String p_tglakhir
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_tglawal : " + p_tglawal + " , " +
                            " p_tglakhir : " + p_tglakhir + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_tglawal", p_tglawal);
            mIn.put("p_tglakhir", p_tglakhir);
            mOut = serviceMonitoringJob.MONITORING_JOB(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_tglawal : " + p_tglawal + " | " +
                            " p_tglakhir : " + p_tglakhir + " | " +
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
                            " p_tglawal : " + p_tglawal + " | " +
                            " p_tglakhir : " + p_tglakhir + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
}