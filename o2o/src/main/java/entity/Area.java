package entity;

import lombok.Data;

import java.util.Date;

/**
 * @author LiHui
 * @create 2020-08-06-9:41
 */
@Data
public class Area {
	//id
	private Integer areaId;
	//名称
	private String areaName;
	//权重
	private Integer priority;
	//创建时间
	private Date createTime;
	//更新时间
	private Date lastEditTime;

}
