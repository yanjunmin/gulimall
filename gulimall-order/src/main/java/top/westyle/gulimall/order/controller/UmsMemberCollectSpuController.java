package top.westyle.gulimall.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.westyle.gulimall.common.utils.PageUtils;
import top.westyle.gulimall.common.utils.R;
import top.westyle.gulimall.order.entity.UmsMemberCollectSpuEntity;
import top.westyle.gulimall.order.service.UmsMemberCollectSpuService;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;


/**
 * 会员收藏的商品
 *
 * @author yjm
 * @email 979107695@gmail.com
 * @date 2020-05-22 22:37:05
 */
@RestController
@RequestMapping("order/umsmembercollectspu")
public class UmsMemberCollectSpuController {
    @Autowired
    private UmsMemberCollectSpuService umsMemberCollectSpuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("order:umsmembercollectspu:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsMemberCollectSpuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("order:umsmembercollectspu:info")
    public R info(@PathVariable("id") Long id){
		UmsMemberCollectSpuEntity umsMemberCollectSpu = umsMemberCollectSpuService.getById(id);

        return R.ok().put("umsMemberCollectSpu", umsMemberCollectSpu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("order:umsmembercollectspu:save")
    public R save(@RequestBody UmsMemberCollectSpuEntity umsMemberCollectSpu){
		umsMemberCollectSpuService.save(umsMemberCollectSpu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("order:umsmembercollectspu:update")
    public R update(@RequestBody UmsMemberCollectSpuEntity umsMemberCollectSpu){
		umsMemberCollectSpuService.updateById(umsMemberCollectSpu);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("order:umsmembercollectspu:delete")
    public R delete(@RequestBody Long[] ids){
		umsMemberCollectSpuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
