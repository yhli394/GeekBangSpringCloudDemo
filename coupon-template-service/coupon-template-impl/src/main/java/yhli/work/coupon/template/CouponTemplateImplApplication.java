package yhli.work.coupon.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.template
 * @className: Application
 * @author: LiYueHong
 * @date: 2023/7/13 10:59
 */
@SpringBootApplication
@EnableJpaAuditing
public class CouponTemplateImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponTemplateImplApplication.class,args);
    }

}
