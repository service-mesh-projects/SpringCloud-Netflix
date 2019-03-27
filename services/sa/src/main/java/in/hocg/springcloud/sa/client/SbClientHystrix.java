package in.hocg.springcloud.sa.client;

import org.springframework.stereotype.Component;

/**
 * Created by hocgin on 2019/3/27.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@Component
public class SbClientHystrix implements SbClient {
    
    @Override
    public String link() {
        return "fail";
    }
}
