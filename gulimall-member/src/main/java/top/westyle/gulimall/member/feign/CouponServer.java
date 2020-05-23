package top.westyle.gulimall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import top.westyle.gulimall.common.utils.R;

@FeignClient("gulimall-coupon")
public interface CouponServer {
    /**
     * 列表
     */
    @RequestMapping("/coupon/coupon/listall")
    public R listAll();
}
