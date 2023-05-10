package cn.jxufe.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jxufe.bean.EasyUIData;
import cn.jxufe.bean.EasyUIDataPageRequest;
import cn.jxufe.bean.Message;
import cn.jxufe.dao.SeedDAO;
import cn.jxufe.entity.Seed;
import cn.jxufe.service.SeedService;

/**
 * 带修改
 * 
 * @ClassName: SeedImp
 * @Description:TODO(描述这个类的作用)
 * @author: Anvlia
 * @date: 2023年5月10日 下午10:09:02
 * @Copyright:
 */
@Service
public class SeedImp implements SeedService {
	@Autowired
	SeedDAO seedDAO;

//	@Override
//	public EasyUIData<Seed> getList(String seedName, EasyUIDataPageRequest easyUIDataPageRequest) {
//		EasyUIData<Seed> result = new EasyUIData<Seed>();
//		List<Sort.Order> orders = new ArrayList<Sort.Order>();
//		if (easyUIDataPageRequest.getOrder().equals("asc")) {
//			orders.add(new Sort.Order(Direction.ASC, easyUIDataPageRequest.getSort()));
//		} else {
//			orders.add(new Sort.Order(Direction.DESC, easyUIDataPageRequest.getSort()));
//		}
//
//		Pageable pageRequest = new PageRequest(easyUIDataPageRequest.getPage() - 1, easyUIDataPageRequest.getRows(), new Sort(orders));
//		;
//
//		Page<Seed> curpage;
//		// seed_name为默认值"doNothing"时，按照pageRequest查找所有内容
//		if (seedName.equals("doNothing")) {
//			curpage = seedDAO.findAll(pageRequest);
//		} else {
//			curpage = seedDAO.findBySeedNameContaining(seedName, pageRequest);
//		}
//
//		result.setRows(curpage.getContent());
//		result.setTotal(curpage.getTotalElements());
//		return result;
//	}
//
//	@Override
//	public Message save(Seed seed) {
//		String result = "OK";
//		Message message = new Message();
//		try {
//			seedDAO.save(seed);
//			message.setCode(0);
//			message.setMsg("数据保存成功");
//		} catch (Exception e) {
//			e.printStackTrace();
//			message.setCode(1);
//			message.setMsg("数据保存错误");
//		}
//		return message;
//	}
//
//	@Override
//	public Message delete(Seed seed) {
//		String result = "OK";
//		Message message = new Message();
//		try {
//			seedDAO.delete(seed);
//			message.setCode(0);
//			message.setMsg("数据删除成功");
//		} catch (Exception e) {
//			e.printStackTrace();
//			message.setCode(1);
//			message.setMsg("数据删除出错");
//		}
//		return message;
//	}

//	@Override
//	public List<Seed> list() {
//
//		return seedDAO.findAll();
//	}

	@Override
	public List<Seed> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seed> getBySeedname(Seed seed) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message add(Seed seed, Seed seed2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message update(Seed seed) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EasyUIData<Seed> getList(String seedName, EasyUIDataPageRequest easyUIDataPageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message delete(Seed seed) {
		// TODO Auto-generated method stub
		return null;
	}

}
