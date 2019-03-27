package in.hocg;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by hocgin on 2019/3/27.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableAdminServer
public class MonitorApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class, args);
    }
    
}
