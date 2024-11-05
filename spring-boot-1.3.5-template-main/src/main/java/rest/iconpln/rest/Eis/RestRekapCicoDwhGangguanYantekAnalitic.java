package rest.iconpln.rest.Eis;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.Eis.ServiceRekapCicoDwhGangguanYantekAnalitic;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/eis/")
public class RestRekapCicoDwhGangguanYantekAnalitic {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestRekapCicoDwhGangguanYantekAnalitic.class);

    @Autowired
    private ServiceRekapCicoDwhGangguanYantekAnalitic serviceRekapCicoDwhGangguanYantekAnalitic;

    // GET
    @RequestMapping(
            value = "/REKAP_TABEL_CICO",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_TABEL_CICO(
            @RequestParam(value = "P_BLTH", defaultValue = "") String P_BLTH,
            @RequestParam(value = "p_user", defaultValue = "") String p_user
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_BLTH : " + P_BLTH + " , " +
                            " p_user : " + p_user + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_BLTH", P_BLTH);
            mIn.put("p_user", p_user);

            mOut = serviceRekapCicoDwhGangguanYantekAnalitic.REKAP_TABEL_CICO(mIn);
            logger.info("===| OUT FROM " + P_BLTH + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + P_BLTH + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/REKAP_TABEL_DWH_GG_YANTEK_ANALITIC",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_TABEL_DWH_GG_YANTEK_ANALITIC(
            @RequestParam(value = "P_BLTH", defaultValue = "") String P_BLTH,
            @RequestParam(value = "p_user", defaultValue = "") String p_user
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_BLTH : " + P_BLTH + " , " +
                            " p_user : " + p_user + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_BLTH", P_BLTH);
            mIn.put("p_user", p_user);

            mOut = serviceRekapCicoDwhGangguanYantekAnalitic.REKAP_TABEL_DWH_GG_YANTEK_ANALITIC(mIn);
            logger.info("===| OUT FROM " + P_BLTH + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + P_BLTH + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
}
