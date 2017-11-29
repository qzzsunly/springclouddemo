package life.qzz.springcloud.service.hi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HiService {
    @Autowired
    private RestTemplate restTemplate;

    public String hello(){
        return restTemplate.getForObject("http://service-hi/hi?name=qqzz",String.class);
    }
}
