package cn.jxufe.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.jxufe.bean.EntityID;

/**
 * @ClassName: User
 * @Description:TODO(用户表)
 * @author: Anvlia
 * @date: 2023年5月10日 下午9:54:49
 * @Copyright:
 */
@Entity
@Table(name = "T_User")
public class User extends EntityID {
	private static final long serialVersionUID = 1L;
	private String headImage;// 头像
	private String userName;// 用户名
	private String nickName;// 昵称
	private int experience;// 经验值
	private int point;// 积分
	private int gold;// 金币

	public String getHeadImg() {
		return headImage;
	}

	public void setHeadImg(String headImg) {
		this.headImage = headImg;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getMoney() {
		return gold;
	}

	public void setMoney(int money) {
		this.gold = money;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
