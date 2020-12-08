package com.common.api.mapper;

import com.common.api.model.OptionWalletFlowRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionWalletFlowRecordMapper{

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionWalletFlowRecord selectOptionWalletFlowRecordById(Long id);

	/**
	* 查询option列表
	*
	* @param optionWalletFlowRecord option
	* @return option集合
	*/
	public List<OptionWalletFlowRecord> selectOptionWalletFlowRecordList(OptionWalletFlowRecord optionWalletFlowRecord);

	/**
	* 新增option
	*
	* @param optionWalletFlowRecord option
	* @return 结果
	*/
	public int insertOptionWalletFlowRecord(OptionWalletFlowRecord optionWalletFlowRecord);

	/**
	* 修改option
	*
	* @param optionWalletFlowRecord option
	* @return 结果
	*/
	public int updateOptionWalletFlowRecord(OptionWalletFlowRecord optionWalletFlowRecord);

	/**
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionWalletFlowRecordById(Long id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionWalletFlowRecordByIds(Long[] ids);

}
