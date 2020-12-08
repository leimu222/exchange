package com.common.api.mapper;

import com.common.api.model.OptionWalletFrozenFlowRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionWalletFrozenFlowRecordMapper{

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionWalletFrozenFlowRecord selectOptionWalletFrozenFlowRecordById(Long id);

	/**
	* 查询option列表
	*
	* @param optionWalletFrozenFlowRecord option
	* @return option集合
	*/
	public List<OptionWalletFrozenFlowRecord> selectOptionWalletFrozenFlowRecordList(OptionWalletFrozenFlowRecord optionWalletFrozenFlowRecord);

	/**
	* 新增option
	*
	* @param optionWalletFrozenFlowRecord option
	* @return 结果
	*/
	public int insertOptionWalletFrozenFlowRecord(OptionWalletFrozenFlowRecord optionWalletFrozenFlowRecord);

	/**
	* 修改option
	*
	* @param optionWalletFrozenFlowRecord option
	* @return 结果
	*/
	public int updateOptionWalletFrozenFlowRecord(OptionWalletFrozenFlowRecord optionWalletFrozenFlowRecord);

	/**
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionWalletFrozenFlowRecordById(Long id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionWalletFrozenFlowRecordByIds(Long[] ids);

}
