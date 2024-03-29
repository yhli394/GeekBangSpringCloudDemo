package yhli.work.coupon.customer.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableJpaAuditing
@EnableTransactionManagement
@EntityScan("yhli.work")
@EnableJpaRepositories("yhli.work")
//@ComponentScan(value = {"yhli.work.coupon.template.service"})
@ComponentScan(value = {"yhli.work"})
public class CouponCustomerImplApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(CouponCustomerImplApplication.class, args);
    }

}
