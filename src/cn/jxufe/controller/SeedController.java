package cn.jxufe.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jxufe.bean.EasyUIData;
import cn.jxufe.bean.EasyUIDataPageRequest;
import cn.jxufe.bean.Message;
import cn.jxufe.entity.Seed;
import cn.jxufe.service.SeedService;

/**
 * @ClassName: SeedController
 * @Description:TODO(种子管理，增删改查)
 * @author: Anvlia
 * @date: 2023年5月10日 上午9:50:03
 * @Copyright:
 */
@Controller
@RequestMapping("seed")
public class SeedController {
	@Autowired
	private SeedService seedService;

	/**
	 * @Title: grid @Description: 页面跳转到seed/grid.jsp
	 */
	@RequestMapping("set")
	public String grid(HttpSession session, Model model) {
		// 设置当前页面
		session.setAttribute("curPage", "seedSetPage");
		return "seed/set";
	}

	/**
	 * @Title: list @Description: 获取所有的种子信息
	 * @param: @return
	 * @return: List<Seed> 种子信息列表 
	 * @throws
	 */
	@RequestMapping("list")
	@ResponseBody
	public List<Seed> list() {
		return seedService.getList();
	}

	/**
	 * @Title: getList
	 * @Description: 以排序的形式获取所有种子的信息.
	 * @param: seedName种子名称 @param:easyUIDataPageRequest easyUI格式的数据，包含分页信息
	 * @param: model
	 * @param: @return
	 * @return: EasyUIData<Seed> easyUI形式的种子信息列表 @throws
	 */
	@RequestMapping("getList")
	@ResponseBody
	public EasyUIData<Seed> getList(@RequestParam(defaultValue = "doNothing") String seedName, EasyUIDataPageRequest easyUIDataPageRequest, Model model) {
		System.out.println("seedName = " + seedName);
		EasyUIData<Seed> easyUIData = seedService.getList(seedName, easyUIDataPageRequest);
		System.out.println("这里的值为 = " + easyUIData.getTotal());
		return easyUIData;
	}

	/**
	 * @Title: save @Description: 保存或修改种子信息. @param: @param seed @param: @return @return: Message @throws
	 */
	@RequestMapping("save")
	@ResponseBody
	public Message save(Seed seed) {
		System.out.println("Seed value = " + seed.getSeedId());
		return seedService.update(seed);
	}

	/**
	 * @Title: delete @Description: 删除种子信息. @param: @param seed @param: @return @return: Message @throws
	 */
	@RequestMapping("delete")
	@ResponseBody
	public Message delete(Seed seed) {
		System.out.println("正在删除种子数据...");
		return seedService.delete(seed);
	}

}
