package yhli.work.coupon.template.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import yhli.work.coupon.template.api.beans.rules.TemplateRule;
import yhli.work.coupon.template.api.enums.CouponType;
import yhli.work.coupon.template.dao.converter.CouponTypeConverter;
import yhli.work.coupon.template.dao.converter.RuleConverter;

import javax.persistence.*;
import java.util.Date;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.template.dao.entity
 * @className: CouponTemplate
 * @author: LiYueHong
 * @date: 2023/7/13 9:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "coupon_template")
@EntityListeners(AuditingEntityListener.class)
public class CouponTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "available",nullable = false)
    private Boolean available;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "shop_id")
    private Long shopId;

    @Column(name = "description",nullable = false)
    private String description;

    @Column(name = "type",nullable = false)
    @Convert(converter = CouponTypeConverter.class)
    private CouponType category;

    @Column(name = "createdTime",nullable = false)
    @CreatedDate
    private Date createdTime;

    @Column(name = "rule",nullable = false)
    @Convert(converter = RuleConverter.class)
    private TemplateRule rule;

}
