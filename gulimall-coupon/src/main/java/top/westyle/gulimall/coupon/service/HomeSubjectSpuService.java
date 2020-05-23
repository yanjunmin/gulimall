package top.westyle.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.westyle.gulimall.common.utils.PageUtils;
import top.westyle.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author yjm
 * @email 979107695@gmail.com
 * @date 2020-05-23 14:47:59
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

