package rest.iconpln.rest.KoreksiCleansing;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.KoreksiCleansing.ServiceKoreksiWaktuKodePJenis;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/koreksi-cleansing/")
public class RestKoreksiWaktuKodePJenis {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestKoreksiWaktuKodePJenis.class);

    @Autowired
    private ServiceKoreksiWaktuKodePJenis serviceKoreksiWaktuKodePJenis;

    // GET
    @RequestMapping(
            value = "/KOREKSI_WAKTU_KODE_P_JENIS",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> KOREKSI_WAKTU_KODE_P_JENIS(
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
            mOut = serviceKoreksiWaktuKodePJenis.KOREKSI_WAKTU_KODE_P_JENIS(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_nolapor : " + p_nolapor + " | " +
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
                            " p_nolapor : " + p_nolapor + " | " +
                            " OUT = "+ mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_KOREKSI_WAKTU_KODE_P_JENIS",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_KOREKSI_WAKTU_KODE_P_JENIS(
            @RequestParam(value = "P_NOLAPORAN", defaultValue = "") String P_NOLAPORAN,
            @RequestParam(
                    value = "P_TGL_DATANG_KOREKSI",
                    defaultValue = ""
            ) String P_TGL_DATANG_KOREKSI,
            @RequestParam(
                    value = "P_TGL_NYALA_KOREKSI",
                    defaultValue = ""
            ) String P_TGL_NYALA_KOREKSI,
            @RequestParam(
                    value = "P_TGL_SELESAI_KOREKSI",
                    defaultValue = ""
            ) String P_TGL_SELESAI_KOREKSI,
            @RequestParam(
                    value = "P_JML_PELANGGAN_PADAM",
                    defaultValue = ""
            ) int P_JML_PELANGGAN_PADAM,
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(value = "P_NO_TICKET", defaultValue = "") String P_NO_TICKET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_NOLAPORAN : " + P_NOLAPORAN + " , " +
                            " P_TGL_DATANG_KOREKSI : " + P_TGL_DATANG_KOREKSI + " , " +
                            " P_TGL_NYALA_KOREKSI : " + P_TGL_NYALA_KOREKSI + " , " +
                            " P_TGL_SELESAI_KOREKSI : " + P_TGL_SELESAI_KOREKSI + " , " +
                            " P_JML_PELANGGAN_PADAM : " + P_JML_PELANGGAN_PADAM + " , " +
                            " P_USERNAME : " + P_USERNAME + " , " +
                            " P_NO_TICKET : " + P_NO_TICKET + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_NOLAPORAN", P_NOLAPORAN);
            mIn.put("P_TGL_DATANG_KOREKSI", P_TGL_DATANG_KOREKSI);
            mIn.put("P_TGL_NYALA_KOREKSI", P_TGL_NYALA_KOREKSI);
            mIn.put("P_TGL_SELESAI_KOREKSI", P_TGL_SELESAI_KOREKSI);
            mIn.put("P_JML_PELANGGAN_PADAM", P_JML_PELANGGAN_PADAM);
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("P_NO_TICKET", P_NO_TICKET);
            mOut = serviceKoreksiWaktuKodePJenis.POST_KOREKSI_WAKTU_KODE_P_JENIS(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_NOLAPORAN : " + P_NOLAPORAN + " | " +
                            " P_TGL_DATANG_KOREKSI : " + P_TGL_DATANG_KOREKSI + " | " +
                            " P_TGL_NYALA_KOREKSI : " + P_TGL_NYALA_KOREKSI + " | " +
                            " P_TGL_SELESAI_KOREKSI : " + P_TGL_SELESAI_KOREKSI + " | " +
                            " P_JML_PELANGGAN_PADAM : " + P_JML_PELANGGAN_PADAM + " | " +
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
                            " P_TGL_DATANG_KOREKSI : " + P_TGL_DATANG_KOREKSI + " | " +
                            " P_TGL_NYALA_KOREKSI : " + P_TGL_NYALA_KOREKSI + " | " +
                            " P_TGL_SELESAI_KOREKSI : " + P_TGL_SELESAI_KOREKSI + " | " +
                            " P_JML_PELANGGAN_PADAM : " + P_JML_PELANGGAN_PADAM + " | " +
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
