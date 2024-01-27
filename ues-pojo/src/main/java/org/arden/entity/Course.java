package org.arden.entity;

import lombok.*;

import java.io.Serial;
import java.util.Date;
import java.io.Serializable;

/**
 * (Course)实体类
 *
 * @author makejava
 * @since 2024-01-27 11:00:11
 */
@Setter
@Getter
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Course implements Serializable {
    @Serial
    private static final long serialVersionUID = -12979140998152796L;

    private Long id;
    /**
     * 课程名称
     */
    private String name;
    /**
     * 用户表中教师的id，哪个教师代课
     */
    private Long userTeacherId;
    /**
     * 课程表的封面，不一定使用
     */
    private String pic;
    /**
     * 描述了课程在星期几上课
     */
    private String week;
    /**
     * 描述了课程的节次
     */
    private Integer pitchNumber;
    /**
     * 上课时间，具体到天数
     */
    private Date time;
    /**
     * 备用字段
     */
    private String remark;
}

