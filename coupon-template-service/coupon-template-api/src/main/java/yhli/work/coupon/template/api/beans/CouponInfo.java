package yhli.work.coupon.template.api.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.template.api.beans
 * @className: CouponInfo
 * @author: LiYueHong
 * @date: 2023/7/12 16:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponInfo {

    private Long id;

    private Long templateId;

    private Long userId;

    private Long shopId;

    private Integer status;

    private CouponTemplateInfo template;

}
