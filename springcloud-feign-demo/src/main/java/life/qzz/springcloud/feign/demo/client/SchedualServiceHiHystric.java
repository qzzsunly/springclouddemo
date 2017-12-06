package life.qzz.springcloud.feign.demo.client;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name +". i'm over.";
    }
}
