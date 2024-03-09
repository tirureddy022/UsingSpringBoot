package com.nit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data

@Table(name = "PLAN_CATEGORY")
public class PlanCateogry {
	@Id
	@GeneratedValue
	@Column(name = "CATEGORY_ID")
	private Integer categoryId;
	@Column(name = "CATEGROY_NAME")
	private String categoryName;
	@Column(name = "ACTIVE_SW")
	private String activeSw;
	@Column(name = "CREATED_BY")
	private String createdBy;
	@Column(name = "UPDATE_BY")
	private String updatedBy;
	@Column(name = "CREATE_DATE", updatable = false)
	private LocalDate createDate;
	@Column(name = "UPDATE_DATE", insertable = false)
	private LocalDate updateDate;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

}
