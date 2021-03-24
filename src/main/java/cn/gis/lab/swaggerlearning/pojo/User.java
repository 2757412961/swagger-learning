package cn.gis.lab.swaggerlearning.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("User(用户)")
public class User {

    @ApiModelProperty("用户名")
    public String userName;

    @ApiModelProperty("密码")
    public String password;

}
