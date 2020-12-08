package com.common.api.mapper;

import com.common.api.model.Advertise;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [advertise服务实现]
 */
public interface AdvertiseMapper{

	/**
	* 查询advertise
	*
	* @param id advertiseID
	* @return advertise
	*/
	public Advertise selectAdvertiseById(Long id);

	/**
	* 查询advertise列表
	*
	* @param advertise advertise
	* @return advertise集合
	*/
	public List<Advertise> selectAdvertiseList(Advertise advertise);

	/**
	* 新增advertise
	*
	* @param advertise advertise
	* @return 结果
	*/
	public int insertAdvertise(Advertise advertise);

	/**
	* 修改advertise
	*
	* @param advertise advertise
	* @return 结果
	*/
	public int updateAdvertise(Advertise advertise);

	/**
	* 删除advertise
	*
	* @param id advertiseID
	* @return 结果
	*/
	public int deleteAdvertiseById(Long id);

	/**
	* 批量删除advertise
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteAdvertiseByIds(Long[] ids);

}
