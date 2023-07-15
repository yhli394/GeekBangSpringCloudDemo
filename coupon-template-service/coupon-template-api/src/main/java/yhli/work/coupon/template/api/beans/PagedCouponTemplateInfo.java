package yhli.work.coupon.template.api.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.template.api.beans
 * @className: PagedCouponTemplateInfo
 * @author: LiYueHong
 * @date: 2023/7/12 16:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagedCouponTemplateInfo {

    public List<CouponTemplateInfo> templates;

    private int page;

    private long total;

}
