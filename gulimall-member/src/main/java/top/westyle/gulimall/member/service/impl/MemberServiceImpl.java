package top.westyle.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.westyle.gulimall.common.utils.PageUtils;
import top.westyle.gulimall.common.utils.Query;
import top.westyle.gulimall.member.dao.MemberDao;
import top.westyle.gulimall.member.entity.MemberEntity;
import top.westyle.gulimall.member.service.MemberService;

import java.util.Map;


@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberDao, MemberEntity> implements MemberService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberEntity> page = this.page(
                new Query<MemberEntity>().getPage(params),
                new QueryWrapper<MemberEntity>()
        );

        return new PageUtils(page);
    }

}