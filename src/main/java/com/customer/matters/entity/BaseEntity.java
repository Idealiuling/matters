package com.customer.matters.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseEntity {
    /**
     * 修改该时间 修改该时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime modifiedTime;

    /**
     * 创建人 创建人
     */
    @TableField(fill = FieldFill.INSERT)
    private Long createAccountId;

    /**
     * 修改人 修改人
     */
    @TableField(fill = FieldFill.UPDATE)
    private Long modifiedAccountId;

    /**
     * 逻辑删除标识 逻辑删除标识
     */
    @TableLogic
    private Integer deleted;

}
