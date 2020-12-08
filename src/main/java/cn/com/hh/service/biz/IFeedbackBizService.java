package com.common.api.service;

import java.util.List;

import com.common.api.model.feedback;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:05
 * Description: [feedbackBiz服务]
 */
public interface IFeedbackBizService {

	/**
	* 查询feedback
	*
	* @param id feedbackID
	* @return feedback
	*/
	public Feedback selectFeedbackById(Long id);

	/**
	* 查询feedback列表
	*
	* @param feedback feedback
	* @return feedback集合
	*/
	public List<Feedback> selectFeedbackList(Feedback feedback);

	/**
	* 新增feedback
	*
	* @param feedback feedback
	* @return 结果
	*/
	public int insertFeedback(Feedback feedback);

	/**
	* 修改feedback
	*
	* @param feedback feedback
	* @return 结果
	*/
	public int updateFeedback(Feedback feedback);

	/**
	* 批量删除feedback
	*
	* @param ids 需要删除的feedbackID
	* @return 结果
	*/
	public int deleteFeedbackByIds(Long[] ids);

	/**
	* 删除feedback信息
	*
	* @param id feedbackID
	* @return 结果
	*/
	public int deleteFeedbackById(Long id);
	
}
