package rest.iconpln.rest.MasterData;

import rest.iconpln.rest.ManagementUsers.*;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.MasterData.ServiceMasterKecamatanKelurahan;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/master-data/")
public class MasterKecamatanKelurahan {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(MasterKecamatanKelurahan.class);
    @Autowired

    private ServiceMasterKecamatanKelurahan serviceMasterKecamatanKelurahan;

    @RequestMapping(
            value = "/MASTER_KELURAHAN_KECAMATAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> MASTER_KELURAHAN_KECAMATAN(
            @RequestParam(value = "P_UNIT", defaultValue = "") String P_UNIT
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_UNIT : " + P_UNIT + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_UNIT", P_UNIT);
            mOut = serviceMasterKecamatanKelurahan.MASTER_KELURAHAN_KECAMATAN(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_UNIT : " + P_UNIT + " | "
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
                    + " P_UNIT : " + P_UNIT + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
