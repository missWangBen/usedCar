package com.car.project.wx.sell.domain;

import com.car.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 文件上传表 c_sell_upload
 * 
 * @author wangben
 * @date 2019-06-07
 */
@Getter
@Setter
public class WxSellUpload extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** id */
	private Integer id;
	/** 卖车code */
	private String sellCode;
	/** 图片名称 */
	private String uploadPath;

	private Integer status;


}
