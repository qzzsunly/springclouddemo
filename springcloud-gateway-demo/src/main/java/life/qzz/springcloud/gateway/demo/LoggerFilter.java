package life.qzz.springcloud.gateway.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;

/**
 * <pre>
 * 自定义数据过滤器
 * </pre>
 */
@Component
public class LoggerFilter extends ZuulFilter{
    @Autowired
    private Tracer tracer;
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 900;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        tracer.addTag("operator", "qzz");
        System.out.println(tracer.getCurrentSpan().traceIdString());
        return null;
    }
}
