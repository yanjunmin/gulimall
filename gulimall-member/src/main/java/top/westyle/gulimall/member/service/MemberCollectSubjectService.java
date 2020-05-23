package top.westyle.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.westyle.gulimall.common.utils.PageUtils;
import top.westyle.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author yjm
 * @email 979107695@gmail.com
 * @date 2020-05-23 15:17:33
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

