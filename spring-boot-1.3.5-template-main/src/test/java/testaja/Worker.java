/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaja;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author sgh88
 */
public class Worker implements Callable<Map> {

    private final int awal;
    private final int akhir;
    private final List<Map> list;

    public Worker(List<Map> list, int awal, int akhir) {
        this.awal = awal;
        this.akhir = akhir;
        this.list = list;
    }

    @Override
    public Map call() {
        System.out.println(awal + ":" + akhir);
        try {
            List<Map> listData = new ArrayList<>();
            for (int i = awal; i <= akhir; i++) {
                listData.add(list.get(i));
            }
            ObjectMapper mapper = new ObjectMapper();
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            mapper.writeValue(out, listData);
            final byte[] data = out.toByteArray();
        //            System.out.println(new String(data));
        //            List<Map> listData2 = mapper.readValue(new String(data), new TypeReference<List<Map>>() {
        //            });
        //            List<Map> listData2 = mapper.readValue(listData.toString(), new TypeReference<List<Map>>() {
        //            });
        //            System.out.println("listData2: " + listData2);
        //            System.out.println("Worker listData: " + listData.size());
            RestTemplate restTemplate = new RestTemplate();
            String url = "http://10.14.205.64:8877/api-integ/private/sendacmt3";
            URI uri = new URI(url);
            HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> request = new HttpEntity<>(new String(data), headers);
            ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
            Map m = new HashMap();
            m.put("page", awal + "-" + akhir + ": StatusCode " + result.getStatusCode());
            //            m.put("page", awal + "-" + akhir);
            return m;
        } catch (Exception ex) {
            Map m = new HashMap();
            m.put("page", awal + "-" + akhir + ": ERROR " + ex.getMessage());
            return m;
        }
    }

}
