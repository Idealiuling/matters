package com.customer.matters.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.customer.matters.dao.ResourceMapper;
import com.customer.matters.entity.Resource;
import com.customer.matters.service.ResourceService;
import com.customer.matters.vo.ResourceVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 资源表 资源表 服务实现类
 * </p>
 *
 * @author liuling
 * @since 2021-05-25
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements ResourceService {

    /**
     * 查询角色的资源
     *
     * @param roleId
     * @return
     */
    @Override
    public List<ResourceVO> listResourceByRoleId(Long roleId) {
        /**
         * 查询目录
         */
        QueryWrapper<Resource> query = Wrappers.<Resource>query();
        query.eq("rr.role_id", roleId).isNotNull("re.parent_id");
        List<ResourceVO> resourceVOS = baseMapper.listResource(query);
        /**
         * 查询二级菜单
         */
        resourceVOS.forEach(r -> {
            Long resourceId = r.getResourceId();
            QueryWrapper<Resource> subWrapper = Wrappers.<Resource>query();
            subWrapper.eq("rr.role_id", roleId)
                    .eq("re.parent_id", resourceId);
            List<ResourceVO> subResourceVO = baseMapper.listResource(subWrapper);
            if (CollectionUtils.isEmpty(subResourceVO)) {
                r.setSubs(subResourceVO);
            }
        });
        return resourceVOS;
    }
}
