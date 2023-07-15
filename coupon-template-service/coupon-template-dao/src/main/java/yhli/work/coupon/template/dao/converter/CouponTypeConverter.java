package yhli.work.coupon.template.dao.converter;

import yhli.work.coupon.template.api.enums.CouponType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.template.dao.converter
 * @className: CouponTypeConverter
 * @author: LiYueHong
 * @date: 2023/7/13 10:01
 */
@Converter
public class CouponTypeConverter implements AttributeConverter<CouponType,String> {


    @Override
    public String convertToDatabaseColumn(CouponType couponType) {
        return couponType.getCode();
    }

    @Override
    public CouponType convertToEntityAttribute(String s) {
        return CouponType.convert(s);
    }
}
