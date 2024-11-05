package rest.iconpln.rest.LaporanSaidiSaifi;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.rest.KoreksiCleansing.RestUpdateNyalaBertahap;
import rest.iconpln.service.LaporanSaidiSaifi.ServiceBukaTutupStatusInputTransaksi;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/saidi-saifi/")
public class RestBukaTutupStatusInputTransaksi {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestBukaTutupStatusInputTransaksi.class);

    @Autowired
    private ServiceBukaTutupStatusInputTransaksi serviceBukaTutupStatusInputTransaksi;

    // GET
    @RequestMapping(
            value = "/Status_Input_Tranasaksi",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> Status_Input_Tranasaksi(
            @RequestParam(value = "p_user", defaultValue = "") String p_user
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_user : " + p_user + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_user", p_user);
            mOut = serviceBukaTutupStatusInputTransaksi.Status_Input_Tranasaksi(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_user : " + p_user + " | "
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
                    + " p_user : " + p_user + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/Post_Input_Tranasaksi",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> Post_Input_Tranasaksi(
            @RequestParam(value = "p_user", defaultValue = "") String p_user,
            @RequestParam(value = "p_dist", defaultValue = "") String p_dist,
            @RequestParam(
                    value = "p_aktif_update",
                    defaultValue = ""
            ) String p_aktif_update
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_user : " + p_user + " , "
                    + " p_dist : " + p_dist + " , "
                    + " p_aktif_update : " + p_aktif_update + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_user", p_user);
            mIn.put("p_dist", p_dist);
            mIn.put("p_aktif_update", p_aktif_update);
            mOut = serviceBukaTutupStatusInputTransaksi.Post_Input_Tranasaksi(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_user : " + p_user + " | "
                    + " p_dist : " + p_dist + " | "
                    + " p_aktif_update : " + p_aktif_update + " | "
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
                    + " p_user : " + p_user + " | "
                    + " p_dist : " + p_dist + " | "
                    + " p_aktif_update : " + p_aktif_update + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
