package cn.jxufe.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @ClassName: SeedGrowthStage
 * @Description:TODO(种子成长阶段)
 * @author: Anvlia
 * @date: 2023年5月10日 上午10:27:01
 * @Copyright:
 */
@Entity
@Table(name = "T_SeedGrowthStage") // 种子成长阶段表
public class SeedGrowthStage {
	private static final long serialVersionUID = 1L;
	private int seedId;
	private int growStage;// 生长阶段（1，2，3...）
	private String growthStageTitle;// 生长阶段标题
	private int growthStageTime;// 生长阶段时间
	private float insectProbability;// 生虫概率
	private int imageWidth;// 图片宽度
	private int imageHeight;// 图片高度
	private int imageOffsetX;// 图片OffsetX
	private int imageOffsetY;// 图片OffsetX
	private String cropStatus;// 作物状态

	public int getSeedId() {
		return seedId;
	}

	public void setSeedId(int seedId) {
		this.seedId = seedId;
	}

	public String getGrowthStageTitle() {
		return growthStageTitle;
	}

	public void setGrowthStageTitle(String growthStageTitle) {
		this.growthStageTitle = growthStageTitle;
	}

	public int getGrowthStageTime() {
		return growthStageTime;
	}

	public void setGrowthStageTime(int growthStageTime) {
		this.growthStageTime = growthStageTime;
	}

	public float getInsectProbability() {
		return insectProbability;
	}

	public void setInsectProbability(float insectProbability) {
		this.insectProbability = insectProbability;
	}

	public int getImageWidth() {
		return imageWidth;
	}

	public void setImageWidth(int imageWidth) {
		this.imageWidth = imageWidth;
	}

	public int getImageHeight() {
		return imageHeight;
	}

	public void setImageHeight(int imageHeight) {
		this.imageHeight = imageHeight;
	}

	public int getImageOffsetX() {
		return imageOffsetX;
	}

	public void setImageOffsetX(int imageOffsetX) {
		this.imageOffsetX = imageOffsetX;
	}

	public int getImageOffsetY() {
		return imageOffsetY;
	}

	public void setImageOffsetY(int imageOffsetY) {
		this.imageOffsetY = imageOffsetY;
	}

	public String getCropStatus() {
		return cropStatus;
	}

	public void setCropStatus(String cropStatus) {
		this.cropStatus = cropStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getGrowStage() {
		return growStage;
	}

	public void setGrowStage(int growStage) {
		this.growStage = growStage;
	}

}
