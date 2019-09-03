package com.drew.fms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.drew.fms.entity.Fms_user;
import com.drew.fms.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户管理mapper
 * @author drewLiang
 * @Date 2019/8/4 15:48
 */
//@Mapper//可以在这里加上mapper或者在启动类中加上@MapperScan
public interface UserMapper extends BaseMapper<User> {

    IPage<User> selectPageVo(Page page, @Param("state") Integer state);
}
