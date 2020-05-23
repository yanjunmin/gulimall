package top.westyle.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.westyle.gulimall.common.utils.PageUtils;
import top.westyle.gulimall.order.entity.UmsMemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author yjm
 * @email 979107695@gmail.com
 * @date 2020-05-22 22:37:05
 */
public interface UmsMemberService extends IService<UmsMemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

