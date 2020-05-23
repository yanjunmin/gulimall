package top.westyle.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.westyle.gulimall.common.utils.PageUtils;
import top.westyle.gulimall.common.utils.Query;
import top.westyle.gulimall.ware.dao.WareOrderTaskDetailDao;
import top.westyle.gulimall.ware.entity.WareOrderTaskDetailEntity;
import top.westyle.gulimall.ware.service.WareOrderTaskDetailService;

import java.util.Map;


@Service("wareOrderTaskDetailService")
public class WareOrderTaskDetailServiceImpl extends ServiceImpl<WareOrderTaskDetailDao, WareOrderTaskDetailEntity> implements WareOrderTaskDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareOrderTaskDetailEntity> page = this.page(
                new Query<WareOrderTaskDetailEntity>().getPage(params),
                new QueryWrapper<WareOrderTaskDetailEntity>()
        );

        return new PageUtils(page);
    }

}