package rest.iconpln.rest;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rest.iconpln.db.DaoAmicon;
import rest.iconpln.service.AmiconService;
import rest.iconpln.service.RestIntegService;
// @CrossOrigin(maxAge = 3600)

@RestController
@RequestMapping("/private/")
public class RestIntegController {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestIntegController.class);

    @Autowired
    private RestIntegService restIntegService;

    @Autowired
    private AmiconService amiconService;

    @Autowired
    private DaoAmicon daoAmicon;

    public DaoAmicon getDaoAmicon() {
        return daoAmicon;
    }

    public void setDaoAmicon(DaoAmicon daoAmicon) {
        this.daoAmicon = daoAmicon;
    }

//    @RequestMapping(value = "/TEST_KONEKSI", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
//    @ResponseBody
//    public ResponseEntity<Object> TEST_KONEKSI(
//            @RequestParam(value = "pilihan", defaultValue = "") String pilihan,
//            @RequestParam(value = "vKD_INSTALATIR", defaultValue = "") String vKD_INSTALATIR
//    ) {
//        Map mOut = null;
//        try {
//            System.out.println("+============== MASUK DATA ==============+");
//            System.out.println("TEST_KONEKSI");
//            System.out.println("pilihan : " + pilihan);
//            System.out.println("vKD_INSTALATIR : " + vKD_INSTALATIR);
//            System.out.println("+============== END MASUK DATA ==============+");
//
//            mOut = amiconService.TEST_KONEKSI(pilihan, vKD_INSTALATIR);
//            System.out.println("+============== KELUAR DATA ==============+");
//            System.out.println("TEST_KONEKSI");
//            System.out.println("mOut: " + mOut);
//            System.out.println("+============== END KELUAR DATA ==============+");
//            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            mOut = new HashMap();
//            mOut.put("return", -1);
//            mOut.put("out_message", "Internal error: " + ex.getMessage());
//            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

}
