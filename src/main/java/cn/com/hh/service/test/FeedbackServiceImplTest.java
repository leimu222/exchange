package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:05
 * Description: [feedback单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FeedbackServiceImplTest  {

	@Autowired
	private IFeedbackService feedbackService;

	/**
	* 查询feedback
	*/
	@Test
	public void selectFeedbackById() {
		Feedback feedback = feedbackService.selectFeedbackById(1);
		System.out.println(feedback.toString());
	}

	/**
	* 查询feedback列表
	*/
	@Test
	public void selectFeedbackList() {
		List<Feedback> list = feedbackService.selectFeedbackList(new Feedback());
		for(Feedback model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增feedback
	*/
	@Test
	public void insertFeedback() {
		for (int i = 1;i < 30; i++) {
			Feedback feedback = new Feedback();
			feedbackService.insertFeedback(feedback);
		}
	}

	/**
	* 修改feedback
	*/
	@Test
	public void updateFeedback() {
		Feedback feedback = new Feedback();
		feedbackService.updateFeedback(feedback);
	}

	/**
	* 批量删除feedback
	*/
	@Test
	public void deleteFeedbackByIds() {
	}

	/**
	* 删除feedback信息
	*/
	@Test
	public void deleteFeedbackById() {
	}

}
