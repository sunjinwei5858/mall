package com.macro.mall.dto;

import com.macro.mall.model.PmsProductAttribute;
import com.macro.mall.model.PmsProductAttributeCategory;
import lombok.Data;

import java.util.List;

/**
 * 包含有分类下属性的dto
 * @author Created by macro on 2018/5/24.
 */
@Data
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {

    private List<PmsProductAttribute> productAttributeList;

}
