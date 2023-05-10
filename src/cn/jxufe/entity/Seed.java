package cn.jxufe.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @ClassName: Seed
 * @Description:种子属性
 * @author: Anvlia
 * @date: 2023年5月10日 上午9:51:39
 * @Copyright:
 */
@Entity
@Table(name = "T_Seed")
public class Seed {
	private static final long serialVersionUID = 1L;
	private int seedId;
	private String seedName;// 种子名称
	private int xSeasonCrop;// x季作物
	private int seedGrade;// 种子等级
	private String seedType;// 种子类型
	private int getExperience;// 可获经验
	private int seasonRipeTime;// 每季成熟所需时间
	private int seasonRipeHarvestNumber;// 每季成熟可获收（种子个数）
	private int seedPurchasePrice;// 种子采购价
	private int perFruitPrice;// 每个收获的果实单价
	private String landQuality;// 土地需求（需要品质）
	private int seasonRipeGetPoint;// 每季成熟可获积分
	private String information;// 提示信息

	public int getSeedId() {
		return seedId;
	}

	public void setSeedId(int seedId) {
		this.seedId = seedId;
	}

	public String getSeedName() {
		return seedName;
	}

	public void setSeedName(String seedName) {
		this.seedName = seedName;
	}

	public int getxSeasonCrop() {
		return xSeasonCrop;
	}

	public void setxSeasonCrop(int xSeasonCrop) {
		this.xSeasonCrop = xSeasonCrop;
	}

	public int getSeedGrade() {
		return seedGrade;
	}

	public void setSeedGrade(int seedGrade) {
		this.seedGrade = seedGrade;
	}

	public String getSeedType() {
		return seedType;
	}

	public void setSeedType(String seedType) {
		this.seedType = seedType;
	}

	public int getGetExperience() {
		return getExperience;
	}

	public void setGetExperience(int getExperience) {
		this.getExperience = getExperience;
	}

	public int getSeasonRipeTime() {
		return seasonRipeTime;
	}

	public void setSeasonRipeTime(int seasonRipeTime) {
		this.seasonRipeTime = seasonRipeTime;
	}

	public int getSeasonRipeHarvestNumber() {
		return seasonRipeHarvestNumber;
	}

	public void setSeasonRipeHarvestNumber(int seasonRipeHarvestNumber) {
		this.seasonRipeHarvestNumber = seasonRipeHarvestNumber;
	}

	public int getSeedPurchasePrice() {
		return seedPurchasePrice;
	}

	public void setSeedPurchasePrice(int seedPurchasePrice) {
		this.seedPurchasePrice = seedPurchasePrice;
	}

	public int getPerFruitPrice() {
		return perFruitPrice;
	}

	public void setPerFruitPrice(int perFruitPrice) {
		this.perFruitPrice = perFruitPrice;
	}

	public String getLandQuality() {
		return landQuality;
	}

	public void setLandQuality(String landQuality) {
		this.landQuality = landQuality;
	}

	public int getSeasonRipeGetPoint() {
		return seasonRipeGetPoint;
	}

	public void setSeasonRipeGetPoint(int seasonRipeGetPoint) {
		this.seasonRipeGetPoint = seasonRipeGetPoint;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
