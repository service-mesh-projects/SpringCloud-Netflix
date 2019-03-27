package in.hocg.springcloud.gateway;

import org.springframework.context.annotation.Configuration;

/**
 * Created by hocgin on 2019/3/27.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@Configuration
public class GatewayConfig {
    
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(p -> p.path("/baidu")
//                        .uri(URI.create("http://www.baidu.com")))
//                .route(p -> p.path("/c/**")
//                        .filters(f -> f.stripPrefix(1))
//                        // lb:{serviceId}
//                        .uri("lb://SA"))
//                .build();
//    }
    
}
