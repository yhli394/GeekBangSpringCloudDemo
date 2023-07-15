package yhli.work.coupon.calculation.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.calculation.api.beans
 * @className: Product
 * @author: LiYueHong
 * @date: 2023/7/13 15:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Long productId;

    private long price;

    private Integer count;

    private Long shopId;

}
