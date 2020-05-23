package top.westyle.gulimall.coupon.dao;

import top.westyle.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yjm
 * @email 979107695@gmail.com
 * @date 2020-05-23 14:47:59
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
