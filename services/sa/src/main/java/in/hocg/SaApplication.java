package in.hocg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by hocgin on 2019/3/27.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class SaApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SaApplication.class, args);
    }
    
}
