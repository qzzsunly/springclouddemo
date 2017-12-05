package life.qzz.springcloud.feign.demo.controller;

import life.qzz.springcloud.feign.demo.client.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    private SchedualServiceHi serviceHi;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name){
        return serviceHi.sayHiFromClientOne(name);
    }
}
