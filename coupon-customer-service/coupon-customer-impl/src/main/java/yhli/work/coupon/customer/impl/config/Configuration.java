package yhli.work.coupon.customer.impl.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.customer.impl.config
 * @className: Configuration
 * @author: LiYueHong
 * @date: 2023/7/15 20:34
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    @LoadBalanced
    public WebClient.Builder register(){
        return WebClient.builder();
    }

}
