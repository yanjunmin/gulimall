package top.westyle.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.westyle.gulimall.common.utils.PageUtils;
import top.westyle.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author yjm
 * @email 979107695@gmail.com
 * @date 2020-05-23 15:17:33
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

