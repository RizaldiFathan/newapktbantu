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
import rest.iconpln.service.MasterJaringan.ServiceUpdateConcatAssetNoAktif;

@RestController
@RequestMapping("/master-jaringan/")
public class UpdateConcatAssetNoAktif {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(UpdateConcatAssetNoAktif.class
    );
    @Autowired

    private ServiceUpdateConcatAssetNoAktif serviceUpdateConcatAssetNoAktif;

    // GET ASSETS
    @RequestMapping(
            value = "/PDATE_CONCAT_ASSET_NONAKTIFU",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> PDATE_CONCAT_ASSET_NONAKTIFU() {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " PDATE_CONCAT_ASSET_NONAKTIFU "
                    + " |==="
            );
            Map mIn = new HashMap();
            mOut = serviceUpdateConcatAssetNoAktif.PDATE_CONCAT_ASSET_NONAKTIFU(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " PDATE_CONCAT_ASSET_NONAKTIFUs "
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
                    + " PDATE_CONCAT_ASSET_NONAKTIFU "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET ASSETS
    // GET
    @RequestMapping(
            value = "/GET_PDATE_CONCAT_ASSET_NONAKTIFU",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_PDATE_CONCAT_ASSET_NONAKTIFU(
            @RequestParam(value = "P_KD_ASSET", defaultValue = "") String P_KD_ASSET,
            @RequestParam(value = "P_TYPE_ASSET", defaultValue = "") String P_TYPE_ASSET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_KD_ASSET : " + P_KD_ASSET + " , "
                    + " P_TYPE_ASSET : " + P_TYPE_ASSET + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_KD_ASSET", P_KD_ASSET);
            mIn.put("P_TYPE_ASSET", P_TYPE_ASSET);
            mOut = serviceUpdateConcatAssetNoAktif.GET_PDATE_CONCAT_ASSET_NONAKTIFU(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_KD_ASSET : " + P_KD_ASSET + " | "
                    + " P_TYPE_ASSET : " + P_TYPE_ASSET + " | "
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
                    + " P_KD_ASSET: " + P_KD_ASSET + " | "
                    + " P_TYPE_ASSET: " + P_TYPE_ASSET + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_PDATE_CONCAT_ASSET_NONAKTIFU",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_PDATE_CONCAT_ASSET_NONAKTIFU(
            @RequestParam(
                    value = "P_KODE_ASSET",
                    defaultValue = ""
            ) String P_KODE_ASSET,
            @RequestParam(
                    value = "P_TYPE_ASSET",
                    defaultValue = ""
            ) String P_TYPE_ASSET,
            @RequestParam(
                    value = "P_PARENT_ASSET",
                    defaultValue = ""
            ) String P_PARENT_ASSET,
            @RequestParam(
                    value = "P_KODE_JARINGAN",
                    defaultValue = ""
            ) String P_KODE_JARINGAN,
            @RequestParam(value = "P_NO_TIANG", defaultValue = "") String P_NO_TIANG,
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
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(value = "P_NO_TICKET", defaultValue = "") String P_NO_TICKET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_KODE_ASSET  : " + P_KODE_ASSET + " , "
                    + " P_TYPE_ASSET  : " + P_TYPE_ASSET + " , "
                    + " P_PARENT_ASSET  : " + P_PARENT_ASSET + " , "
                    + " P_KODE_JARINGAN  : " + P_KODE_JARINGAN + " , "
                    + " P_NO_TIANG  : " + P_NO_TIANG + " , "
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
                    + " P_USERNAME  : " + P_USERNAME + " , "
                    + " P_NO_TICKET  : " + P_NO_TICKET + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_KODE_ASSET", P_KODE_ASSET);
            mIn.put("P_TYPE_ASSET", P_TYPE_ASSET);
            mIn.put("P_PARENT_ASSET", P_PARENT_ASSET);
            mIn.put("P_KODE_JARINGAN", P_KODE_JARINGAN);
            mIn.put("P_NO_TIANG", P_NO_TIANG);
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
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("P_NO_TICKET", P_NO_TICKET);
            mOut = serviceUpdateConcatAssetNoAktif.POST_PDATE_CONCAT_ASSET_NONAKTIFU(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_KODE_ASSET : " + P_KODE_ASSET + " | "
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
                    + " P_KODE_ASSET: " + P_KODE_ASSET + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
