package com.customer.matters.service.impl;

import com.customer.matters.entity.Customer;
import com.customer.matters.dao.CustomerMapper;
import com.customer.matters.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户表 客户表 服务实现类
 * </p>
 *
 * @author liuling
 * @since 2021-05-25
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
