package rest.iconpln.rest.KoreksiCleansing;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.KoreksiCleansing.ServicePemadamanTM;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/koreksi-cleansing/")
public class RestPemadamanTM {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestPemadamanTM.class);

    @Autowired
    private ServicePemadamanTM servicePemadamanTM;

    // GET
    @RequestMapping(
            value = "/GET_PEMADAMANTM",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> GET_PEMADAMANTM(
            @RequestParam(value = "NO_LAPORAN", defaultValue = "") String unitid
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " unitid : " + unitid + " , " +
                            " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_LAPORAN", unitid);
            mOut = servicePemadamanTM.GET_PEMADAMANTM(mIn);
            logger.info(
                    "===|  OUT FROM = " +
                            " unitid : " + unitid + " | " +
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
                            " unitid : " + unitid + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_PEMADAMANTM",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_PEMADAMANTM(
            @RequestParam(
                    value = "P_NO_LAPORAN",
                    defaultValue = ""
            ) String P_NO_LAPORAN,
            @RequestParam(
                    value = "P_TGL_LAPOR_ACTUAL_1",
                    defaultValue = ""
            ) String P_TGL_LAPOR_ACTUAL_1,
            @RequestParam(
                    value = "P_TGL_DATANG_ACTUAL_1",
                    defaultValue = ""
            ) String P_TGL_DATANG_ACTUAL_1,
            @RequestParam(
                    value = "P_TGL_DATANG_KOREKSI_1",
                    defaultValue = ""
            ) String P_TGL_DATANG_KOREKSI_1,
            @RequestParam(
                    value = "P_TGL_NYALA_ACTUAL_1",
                    defaultValue = ""
            ) String P_TGL_NYALA_ACTUAL_1,
            @RequestParam(
                    value = "P_TGL_NYALA_KOREKSI_1",
                    defaultValue = ""
            ) String P_TGL_NYALA_KOREKSI_1,
            @RequestParam(
                    value = "P_JML_PLGN_PADAM_1",
                    defaultValue = ""
            ) Number P_JML_PLGN_PADAM_1,
            @RequestParam(
                    value = "P_KWH_LOSS_ACTUAL_1",
                    defaultValue = ""
            ) Number P_KWH_LOSS_ACTUAL_1,
            @RequestParam(value = "P_ULP_1", defaultValue = "") Number P_ULP_1,
            @RequestParam(
                    value = "P_TGL_NYALA_ACTUAL_2",
                    defaultValue = ""
            ) String P_TGL_NYALA_ACTUAL_2,
            @RequestParam(
                    value = "P_TGL_NYALA_KOREKSI_2",
                    defaultValue = ""
            ) String P_TGL_NYALA_KOREKSI_2,
            @RequestParam(
                    value = "P_JML_PLGN_PADAM_2",
                    defaultValue = ""
            ) Number P_JML_PLGN_PADAM_2,
            @RequestParam(
                    value = "P_KWH_LOSS_ACTUAL_2",
                    defaultValue = ""
            ) Number P_KWH_LOSS_ACTUAL_2,
            @RequestParam(value = "P_ULP_2", defaultValue = "") Number P_ULP_2,
            @RequestParam(
                    value = "P_TGL_NYALA_ACTUAL_3",
                    defaultValue = ""
            ) String P_TGL_NYALA_ACTUAL_3,
            @RequestParam(
                    value = "P_TGL_NYALA_KOREKSI_3",
                    defaultValue = ""
            ) String P_TGL_NYALA_KOREKSI_3,
            @RequestParam(
                    value = "P_JML_PLGN_PADAM_3",
                    defaultValue = ""
            ) Number P_JML_PLGN_PADAM_3,
            @RequestParam(
                    value = "P_KWH_LOSS_ACTUAL_3",
                    defaultValue = ""
            ) Number P_KWH_LOSS_ACTUAL_3,
            @RequestParam(value = "P_ULP_3", defaultValue = "") Number P_ULP_3,
            @RequestParam(
                    value = "P_TGL_NYALA_ACTUAL_4",
                    defaultValue = ""
            ) String P_TGL_NYALA_ACTUAL_4,
            @RequestParam(
                    value = "P_TGL_NYALA_KOREKSI_4",
                    defaultValue = ""
            ) String P_TGL_NYALA_KOREKSI_4,
            @RequestParam(
                    value = "P_JML_PLGN_PADAM_4",
                    defaultValue = ""
            ) Number P_JML_PLGN_PADAM_4,
            @RequestParam(
                    value = "P_KWH_LOSS_ACTUAL_4",
                    defaultValue = ""
            ) Number P_KWH_LOSS_ACTUAL_4,
            @RequestParam(value = "P_ULP_4", defaultValue = "") Number P_ULP_4,
            @RequestParam(
                    value = "P_TGL_NYALA_ACTUAL_5",
                    defaultValue = ""
            ) String P_TGL_NYALA_ACTUAL_5,
            @RequestParam(
                    value = "P_TGL_NYALA_KOREKSI_5",
                    defaultValue = ""
            ) String P_TGL_NYALA_KOREKSI_5,
            @RequestParam(
                    value = "P_JML_PLGN_PADAM_5",
                    defaultValue = ""
            ) Number P_JML_PLGN_PADAM_5,
            @RequestParam(
                    value = "P_KWH_LOSS_ACTUAL_5",
                    defaultValue = ""
            ) Number P_KWH_LOSS_ACTUAL_5,
            @RequestParam(value = "P_ULP_5", defaultValue = "") Number P_ULP_5,
            @RequestParam(
                    value = "P_TGL_NYALA_ACTUAL_6",
                    defaultValue = ""
            ) String P_TGL_NYALA_ACTUAL_6,
            @RequestParam(
                    value = "P_TGL_NYALA_KOREKSI_6",
                    defaultValue = ""
            ) String P_TGL_NYALA_KOREKSI_6,
            @RequestParam(
                    value = "P_JML_PLGN_PADAM_6",
                    defaultValue = ""
            ) Number P_JML_PLGN_PADAM_6,
            @RequestParam(
                    value = "P_KWH_LOSS_ACTUAL_6",
                    defaultValue = ""
            ) Number P_KWH_LOSS_ACTUAL_6,
            @RequestParam(value = "P_ULP_6", defaultValue = "") Number P_ULP_6,
            @RequestParam(
                    value = "P_TGL_NYALA_ACTUAL_7",
                    defaultValue = ""
            ) String P_TGL_NYALA_ACTUAL_7,
            @RequestParam(
                    value = "P_TGL_NYALA_KOREKSI_7",
                    defaultValue = ""
            ) String P_TGL_NYALA_KOREKSI_7,
            @RequestParam(
                    value = "P_JML_PLGN_PADAM_7",
                    defaultValue = ""
            ) Number P_JML_PLGN_PADAM_7,
            @RequestParam(
                    value = "P_KWH_LOSS_ACTUAL_7",
                    defaultValue = ""
            ) Number P_KWH_LOSS_ACTUAL_7,
            @RequestParam(value = "P_ULP_7", defaultValue = "") Number P_ULP_7,
            @RequestParam(
                    value = "P_TGL_NYALA_ACTUAL_8",
                    defaultValue = ""
            ) String P_TGL_NYALA_ACTUAL_8,
            @RequestParam(
                    value = "P_TGL_NYALA_KOREKSI_8",
                    defaultValue = ""
            ) String P_TGL_NYALA_KOREKSI_8,
            @RequestParam(
                    value = "P_JML_PLGN_PADAM_8",
                    defaultValue = ""
            ) Number P_JML_PLGN_PADAM_8,
            @RequestParam(
                    value = "P_KWH_LOSS_ACTUAL_8",
                    defaultValue = ""
            ) Number P_KWH_LOSS_ACTUAL_8,
            @RequestParam(value = "P_ULP_8", defaultValue = "") Number P_ULP_8,
            @RequestParam(
                    value = "P_TGL_NYALA_ACTUAL_9",
                    defaultValue = ""
            ) String P_TGL_NYALA_ACTUAL_9,
            @RequestParam(
                    value = "P_TGL_NYALA_KOREKSI_9",
                    defaultValue = ""
            ) String P_TGL_NYALA_KOREKSI_9,
            @RequestParam(
                    value = "P_JML_PLGN_PADAM_9",
                    defaultValue = ""
            ) Number P_JML_PLGN_PADAM_9,
            @RequestParam(
                    value = "P_KWH_LOSS_ACTUAL_9",
                    defaultValue = ""
            ) Number P_KWH_LOSS_ACTUAL_9,
            @RequestParam(value = "P_ULP_9", defaultValue = "") Number P_ULP_9,
            @RequestParam(
                    value = "P_TGL_NYALA_ACTUAL_10",
                    defaultValue = ""
            ) String P_TGL_NYALA_ACTUAL_10,
            @RequestParam(
                    value = "P_TGL_NYALA_KOREKSI_10",
                    defaultValue = ""
            ) String P_TGL_NYALA_KOREKSI_10,
            @RequestParam(
                    value = "P_JML_PLGN_PADAM_10",
                    defaultValue = ""
            ) Number P_JML_PLGN_PADAM_10,
            @RequestParam(
                    value = "P_KWH_LOSS_ACTUAL_10",
                    defaultValue = ""
            ) Number P_KWH_LOSS_ACTUAL_10,
            @RequestParam(value = "P_ULP_10", defaultValue = "") Number P_ULP_10,
            @RequestParam(value = "P_JML_PLGN1", defaultValue = "") Number P_JML_PLGN1,
            @RequestParam(value = "P_JML_PLGN2", defaultValue = "") Number P_JML_PLGN2,
            @RequestParam(value = "P_JML_PLGN3", defaultValue = "") Number P_JML_PLGN3,
            @RequestParam(value = "P_JML_PLGN4", defaultValue = "") Number P_JML_PLGN4,
            @RequestParam(value = "P_JML_PLGN5", defaultValue = "") Number P_JML_PLGN5,
            @RequestParam(value = "P_JML_PLGN6", defaultValue = "") Number P_JML_PLGN6,
            @RequestParam(value = "P_JML_PLGN7", defaultValue = "") Number P_JML_PLGN7,
            @RequestParam(value = "P_JML_PLGN8", defaultValue = "") Number P_JML_PLGN8,
            @RequestParam(value = "P_JML_PLGN9", defaultValue = "") Number P_JML_PLGN9,
            @RequestParam(
                    value = "P_JML_PLGN10",
                    defaultValue = ""
            ) Number P_JML_PLGN10,
            @RequestParam(
                    value = "P_TGL_SELESAI_ACTUAL_1",
                    defaultValue = ""
            ) String P_TGL_SELESAI_ACTUAL_1,
            @RequestParam(
                    value = "P_TGL_SELESAI_KOREKSI_1",
                    defaultValue = ""
            ) String P_TGL_SELESAI_KOREKSI_1,
            @RequestParam(value = "P_STATUS", defaultValue = "") String P_STATUS,
            @RequestParam(value = "P_BLTH", defaultValue = "") String P_BLTH,
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(value = "P_TGLUPDATE", defaultValue = "") String P_TGLUPDATE,
            @RequestParam(value = "P_NO_TICKET", defaultValue = "") String P_NO_TICKET
            // @RequestParam(value = "P_KETERANGAN", defaultValue = "") String P_KETERANGAN,
            // @RequestParam(value = "P_PEMOHON", defaultValue = "") String P_PEMOHON

    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                            " P_NO_LAPORAN : " + P_NO_LAPORAN + " , " +
                            " P_TGL_LAPOR_ACTUAL_1 : " + P_TGL_LAPOR_ACTUAL_1 + " , " +
                            " P_TGL_DATANG_ACTUAL_1 : " + P_TGL_DATANG_ACTUAL_1 + " , " +
                            " P_TGL_DATANG_KOREKSI_1 : " + P_TGL_DATANG_KOREKSI_1 + " , " +
                            " P_TGL_NYALA_ACTUAL_1 : " + P_TGL_NYALA_ACTUAL_1 + " , " +
                            " P_TGL_NYALA_KOREKSI_1 : " + P_TGL_NYALA_KOREKSI_1 + " , " +
                            " P_JML_PLGN_PADAM_1 : " + P_JML_PLGN_PADAM_1 + " , " +
                            " P_KWH_LOSS_ACTUAL_1 : " + P_KWH_LOSS_ACTUAL_1 + " , " +
                            " P_ULP_1 : " + P_ULP_1 + " , " +
                            " P_TGL_NYALA_ACTUAL_2 : " + P_TGL_NYALA_ACTUAL_2 + " , " +
                            " P_TGL_NYALA_KOREKSI_2 : " + P_TGL_NYALA_KOREKSI_2 + " , " +
                            " P_JML_PLGN_PADAM_2 : " + P_JML_PLGN_PADAM_2 + " , " +
                            " P_KWH_LOSS_ACTUAL_2 : " + P_KWH_LOSS_ACTUAL_2 + " , " +
                            " P_ULP_2 : " + P_ULP_2 + " , " +
                            " P_TGL_NYALA_ACTUAL_3 : " + P_TGL_NYALA_ACTUAL_3 + " , " +
                            " P_TGL_NYALA_KOREKSI_3 : " + P_TGL_NYALA_KOREKSI_3 + " , " +
                            " P_JML_PLGN_PADAM_3 : " + P_JML_PLGN_PADAM_3 + " , " +
                            " P_KWH_LOSS_ACTUAL_3 : " + P_KWH_LOSS_ACTUAL_3 + " , " +
                            " P_ULP_3 : " + P_ULP_3 + " , " +
                            " P_TGL_NYALA_ACTUAL_4 : " + P_TGL_NYALA_ACTUAL_4 + " , " +
                            " P_TGL_NYALA_KOREKSI_4 : " + P_TGL_NYALA_KOREKSI_4 + " , " +
                            " P_JML_PLGN_PADAM_4 : " + P_JML_PLGN_PADAM_4 + " , " +
                            " P_KWH_LOSS_ACTUAL_4 : " + P_KWH_LOSS_ACTUAL_4 + " , " +
                            " P_ULP_4 : " + P_ULP_4 + " , " +
                            " P_TGL_NYALA_ACTUAL_5 : " + P_TGL_NYALA_ACTUAL_5 + " , " +
                            " P_TGL_NYALA_KOREKSI_5 : " + P_TGL_NYALA_KOREKSI_5 + " , " +
                            " P_JML_PLGN_PADAM_5 : " + P_JML_PLGN_PADAM_5 + " , " +
                            " P_KWH_LOSS_ACTUAL_5 : " + P_KWH_LOSS_ACTUAL_5 + " , " +
                            " P_ULP_5 : " + P_ULP_5 + " , " +
                            " P_TGL_NYALA_ACTUAL_6 : " + P_TGL_NYALA_ACTUAL_6 + " , " +
                            " P_TGL_NYALA_KOREKSI_6 : " + P_TGL_NYALA_KOREKSI_6 + " , " +
                            " P_JML_PLGN_PADAM_6 : " + P_JML_PLGN_PADAM_6 + " , " +
                            " P_KWH_LOSS_ACTUAL_6 : " + P_KWH_LOSS_ACTUAL_6 + " , " +
                            " P_ULP_6 : " + P_ULP_6 + " , " +
                            " P_TGL_NYALA_ACTUAL_7 : " + P_TGL_NYALA_ACTUAL_7 + " , " +
                            " P_TGL_NYALA_KOREKSI_7 : " + P_TGL_NYALA_KOREKSI_7 + " , " +
                            " P_JML_PLGN_PADAM_7 : " + P_JML_PLGN_PADAM_7 + " , " +
                            " P_KWH_LOSS_ACTUAL_7 : " + P_KWH_LOSS_ACTUAL_7 + " , " +
                            " P_ULP_7 : " + P_ULP_7 + " , " +
                            " P_TGL_NYALA_ACTUAL_8 : " + P_TGL_NYALA_ACTUAL_8 + " , " +
                            " P_TGL_NYALA_KOREKSI_8 : " + P_TGL_NYALA_KOREKSI_8 + " , " +
                            " P_JML_PLGN_PADAM_8 : " + P_JML_PLGN_PADAM_8 + " , " +
                            " P_KWH_LOSS_ACTUAL_8 : " + P_KWH_LOSS_ACTUAL_8 + " , " +
                            " P_ULP_8 : " + P_ULP_8 + " , " +
                            " P_TGL_NYALA_ACTUAL_9 : " + P_TGL_NYALA_ACTUAL_9 + " , " +
                            " P_TGL_NYALA_KOREKSI_9 : " + P_TGL_NYALA_KOREKSI_9 + " , " +
                            " P_JML_PLGN_PADAM_9 : " + P_JML_PLGN_PADAM_9 + " , " +
                            " P_KWH_LOSS_ACTUAL_9 : " + P_KWH_LOSS_ACTUAL_9 + " , " +
                            " P_ULP_9 : " + P_ULP_9 + " , " +
                            " P_TGL_NYALA_ACTUAL_10 : " + P_TGL_NYALA_ACTUAL_10 + " , " +
                            " P_TGL_NYALA_KOREKSI_10 : " + P_TGL_NYALA_KOREKSI_10 + " , " +
                            " P_JML_PLGN_PADAM_10 : " + P_JML_PLGN_PADAM_10 + " , " +
                            " P_KWH_LOSS_ACTUAL_10 : " + P_KWH_LOSS_ACTUAL_10 + " , " +
                            " P_ULP_10 : " + P_ULP_10 + " , " +
                            " P_JML_PLGN1 : " + P_JML_PLGN1 + " , " +
                            " P_JML_PLGN2 : " + P_JML_PLGN2 + " , " +
                            " P_JML_PLGN3 : " + P_JML_PLGN3 + " , " +
                            " P_JML_PLGN4 : " + P_JML_PLGN4 + " , " +
                            " P_JML_PLGN5 : " + P_JML_PLGN5 + " , " +
                            " P_JML_PLGN6 : " + P_JML_PLGN6 + " , " +
                            " P_JML_PLGN7 : " + P_JML_PLGN7 + " , " +
                            " P_JML_PLGN8 : " + P_JML_PLGN8 + " , " +
                            " P_JML_PLGN9 : " + P_JML_PLGN9 + " , " +
                            " P_JML_PLGN10 : " + P_JML_PLGN10 + " , " +
                            " P_TGL_SELESAI_ACTUAL_1 : " + P_TGL_SELESAI_ACTUAL_1 + " , " +
                            " P_TGL_SELESAI_KOREKSI_1 : " + P_TGL_SELESAI_KOREKSI_1 + " , " +
                            " P_STATUS : " + P_STATUS + " , " +
                            " P_BLTH : " + P_BLTH + " , " +
                            " P_USERNAME : " + P_USERNAME + " , " +
                            " P_TGLUPDATE : " + P_TGLUPDATE + " , " +
                            " P_NO_TICKET : " + P_NO_TICKET + " , " +
                            " |==="
            );

            Map mIn = new HashMap();
            mIn.put("P_NO_LAPORAN", P_NO_LAPORAN);
            mIn.put("P_TGL_LAPOR_ACTUAL_1", P_TGL_LAPOR_ACTUAL_1);
            mIn.put("P_TGL_DATANG_ACTUAL_1", P_TGL_DATANG_ACTUAL_1);
            mIn.put("P_TGL_DATANG_KOREKSI_1", P_TGL_DATANG_KOREKSI_1);
            mIn.put("P_TGL_NYALA_ACTUAL_1", P_TGL_NYALA_ACTUAL_1);
            mIn.put("P_TGL_NYALA_KOREKSI_1", P_TGL_NYALA_KOREKSI_1);
            mIn.put("P_JML_PLGN_PADAM_1", P_JML_PLGN_PADAM_1);
            mIn.put("P_KWH_LOSS_ACTUAL_1", P_KWH_LOSS_ACTUAL_1);
            mIn.put("P_ULP_1", P_ULP_1);
            mIn.put("P_TGL_NYALA_ACTUAL_2", P_TGL_NYALA_ACTUAL_2);
            mIn.put("P_TGL_NYALA_KOREKSI_2", P_TGL_NYALA_KOREKSI_2);
            mIn.put("P_JML_PLGN_PADAM_2", P_JML_PLGN_PADAM_2);
            mIn.put("P_KWH_LOSS_ACTUAL_2", P_KWH_LOSS_ACTUAL_2);
            mIn.put("P_ULP_2", P_ULP_2);
            mIn.put("P_TGL_NYALA_ACTUAL_3", P_TGL_NYALA_ACTUAL_3);
            mIn.put("P_TGL_NYALA_KOREKSI_3", P_TGL_NYALA_KOREKSI_3);
            mIn.put("P_JML_PLGN_PADAM_3", P_JML_PLGN_PADAM_3);
            mIn.put("P_KWH_LOSS_ACTUAL_3", P_KWH_LOSS_ACTUAL_3);
            mIn.put("P_ULP_3", P_ULP_3);
            mIn.put("P_TGL_NYALA_ACTUAL_4", P_TGL_NYALA_ACTUAL_4);
            mIn.put("P_TGL_NYALA_KOREKSI_4", P_TGL_NYALA_KOREKSI_4);
            mIn.put("P_JML_PLGN_PADAM_4", P_JML_PLGN_PADAM_4);
            mIn.put("P_KWH_LOSS_ACTUAL_4", P_KWH_LOSS_ACTUAL_4);
            mIn.put("P_ULP_4", P_ULP_4);
            mIn.put("P_TGL_NYALA_ACTUAL_5", P_TGL_NYALA_ACTUAL_5);
            mIn.put("P_TGL_NYALA_KOREKSI_5", P_TGL_NYALA_KOREKSI_5);
            mIn.put("P_JML_PLGN_PADAM_5", P_JML_PLGN_PADAM_5);
            mIn.put("P_KWH_LOSS_ACTUAL_5", P_KWH_LOSS_ACTUAL_5);
            mIn.put("P_ULP_5", P_ULP_5);
            mIn.put("P_TGL_NYALA_ACTUAL_6", P_TGL_NYALA_ACTUAL_6);
            mIn.put("P_TGL_NYALA_KOREKSI_6", P_TGL_NYALA_KOREKSI_6);
            mIn.put("P_JML_PLGN_PADAM_6", P_JML_PLGN_PADAM_6);
            mIn.put("P_KWH_LOSS_ACTUAL_6", P_KWH_LOSS_ACTUAL_6);
            mIn.put("P_ULP_6", P_ULP_6);
            mIn.put("P_TGL_NYALA_ACTUAL_7", P_TGL_NYALA_ACTUAL_7);
            mIn.put("P_TGL_NYALA_KOREKSI_7", P_TGL_NYALA_KOREKSI_7);
            mIn.put("P_JML_PLGN_PADAM_7", P_JML_PLGN_PADAM_7);
            mIn.put("P_KWH_LOSS_ACTUAL_7", P_KWH_LOSS_ACTUAL_7);
            mIn.put("P_ULP_7", P_ULP_7);
            mIn.put("P_TGL_NYALA_ACTUAL_8", P_TGL_NYALA_ACTUAL_8);
            mIn.put("P_TGL_NYALA_KOREKSI_8", P_TGL_NYALA_KOREKSI_8);
            mIn.put("P_JML_PLGN_PADAM_8", P_JML_PLGN_PADAM_8);
            mIn.put("P_KWH_LOSS_ACTUAL_8", P_KWH_LOSS_ACTUAL_8);
            mIn.put("P_ULP_8", P_ULP_8);
            mIn.put("P_TGL_NYALA_ACTUAL_9", P_TGL_NYALA_ACTUAL_9);
            mIn.put("P_TGL_NYALA_KOREKSI_9", P_TGL_NYALA_KOREKSI_9);
            mIn.put("P_JML_PLGN_PADAM_9", P_JML_PLGN_PADAM_9);
            mIn.put("P_KWH_LOSS_ACTUAL_9", P_KWH_LOSS_ACTUAL_9);
            mIn.put("P_ULP_9", P_ULP_9);
            mIn.put("P_TGL_NYALA_ACTUAL_10", P_TGL_NYALA_ACTUAL_10);
            mIn.put("P_TGL_NYALA_KOREKSI_10", P_TGL_NYALA_KOREKSI_10);
            mIn.put("P_JML_PLGN_PADAM_10", P_JML_PLGN_PADAM_10);
            mIn.put("P_KWH_LOSS_ACTUAL_10", P_KWH_LOSS_ACTUAL_10);
            mIn.put("P_ULP_10", P_ULP_10);
            mIn.put("P_JML_PLGN1", P_JML_PLGN1);
            mIn.put("P_JML_PLGN2", P_JML_PLGN2);
            mIn.put("P_JML_PLGN3", P_JML_PLGN3);
            mIn.put("P_JML_PLGN4", P_JML_PLGN4);
            mIn.put("P_JML_PLGN5", P_JML_PLGN5);
            mIn.put("P_JML_PLGN6", P_JML_PLGN6);
            mIn.put("P_JML_PLGN7", P_JML_PLGN7);
            mIn.put("P_JML_PLGN8", P_JML_PLGN8);
            mIn.put("P_JML_PLGN9", P_JML_PLGN9);
            mIn.put("P_JML_PLGN10", P_JML_PLGN10);
            mIn.put("P_TGL_SELESAI_ACTUAL_1", P_TGL_SELESAI_ACTUAL_1);
            mIn.put("P_TGL_SELESAI_KOREKSI_1", P_TGL_SELESAI_KOREKSI_1);
            mIn.put("P_STATUS", P_STATUS);
            mIn.put("P_BLTH", P_BLTH);
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("P_TGLUPDATE", P_TGLUPDATE);
            mIn.put("P_NO_TICKET", P_NO_TICKET);
            // mIn.put("P_KETERANGAN", P_KETERANGAN);
            // mIn.put("P_PEMOHON", P_PEMOHON);

            mOut = servicePemadamanTM.POST_PEMADAMANTM(mIn);
            // mOut = "OKE";
            logger.info(
                    "===|  OUT FROM = " +
                            " P_NO_LAPORAN : " + P_NO_LAPORAN + " | " +
                            " P_TGL_LAPOR_ACTUAL_1 : " + P_TGL_LAPOR_ACTUAL_1 + " | " +
                            " P_TGL_DATANG_ACTUAL_1 : " + P_TGL_DATANG_ACTUAL_1 + " | " +
                            " P_TGL_DATANG_KOREKSI_1 : " + P_TGL_DATANG_KOREKSI_1 + " | " +
                            " P_TGL_NYALA_ACTUAL_1 : " + P_TGL_NYALA_ACTUAL_1 + " | " +
                            " P_TGL_NYALA_KOREKSI_1 : " + P_TGL_NYALA_KOREKSI_1 + " | " +
                            " P_JML_PLGN_PADAM_1 : " + P_JML_PLGN_PADAM_1 + " | " +
                            " P_KWH_LOSS_ACTUAL_1 : " + P_KWH_LOSS_ACTUAL_1 + " | " +
                            " P_ULP_1 : " + P_ULP_1 + " | " +
                            " P_TGL_NYALA_ACTUAL_2 : " + P_TGL_NYALA_ACTUAL_2 + " | " +
                            " P_TGL_NYALA_KOREKSI_2 : " + P_TGL_NYALA_KOREKSI_2 + " | " +
                            " P_JML_PLGN_PADAM_2 : " + P_JML_PLGN_PADAM_2 + " | " +
                            " P_KWH_LOSS_ACTUAL_2 : " + P_KWH_LOSS_ACTUAL_2 + " | " +
                            " P_ULP_2 : " + P_ULP_2 + " | " +
                            " P_TGL_NYALA_ACTUAL_3 : " + P_TGL_NYALA_ACTUAL_3 + " | " +
                            " P_TGL_NYALA_KOREKSI_3 : " + P_TGL_NYALA_KOREKSI_3 + " | " +
                            " P_JML_PLGN_PADAM_3 : " + P_JML_PLGN_PADAM_3 + " | " +
                            " P_KWH_LOSS_ACTUAL_3 : " + P_KWH_LOSS_ACTUAL_3 + " | " +
                            " P_ULP_3 : " + P_ULP_3 + " | " +
                            " P_TGL_NYALA_ACTUAL_4 : " + P_TGL_NYALA_ACTUAL_4 + " | " +
                            " P_TGL_NYALA_KOREKSI_4 : " + P_TGL_NYALA_KOREKSI_4 + " | " +
                            " P_JML_PLGN_PADAM_4 : " + P_JML_PLGN_PADAM_4 + " | " +
                            " P_KWH_LOSS_ACTUAL_4 : " + P_KWH_LOSS_ACTUAL_4 + " | " +
                            " P_ULP_4 : " + P_ULP_4 + " | " +
                            " P_TGL_NYALA_ACTUAL_5 : " + P_TGL_NYALA_ACTUAL_5 + " | " +
                            " P_TGL_NYALA_KOREKSI_5 : " + P_TGL_NYALA_KOREKSI_5 + " | " +
                            " P_JML_PLGN_PADAM_5 : " + P_JML_PLGN_PADAM_5 + " | " +
                            " P_KWH_LOSS_ACTUAL_5 : " + P_KWH_LOSS_ACTUAL_5 + " | " +
                            " P_ULP_5 : " + P_ULP_5 + " | " +
                            " P_TGL_NYALA_ACTUAL_6 : " + P_TGL_NYALA_ACTUAL_6 + " | " +
                            " P_TGL_NYALA_KOREKSI_6 : " + P_TGL_NYALA_KOREKSI_6 + " | " +
                            " P_JML_PLGN_PADAM_6 : " + P_JML_PLGN_PADAM_6 + " | " +
                            " P_KWH_LOSS_ACTUAL_6 : " + P_KWH_LOSS_ACTUAL_6 + " | " +
                            " P_ULP_6 : " + P_ULP_6 + " | " +
                            " P_TGL_NYALA_ACTUAL_7 : " + P_TGL_NYALA_ACTUAL_7 + " | " +
                            " P_TGL_NYALA_KOREKSI_7 : " + P_TGL_NYALA_KOREKSI_7 + " | " +
                            " P_JML_PLGN_PADAM_7 : " + P_JML_PLGN_PADAM_7 + " | " +
                            " P_KWH_LOSS_ACTUAL_7 : " + P_KWH_LOSS_ACTUAL_7 + " | " +
                            " P_ULP_7 : " + P_ULP_7 + " | " +
                            " P_TGL_NYALA_ACTUAL_8 : " + P_TGL_NYALA_ACTUAL_8 + " | " +
                            " P_TGL_NYALA_KOREKSI_8 : " + P_TGL_NYALA_KOREKSI_8 + " | " +
                            " P_JML_PLGN_PADAM_8 : " + P_JML_PLGN_PADAM_8 + " | " +
                            " P_KWH_LOSS_ACTUAL_8 : " + P_KWH_LOSS_ACTUAL_8 + " | " +
                            " P_ULP_8 : " + P_ULP_8 + " | " +
                            " P_TGL_NYALA_ACTUAL_9 : " + P_TGL_NYALA_ACTUAL_9 + " | " +
                            " P_TGL_NYALA_KOREKSI_9 : " + P_TGL_NYALA_KOREKSI_9 + " | " +
                            " P_JML_PLGN_PADAM_9 : " + P_JML_PLGN_PADAM_9 + " | " +
                            " P_KWH_LOSS_ACTUAL_9 : " + P_KWH_LOSS_ACTUAL_9 + " | " +
                            " P_ULP_9 : " + P_ULP_9 + " | " +
                            " P_TGL_NYALA_ACTUAL_10 : " + P_TGL_NYALA_ACTUAL_10 + " | " +
                            " P_TGL_NYALA_KOREKSI_10 : " + P_TGL_NYALA_KOREKSI_10 + " | " +
                            " P_JML_PLGN_PADAM_10 : " + P_JML_PLGN_PADAM_10 + " | " +
                            " P_KWH_LOSS_ACTUAL_10 : " + P_KWH_LOSS_ACTUAL_10 + " | " +
                            " P_ULP_10 : " + P_ULP_10 + " | " +
                            " P_JML_PLGN1 : " + P_JML_PLGN1 + " | " +
                            " P_JML_PLGN2 : " + P_JML_PLGN2 + " | " +
                            " P_JML_PLGN3 : " + P_JML_PLGN3 + " | " +
                            " P_JML_PLGN4 : " + P_JML_PLGN4 + " | " +
                            " P_JML_PLGN5 : " + P_JML_PLGN5 + " | " +
                            " P_JML_PLGN6 : " + P_JML_PLGN6 + " | " +
                            " P_JML_PLGN7 : " + P_JML_PLGN7 + " | " +
                            " P_JML_PLGN8 : " + P_JML_PLGN8 + " | " +
                            " P_JML_PLGN9 : " + P_JML_PLGN9 + " | " +
                            " P_JML_PLGN10 : " + P_JML_PLGN10 + " | " +
                            " P_TGL_SELESAI_ACTUAL_1 : " + P_TGL_SELESAI_ACTUAL_1 + " | " +
                            " P_TGL_SELESAI_KOREKSI_1 : " + P_TGL_SELESAI_KOREKSI_1 + " | " +
                            " P_STATUS : " + P_STATUS + " | " +
                            " P_BLTH : " + P_BLTH + " | " +
                            " P_USERNAME : " + P_USERNAME + " | " +
                            " P_TGLUPDATE : " + P_TGLUPDATE + " | " +
                            " P_NO_TICKET : " + P_NO_TICKET + " | " +
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
                            " P_NO_LAPORAN : " + P_NO_LAPORAN + " | " +
                            " P_TGL_LAPOR_ACTUAL_1 : " + P_TGL_LAPOR_ACTUAL_1 + " | " +
                            " P_TGL_DATANG_ACTUAL_1 : " + P_TGL_DATANG_ACTUAL_1 + " | " +
                            " P_TGL_DATANG_KOREKSI_1 : " + P_TGL_DATANG_KOREKSI_1 + " | " +
                            " P_TGL_NYALA_ACTUAL_1 : " + P_TGL_NYALA_ACTUAL_1 + " | " +
                            " P_TGL_NYALA_KOREKSI_1 : " + P_TGL_NYALA_KOREKSI_1 + " | " +
                            " P_JML_PLGN_PADAM_1 : " + P_JML_PLGN_PADAM_1 + " | " +
                            " P_KWH_LOSS_ACTUAL_1 : " + P_KWH_LOSS_ACTUAL_1 + " | " +
                            " P_ULP_1 : " + P_ULP_1 + " | " +
                            " P_TGL_NYALA_ACTUAL_2 : " + P_TGL_NYALA_ACTUAL_2 + " | " +
                            " P_TGL_NYALA_KOREKSI_2 : " + P_TGL_NYALA_KOREKSI_2 + " | " +
                            " P_JML_PLGN_PADAM_2 : " + P_JML_PLGN_PADAM_2 + " | " +
                            " P_KWH_LOSS_ACTUAL_2 : " + P_KWH_LOSS_ACTUAL_2 + " | " +
                            " P_ULP_2 : " + P_ULP_2 + " | " +
                            " P_TGL_NYALA_ACTUAL_3 : " + P_TGL_NYALA_ACTUAL_3 + " | " +
                            " P_TGL_NYALA_KOREKSI_3 : " + P_TGL_NYALA_KOREKSI_3 + " | " +
                            " P_JML_PLGN_PADAM_3 : " + P_JML_PLGN_PADAM_3 + " | " +
                            " P_KWH_LOSS_ACTUAL_3 : " + P_KWH_LOSS_ACTUAL_3 + " | " +
                            " P_ULP_3 : " + P_ULP_3 + " | " +
                            " P_TGL_NYALA_ACTUAL_4 : " + P_TGL_NYALA_ACTUAL_4 + " | " +
                            " P_TGL_NYALA_KOREKSI_4 : " + P_TGL_NYALA_KOREKSI_4 + " | " +
                            " P_JML_PLGN_PADAM_4 : " + P_JML_PLGN_PADAM_4 + " | " +
                            " P_KWH_LOSS_ACTUAL_4 : " + P_KWH_LOSS_ACTUAL_4 + " | " +
                            " P_ULP_4 : " + P_ULP_4 + " | " +
                            " P_TGL_NYALA_ACTUAL_5 : " + P_TGL_NYALA_ACTUAL_5 + " | " +
                            " P_TGL_NYALA_KOREKSI_5 : " + P_TGL_NYALA_KOREKSI_5 + " | " +
                            " P_JML_PLGN_PADAM_5 : " + P_JML_PLGN_PADAM_5 + " | " +
                            " P_KWH_LOSS_ACTUAL_5 : " + P_KWH_LOSS_ACTUAL_5 + " | " +
                            " P_ULP_5 : " + P_ULP_5 + " | " +
                            " P_TGL_NYALA_ACTUAL_6 : " + P_TGL_NYALA_ACTUAL_6 + " | " +
                            " P_TGL_NYALA_KOREKSI_6 : " + P_TGL_NYALA_KOREKSI_6 + " | " +
                            " P_JML_PLGN_PADAM_6 : " + P_JML_PLGN_PADAM_6 + " | " +
                            " P_KWH_LOSS_ACTUAL_6 : " + P_KWH_LOSS_ACTUAL_6 + " | " +
                            " P_ULP_6 : " + P_ULP_6 + " | " +
                            " P_TGL_NYALA_ACTUAL_7 : " + P_TGL_NYALA_ACTUAL_7 + " | " +
                            " P_TGL_NYALA_KOREKSI_7 : " + P_TGL_NYALA_KOREKSI_7 + " | " +
                            " P_JML_PLGN_PADAM_7 : " + P_JML_PLGN_PADAM_7 + " | " +
                            " P_KWH_LOSS_ACTUAL_7 : " + P_KWH_LOSS_ACTUAL_7 + " | " +
                            " P_ULP_7 : " + P_ULP_7 + " | " +
                            " P_TGL_NYALA_ACTUAL_8 : " + P_TGL_NYALA_ACTUAL_8 + " | " +
                            " P_TGL_NYALA_KOREKSI_8 : " + P_TGL_NYALA_KOREKSI_8 + " | " +
                            " P_JML_PLGN_PADAM_8 : " + P_JML_PLGN_PADAM_8 + " | " +
                            " P_KWH_LOSS_ACTUAL_8 : " + P_KWH_LOSS_ACTUAL_8 + " | " +
                            " P_ULP_8 : " + P_ULP_8 + " | " +
                            " P_TGL_NYALA_ACTUAL_9 : " + P_TGL_NYALA_ACTUAL_9 + " | " +
                            " P_TGL_NYALA_KOREKSI_9 : " + P_TGL_NYALA_KOREKSI_9 + " | " +
                            " P_JML_PLGN_PADAM_9 : " + P_JML_PLGN_PADAM_9 + " | " +
                            " P_KWH_LOSS_ACTUAL_9 : " + P_KWH_LOSS_ACTUAL_9 + " | " +
                            " P_ULP_9 : " + P_ULP_9 + " | " +
                            " P_TGL_NYALA_ACTUAL_10 : " + P_TGL_NYALA_ACTUAL_10 + " | " +
                            " P_TGL_NYALA_KOREKSI_10 : " + P_TGL_NYALA_KOREKSI_10 + " | " +
                            " P_JML_PLGN_PADAM_10 : " + P_JML_PLGN_PADAM_10 + " | " +
                            " P_KWH_LOSS_ACTUAL_10 : " + P_KWH_LOSS_ACTUAL_10 + " | " +
                            " P_ULP_10 : " + P_ULP_10 + " | " +
                            " P_JML_PLGN1 : " + P_JML_PLGN1 + " | " +
                            " P_JML_PLGN2 : " + P_JML_PLGN2 + " | " +
                            " P_JML_PLGN3 : " + P_JML_PLGN3 + " | " +
                            " P_JML_PLGN4 : " + P_JML_PLGN4 + " | " +
                            " P_JML_PLGN5 : " + P_JML_PLGN5 + " | " +
                            " P_JML_PLGN6 : " + P_JML_PLGN6 + " | " +
                            " P_JML_PLGN7 : " + P_JML_PLGN7 + " | " +
                            " P_JML_PLGN8 : " + P_JML_PLGN8 + " | " +
                            " P_JML_PLGN9 : " + P_JML_PLGN9 + " | " +
                            " P_JML_PLGN10 : " + P_JML_PLGN10 + " | " +
                            " P_TGL_SELESAI_ACTUAL_1 : " + P_TGL_SELESAI_ACTUAL_1 + " | " +
                            " P_TGL_SELESAI_KOREKSI_1 : " + P_TGL_SELESAI_KOREKSI_1 + " | " +
                            " P_STATUS : " + P_STATUS + " | " +
                            " P_BLTH : " + P_BLTH + " | " +
                            " P_USERNAME : " + P_USERNAME + " | " +
                            " P_TGLUPDATE : " + P_TGLUPDATE + " | " +
                            " P_NO_TICKET : " + P_NO_TICKET + " | " +
                            " OUT = " + mOut +
                            " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
    // END PEMADAMANTM
}
