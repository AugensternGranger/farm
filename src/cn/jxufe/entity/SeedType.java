package cn.jxufe.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.jxufe.bean.EntityID;

/**
 * @ClassName: SeedType
 * @Description:TODO(种子类型)
 * @author: Anvlia
 * @date: 2023年5月10日 下午9:56:31
 * @Copyright:
 */
@Entity
@Table(name = "T_SeedType")
public class SeedType extends EntityID {
	private static final long serialVersionUID = 1L;
	private String code;
	private String caption;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
