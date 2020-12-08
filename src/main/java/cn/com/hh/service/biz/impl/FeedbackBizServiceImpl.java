package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.FeedbackMapper;
import com.common.api.model.Feedback;
import com.common.api.service.IFeedbackService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [feedbackBiz服务实现]
 */
@Service
public class FeedbackBizServiceImpl extends CommonService implements IFeedbackBizService {
	@Autowired
	private IFeedbackService feedbackService;

	/**
	* 查询feedback
	*
	* @param id feedbackID
	* @return feedback
	*/
	@Override
	public Feedback selectFeedbackById(Long id) {
		return feedbackService.selectFeedbackById(id);
	}

	/**
	* 查询feedback列表
	*
	* @param feedback feedback
	* @return feedback
	*/
	@Override
	public List<Feedback> selectFeedbackList(Feedback feedback) {
		return feedbackService.selectFeedbackList(feedback);
	}

	/**
	* 新增feedback
	*
	* @param feedback feedback
	* @return 结果
	*/
	@Override
	public int insertFeedback(Feedback feedback) {
		return feedbackService.insertFeedback(feedback);
	}

	/**
	* 修改feedback
	*
	* @param feedback feedback
	* @return 结果
	*/
	@Override
	public int updateFeedback(Feedback feedback) {
		return feedbackService.updateFeedback(feedback);
	}

	/**
	* 批量删除feedback
	*
	* @param ids 需要删除的feedbackID
	* @return 结果
	*/
	@Override
	public int deleteFeedbackByIds(Long[] ids) {
		return feedbackService.deleteFeedbackByIds(ids);
	}

	/**
	* 删除feedback信息
	*
	* @param id feedbackID
	* @return 结果
	*/
	@Override
	public int deleteFeedbackById(Long id) {
		return feedbackService.deleteFeedbackById(id);
	}

}
