package rest.iconpln.rest.ManagementUsers;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.ManagementUsers.ServiceSeasonYantek;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/management-user/")
public class SeasonYantek {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(SeasonYantek.class);
    @Autowired

    private ServiceSeasonYantek serviceSeasonYantek;

    // GET
    @RequestMapping(
            value = "/GET_SEASON_YANTEK",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> GET_SEASON_YANTEK(
            @RequestParam(
                    value = "P_USERPETUGAS",
                    defaultValue = ""
            ) String P_USERPETUGAS
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_USERPETUGAS : " + P_USERPETUGAS + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USERPETUGAS", P_USERPETUGAS);

            mOut = serviceSeasonYantek.GET_SEASON_YANTEK(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_USERPETUGAS : " + P_USERPETUGAS + " | "
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
                    + " P_USERPETUGAS : " + P_USERPETUGAS + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_SEASON_YANTEK",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_SEASON_YANTEK(
            @RequestParam(
                    value = "P_USERPETUGAS",
                    defaultValue = ""
            ) String P_USERPETUGAS
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_USERPETUGAS : " + P_USERPETUGAS + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_USERPETUGAS", P_USERPETUGAS);

            mOut = serviceSeasonYantek.POST_SEASON_YANTEK(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_USERPETUGAS : " + P_USERPETUGAS + " | "
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
                    + " P_USERPETUGAS : " + P_USERPETUGAS + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
    // END SEASON YANTEK
}
