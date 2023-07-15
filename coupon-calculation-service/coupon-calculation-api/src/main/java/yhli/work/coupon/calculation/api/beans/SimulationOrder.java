package yhli.work.coupon.calculation.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;
import yhli.work.coupon.template.api.beans.CouponInfo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.calculation.api.beans
 * @className: SimulationOrder
 * @author: LiYueHong
 * @date: 2023/7/13 15:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimulationOrder {

    @NotEmpty
    private List<Product> products;

    @NotEmpty
    private List<Long> couponIDs;

    private List<CouponInfo> couponInfos;

    @NotEmpty
    private Long userId;

}
