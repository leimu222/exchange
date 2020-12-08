package com.common.api.service;

import java.util.List;

import com.common.api.model.communityTraderProfitRecord;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:02
 * Description: [communityBiz服务]
 */
public interface ICommunityTraderProfitRecordBizService {

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	public CommunityTraderProfitRecord selectCommunityTraderProfitRecordById(Long id);

	/**
	* 查询community列表
	*
	* @param communityTraderProfitRecord community
	* @return community集合
	*/
	public List<CommunityTraderProfitRecord> selectCommunityTraderProfitRecordList(CommunityTraderProfitRecord communityTraderProfitRecord);

	/**
	* 新增community
	*
	* @param communityTraderProfitRecord community
	* @return 结果
	*/
	public int insertCommunityTraderProfitRecord(CommunityTraderProfitRecord communityTraderProfitRecord);

	/**
	* 修改community
	*
	* @param communityTraderProfitRecord community
	* @return 结果
	*/
	public int updateCommunityTraderProfitRecord(CommunityTraderProfitRecord communityTraderProfitRecord);

	/**
	* 批量删除community
	*
	* @param ids 需要删除的communityID
	* @return 结果
	*/
	public int deleteCommunityTraderProfitRecordByIds(Long[] ids);

	/**
	* 删除community信息
	*
	* @param id communityID
	* @return 结果
	*/
	public int deleteCommunityTraderProfitRecordById(Long id);
	
}
