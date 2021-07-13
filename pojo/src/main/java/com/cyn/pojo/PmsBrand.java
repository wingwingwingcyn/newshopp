package com.cyn.pojo;

import com.cyn.pojo.BasePojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 品牌表
 * </p>
 *
 * @author giegie
 * @since 2021-07-01
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PmsBrand extends BasePojo {

    private static final long serialVersionUID = 1L;

    /**
     * 品牌名
     */
    private String name;

    /**
     * 品牌首字母
     */
    private String firstLetter;

    /**
     * 品牌图片
     */
    private String logo;

    /**
     * 是否有效
     */
    private Integer active;


}
