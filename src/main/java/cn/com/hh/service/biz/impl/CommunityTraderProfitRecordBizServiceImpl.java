package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.CommunityTraderProfitRecordMapper;
import com.common.api.model.CommunityTraderProfitRecord;
import com.common.api.service.ICommunityTraderProfitRecordService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:02
 * Description: [communityBiz服务实现]
 */
@Service
public class CommunityTraderProfitRecordBizServiceImpl extends CommonService implements ICommunityTraderProfitRecordBizService {
	@Autowired
	private ICommunityTraderProfitRecordService communityTraderProfitRecordService;

	/**
	* 查询community
	*
	* @param id communityID
	* @return community
	*/
	@Override
	public CommunityTraderProfitRecord selectCommunityTraderProfitRecordById(Long id) {
		return communityTraderProfitRecordService.selectCommunityTraderProfitRecordById(id);
	}

	/**
	* 查询community列表
	*
	* @param communityTraderProfitRecord community
	* @return community
	*/
	@Override
	public List<CommunityTraderProfitRecord> selectCommunityTraderProfitRecordList(CommunityTraderProfitRecord communityTraderProfitRecord) {
		return communityTraderProfitRecordService.selectCommunityTraderProfitRecordList(communityTraderProfitRecord);
	}

	/**
	* 新增community
	*
	* @param communityTraderProfitRecord community
	* @return 结果
	*/
	@Override
	public int insertCommunityTraderProfitRecord(CommunityTraderProfitRecord communityTraderProfitRecord) {
		return communityTraderProfitRecordService.insertCommunityTraderProfitRecord(communityTraderProfitRecord);
	}

	/**
	* 修改community
	*
	* @param communityTraderProfitRecord community
	* @return 结果
	*/
	@Override
	public int updateCommunityTraderProfitRecord(CommunityTraderProfitRecord communityTraderProfitRecord) {
		return communityTraderProfitRecordService.updateCommunityTraderProfitRecord(communityTraderProfitRecord);
	}

	/**
	* 批量删除community
	*
	* @param ids 需要删除的communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityTraderProfitRecordByIds(Long[] ids) {
		return communityTraderProfitRecordService.deleteCommunityTraderProfitRecordByIds(ids);
	}

	/**
	* 删除community信息
	*
	* @param id communityID
	* @return 结果
	*/
	@Override
	public int deleteCommunityTraderProfitRecordById(Long id) {
		return communityTraderProfitRecordService.deleteCommunityTraderProfitRecordById(id);
	}

}
