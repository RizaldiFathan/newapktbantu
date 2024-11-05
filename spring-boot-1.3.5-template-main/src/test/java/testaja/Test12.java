/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaja;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
//import static org.springframework.http.converter.json.Jackson2ObjectMapperBuilder.json;

/**
 *
 * @author sgh88
 */
public class Test12 {

    public static void main(String[] args) throws IOException, URISyntaxException {

        ObjectMapper mapper = new ObjectMapper();
        String json = new String(Files.readAllBytes(Paths.get("E:\\workspace\\amicon\\rest-integ\\dataamicon.txt")), StandardCharsets.UTF_8);
        List<Map> listData = mapper.readValue(json, new TypeReference<List<Map>>() {
        });
        int jumlahData = listData.size();
        int page = 100;
        int sisa = (jumlahData % page) - 1;
        int awal = 0, akhir = sisa <= 0 ? page : sisa;
        List<Future<Map>> futureList = new ArrayList<>();

        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(4);
        taskExecutor.setMaxPoolSize(4);
        taskExecutor.setThreadNamePrefix("default_task_executor_thread");
        taskExecutor.initialize();

        do {
//            System.out.println("awal: " + awal + ", akhir: " + (akhir - 1));
            futureList.add(taskExecutor.submit(new Worker(listData, awal, (akhir - 1))));
            ////////////
            awal = akhir;
            akhir += page;
        } while (akhir <= jumlahData);

        futureList.forEach((future) -> {
            try {
                System.out.println(future.get().toString());
            } catch (InterruptedException | ExecutionException ex) {
                ex.printStackTrace();
            }
        });
        System.exit(0);
    }
}
