package top.westyle.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.westyle.gulimall.common.utils.PageUtils;
import top.westyle.gulimall.order.entity.UmsMemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author yjm
 * @email 979107695@gmail.com
 * @date 2020-05-22 22:37:05
 */
public interface UmsMemberCollectSubjectService extends IService<UmsMemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

