package rest.iconpln.rest.KoreksiCleansing;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.KoreksiCleansing.ServiceKoreksiWaktuGangguanIndividual;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/koreksi-cleansing/")
public class RestKoreksiWaktuGangguanIndividual {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestKoreksiWaktuGangguanIndividual.class);

    @Autowired
    private ServiceKoreksiWaktuGangguanIndividual serviceKoreksiWaktuGangguanIndividual;

    // GET
    @RequestMapping(
            value = "/Koreksi_Durasi_Gangguan",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> Koreksi_Durasi_Gangguan(
            @RequestParam(value = "P_NOLAPORAN", defaultValue = "") String P_NOLAPORAN
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_NOLAPORAN : " + P_NOLAPORAN + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_NOLAPORAN", P_NOLAPORAN);
            mOut = serviceKoreksiWaktuGangguanIndividual.Koreksi_Durasi_Gangguan(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " P_NOLAPORAN : " + P_NOLAPORAN + " | " +
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
                            " OUT = "+ mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_Koreksi_Durasi_Gangguan",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_Koreksi_Durasi_Gangguan(
            @RequestParam(
                    value = "p_reportnumber",
                    defaultValue = ""
            ) String p_reportnumber,
            @RequestParam(value = "p_penugasan", defaultValue = "") String p_penugasan,
            @RequestParam(
                    value = "p_perjalanan",
                    defaultValue = ""
            ) String p_perjalanan,
            @RequestParam(
                    value = "p_pengerjaan",
                    defaultValue = ""
            ) String p_pengerjaan,
            @RequestParam(
                    value = "p_nyalasementara",
                    defaultValue = ""
            ) String p_nyalasementara,
            @RequestParam(value = "p_nyala", defaultValue = "") String p_nyala,
            @RequestParam(value = "p_selesai", defaultValue = "") String p_selesai,
            @RequestParam(value = "p_user", defaultValue = "") String p_user,
            @RequestParam(value = "p_noticket", defaultValue = "") String p_noticket
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_reportnumber : " + p_reportnumber + " , " +
                            " p_penugasan : " + p_penugasan + " , " +
                            " p_perjalanan : " + p_perjalanan + " , " +
                            " p_pengerjaan : " + p_pengerjaan + " , " +
                            " p_nyalasementara : " + p_nyalasementara + " , " +
                            " p_nyala : " + p_nyala + " , " +
                            " p_selesai : " + p_selesai + " , " +
                            " p_user : " + p_user + " , " +
                            " p_noticket : " + p_noticket + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_reportnumber", p_reportnumber);
            mIn.put("p_penugasan", p_penugasan);
            mIn.put("p_perjalanan", p_perjalanan);
            mIn.put("p_pengerjaan", p_pengerjaan);
            mIn.put("p_nyalasementara", p_nyalasementara);
            mIn.put("p_nyala", p_nyala);
            mIn.put("p_selesai", p_selesai);
            mIn.put("p_user", p_user);
            mIn.put("p_noticket", p_noticket);
            mOut = serviceKoreksiWaktuGangguanIndividual.POST_Koreksi_Durasi_Gangguan(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_reportnumber : " + p_reportnumber + " | " +
                            " p_penugasan : " + p_penugasan + " | " +
                            " p_perjalanan : " + p_perjalanan + " | " +
                            " p_pengerjaan : " + p_pengerjaan + " | " +
                            " p_nyalasementara : " + p_nyalasementara + " | " +
                            " p_nyala : " + p_nyala + " | " +
                            " p_selesai : " + p_selesai + " | " +
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
                            " p_penugasan : " + p_penugasan + " | " +
                            " p_perjalanan : " + p_perjalanan + " | " +
                            " p_pengerjaan : " + p_pengerjaan + " | " +
                            " p_nyalasementara : " + p_nyalasementara + " | " +
                            " p_nyala : " + p_nyala + " | " +
                            " p_selesai : " + p_selesai + " | " +
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
