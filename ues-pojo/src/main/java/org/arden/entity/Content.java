package org.arden.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * (Content)实体类
 *
 * @author makejava
 * @since 2024-01-27 11:00:11
 */
@Setter
@Getter
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Content implements Serializable {
    @Serial
    private static final long serialVersionUID = -74598421030572636L;

    private Long id;
    /**
     * 分数评价的标题，每个课程评价有多个分数评价标题
     */
    private String title;
    /**
     * 这个是分数评价的得分
     */
    private Integer score;
    /**
     * 文本评价内容
     */
    private String text;
    /**
     * 评价类型， 0是分数评价，1是文字评价
     */
    private Integer type;
    /**
     * 备用字段
     */
    private String remark;


}

