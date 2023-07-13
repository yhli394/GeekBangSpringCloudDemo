package yhli.work.coupon.calculation.template;

import yhli.work.coupon.calculation.api.beans.ShoppingCart;

public interface RuleTemplate {

    ShoppingCart calculate(ShoppingCart shoppingCart);

}
