package top.westyle.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.westyle.gulimall.common.utils.PageUtils;
import top.westyle.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author yjm
 * @email 979107695@gmail.com
 * @date 2020-05-23 14:47:59
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

