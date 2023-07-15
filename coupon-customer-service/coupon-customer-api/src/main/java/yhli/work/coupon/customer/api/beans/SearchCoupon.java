package yhli.work.coupon.customer.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.customer.beans
 * @className: SearchCoupon
 * @author: LiYueHong
 * @date: 2023/7/13 19:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchCoupon {

    @NotNull
    private Long userId;
    private Long shopId;
    private Integer couponStatus;

}
