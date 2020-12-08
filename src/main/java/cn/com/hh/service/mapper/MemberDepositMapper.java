package com.common.api.mapper;

import com.common.api.model.MemberDeposit;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberDepositMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberDeposit selectMemberDepositById(Long id);

	/**
	* 查询member列表
	*
	* @param memberDeposit member
	* @return member集合
	*/
	public List<MemberDeposit> selectMemberDepositList(MemberDeposit memberDeposit);

	/**
	* 新增member
	*
	* @param memberDeposit member
	* @return 结果
	*/
	public int insertMemberDeposit(MemberDeposit memberDeposit);

	/**
	* 修改member
	*
	* @param memberDeposit member
	* @return 结果
	*/
	public int updateMemberDeposit(MemberDeposit memberDeposit);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberDepositById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberDepositByIds(Long[] ids);

}
