package top.westyle.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.westyle.gulimall.common.utils.PageUtils;
import top.westyle.gulimall.common.utils.Query;
import top.westyle.gulimall.coupon.dao.CouponSpuCategoryRelationDao;
import top.westyle.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;
import top.westyle.gulimall.coupon.service.CouponSpuCategoryRelationService;

import java.util.Map;


@Service("couponSpuCategoryRelationService")
public class CouponSpuCategoryRelationServiceImpl extends ServiceImpl<CouponSpuCategoryRelationDao, CouponSpuCategoryRelationEntity> implements CouponSpuCategoryRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponSpuCategoryRelationEntity> page = this.page(
                new Query<CouponSpuCategoryRelationEntity>().getPage(params),
                new QueryWrapper<CouponSpuCategoryRelationEntity>()
        );

        return new PageUtils(page);
    }

}