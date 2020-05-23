package top.westyle.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.westyle.gulimall.common.utils.PageUtils;
import top.westyle.gulimall.order.entity.UmsGrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author yjm
 * @email 979107695@gmail.com
 * @date 2020-05-22 22:37:05
 */
public interface UmsGrowthChangeHistoryService extends IService<UmsGrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

