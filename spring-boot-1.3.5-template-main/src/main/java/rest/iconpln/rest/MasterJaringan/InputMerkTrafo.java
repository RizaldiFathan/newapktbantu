package rest.iconpln.rest.MasterJaringan;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.MasterJaringan.ServiceInputMerkTrafo;

@RestController
@RequestMapping("/master-jaringan/")
public class InputMerkTrafo {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(InputMerkTrafo.class
    );
    @Autowired

    private ServiceInputMerkTrafo serviceInputMerkTrafo;

    // GET
    @RequestMapping(
            value = "/GET_MERK_TRAVO",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<Object> GET_MERK_TRAVO() {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " GET_MERK_TRAVO "
                    + " |==="
            );
            Map mIn = new HashMap();
            mOut = serviceInputMerkTrafo.GET_MERK_TRAVO(mIn);
            System.out.println("+============== KELUAR DATA ==============+");
            System.out.println("GET MERK TRAVO");
            System.out.println("mOut: " + mOut);
            System.out.println("+============== END KELUAR DATA ==============+");
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error(
                    "===|  OUT FROM = "
                    + " GET_MERK_TRAVO "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_MERK_TRAVO",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_MERK_TRAVO(
            @RequestParam(value = "P_merk", defaultValue = "") String P_merk
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_merk : " + P_merk + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_merk", P_merk);
            mOut = serviceInputMerkTrafo.POST_MERK_TRAVO(mIn);
            System.out.println("+============== KELUAR DATA ==============+");
            System.out.println("POST MERK TRAVO");
            System.out.println("mOut: " + mOut);
            System.out.println("+============== END KELUAR DATA ==============+");
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error(
                    "===|  OUT FROM = "
                    + " P_merk : " + P_merk + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
            value = "/DEL_MERK_TRAVO",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> DEL_MERK_TRAVO(
            @RequestParam(value = "P_merk", defaultValue = "") String P_merk,
            @RequestParam(value = "P_user", defaultValue = "") String P_user
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_merk : " + P_merk + " , "
                    + " P_merk : " + P_user + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_merk", P_merk);
            mIn.put("P_user", P_user);
            mOut = serviceInputMerkTrafo.DEL_MERK_TRAVO(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_merk : " + P_merk + " | "
                    + " P_user : " + P_user + " | "
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
                    + " P_merk : " + P_merk + " | "
                    + " P_merk : " + P_user + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
