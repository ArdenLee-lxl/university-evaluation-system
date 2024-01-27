package org.arden.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * (Evaluate)实体类
 *
 * @author makejava
 * @since 2024-01-27 11:00:11
 */
@Setter
@Getter
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Evaluate implements Serializable {
    @Serial
    private static final long serialVersionUID = -34956139364712233L;

    private Long id;
    /**
     * 学生的id
     */
    private Long studentId;
    /**
     * 课程的id
     */
    private Long courseId;
    /**
     * 评价内容的id
     */
    private Long contentId;
    /**
     * 备用字段
     */
    private String remark;
}

