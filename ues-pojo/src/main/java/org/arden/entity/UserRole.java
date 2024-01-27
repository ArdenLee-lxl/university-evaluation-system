package org.arden.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author makejava
 * @since 2024-01-27 11:00:12
 */
@Setter
@Getter
@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserRole implements Serializable {
    @Serial
    private static final long serialVersionUID = 994825270283576605L;
    /**
     * 用户表的id
     */
    private Long userId;
    /**
     * 角色表的id
     */
    private Long roleId;


}

