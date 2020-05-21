package top.westyle.gulimall.product.dao;

import top.westyle.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yjm
 * @email 979107695@gmail.com
 * @date 2020-05-21 22:30:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
