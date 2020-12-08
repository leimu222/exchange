package com.common.api.mapper;

import com.common.api.model.OptionNode;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionNodeMapper{

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionNode selectOptionNodeById(Long id);

	/**
	* 查询option列表
	*
	* @param optionNode option
	* @return option集合
	*/
	public List<OptionNode> selectOptionNodeList(OptionNode optionNode);

	/**
	* 新增option
	*
	* @param optionNode option
	* @return 结果
	*/
	public int insertOptionNode(OptionNode optionNode);

	/**
	* 修改option
	*
	* @param optionNode option
	* @return 结果
	*/
	public int updateOptionNode(OptionNode optionNode);

	/**
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionNodeById(Long id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionNodeByIds(Long[] ids);

}
