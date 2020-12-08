package com.common.api.mapper;

import com.common.api.model.InitPlate;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [init服务实现]
 */
public interface InitPlateMapper{

	/**
	* 查询init
	*
	* @param id initID
	* @return init
	*/
	public InitPlate selectInitPlateById(Long id);

	/**
	* 查询init列表
	*
	* @param initPlate init
	* @return init集合
	*/
	public List<InitPlate> selectInitPlateList(InitPlate initPlate);

	/**
	* 新增init
	*
	* @param initPlate init
	* @return 结果
	*/
	public int insertInitPlate(InitPlate initPlate);

	/**
	* 修改init
	*
	* @param initPlate init
	* @return 结果
	*/
	public int updateInitPlate(InitPlate initPlate);

	/**
	* 删除init
	*
	* @param id initID
	* @return 结果
	*/
	public int deleteInitPlateById(Long id);

	/**
	* 批量删除init
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteInitPlateByIds(Long[] ids);

}
