package com.common.api.mapper;

import com.common.api.model.OptionCoinNode;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [option服务实现]
 */
public interface OptionCoinNodeMapper{

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionCoinNode selectOptionCoinNodeById(Integer id);

	/**
	* 查询option列表
	*
	* @param optionCoinNode option
	* @return option集合
	*/
	public List<OptionCoinNode> selectOptionCoinNodeList(OptionCoinNode optionCoinNode);

	/**
	* 新增option
	*
	* @param optionCoinNode option
	* @return 结果
	*/
	public int insertOptionCoinNode(OptionCoinNode optionCoinNode);

	/**
	* 修改option
	*
	* @param optionCoinNode option
	* @return 结果
	*/
	public int updateOptionCoinNode(OptionCoinNode optionCoinNode);

	/**
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionCoinNodeById(Integer id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionCoinNodeByIds(Integer[] ids);

}
