package org.arden.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2024-01-27 11:00:11
 */
@Setter
@Getter
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -37612761616048053L;

    private Long id;
    /**
     * 学生的学号与老师的编号
     */
    private Integer number;
    /**
     * 用户电话
     */
    private Integer phone;
    /**
     * 用户真实姓名
     */
    private String name;
    /**
     * 用户性别，0为女生，1为男生
     */
    private Integer gender;
    /**
     * 用户密码，存放加密之后的密码，应当有一个默认值
     */
    private String password;
    /**
     * 用户的头像地址，应有默认值
     */
    private String pic;
    /**
     * 备用字段
     */
    private String remark;


}

