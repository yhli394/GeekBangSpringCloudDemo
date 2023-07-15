package yhli.work.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import yhli.work.coupon.calculation.template.AbstractRuleTemplate;
import yhli.work.coupon.calculation.template.RuleTemplate;

import java.util.Random;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.calculation.template.impl
 * @className: RandomReductionTemplate
 * @author: LiYueHong
 * @date: 2023/7/13 16:29
 */
// 随机减钱
@Slf4j
@Component
public class RandomReductionTemplate extends AbstractRuleTemplate implements RuleTemplate {

    @Override
    protected Long calculateNewPrice(Long totalAmount, Long shopAmount, Long quota) {
        // 计算使用优惠券之后的价格
        Long maxBenefit = Math.min(shopAmount, quota);
        int reductionAmount = new Random().nextInt(maxBenefit.intValue());
        Long newCost = totalAmount - reductionAmount;

        log.debug("original price={}, new price={}", totalAmount, newCost );
        return newCost;
    }
}

