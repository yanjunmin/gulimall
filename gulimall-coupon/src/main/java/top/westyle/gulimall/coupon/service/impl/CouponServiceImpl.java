package top.westyle.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.westyle.gulimall.common.utils.PageUtils;
import top.westyle.gulimall.common.utils.Query;
import top.westyle.gulimall.coupon.dao.CouponDao;
import top.westyle.gulimall.coupon.entity.CouponEntity;
import top.westyle.gulimall.coupon.service.CouponService;

import java.util.Map;


@Service("couponService")
public class CouponServiceImpl extends ServiceImpl<CouponDao, CouponEntity> implements CouponService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponEntity> page = this.page(
                new Query<CouponEntity>().getPage(params),
                new QueryWrapper<CouponEntity>()
        );

        return new PageUtils(page);
    }

}