package com.common.api.mapper;

import com.common.api.model.OptionWalletExplodeRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionWalletExplodeRecordMapper{

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionWalletExplodeRecord selectOptionWalletExplodeRecordById(Long id);

	/**
	* 查询option列表
	*
	* @param optionWalletExplodeRecord option
	* @return option集合
	*/
	public List<OptionWalletExplodeRecord> selectOptionWalletExplodeRecordList(OptionWalletExplodeRecord optionWalletExplodeRecord);

	/**
	* 新增option
	*
	* @param optionWalletExplodeRecord option
	* @return 结果
	*/
	public int insertOptionWalletExplodeRecord(OptionWalletExplodeRecord optionWalletExplodeRecord);

	/**
	* 修改option
	*
	* @param optionWalletExplodeRecord option
	* @return 结果
	*/
	public int updateOptionWalletExplodeRecord(OptionWalletExplodeRecord optionWalletExplodeRecord);

	/**
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionWalletExplodeRecordById(Long id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionWalletExplodeRecordByIds(Long[] ids);

}
