package life.qzz.springcloud.service.hi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    private HiService service;
    @RequestMapping("hello")
    public String hello(){
        return service.hello();
    }
}
