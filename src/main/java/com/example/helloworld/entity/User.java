package com.example.helloworld.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User {

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    private String username;

    private String password;

    private String phone;

    private String avatar;

    private Integer sex;

    /**
     * 逻辑删除，删除：1， 未删除：0
     */
    @TableLogic
    private boolean isDeleted;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private  String createTime;

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

}
