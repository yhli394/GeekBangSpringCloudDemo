package yhli.work.coupon.calculation.service;

import org.springframework.web.bind.annotation.RequestBody;
import yhli.work.coupon.calculation.api.beans.ShoppingCart;
import yhli.work.coupon.calculation.api.beans.SimulationOrder;
import yhli.work.coupon.calculation.api.beans.SimulationResponse;

public interface CouponCalculationService {

    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart);

    SimulationResponse simulateOrder(@RequestBody SimulationOrder cart);

}
