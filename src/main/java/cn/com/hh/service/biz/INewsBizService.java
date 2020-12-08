package com.common.api.service;

import java.util.List;

import com.common.api.model.news;

/**
 * @author  Gavin Lee
 * @version 1.0 
 * Created on 2020-12-08 18:16:06
 * Description: [newsBiz服务]
 */
public interface INewsBizService {

	/**
	* 查询news
	*
	* @param id newsID
	* @return news
	*/
	public News selectNewsById(Long id);

	/**
	* 查询news列表
	*
	* @param news news
	* @return news集合
	*/
	public List<News> selectNewsList(News news);

	/**
	* 新增news
	*
	* @param news news
	* @return 结果
	*/
	public int insertNews(News news);

	/**
	* 修改news
	*
	* @param news news
	* @return 结果
	*/
	public int updateNews(News news);

	/**
	* 批量删除news
	*
	* @param ids 需要删除的newsID
	* @return 结果
	*/
	public int deleteNewsByIds(Long[] ids);

	/**
	* 删除news信息
	*
	* @param id newsID
	* @return 结果
	*/
	public int deleteNewsById(Long id);
	
}
