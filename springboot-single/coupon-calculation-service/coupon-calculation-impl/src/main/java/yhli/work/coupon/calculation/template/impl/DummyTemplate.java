package yhli.work.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import yhli.work.coupon.calculation.api.beans.ShoppingCart;
import yhli.work.coupon.calculation.template.AbstractRuleTemplate;
import yhli.work.coupon.calculation.template.RuleTemplate;

/**空实现
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.calculation.template.impl
 * @className: DummyTemplate
 * @author: LiYueHong
 * @date: 2023/7/13 16:28
 */
@Slf4j
@Component
public class DummyTemplate extends AbstractRuleTemplate implements RuleTemplate {

    @Override
    public ShoppingCart calculate(ShoppingCart order) {
        // 获取订单总价
        Long orderTotalAmount = getTotalPrice(order.getProducts());

        order.setCost(orderTotalAmount);
        return order;
    }


    @Override
    protected Long calculateNewPrice(Long orderTotalAmount, Long shopTotalAmount, Long quota) {
        return orderTotalAmount;
    }
}