package org.arden.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * (Permission)实体类
 *
 * @author makejava
 * @since 2024-01-27 11:00:11
 */
@Setter
@Getter
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Permission implements Serializable {
    @Serial
    private static final long serialVersionUID = 885439366795809446L;
    /**
     *
     */
    private Long id;
    /**
     * 权限名称，前端展示使用
     */
    private String name;
    /**
     * 权限名称，程序使用
     */
    private String path;
    /**
     * 备用字段
     */
    private String remark;


}

