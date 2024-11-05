package rest.iconpln.rest.KoreksiCleansing;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.KoreksiCleansing.ServiceKoreksiJumlahPelanggan;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/koreksi-cleansing/")
public class RestKoreksiJumlahPelanggan {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestKoreksiJumlahPelanggan.class);

    @Autowired
    private ServiceKoreksiJumlahPelanggan serviceKoreksiJumlahPelanggan;

    // GET
    @RequestMapping(
            value = "/KoreksiJumlahPelanggan",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> KoreksiJumlahPelanggan(
            @RequestParam(value = "P_NO_LAPORAN", defaultValue = "") String P_NO_LAPORAN
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_NO_LAPORAN : " + P_NO_LAPORAN + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_NO_LAPORAN", P_NO_LAPORAN);

            mOut = serviceKoreksiJumlahPelanggan.KoreksiJumlahPelanggan(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_NO_LAPORAN : " + P_NO_LAPORAN + " | " +
                            " OUT = "+ mOut +
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
                            " P_NO_LAPORAN : " + P_NO_LAPORAN + " | " +
                            " OUT = "+ mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POSTKoreksiJumlahPelanggan",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POSTKoreksiJumlahPelanggan(
            @RequestParam(value = "P_NOLAPORAN", defaultValue = "") String P_NOLAPORAN,
            @RequestParam(
                    value = "P_JML_PLGN_PADAM_KOREKSI",
                    defaultValue = ""
            ) String P_JML_PLGN_PADAM_KOREKSI,
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(value = "P_NO_TICKET", defaultValue = "") String P_NO_TICKET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_NOLAPORAN : " + P_NOLAPORAN + " , " +
                            " P_JML_PLGN_PADAM_KOREKSI : " + P_JML_PLGN_PADAM_KOREKSI + " , " +
                            " P_USERNAME : " + P_USERNAME + " , " +
                            " P_NO_TICKET : " + P_NO_TICKET + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_NOLAPORAN", P_NOLAPORAN);
            mIn.put("P_JML_PLGN_PADAM_KOREKSI", P_JML_PLGN_PADAM_KOREKSI);
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("P_NO_TICKET", P_NO_TICKET);

            mOut = serviceKoreksiJumlahPelanggan.POSTKoreksiJumlahPelanggan(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_NOLAPORAN : " + P_NOLAPORAN + " | " +
                            " P_JML_PLGN_PADAM_KOREKSI : " + P_JML_PLGN_PADAM_KOREKSI + " | " +
                            " P_USERNAME : " + P_USERNAME + " | " +
                            " P_NO_TICKET : " + P_NO_TICKET + " | " +
                            " OUT = "+ mOut +
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
                            " P_NOLAPORAN : " + P_NOLAPORAN + " | " +
                            " P_JML_PLGN_PADAM_KOREKSI : " + P_JML_PLGN_PADAM_KOREKSI + " | " +
                            " P_USERNAME : " + P_USERNAME + " | " +
                            " P_NO_TICKET : " + P_NO_TICKET + " | " +
                            " OUT = "+ mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END POST
}
