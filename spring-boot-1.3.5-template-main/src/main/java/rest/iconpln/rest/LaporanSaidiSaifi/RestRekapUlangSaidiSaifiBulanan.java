package rest.iconpln.rest.LaporanSaidiSaifi;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.LaporanSaidiSaifi.ServiceRekapUlangSaidiSaifiBulanan;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/saidi-saifi/")
public class RestRekapUlangSaidiSaifiBulanan {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestRekapUlangSaidiSaifiBulanan.class);
    @Autowired

    private ServiceRekapUlangSaidiSaifiBulanan serviceRekapUlangSaidiSaifiBulanan;

    // GET
    @RequestMapping(
            value = "/GET_BUKATUTUPPENGESAHAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_BUKATUTUPPENGESAHAN(
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "p_dist", defaultValue = "") String p_dist,
            @RequestParam(value = "p_action", defaultValue = "") String p_action
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_blth : " + p_blth + " , " +
                            " p_dist : " + p_dist + " , " +
                            " p_action : " + p_action + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_blth", p_blth);
            mIn.put("p_dist", p_dist);
            mIn.put("p_action", p_action);

            mOut = serviceRekapUlangSaidiSaifiBulanan.GET_BUKATUTUPPENGESAHAN(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_blth : " + p_blth + " | " +
                            " p_dist : " + p_dist + " | " +
                            " p_action : " + p_action + " | " +
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
                            " p_blth : " + p_blth + " | " +
                            " p_dist : " + p_dist + " | " +
                            " p_action : " + p_action + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_BUKATUTUPPENGESAHAN",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_BUKATUTUPPENGESAHAN(
            @RequestParam(value = "p_user", defaultValue = "") String p_user,
            @RequestParam(value = "p_kode", defaultValue = "") String p_kode,
            @RequestParam(value = "p_blth", defaultValue = "") String p_blth,
            @RequestParam(value = "p_distribusi", defaultValue = "") String p_distribusi
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_user : " + p_user + " , " +
                            " p_kode : " + p_kode + " , " +
                            " p_blth : " + p_blth + " , " +
                            " p_distribusi : " + p_distribusi + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_user", p_user);
            mIn.put("p_kode", p_kode);
            mIn.put("p_blth", p_blth);
            mIn.put("p_distribusi", p_distribusi);

            mOut = serviceRekapUlangSaidiSaifiBulanan.POST_BUKATUTUPPENGESAHAN(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_user : " + p_user + " | " +
                            " p_kode : " + p_kode + " | " +
                            " p_blth : " + p_blth + " | " +
                            " p_distribusi : " + p_distribusi + " | " +
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
                            " p_user : " + p_user + " | " +
                            " p_kode : " + p_kode + " | " +
                            " p_blth : " + p_blth + " | " +
                            " p_distribusi : " + p_distribusi + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
