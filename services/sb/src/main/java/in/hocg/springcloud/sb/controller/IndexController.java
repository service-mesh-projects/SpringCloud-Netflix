package in.hocg.springcloud.sb.controller;

import in.hocg.springcloud.sb.service.IndexService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

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
    
    @GetMapping("index")
    public ResponseEntity index() {
        return ResponseEntity.ok("ok " + indexService.index());
    }
    
    @GetMapping("link")
    public ResponseEntity link() {
        return ResponseEntity.ok("ok:: " + LocalDateTime.now());
    }
    
}
