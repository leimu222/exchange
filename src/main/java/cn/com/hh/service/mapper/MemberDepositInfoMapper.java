package com.common.api.mapper;

import com.common.api.model.MemberDepositInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberDepositInfoMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberDepositInfo selectMemberDepositInfoById(Long id);

	/**
	* 查询member列表
	*
	* @param memberDepositInfo member
	* @return member集合
	*/
	public List<MemberDepositInfo> selectMemberDepositInfoList(MemberDepositInfo memberDepositInfo);

	/**
	* 新增member
	*
	* @param memberDepositInfo member
	* @return 结果
	*/
	public int insertMemberDepositInfo(MemberDepositInfo memberDepositInfo);

	/**
	* 修改member
	*
	* @param memberDepositInfo member
	* @return 结果
	*/
	public int updateMemberDepositInfo(MemberDepositInfo memberDepositInfo);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberDepositInfoById(Long id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberDepositInfoByIds(Long[] ids);

}
