package com.common.api.mapper;

import com.common.api.model.OptionMemberStatusRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:07
  * Description: [option服务实现]
 */
public interface OptionMemberStatusRecordMapper{

	/**
	* 查询option
	*
	* @param id optionID
	* @return option
	*/
	public OptionMemberStatusRecord selectOptionMemberStatusRecordById(Long id);

	/**
	* 查询option列表
	*
	* @param optionMemberStatusRecord option
	* @return option集合
	*/
	public List<OptionMemberStatusRecord> selectOptionMemberStatusRecordList(OptionMemberStatusRecord optionMemberStatusRecord);

	/**
	* 新增option
	*
	* @param optionMemberStatusRecord option
	* @return 结果
	*/
	public int insertOptionMemberStatusRecord(OptionMemberStatusRecord optionMemberStatusRecord);

	/**
	* 修改option
	*
	* @param optionMemberStatusRecord option
	* @return 结果
	*/
	public int updateOptionMemberStatusRecord(OptionMemberStatusRecord optionMemberStatusRecord);

	/**
	* 删除option
	*
	* @param id optionID
	* @return 结果
	*/
	public int deleteOptionMemberStatusRecordById(Long id);

	/**
	* 批量删除option
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteOptionMemberStatusRecordByIds(Long[] ids);

}
