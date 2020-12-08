package com.common.api.mapper;

import com.common.api.model.MemberBuyCoinInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:05
  * Description: [member服务实现]
 */
public interface MemberBuyCoinInfoMapper{

	/**
	* 查询member
	*
	* @param id memberID
	* @return member
	*/
	public MemberBuyCoinInfo selectMemberBuyCoinInfoById(Integer id);

	/**
	* 查询member列表
	*
	* @param memberBuyCoinInfo member
	* @return member集合
	*/
	public List<MemberBuyCoinInfo> selectMemberBuyCoinInfoList(MemberBuyCoinInfo memberBuyCoinInfo);

	/**
	* 新增member
	*
	* @param memberBuyCoinInfo member
	* @return 结果
	*/
	public int insertMemberBuyCoinInfo(MemberBuyCoinInfo memberBuyCoinInfo);

	/**
	* 修改member
	*
	* @param memberBuyCoinInfo member
	* @return 结果
	*/
	public int updateMemberBuyCoinInfo(MemberBuyCoinInfo memberBuyCoinInfo);

	/**
	* 删除member
	*
	* @param id memberID
	* @return 结果
	*/
	public int deleteMemberBuyCoinInfoById(Integer id);

	/**
	* 批量删除member
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberBuyCoinInfoByIds(Integer[] ids);

}
