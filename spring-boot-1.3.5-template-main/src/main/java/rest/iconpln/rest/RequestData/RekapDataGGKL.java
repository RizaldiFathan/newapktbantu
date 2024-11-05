package rest.iconpln.rest.RequestData;

import rest.iconpln.rest.Rantask.*;
import rest.iconpln.rest.Pencarian.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.RequestData.ServiceRekapDataGGKL;

@RestController
@RequestMapping("/request-data/")
public class RekapDataGGKL {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(RekapDataGGKL.class
    );
    @Autowired

    private ServiceRekapDataGGKL serviceRekapDataGGKL;

    @RequestMapping(
            value = "/REKAP_DATA_GANGGUAN_PLNMOBILE",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_DATA_GANGGUAN_PLNMOBILE(
            @RequestParam(value = "p_tgl_mulai", defaultValue = "") String p_tgl_mulai,
            @RequestParam(
                    value = "p_tgl_selesai",
                    defaultValue = ""
            ) String p_tgl_selesai,
            @RequestParam(value = "p_blth_awal", defaultValue = "") String p_blth_awal,
            @RequestParam(
                    value = "p_blth_selesai",
                    defaultValue = ""
            ) String p_blth_selesai
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_tgl_mulai  : " + p_tgl_mulai + " , "
                    + " p_tgl_selesai  : " + p_tgl_selesai + " , "
                    + " p_blth_awal  : " + p_blth_awal + " , "
                    + " p_blth_selesai  : " + p_blth_selesai + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_tgl_mulai", p_tgl_mulai);
            mIn.put("p_tgl_selesai", p_tgl_selesai);
            mIn.put("p_blth_awal", p_blth_awal);
            mIn.put("p_blth_selesai", p_blth_selesai);

            mOut = serviceRekapDataGGKL.REKAP_DATA_GANGGUAN_PLNMOBILE(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_tgl_mulai  : " + p_tgl_mulai + " | "
                    + " p_tgl_selesai  : " + p_tgl_selesai + " | "
                    + " p_blth_awal  : " + p_blth_awal + " | "
                    + " p_blth_selesai  : " + p_blth_selesai + " | "
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
                    + " p_tgl_mulai : " + p_tgl_mulai + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/REKAP_DATA_KELUHAN_PLNMOBILE",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_DATA_KELUHAN_PLNMOBILE(
            @RequestParam(value = "p_tgl_mulai", defaultValue = "") String p_tgl_mulai,
            @RequestParam(
                    value = "p_tgl_selesai",
                    defaultValue = ""
            ) String p_tgl_selesai,
            @RequestParam(value = "p_blth_awal", defaultValue = "") String p_blth_awal,
            @RequestParam(
                    value = "p_blth_selesai",
                    defaultValue = ""
            ) String p_blth_selesai
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_tgl_mulai  : " + p_tgl_mulai + " , "
                    + " p_tgl_selesai  : " + p_tgl_selesai + " , "
                    + " p_blth_awal  : " + p_blth_awal + " , "
                    + " p_blth_selesai  : " + p_blth_selesai + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_tgl_mulai", p_tgl_mulai);
            mIn.put("p_tgl_selesai", p_tgl_selesai);
            mIn.put("p_blth_awal", p_blth_awal);
            mIn.put("p_blth_selesai", p_blth_selesai);

            mOut = serviceRekapDataGGKL.REKAP_DATA_KELUHAN_PLNMOBILE(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_tgl_mulai  : " + p_tgl_mulai + " | "
                    + " p_tgl_selesai  : " + p_tgl_selesai + " | "
                    + " p_blth_awal  : " + p_blth_awal + " | "
                    + " p_blth_selesai  : " + p_blth_selesai + " | "
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
                    + " p_tgl_mulai : " + p_tgl_mulai + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/REKAP_DATA_GANGGUAN_CC123",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_DATA_GANGGUAN_CC123(
            @RequestParam(value = "p_tgl_mulai", defaultValue = "") String p_tgl_mulai,
            @RequestParam(
                    value = "p_tgl_selesai",
                    defaultValue = ""
            ) String p_tgl_selesai,
            @RequestParam(value = "p_blth_awal", defaultValue = "") String p_blth_awal,
            @RequestParam(
                    value = "p_blth_selesai",
                    defaultValue = ""
            ) String p_blth_selesai
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_tgl_mulai  : " + p_tgl_mulai + " , "
                    + " p_tgl_selesai  : " + p_tgl_selesai + " , "
                    + " p_blth_awal  : " + p_blth_awal + " , "
                    + " p_blth_selesai  : " + p_blth_selesai + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_tgl_mulai", p_tgl_mulai);
            mIn.put("p_tgl_selesai", p_tgl_selesai);
            mIn.put("p_blth_awal", p_blth_awal);
            mIn.put("p_blth_selesai", p_blth_selesai);

            mOut = serviceRekapDataGGKL.REKAP_DATA_GANGGUAN_CC123(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_tgl_mulai  : " + p_tgl_mulai + " | "
                    + " p_tgl_selesai  : " + p_tgl_selesai + " | "
                    + " p_blth_awal  : " + p_blth_awal + " | "
                    + " p_blth_selesai  : " + p_blth_selesai + " | "
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
                    + " p_tgl_mulai : " + p_tgl_mulai + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/REKAP_DATA_KELUHAN_CC123",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> REKAP_DATA_KELUHAN_CC123(
            @RequestParam(value = "p_tgl_mulai", defaultValue = "") String p_tgl_mulai,
            @RequestParam(
                    value = "p_tgl_selesai",
                    defaultValue = ""
            ) String p_tgl_selesai,
            @RequestParam(value = "p_blth_awal", defaultValue = "") String p_blth_awal,
            @RequestParam(
                    value = "p_blth_selesai",
                    defaultValue = ""
            ) String p_blth_selesai
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_tgl_mulai  : " + p_tgl_mulai + " , "
                    + " p_tgl_selesai  : " + p_tgl_selesai + " , "
                    + " p_blth_awal  : " + p_blth_awal + " , "
                    + " p_blth_selesai  : " + p_blth_selesai + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_tgl_mulai", p_tgl_mulai);
            mIn.put("p_tgl_selesai", p_tgl_selesai);
            mIn.put("p_blth_awal", p_blth_awal);
            mIn.put("p_blth_selesai", p_blth_selesai);

            mOut = serviceRekapDataGGKL.REKAP_DATA_KELUHAN_CC123(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_tgl_mulai  : " + p_tgl_mulai + " | "
                    + " p_tgl_selesai  : " + p_tgl_selesai + " | "
                    + " p_blth_awal  : " + p_blth_awal + " | "
                    + " p_blth_selesai  : " + p_blth_selesai + " | "
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
                    + " p_tgl_mulai : " + p_tgl_mulai + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
