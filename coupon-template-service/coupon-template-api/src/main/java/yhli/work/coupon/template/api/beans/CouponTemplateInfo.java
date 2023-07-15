package yhli.work.coupon.template.api.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import yhli.work.coupon.template.api.beans.rules.TemplateRule;

import javax.validation.constraints.NotNull;


/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.template.api.beans
 * @className: CouponTemplateInfo
 * @author: LiYueHong
 * @date: 2023/7/12 16:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponTemplateInfo {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String desc;

    @NotNull
    private String type;

    private Long shopId;

    @NotNull
    private TemplateRule rule;

    private Boolean available;

}
