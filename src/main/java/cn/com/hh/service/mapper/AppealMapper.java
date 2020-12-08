package com.common.api.mapper;

import com.common.api.model.Appeal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:01
  * Description: [appeal服务实现]
 */
public interface AppealMapper{

	/**
	* 查询appeal
	*
	* @param id appealID
	* @return appeal
	*/
	public Appeal selectAppealById(Long id);

	/**
	* 查询appeal列表
	*
	* @param appeal appeal
	* @return appeal集合
	*/
	public List<Appeal> selectAppealList(Appeal appeal);

	/**
	* 新增appeal
	*
	* @param appeal appeal
	* @return 结果
	*/
	public int insertAppeal(Appeal appeal);

	/**
	* 修改appeal
	*
	* @param appeal appeal
	* @return 结果
	*/
	public int updateAppeal(Appeal appeal);

	/**
	* 删除appeal
	*
	* @param id appealID
	* @return 结果
	*/
	public int deleteAppealById(Long id);

	/**
	* 批量删除appeal
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteAppealByIds(Long[] ids);

}
