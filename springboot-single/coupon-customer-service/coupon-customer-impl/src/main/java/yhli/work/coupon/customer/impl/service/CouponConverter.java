package yhli.work.coupon.customer.impl.service;

import yhli.work.coupon.customer.dao.entity.Coupon;
import yhli.work.coupon.template.api.beans.CouponInfo;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.customer.impl.service
 * @className: CouponConverter
 * @author: LiYueHong
 * @date: 2023/7/13 19:58
 */
public class CouponConverter {
    public static CouponInfo convertToCoupon(Coupon coupon) {

        return CouponInfo.builder()
                .id(coupon.getId())
                .status(coupon.getStatus().getCode())
                .templateId(coupon.getTemplateId())
                .shopId(coupon.getShopId())
                .userId(coupon.getUserId())
                .template(coupon.getTemplateInfo())
                .build();
    }
}