package com.customer.matters.dao;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.customer.matters.entity.Resource;
import com.customer.matters.vo.ResourceVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 资源表 资源表 Mapper 接口
 * </p>
 *
 * @author liuling
 * @since 2021-05-25
 */
public interface ResourceMapper extends BaseMapper<Resource> {

    List<ResourceVO> listResource (@Param(Constants.WRAPPER) Wrapper<Resource> wrapper);
}
