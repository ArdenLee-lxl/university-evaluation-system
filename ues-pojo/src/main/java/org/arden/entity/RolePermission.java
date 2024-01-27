package org.arden.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * (RolePermission)实体类
 *
 * @author makejava
 * @since 2024-01-27 11:00:11
 */
@Setter
@Getter
@AllArgsConstructor
@Data
@NoArgsConstructor
public class RolePermission implements Serializable {
    @Serial
    private static final long serialVersionUID = -66478766489027658L;
    /**
     * 角色表的主键
     */
    private Long roleId;
    /**
     * 权限表的主键
     */
    private Long permissionId;


}

