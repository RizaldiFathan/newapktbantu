package rest.iconpln.rest.KoreksiCleansing;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.KoreksiCleansing.ServiceKoreksiKodeGangguan;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/koreksi-cleansing/")
public class RestKoreksiKodeGangguan {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestKoreksiKodeGangguan.class);

    @Autowired
    private ServiceKoreksiKodeGangguan serviceKoreksiKodeGangguan;

    // GET
    @RequestMapping(
            value = "/Koreksi_Kode_Gangguan",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> Koreksi_Kode_Gangguan(
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
            mOut = serviceKoreksiKodeGangguan.Koreksi_Kode_Gangguan(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_nolapor : " + p_nolapor + " | " +
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
                            " p_nolapor : " + p_nolapor + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_Koreksi_Kode_Gangguan",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_Koreksi_Kode_Gangguan(
            @RequestParam(value = "p_nolaporan", defaultValue = "") String p_nolaporan,
            @RequestParam(
                    value = "p_fasilitas_id",
                    defaultValue = ""
            ) String p_fasilitas_id,
            @RequestParam(
                    value = "p_subfasilitas_id",
                    defaultValue = ""
            ) String p_subfasilitas_id,
            @RequestParam(
                    value = "p_equipment_id",
                    defaultValue = ""
            ) String p_equipment_id,
            @RequestParam(
                    value = "p_eventdamage_id",
                    defaultValue = ""
            ) String p_eventdamage_id,
            @RequestParam(value = "p_cause_id", defaultValue = "") String p_cause_id,
            @RequestParam(
                    value = "p_causegroup_id",
                    defaultValue = ""
            ) String p_causegroup_id,
            @RequestParam(
                    value = "p_weather_id",
                    defaultValue = ""
            ) String p_weather_id,
            @RequestParam(value = "p_username", defaultValue = "") String p_username,
            @RequestParam(value = "p_no_tiket", defaultValue = "") String p_no_tiket
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_nolaporan : " + p_nolaporan + " , " +
                            " p_fasilitas_id : " + p_fasilitas_id + " , " +
                            " p_subfasilitas_id : " + p_subfasilitas_id + " , " +
                            " p_equipment_id : " + p_equipment_id + " , " +
                            " p_eventdamage_id : " + p_eventdamage_id + " , " +
                            " p_cause_id : " + p_cause_id + " , " +
                            " p_causegroup_id : " + p_causegroup_id + " , " +
                            " p_weather_id : " + p_weather_id + " , " +
                            " p_username : " + p_username + " , " +
                            " p_no_tiket : " + p_no_tiket + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_nolaporan", p_nolaporan);
            mIn.put("p_fasilitas_id", p_fasilitas_id);
            mIn.put("p_subfasilitas_id", p_subfasilitas_id);
            mIn.put("p_equipment_id", p_equipment_id);
            mIn.put("p_eventdamage_id", p_eventdamage_id);
            mIn.put("p_cause_id", p_cause_id);
            mIn.put("p_causegroup_id", p_causegroup_id);
            mIn.put("p_weather_id", p_weather_id);
            mIn.put("p_username", p_username);
            mIn.put("p_no_tiket", p_no_tiket);
            mOut = serviceKoreksiKodeGangguan.POST_Koreksi_Kode_Gangguan(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_nolaporan : " + p_nolaporan + " | " +
                            " p_fasilitas_id : " + p_fasilitas_id + " | " +
                            " p_subfasilitas_id : " + p_subfasilitas_id + " | " +
                            " p_equipment_id : " + p_equipment_id + " | " +
                            " p_eventdamage_id : " + p_eventdamage_id + " | " +
                            " p_cause_id : " + p_cause_id + " | " +
                            " p_causegroup_id : " + p_causegroup_id + " | " +
                            " p_weather_id : " + p_weather_id + " | " +
                            " p_username : " + p_username + " | " +
                            " p_no_tiket : " + p_no_tiket + " | " +
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
                            " p_nolaporan : " + p_nolaporan + " | " +
                            " p_fasilitas_id : " + p_fasilitas_id + " | " +
                            " p_subfasilitas_id : " + p_subfasilitas_id + " | " +
                            " p_equipment_id : " + p_equipment_id + " | " +
                            " p_eventdamage_id : " + p_eventdamage_id + " | " +
                            " p_cause_id : " + p_cause_id + " | " +
                            " p_causegroup_id : " + p_causegroup_id + " | " +
                            " p_weather_id : " + p_weather_id + " | " +
                            " p_username : " + p_username + " | " +
                            " p_no_tiket : " + p_no_tiket + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
    // ATRIBUT
    @RequestMapping(
            value = "/GET_FASILITAS",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_FASILITAS(
            @RequestParam(value = "p_kodelapor", defaultValue = "") String p_kodelapor
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_kodelapor : " + p_kodelapor + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_kodelapor", p_kodelapor);
            mOut = serviceKoreksiKodeGangguan.GET_FASILITAS(mIn);
            logger.info(
                    "===|  OUT FROM GET_FASILITAS = " +
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
                    "===|  OUT FROM GET_FASILITAS = " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/GET_SUB_FASILITAS",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_SUB_FASILITAS(
            @RequestParam(
                    value = "p_idfasilitas",
                    defaultValue = ""
            ) String p_idfasilitas
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_idfasilitas : " + p_idfasilitas + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_idfasilitas", p_idfasilitas);
            mOut = serviceKoreksiKodeGangguan.GET_SUB_FASILITAS(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_idfasilitas : " + p_idfasilitas + " | " +
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
                            " p_idfasilitas : " + p_idfasilitas + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/GET_EVENTDAMAGE",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_EVENTDAMAGE() {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " GET_EVENTDAMAGE : " +
                            " |==="
            );
            Map mIn = new HashMap();
            // mIn.put("p_idfasilitas", p_idfasilitas);
            mOut = serviceKoreksiKodeGangguan.GET_EVENTDAMAGE(mIn);
            logger.info(
                    "===|  OUT FROM GET_EVENTDAMAGE = " +
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
                    "===|  OUT FROM GET_EVENTDAMAGE = " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/GET_CAUSE",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_CAUSE() {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " GET_CAUSE : " +
                            " |==="
            );
            Map mIn = new HashMap();
            // mIn.put("p_idfasilitas", p_idfasilitas);
            mOut = serviceKoreksiKodeGangguan.GET_CAUSE(mIn);
            logger.info(
                    "===|  OUT FROM GET_CAUSE = " +
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
                    "===|  OUT FROM GET_CAUSE = " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/GET_GROUPCAUSE",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_GROUPCAUSE() {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " GET_GROUPCAUSE : " +
                            " |==="
            );
            Map mIn = new HashMap();
            // mIn.put("p_idfasilitas", p_idfasilitas);
            mOut = serviceKoreksiKodeGangguan.GET_GROUPCAUSE(mIn);
            logger.info(
                    "===|  OUT FROM GET_GROUPCAUSE = " +
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
                    "===|  OUT FROM GET_GROUPCAUSE = " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/GET_WEATHER",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_WEATHER() {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " GET_WEATHER : " +
                            " |==="
            );
            Map mIn = new HashMap();
            // mIn.put("p_idfasilitas", p_idfasilitas);
            mOut = serviceKoreksiKodeGangguan.GET_WEATHER(mIn);
            logger.info(
                    "===|  OUT FROM GET_WEATHER = " +
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
                    "===|  OUT FROM GET_WEATHER = " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/GET_EQUIPMENT",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_EQUIPMENT(
            @RequestParam(
                    value = "p_idsubfasilitas",
                    defaultValue = ""
            ) String p_idsubfasilitas
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " p_idsubfasilitas : " + p_idsubfasilitas + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_idsubfasilitas", p_idsubfasilitas);
            mOut = serviceKoreksiKodeGangguan.GET_EQUIPMENT(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " p_idsubfasilitas : " + p_idsubfasilitas + " | " +
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
                            " p_idsubfasilitas : " + p_idsubfasilitas + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END ATRIBUT
}
