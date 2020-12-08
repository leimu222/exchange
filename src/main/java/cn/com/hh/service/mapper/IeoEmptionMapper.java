package com.common.api.mapper;

import com.common.api.model.IeoEmption;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [ieo服务实现]
 */
public interface IeoEmptionMapper{

	/**
	* 查询ieo
	*
	* @param id ieoID
	* @return ieo
	*/
	public IeoEmption selectIeoEmptionById(Long id);

	/**
	* 查询ieo列表
	*
	* @param ieoEmption ieo
	* @return ieo集合
	*/
	public List<IeoEmption> selectIeoEmptionList(IeoEmption ieoEmption);

	/**
	* 新增ieo
	*
	* @param ieoEmption ieo
	* @return 结果
	*/
	public int insertIeoEmption(IeoEmption ieoEmption);

	/**
	* 修改ieo
	*
	* @param ieoEmption ieo
	* @return 结果
	*/
	public int updateIeoEmption(IeoEmption ieoEmption);

	/**
	* 删除ieo
	*
	* @param id ieoID
	* @return 结果
	*/
	public int deleteIeoEmptionById(Long id);

	/**
	* 批量删除ieo
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteIeoEmptionByIds(Long[] ids);

}
