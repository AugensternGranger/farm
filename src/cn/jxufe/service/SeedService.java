package cn.jxufe.service;

import java.util.List;

import cn.jxufe.bean.EasyUIData;
import cn.jxufe.bean.EasyUIDataPageRequest;
import cn.jxufe.bean.Message;
import cn.jxufe.entity.Seed;

/**
 * @ClassName: SeedService
 * @Description:
 * @author: Anvlia
 * @date: 2023年5月10日 下午10:07:42
 * @Copyright:
 */
public interface SeedService {
	// EasyUIData<Seed> getList(String seedName, EasyUIDataPageRequest easyUIDataPageRequest);
	// Message save(Seed seed);
	// Message delete(Seed seed);
	List<Seed> getList();

	public EasyUIData<Seed> getList(String seedName, EasyUIDataPageRequest easyUIDataPageRequest);// 全部列表
	// public List<Seed> getList(Seed seed);// 全部列表

	public List<Seed> getBySeedname(Seed seed);// 通过种子名字查找

	public Message add(Seed seed, Seed seed2);// 增加

	public Message update(Seed seed);// 更新

	public Message delete(Seed seed);// 删除

	// public Seed getByALLSeedname(Seed seed);// 通过种子名字查找

	// public List<Seed> findSeed();
}
