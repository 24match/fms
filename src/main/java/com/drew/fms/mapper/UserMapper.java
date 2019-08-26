package com.drew.fms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.drew.fms.entity.Fms_user;

/**
 * 用户管理mapper
 * @author drewLiang
 * @Date 2019/8/4 15:48
 */
//@Mapper//可以在这里加上mapper或者在启动类中加上@MapperScan
public interface UserMapper extends BaseMapper<Fms_user> {

}
