package top.westyle.gulimall.coupon.dao;

import top.westyle.gulimall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author yjm
 * @email 979107695@gmail.com
 * @date 2020-05-23 14:47:59
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
