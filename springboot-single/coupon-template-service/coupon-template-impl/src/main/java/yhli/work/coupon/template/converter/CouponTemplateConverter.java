package yhli.work.coupon.template.converter;

import yhli.work.coupon.template.api.beans.CouponTemplateInfo;
import yhli.work.coupon.template.dao.entity.CouponTemplate;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.template.converter
 * @className: CouponTemplateConverter
 * @author: LiYueHong
 * @date: 2023/7/13 10:52
 */
public class CouponTemplateConverter {

    public static CouponTemplateInfo convertToTemplateInfo(CouponTemplate template) {

        return CouponTemplateInfo.builder()
                .id(template.getId())
                .name(template.getName())
                .desc(template.getDescription())
                .type(template.getCategory().getCode())
                .shopId(template.getShopId())
                .available(template.getAvailable())
                .rule(template.getRule())
                .build();
    }

}
