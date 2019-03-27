package in.hocg.springcloud.sa.controller;

import in.hocg.springcloud.sa.client.SbClient;
import in.hocg.springcloud.sa.service.IndexService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by hocgin on 2019/3/27.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@Controller
@AllArgsConstructor
public class IndexController {
    
    private final IndexService indexService;
    private final SbClient sbClient;
    
    @GetMapping("index")
    public ResponseEntity index() {
        return ResponseEntity.ok("ok " + indexService.index());
    }
    
    @GetMapping("link-a")
    public ResponseEntity link() {
        return ResponseEntity.ok("ok " + sbClient.link());
    }
}
