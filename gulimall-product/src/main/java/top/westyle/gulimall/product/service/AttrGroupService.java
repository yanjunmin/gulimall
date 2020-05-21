package top.westyle.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import top.westyle.gulimall.common.utils.PageUtils;
import top.westyle.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author yjm
 * @email 979107695@gmail.com
 * @date 2020-05-21 22:30:51
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

