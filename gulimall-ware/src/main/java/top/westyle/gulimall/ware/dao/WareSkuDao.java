package top.westyle.gulimall.ware.dao;

import top.westyle.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author yjm
 * @email 979107695@gmail.com
 * @date 2020-05-23 16:16:22
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
