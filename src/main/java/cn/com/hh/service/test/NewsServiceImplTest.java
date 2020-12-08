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
 * @date 2020-12-08 18:16:06
 * Description: [news单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsServiceImplTest  {

	@Autowired
	private INewsService newsService;

	/**
	* 查询news
	*/
	@Test
	public void selectNewsById() {
		News news = newsService.selectNewsById(1);
		System.out.println(news.toString());
	}

	/**
	* 查询news列表
	*/
	@Test
	public void selectNewsList() {
		List<News> list = newsService.selectNewsList(new News());
		for(News model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增news
	*/
	@Test
	public void insertNews() {
		for (int i = 1;i < 30; i++) {
			News news = new News();
			newsService.insertNews(news);
		}
	}

	/**
	* 修改news
	*/
	@Test
	public void updateNews() {
		News news = new News();
		newsService.updateNews(news);
	}

	/**
	* 批量删除news
	*/
	@Test
	public void deleteNewsByIds() {
	}

	/**
	* 删除news信息
	*/
	@Test
	public void deleteNewsById() {
	}

}
