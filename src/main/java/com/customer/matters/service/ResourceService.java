package com.customer.matters.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.customer.matters.entity.Resource;
import com.customer.matters.vo.ResourceVO;

import java.util.List;

/**
 * <p>
 * 资源表 资源表 服务类
 * </p>
 *
 * @author liuling
 * @since 2021-05-25
 */
public interface ResourceService extends IService<Resource> {
    /**
     * 查询角色的资源
     * @param roleId
     * @return
     */

    List<ResourceVO> listResourceByRoleId(Long roleId);
}
