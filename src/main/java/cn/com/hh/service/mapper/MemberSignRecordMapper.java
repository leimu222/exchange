package com.common.api.mapper;

import com.common.api.model.MemberSignRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberSignRecordMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberSignRecord selectMemberSignRecordById(Long id);

	/**
	* 查询member列表
	*
	* @param memberSignRecord member
	* @return member集合
	*/
	public List<MemberSignRecord> selectMemberSignRecordList(MemberSignRecord memberSignRecord);

	/**
	* 新增member
	*
	* @param memberSignRecord member
	* @return 结果
	*/
	public int insertMemberSignRecord(MemberSignRecord memberSignRecord);

	/**
	* 修改member
	*
	* @param memberSignRecord member
	* @return 结果
	*/
	public int updateMemberSignRecord(MemberSignRecord memberSignRecord);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberSignRecordById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberSignRecordByIds(Long[] ids);

}
