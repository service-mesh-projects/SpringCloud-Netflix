package in.hocg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by hocgin on 2019/3/27.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(RegisterApplication.class, args);
    }
    
}
