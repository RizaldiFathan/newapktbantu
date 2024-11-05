package rest.iconpln.rest.MasterData;

import rest.iconpln.rest.ManagementUsers.*;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.iconpln.service.MasterData.ServiceMapingUnitAP2T;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/master-data/")
public class MapingUnitAP2T {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(MapingUnitAP2T.class);
    @Autowired

    private ServiceMapingUnitAP2T serviceMapingUnitAP2T;

  // GET
  @RequestMapping(
    value = "/MAPPING_UNIT_AP2T",
    produces = MediaType.APPLICATION_JSON_VALUE,
    method = RequestMethod.GET
  )
  @ResponseBody
  public ResponseEntity<Object> MAPPING_UNIT_AP2T() {
    Map mOut = null;
    try {
      logger.info(
                    "===| PARAM = "
                    + " MAPPING_UNIT_AP2T "
                    + " |==="
            );
      Map mIn = new HashMap();
      mOut = serviceMapingUnitAP2T.MAPPING_UNIT_AP2T(mIn);
       logger.info(
                    "===|  OUT FROM = "
                    + " MAPPING_UNIT_AP2T : "
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
                    + " MAPPING_UNIT_AP2T : "
                    + " OUT = " + mOut
                    + " |==="
            );
      return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
  // END GET
}
