package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.NewsMapper;
import com.common.api.model.News;
import com.common.api.service.INewsService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:06
 * Description: [newsBiz服务实现]
 */
@Service
public class NewsBizServiceImpl extends CommonService implements INewsBizService {
	@Autowired
	private INewsService newsService;

	/**
	* 查询news
	*
	* @param id newsID
	* @return news
	*/
	@Override
	public News selectNewsById(Long id) {
		return newsService.selectNewsById(id);
	}

	/**
	* 查询news列表
	*
	* @param news news
	* @return news
	*/
	@Override
	public List<News> selectNewsList(News news) {
		return newsService.selectNewsList(news);
	}

	/**
	* 新增news
	*
	* @param news news
	* @return 结果
	*/
	@Override
	public int insertNews(News news) {
		return newsService.insertNews(news);
	}

	/**
	* 修改news
	*
	* @param news news
	* @return 结果
	*/
	@Override
	public int updateNews(News news) {
		return newsService.updateNews(news);
	}

	/**
	* 批量删除news
	*
	* @param ids 需要删除的newsID
	* @return 结果
	*/
	@Override
	public int deleteNewsByIds(Long[] ids) {
		return newsService.deleteNewsByIds(ids);
	}

	/**
	* 删除news信息
	*
	* @param id newsID
	* @return 结果
	*/
	@Override
	public int deleteNewsById(Long id) {
		return newsService.deleteNewsById(id);
	}

}
