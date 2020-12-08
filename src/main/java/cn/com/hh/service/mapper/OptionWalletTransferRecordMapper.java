package com.common.api.mapper;

import com.common.api.model.OptionWalletTransferRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionWalletTransferRecordMapper{

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionWalletTransferRecord selectOptionWalletTransferRecordById(Long id);

	/**
	* 查询option列表
	*
	* @param optionWalletTransferRecord option
	* @return option集合
	*/
	public List<OptionWalletTransferRecord> selectOptionWalletTransferRecordList(OptionWalletTransferRecord optionWalletTransferRecord);

	/**
	* 新增option
	*
	* @param optionWalletTransferRecord option
	* @return 结果
	*/
	public int insertOptionWalletTransferRecord(OptionWalletTransferRecord optionWalletTransferRecord);

	/**
	* 修改option
	*
	* @param optionWalletTransferRecord option
	* @return 结果
	*/
	public int updateOptionWalletTransferRecord(OptionWalletTransferRecord optionWalletTransferRecord);

	/**
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionWalletTransferRecordById(Long id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionWalletTransferRecordByIds(Long[] ids);

}
