package com.drew.fms.entity;

import lombok.Data;

/**
 * 用户实体类
 * @author drewLiang
 * @Date 2019/8/4 15:44
 */
@Data
public class fms_user {

    private int id;//主键id

    private String username;//用户名

    private String password;//密码

    private int type_id;//用户类型id

    private String add_date;//新增日期

    private String upd_date;//修改日期

    private String upd_user;//修改者


}
