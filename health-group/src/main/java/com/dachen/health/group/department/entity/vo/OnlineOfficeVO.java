package com.dachen.health.group.department.entity.vo;

import org.mongodb.morphia.annotations.Id;

/**
 * 
 * @author pijingwei
 * @date 2015/8/14
 */
public class OnlineOfficeVO {

	/**
	 * id
	 */
	@Id
	private String id;
	
	/**
	 * 组织架构Id（科室Id）
	 */
	private String departmentId;
	
	/**
	 * 类型  A：上午，P：下午，N：晚上
	 */
	private String type;
	
	/**
	 * 星期   1:星期一   2：星期二   3：星期三   4：星期四   5：星期五   6：星期六   7：星期天
	 */
	private Integer week;
	
	/**
	 * 开始时间
	 */
	private String startTime;
	
	/**
	 * 结束时间
	 */
	private String endTime;
	
	/**
	 * 创建人
	 */
	private String creator;
	
	/**
	 * 创建时间
	 */
	private Long creatorDate;
	
	/**
	 * 更新人
	 */
	private String updator;
	
	/**
	 * 更新时间
	 */
	private Long updatorDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getWeek() {
		return week;
	}

	public void setWeek(Integer week) {
		this.week = week;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Long getCreatorDate() {
		return creatorDate;
	}

	public void setCreatorDate(Long creatorDate) {
		this.creatorDate = creatorDate;
	}

	public String getUpdator() {
		return updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator;
	}

	public Long getUpdatorDate() {
		return updatorDate;
	}

	public void setUpdatorDate(Long updatorDate) {
		this.updatorDate = updatorDate;
	}
	
	
}
