package com.example.helloworld.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Article {

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    private String username;

    private String userId;

    private String title;

    private String description;

    private String content;

    private String keywords;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private  String createTime;

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

}
