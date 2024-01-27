package org.arden.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2024-01-27 11:00:11
 */
@Setter
@Getter
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Role implements Serializable {
    @Serial
    private static final long serialVersionUID = 773636689584675334L;

    private Long id;
    /**
     * 角色名称，显示用的
     */
    private String name;
    /**
     * 角色名称，程序使用的
     */
    private String path;
    /**
     * 备用字段
     */
    private String remark;


}

