package com.hbyd.parks.dto.managesys;

// Generated 2014-6-26 13:14:36 by Hibernate Tools 3.4.0.CR1

import com.hbyd.parks.common.base.BaseDTO;

/**
 * SysButton generated by hbm2java
 */
public class ResBtnDTO extends BaseDTO implements Comparable<ResBtnDTO>{
    /**
     * 是否可见，有些功能只有开发和部署人员才能看到，即使是客户的管理员也不能看到
     */
    private Boolean isVisible;
	private String btnName;
	private String btnIconUrl;
	private Integer btnOrder;
	private String btnScript;
    private String btnUrl;

    /**
     * 所属菜单ID
     */
	private String menuId;

    /**
     * 所属菜单名称
     */
    private String menuName;

	public ResBtnDTO() {
	}

    public Boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

	public String getBtnName() {
		return btnName;
	}

	public void setBtnName(String btnName) {
		this.btnName = btnName;
	}

	public String getBtnIconUrl() {
		return btnIconUrl;
	}

	public void setBtnIconUrl(String btnIconUrl) {
		this.btnIconUrl = btnIconUrl;
	}

    public Integer getBtnOrder() {
        return btnOrder;
    }

    public void setBtnOrder(Integer btnOrder) {
        this.btnOrder = btnOrder;
    }

    public String getBtnScript() {
		return btnScript;
	}

	public void setBtnScript(String btnScript) {
		this.btnScript = btnScript;
	}

    public String getBtnUrl() {
        return btnUrl;
    }

    public void setBtnUrl(String btnUrl) {
        this.btnUrl = btnUrl;
    }

    @Override
    public int compareTo(ResBtnDTO o) {
        return Integer.compare(this.getBtnOrder(),o.getBtnOrder());
    }
}
