package yhli.work.coupon.template.dao.converter;

import com.alibaba.fastjson.JSON;
import yhli.work.coupon.template.api.beans.rules.TemplateRule;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.template.dao.converter
 * @className: RuleConverter
 * @author: LiYueHong
 * @date: 2023/7/13 10:05
 */
@Converter
public class RuleConverter implements AttributeConverter<TemplateRule,String> {

    @Override
    public String convertToDatabaseColumn(TemplateRule templateRule) {
        return JSON.toJSONString(templateRule);
    }

    @Override
    public TemplateRule convertToEntityAttribute(String s) {
        return JSON.parseObject(s, TemplateRule.class);
    }
}
