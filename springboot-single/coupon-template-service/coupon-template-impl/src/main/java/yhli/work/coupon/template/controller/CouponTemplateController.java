package yhli.work.coupon.template.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import yhli.work.coupon.template.api.beans.CouponTemplateInfo;
import yhli.work.coupon.template.api.beans.PagedCouponTemplateInfo;
import yhli.work.coupon.template.api.beans.TemplateSearchParams;
import yhli.work.coupon.template.service.CouponTemplateService;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Collection;
import java.util.Map;

/**
 * @projectName: GeekBangSpringCloudDemo
 * @package: yhli.work.coupon.template.controller
 * @className: CouponTemplateController
 * @author: LiYueHong
 * @date: 2023/7/13 10:55
 */
@Slf4j
@RestController
@RequestMapping("/template")
public class CouponTemplateController {

    @Resource
    private CouponTemplateService couponTemplateService;

    // 创建优惠券
    @PostMapping("/addTemplate")
    public CouponTemplateInfo addTemplate(@Valid @RequestBody CouponTemplateInfo request) {
        log.info("Create coupon template: data={}", request);
        return couponTemplateService.createTemplate(request);
    }

    @PostMapping("/cloneTemplate")
    public CouponTemplateInfo cloneTemplate(@RequestParam("id") Long templateId) {
        log.info("Clone coupon template: data={}", templateId);
        return couponTemplateService.cloneTemplate(templateId);
    }

    // 读取优惠券
    @GetMapping("/getTemplate")
    public CouponTemplateInfo getTemplate(@RequestParam("id") Long id){
        log.info("Load template, id={}", id);
        return couponTemplateService.loadTemplateInfo(id);
    }

    // 批量获取
    @GetMapping("/getBatch")
    public Map<Long, CouponTemplateInfo> getTemplateInBatch(@RequestParam("ids") Collection<Long> ids) {
        log.info("getTemplateInBatch: {}", JSON.toJSONString(ids));
        return couponTemplateService.getTemplateInfoMap(ids);
    }

    // 搜索模板
    @PostMapping("/search")
    public PagedCouponTemplateInfo search(@Valid @RequestBody TemplateSearchParams request) {
        log.info("search templates, payload={}", request);
        return couponTemplateService.search(request);
    }

    // 优惠券无效化
    @DeleteMapping("/deleteTemplate")
    public void deleteTemplate(@RequestParam("id") Long id){
        log.info("Load template, id={}", id);
        couponTemplateService.deleteTemplate(id);
    }

}
