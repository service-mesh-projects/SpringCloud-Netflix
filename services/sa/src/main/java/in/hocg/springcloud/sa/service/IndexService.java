package in.hocg.springcloud.sa.service;

import org.springframework.stereotype.Service;

/**
 * Created by hocgin on 2019/3/27.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@Service
public class IndexService {
    
    public String index() {
        return "ResponseEntity.ok(ok)";
    }
}
