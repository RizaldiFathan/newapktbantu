package rest.iconpln.rest.MasterData;

import rest.iconpln.rest.ManagementUsers.*;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.MasterData.ServiceMasterAktifAutoDispatch;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/master-data/")
public class MasterAktifAutoDispatch {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(MasterAktifAutoDispatch.class);
    @Autowired

    private ServiceMasterAktifAutoDispatch serviceMasterAktifAutoDispatch;

    // GET
    @RequestMapping(
            value = "/MASTER_AKTIF_AUTODISPATCH",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> MASTER_AKTIF_AUTODISPATCH() {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " MASTER_AKTIF_AUTODISPATCH "
                    + " |==="
            );
            Map mIn = new HashMap();
            mOut = serviceMasterAktifAutoDispatch.MASTER_AKTIF_AUTODISPATCH(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " MASTER_AKTIF_AUTODISPATCH "
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
                    + " MASTER_AKTIF_AUTODISPATCH "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
}
