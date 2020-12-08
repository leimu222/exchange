package com.common.api.mapper;

import com.common.api.model.MemberTrustGatewayInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [member服务实现]
 */
public interface MemberTrustGatewayInfoMapper{

	/**
	* 查询member
	*
	* @param coin memberID
	* @return member
	*/
	public MemberTrustGatewayInfo selectMemberTrustGatewayInfoById(String coin);

	/**
	* 查询member列表
	*
	* @param memberTrustGatewayInfo member
	* @return member集合
	*/
	public List<MemberTrustGatewayInfo> selectMemberTrustGatewayInfoList(MemberTrustGatewayInfo memberTrustGatewayInfo);

	/**
	* 新增member
	*
	* @param memberTrustGatewayInfo member
	* @return 结果
	*/
	public int insertMemberTrustGatewayInfo(MemberTrustGatewayInfo memberTrustGatewayInfo);

	/**
	* 修改member
	*
	* @param memberTrustGatewayInfo member
	* @return 结果
	*/
	public int updateMemberTrustGatewayInfo(MemberTrustGatewayInfo memberTrustGatewayInfo);

	/**
	* 删除member
	*
	* @param coin memberID
	* @return 结果
	*/
	public int deleteMemberTrustGatewayInfoById(String coin);

	/**
	* 批量删除member
	*
	* @param coins 需要删除的数据ID
	* @return 结果
	*/
	public int deleteMemberTrustGatewayInfoByIds(String[] coins);

}
