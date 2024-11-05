package rest.iconpln.rest.AlihUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.db.DaoAmicon;
import rest.iconpln.service.AlihUnit.ServiceAlihPoskoGangguan;
import rest.iconpln.service.AmiconService;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
// @CrossOrigin(maxAge = 3600)

@RestController
@RequestMapping("/alih-unit/")
public class RestAlihPoskoGangguan {

    //    private org.slf4j.Logger logger = LoggerFactory.getLogger(RestAlihPoskoGangguan.class);
    private static final Logger logger = LoggerFactory.getLogger(RestAlihPoskoGangguan.class);

    @Autowired
    private ServiceAlihPoskoGangguan serviceAlihPoskoGangguan;

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

    // GET
    @RequestMapping(
            value = "/Get_Alih_Posko_Gangguan",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> Get_Alih_Posko_Gangguan(
            @RequestParam(value = "p_nolaporan", defaultValue = "") String p_nolaporan
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = " +
                    " p_nolaporan : " + p_nolaporan + " , " +
                    " |==="
            );

            Map mIn = new HashMap();
            mIn.put("p_nolaporan", p_nolaporan);

            mOut = serviceAlihPoskoGangguan.Get_Alih_Posko_Gangguan(mIn);
            logger.info("===| OUT FROM " + p_nolaporan + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_nolaporan + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_Alih_Posko_Gangguan",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_Alih_Posko_Gangguan(

            @RequestParam(value = "p_nolaporan", defaultValue = "") String p_nolaporan,
            @RequestParam(value = "p_dist", defaultValue = "") String p_dist,
            @RequestParam(value = "p_area", defaultValue = "") String p_area,
            @RequestParam(value = "p_posko", defaultValue = "") String p_posko,
            @RequestParam(value = "p_unitname", defaultValue = "") String p_unitname,
            @RequestParam(value = "p_user", defaultValue = "") String p_user,
            @RequestParam(value = "p_noticket", defaultValue = "") String p_noticket
    ) {
        Map mOut = null;
        try {

            logger.info(
                    "===| PARAM = " +
                            "p_nolaporan : " + p_nolaporan + " , " +
                            "p_dist : " + p_dist + " , " +
                            "p_area : " + p_area + " , " +
                            "p_posko : " + p_posko + " , " +
                            "p_unitname : " + p_unitname + " , " +
                            "p_user : " + p_user + " , " +
                            "p_noticket : " + p_noticket + " , " +
                            " |==="
            );


            Map mIn = new HashMap();
            mIn.put("p_nolaporan", p_nolaporan);
            mIn.put("p_dist", p_dist);
            mIn.put("p_area", p_area);
            mIn.put("p_posko", p_posko);
            mIn.put("p_unitname", p_unitname);
            mIn.put("p_user", p_user);
            mIn.put("p_noticket", p_noticket);

            mOut = serviceAlihPoskoGangguan.POST_Alih_Posko_Gangguan(mIn);
            logger.info("===| OUT FROM " + p_nolaporan + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.OK);
        } catch (SQLException ex) {
            ex.printStackTrace();
            mOut = new HashMap();
            mOut.put("return", -1);
            mOut.put("out_message", "Internal error: " + ex.getMessage());
            logger.error("===| OUT FROM " + p_nolaporan + " = " + mOut);
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // END POST

}
