package com.xch900910.mall.common.model;

import lombok.Data;

/**
 * @author xch900910
 * @version 1.0
 * @Desc 用户信息
 * @Date 2020/5/4 11:06
 **/
@Data
public class UserInfo extends BaseModel {
    private String name;
    private String sex;
    private Integer age;

}
