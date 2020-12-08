package com.common.api.mapper;

import com.common.api.model.MemberAccountOperateRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public interface MemberAccountOperateRecordMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberAccountOperateRecord selectMemberAccountOperateRecordById(Long id);

	/**
	* 查询member列表
	*
	* @param memberAccountOperateRecord member
	* @return member集合
	*/
	public List<MemberAccountOperateRecord> selectMemberAccountOperateRecordList(MemberAccountOperateRecord memberAccountOperateRecord);

	/**
	* 新增member
	*
	* @param memberAccountOperateRecord member
	* @return 结果
	*/
	public int insertMemberAccountOperateRecord(MemberAccountOperateRecord memberAccountOperateRecord);

	/**
	* 修改member
	*
	* @param memberAccountOperateRecord member
	* @return 结果
	*/
	public int updateMemberAccountOperateRecord(MemberAccountOperateRecord memberAccountOperateRecord);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberAccountOperateRecordById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberAccountOperateRecordByIds(Long[] ids);

}
