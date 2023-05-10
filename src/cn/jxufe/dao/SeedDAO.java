package cn.jxufe.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import cn.jxufe.entity.Seed;

@Repository
//@Mapper
public interface SeedDAO {
//	public interface SeedDAO extends JpaRepository<Seed, Long>{
	// 信息管理,增删改查
	// 插入数据
	Page<Seed> findBySeedNameContaining(String seedName, Pageable pageRequest);

	Seed findBySeedId(int seedId);

//	@Insert("Insert into t_seed(identifier,caption,roomnumber,saloonnumber,toiletnumber,area," + "orientation,year,floor,totalfloor,estate,price,decoration,property,equity,seller,status)"
//			+ " values(#{house.identifier},#{house.caption},#{house.roomnumber}," + "#{house.saloonnumber},#{house.toiletnumber},#{house.area},#{house.orientation}," + "#{house.year},#{house.floor},#{house.totalfloor},#{house.estate},"
//			+ "#{house.price},#{house.decoration},#{house.property},#{house.equity}," + "#{house.seller},#{house.status})")
//	public int insertSeed(@Param("seed") Seed seed);
//
//	// 更新数据
//	@Update("Update t_house set identifier=#{house.identifier},caption=#{house.caption},roomnumber=#{house.roomnumber}," + " saloonnumber=#{house.saloonnumber},toiletnumber=#{house.toiletnumber},area=#{house.area},"
//			+ "orientation=#{house.orientation},year=#{house.year},floor=#{house.floor},totalfloor=#{house.totalfloor}," + "estate=#{house.estate},price=#{house.price},decoration=#{house.decoration},property=#{house.property},"
//			+ "equity=#{house.equity},seller=#{house.seller},status=#{house.status}")
//	public int update(@Param("house") House house);
//
//	// 删除数据
//	@Delete("Delete from t_house where id = #{house.id} ")
//	public int delete(@Param("house") House house);
//
//	//
//	// 查询数据
//	@Select("Select * from t_house where id = #{house.id}")
//	public House getById(@Param("house") House house);
//
//	@Select("Select * from t_house where housecaption = #{house.housecaption}")
//	public House getByCaption(@Param("house") House house);
//
//	@Select("<script>select * from t_house <where> " + "   <if test=\"house.id != ''\">" + "       and id = #{house.id}" + "   </if>" + "   <if test=\"house.housecaption != ''\">" + "       and housecaption = #{house.housecaption}"
//			+ "   </if></where>" + "</script>")
//	public House getByIdOrCaption(@Param("house") House house);
//
//	// 状态
//	@Select("Select caption from t_housestatus where code = #{houseStatus.code}}")
//	public List<HouseStatus> findHouseStatus(@Param("HouseStatus") HouseStatus houseStatus);

}
