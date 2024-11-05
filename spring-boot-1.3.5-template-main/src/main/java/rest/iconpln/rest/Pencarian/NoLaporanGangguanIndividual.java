package rest.iconpln.rest.Pencarian;

import rest.iconpln.rest.MasterJaringan.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.Pencarian.ServiceNoLaporanGangguanIndividual;

@RestController
@RequestMapping("/pencarian/")
public class NoLaporanGangguanIndividual {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(NoLaporanGangguanIndividual.class
    );
    @Autowired

    private ServiceNoLaporanGangguanIndividual serviceNoLaporanGangguanIndividual;

    // GET
    @RequestMapping(
            value = "/NO_LAPORAN_GANGGUAN_INDIVIDUAL_1",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> NO_LAPORAN_GANGGUAN_INDIVIDUAL_1(
            @RequestParam(value = "p_nolapor", defaultValue = "") String p_nolapor
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_nolapor : " + p_nolapor + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_nolapor", p_nolapor);

            mOut = serviceNoLaporanGangguanIndividual.NO_LAPORAN_GANGGUAN_INDIVIDUAL_1(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_nolapor : " + p_nolapor + " | "
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
                    + " p_nolapor : " + p_nolapor + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/NO_LAPORAN_GANGGUAN_INDIVIDUAL_2",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> NO_LAPORAN_GANGGUAN_INDIVIDUAL_2(
            @RequestParam(value = "p_nolapor", defaultValue = "") String p_nolapor
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " p_nolapor : " + p_nolapor + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("p_nolapor", p_nolapor);

            mOut = serviceNoLaporanGangguanIndividual.NO_LAPORAN_GANGGUAN_INDIVIDUAL_2(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " p_nolapor : " + p_nolapor + " | "
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
                    + " p_nolapor : " + p_nolapor + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
}
