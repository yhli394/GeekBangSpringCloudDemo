package yhli.work.coupon.template.api.beans.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.template.api.beans.rules
 * @className: DisCount
 * @author: LiYueHong
 * @date: 2023/7/12 16:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DisCount {

    private Long quota;

    private Long threshold;

}
