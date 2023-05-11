package cn.jxufe.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.jxufe.entity.Seed;

public interface SeedDAO {
	Page<Seed> findBySeedNameContaining(String seedName, Pageable pageRequest);

	Seed findBySeedId(int seedId);

}
