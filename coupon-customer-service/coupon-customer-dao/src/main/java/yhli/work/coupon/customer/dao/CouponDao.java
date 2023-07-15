package yhli.work.coupon.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yhli.work.coupon.customer.dao.entity.Coupon;

public interface CouponDao extends JpaRepository<Coupon, Long> {

    // 根据用户ID和Template ID，统计用户从当前优惠券模板中领了多少张券
    long countByUserIdAndTemplateId(Long userId, Long templateId);

}