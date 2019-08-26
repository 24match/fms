package com.drew.fms.entity;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.drew.fms.mapper.TransForDayMapper;
import lombok.Data;

/**
 * @author drewLiang
 * @Date 2019/8/26 20:31
 */
@Data
public class Fms_trans_day{

    private Integer id;

    private String merchant_name;//商户名称

    private String merchant_addres;//商户地址

    private Integer trans_amount;//交易金额

    private Integer trans_type_id;//交易类型id

    private String trans_time;//消费时间
}
