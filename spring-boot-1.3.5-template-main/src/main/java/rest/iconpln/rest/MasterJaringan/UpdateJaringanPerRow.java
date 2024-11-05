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
import rest.iconpln.service.MasterJaringan.ServiceUpdateJaringanPerRow;

@RestController
@RequestMapping("/master-jaringan/")
public class UpdateJaringanPerRow {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(UpdateJaringanPerRow.class
    );
    @Autowired

    private ServiceUpdateJaringanPerRow serviceUpdateJaringanPerRow;

    // GET
    @RequestMapping(
            value = "/UPDATE_DATA_JARINGAN_PER_1_ROW",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> UPDATE_DATA_JARINGAN_PER_1_ROW(
            @RequestParam(value = "P_KD_ASSET", defaultValue = "") String P_KD_ASSET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_KD_ASSET : " + P_KD_ASSET + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_KD_ASSET", P_KD_ASSET);
            mOut = serviceUpdateJaringanPerRow.UPDATE_DATA_JARINGAN_PER_1_ROW(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_KD_ASSET : " + P_KD_ASSET + " | "
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
                    + " P_KD_ASSET : " + P_KD_ASSET + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END GET
    // POST
    @RequestMapping(
            value = "/POST_UPDATE_DATA_JARINGAN_PER_1_ROW",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @ResponseBody
    public ResponseEntity<Object> POST_UPDATE_DATA_JARINGAN_PER_1_ROW(
            @RequestParam(value = "P_KODE_ASSET", defaultValue = "") String P_KODE_ASSET,
            @RequestParam(value = "P_TYPE_ASSET", defaultValue = "0") int P_TYPE_ASSET,
            @RequestParam(value = "P_PARENT_ASSET", defaultValue = "") String P_PARENT_ASSET,
            @RequestParam(value = "P_TYPE_PARENT", defaultValue = "0") int P_TYPE_PARENT,
            @RequestParam(value = "P_KODE_JARINGAN", defaultValue = "") String P_KODE_JARINGAN,
            @RequestParam(value = "P_AKTIF", defaultValue = "0") int P_AKTIF,
            @RequestParam(value = "P_STATUS_NYALA", defaultValue = "0") int P_STATUS_NYALA,
            @RequestParam(value = "P_NAMA", defaultValue = "") String P_NAMA,
            @RequestParam(value = "P_NO_URUT", defaultValue = "0") int P_NO_URUT,
            @RequestParam(value = "P_NO_TIANG", defaultValue = "") String P_NO_TIANG,
            @RequestParam(value = "P_ALAMAT", defaultValue = "") String P_ALAMAT,
            @RequestParam(value = "P_COVERAGE", defaultValue = "") String P_COVERAGE,
            @RequestParam(value = "P_LONGITUDE", defaultValue = "") String P_LONGITUDE,
            @RequestParam(value = "P_LATITUDE", defaultValue = "") String P_LATITUDE,
            @RequestParam(value = "P_KODE_GI", defaultValue = "") String P_KODE_GI,
            @RequestParam(value = "P_KODE_FEEDER", defaultValue = "") String P_KODE_FEEDER,
            @RequestParam(value = "P_KODE_ZONE", defaultValue = "") String P_KODE_ZONE,
            @RequestParam(value = "P_KODE_SECTION", defaultValue = "") String P_KODE_SECTION,
            @RequestParam(value = "P_KODE_SEGMENT", defaultValue = "") String P_KODE_SEGMENT,
            @RequestParam(value = "P_KODE_SUBSEGMENT", defaultValue = "") String P_KODE_SUBSEGMENT,
            @RequestParam(value = "P_KODE_SUBSUBSEGMENT", defaultValue = "") String P_KODE_SUBSUBSEGMENT,
            @RequestParam(value = "P_KODE_LATERAL", defaultValue = "") String P_KODE_LATERAL,
            @RequestParam(value = "P_KODE_SUBLATERAL", defaultValue = "") String P_KODE_SUBLATERAL,
            @RequestParam(value = "P_KODE_SUBSUBLATERAL", defaultValue = "") String P_KODE_SUBSUBLATERAL,
            @RequestParam(value = "P_MERK_TRAFO", defaultValue = "") String P_MERK_TRAFO,
            @RequestParam(value = "P_JENIS_TRAFO", defaultValue = "") String P_JENIS_TRAFO,
            @RequestParam(value = "P_JUMLAH_TRAFO", defaultValue = "") String P_JUMLAH_TRAFO,
            @RequestParam(value = "P_UNIT", defaultValue = "") String P_UNIT,
            @RequestParam(value = "P_AREA", defaultValue = "") String P_AREA,
            @RequestParam(value = "P_DISTRIBUSI", defaultValue = "") String P_DISTRIBUSI,
            @RequestParam(value = "P_USERNAME", defaultValue = "") String P_USERNAME,
            @RequestParam(value = "P_NO_TICKET", defaultValue = "") String P_NO_TICKET
    ) {
        Map mOut = null;
        try {
            logger.info(
                    "===| PARAM = "
                    + " P_KODE_ASSET : " + P_KODE_ASSET + " , "
                    + " P_TYPE_ASSET : " + P_TYPE_ASSET + " , "
                    + " P_PARENT_ASSET : " + P_PARENT_ASSET + " , "
                    + " P_TYPE_PARENT : " + P_TYPE_PARENT + " , "
                    + " P_KODE_JARINGAN : " + P_KODE_JARINGAN + " , "
                    + " P_AKTIF : " + P_AKTIF + " , "
                    + " P_STATUS_NYALA : " + P_STATUS_NYALA + " , "
                    + " P_NAMA : " + P_NAMA + " , "
                    + " P_NO_URUT : " + P_NO_URUT + " , "
                    + " P_NO_TIANG : " + P_NO_TIANG + " , "
                    + " P_ALAMAT : " + P_ALAMAT + " , "
                    + " P_COVERAGE : " + P_COVERAGE + " , "
                    + " P_LONGITUDE : " + P_LONGITUDE + " , "
                    + " P_LATITUDE : " + P_LATITUDE + " , "
                    + " P_KODE_GI : " + P_KODE_GI + " , "
                    + " P_KODE_FEEDER : " + P_KODE_FEEDER + " , "
                    + " P_KODE_ZONE : " + P_KODE_ZONE + " , "
                    + " P_KODE_SECTION : " + P_KODE_SECTION + " , "
                    + " P_KODE_SEGMENT : " + P_KODE_SEGMENT + " , "
                    + " P_KODE_SUBSEGMENT : " + P_KODE_SUBSEGMENT + " , "
                    + " P_KODE_SUBSUBSEGMENT : " + P_KODE_SUBSUBSEGMENT + " , "
                    + " P_KODE_LATERAL : " + P_KODE_LATERAL + " , "
                    + " P_KODE_SUBLATERAL : " + P_KODE_SUBLATERAL + " , "
                    + " P_KODE_SUBSUBLATERAL : " + P_KODE_SUBSUBLATERAL + " , "
                    + " P_MERK_TRAFO : " + P_MERK_TRAFO + " , "
                    + " P_JENIS_TRAFO : " + P_JENIS_TRAFO + " , "
                    + " P_JUMLAH_TRAFO : " + P_JUMLAH_TRAFO + " , "
                    + " P_UNIT : " + P_UNIT + " , "
                    + " P_AREA : " + P_AREA + " , "
                    + " P_DISTRIBUSI : " + P_DISTRIBUSI + " , "
                    + " P_USERNAME : " + P_USERNAME + " , "
                    + " P_NO_TICKET : " + P_NO_TICKET + " , "
                    + " |==="
            );
            Map mIn = new HashMap();
            mIn.put("P_KODE_ASSET", P_KODE_ASSET);
            mIn.put("P_TYPE_ASSET", P_TYPE_ASSET);
            mIn.put("P_PARENT_ASSET", P_PARENT_ASSET);
            mIn.put("P_TYPE_PARENT", P_TYPE_PARENT);
            mIn.put("P_KODE_JARINGAN", P_KODE_JARINGAN);
            mIn.put("P_AKTIF", P_AKTIF);
            mIn.put("P_STATUS_NYALA", P_STATUS_NYALA);
            mIn.put("P_NAMA", P_NAMA);
            mIn.put("P_NO_URUT", P_NO_URUT);
            mIn.put("P_NO_TIANG", P_NO_TIANG);
            mIn.put("P_ALAMAT", P_ALAMAT);
            mIn.put("P_COVERAGE", P_COVERAGE);
            mIn.put("P_LONGITUDE", P_LONGITUDE);
            mIn.put("P_LATITUDE", P_LATITUDE);
            mIn.put("P_KODE_GI", P_KODE_GI);
            mIn.put("P_KODE_FEEDER", P_KODE_FEEDER);
            mIn.put("P_KODE_ZONE", P_KODE_ZONE);
            mIn.put("P_KODE_SECTION", P_KODE_SECTION);
            mIn.put("P_KODE_SEGMENT", P_KODE_SEGMENT);
            mIn.put("P_KODE_SUBSEGMENT", P_KODE_SUBSEGMENT);
            mIn.put("P_KODE_SUBSUBSEGMENT", P_KODE_SUBSUBSEGMENT);
            mIn.put("P_KODE_LATERAL", P_KODE_LATERAL);
            mIn.put("P_KODE_SUBLATERAL", P_KODE_SUBLATERAL);
            mIn.put("P_KODE_SUBSUBLATERAL", P_KODE_SUBSUBLATERAL);
            mIn.put("P_MERK_TRAFO", P_MERK_TRAFO);
            mIn.put("P_JENIS_TRAFO", P_JENIS_TRAFO);
            mIn.put("P_JUMLAH_TRAFO", P_JUMLAH_TRAFO);
            mIn.put("P_UNIT", P_UNIT);
            mIn.put("P_AREA", P_AREA);
            mIn.put("P_DISTRIBUSI", P_DISTRIBUSI);
            mIn.put("P_USERNAME", P_USERNAME);
            mIn.put("P_NO_TICKET", P_NO_TICKET);
            mOut = serviceUpdateJaringanPerRow.POST_UPDATE_DATA_JARINGAN_PER_1_ROW(mIn);
            logger.info(
                    "===|  OUT FROM = "
                    + " P_KODE_ASSET : " + P_KODE_ASSET + " | "
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
                    + " P_KODE_ASSET : " + P_KODE_ASSET + " | "
                    + " OUT = " + mOut
                    + " |==="
            );
            return new ResponseEntity<Object>(mOut, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // END POST
}
