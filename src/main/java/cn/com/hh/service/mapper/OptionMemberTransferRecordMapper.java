package com.common.api.mapper;

import com.common.api.model.OptionMemberTransferRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionMemberTransferRecordMapper{

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionMemberTransferRecord selectOptionMemberTransferRecordById(Long id);

	/**
	* 查询option列表
	*
	* @param optionMemberTransferRecord option
	* @return option集合
	*/
	public List<OptionMemberTransferRecord> selectOptionMemberTransferRecordList(OptionMemberTransferRecord optionMemberTransferRecord);

	/**
	* 新增option
	*
	* @param optionMemberTransferRecord option
	* @return 结果
	*/
	public int insertOptionMemberTransferRecord(OptionMemberTransferRecord optionMemberTransferRecord);

	/**
	* 修改option
	*
	* @param optionMemberTransferRecord option
	* @return 结果
	*/
	public int updateOptionMemberTransferRecord(OptionMemberTransferRecord optionMemberTransferRecord);

	/**
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionMemberTransferRecordById(Long id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionMemberTransferRecordByIds(Long[] ids);

}
