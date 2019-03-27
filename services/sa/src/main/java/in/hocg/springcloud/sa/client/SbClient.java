package in.hocg.springcloud.sa.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by hocgin on 2019/3/27.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@FeignClient(value = All.SB, fallback = SbClientHystrix.class)
public interface SbClient {
    
    /**
     * link
     * @return
     */
    @GetMapping("link")
    String link();
}
