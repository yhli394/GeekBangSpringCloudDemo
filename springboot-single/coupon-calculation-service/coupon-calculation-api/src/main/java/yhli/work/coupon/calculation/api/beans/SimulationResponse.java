package yhli.work.coupon.calculation.api.beans;

import com.google.common.collect.Maps;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.calculation.api.beans
 * @className: SimulationResponse
 * @author: LiYueHong
 * @date: 2023/7/13 16:00
 */
@Data
@NoArgsConstructor
public class SimulationResponse {

    private Long bestCouponId;

    private Map<Long,Long> couponToOrderPrice = Maps.newHashMap();

}
