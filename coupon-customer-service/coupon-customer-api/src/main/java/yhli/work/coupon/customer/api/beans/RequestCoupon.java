package yhli.work.coupon.customer.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import yhli.work.coupon.template.api.beans.CouponTemplateInfo;

import javax.validation.constraints.NotNull;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.customer.beans
 * @className: RequestCoupon
 * @author: LiYueHong
 * @date: 2023/7/13 19:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestCoupon {

    // 用户领券
    @NotNull
    private Long userId;

    // 券模板ID
    @NotNull
    private Long couponTemplateId;

    /** 优惠券模板信息 */
    private CouponTemplateInfo templateSDK;

    // Loadbalancer - 用作测试流量打标
    private String trafficVersion;

}
