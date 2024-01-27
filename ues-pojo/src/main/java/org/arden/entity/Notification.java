package org.arden.entity;

import lombok.*;

import java.io.Serial;
import java.util.Date;
import java.io.Serializable;

/**
 * (Notification)实体类
 *
 * @author makejava
 * @since 2024-01-27 11:00:11
 */
@Setter
@Getter
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Notification implements Serializable {
    @Serial
    private static final long serialVersionUID = 698214822012384179L;

    private Long id;
    /**
     * 通知的标题
     */
    private String title;
    /**
     * 通知的内容
     */
    private String content;
    /**
     * 通知的时间
     */
    private Date time;
    /**
     * 通知的结束时间
     */
    private Date dieTime;
    /**
     * 发送人的id，这里是用户表里面的id
     */
    private Long sendId;
    /**
     * 接收人的类型（0是所有人能收到，1是只有老师收到，2只有学生收到）
     */
    private Integer acceptor;
    /**
     * 备用字段
     */
    private String remark;
}

