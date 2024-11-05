package rest.iconpln.rest.KoreksiCleansing;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.KoreksiCleansing.ServiceKoreksiWaktuKeluhan;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/koreksi-cleansing/")
public class RestKoreksiWaktuKeluhan {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestKoreksiWaktuKeluhan.class);

    @Autowired
    private ServiceKoreksiWaktuKeluhan serviceKoreksiWaktuKeluhan;

    // GET
    @RequestMapping(
            value = "/Koreksi_Durasi_Keluhan",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> Koreksi_Durasi_Keluhan(
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
            mOut = serviceKoreksiWaktuKeluhan.Koreksi_Durasi_Keluhan(mIn);
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
            value = "/POST_Koreksi_Durasi_Keluhan",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_Koreksi_Durasi_Keluhan(
            @RequestParam(
                    value = "p_reportnumber",
                    defaultValue = ""
            ) String p_reportnumber,
            @RequestParam(
                    value = "p_Dalam_Proses_Bidang_Unit",
                    defaultValue = ""
            ) String p_Dalam_Proses_Bidang_Unit,
            @RequestParam(
                    value = "p_Selesai_Dijawab_Bidang_Unit",
                    defaultValue = ""
            ) String p_Selesai_Dijawab_Bidang_Unit,
            @RequestParam(
                    value = "p_Konfirmasi",
                    defaultValue = ""
            ) String p_Konfirmasi,
            @RequestParam(value = "p_Selesai", defaultValue = "") String p_Selesai,
            @RequestParam(value = "p_user", defaultValue = "") String p_user,
            @RequestParam(value = "p_noticket", defaultValue = "") String p_noticket
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_reportnumber : " + p_reportnumber + " , " +
                            " p_Dalam_Proses_Bidang_Unit : " + p_Dalam_Proses_Bidang_Unit + " , " +
                            " p_Selesai_Dijawab_Bidang_Unit : " + p_Selesai_Dijawab_Bidang_Unit + " , " +
                            " p_Konfirmasi : " + p_Konfirmasi + " , " +
                            " p_Selesai : " + p_Selesai + " , " +
                            " p_user : " + p_user + " , " +
                            " p_noticket : " + p_noticket + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_reportnumber", p_reportnumber);
            mIn.put("p_Dalam_Proses_Bidang_Unit", p_Dalam_Proses_Bidang_Unit);
            mIn.put("p_Selesai_Dijawab_Bidang_Unit", p_Selesai_Dijawab_Bidang_Unit);
            mIn.put("p_Konfirmasi", p_Konfirmasi);
            mIn.put("p_Selesai", p_Selesai);
            mIn.put("p_user", p_user);
            mIn.put("p_noticket", p_noticket);
            mOut = serviceKoreksiWaktuKeluhan.POST_Koreksi_Durasi_Keluhan(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_reportnumber : " + p_reportnumber + " | " +
                            " p_Dalam_Proses_Bidang_Unit : " + p_Dalam_Proses_Bidang_Unit + " | " +
                            " p_Selesai_Dijawab_Bidang_Unit : " + p_Selesai_Dijawab_Bidang_Unit + " | " +
                            " p_Konfirmasi : " + p_Konfirmasi + " | " +
                            " p_Selesai : " + p_Selesai + " | " +
                            " p_user : " + p_user + " | " +
                            " p_noticket : " + p_noticket + " | " +
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
                            " p_reportnumber : " + p_reportnumber + " | " +
                            " p_Dalam_Proses_Bidang_Unit : " + p_Dalam_Proses_Bidang_Unit + " | " +
                            " p_Selesai_Dijawab_Bidang_Unit : " + p_Selesai_Dijawab_Bidang_Unit + " | " +
                            " p_Konfirmasi : " + p_Konfirmasi + " | " +
                            " p_Selesai : " + p_Selesai + " | " +
                            " p_user : " + p_user + " | " +
                            " p_noticket : " + p_noticket + " | " +
                            " OUT = "+ mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
