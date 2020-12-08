package com.common.api.mapper;

import com.common.api.model.News;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:06
  * Description: [news服务实现]
 */
public interface NewsMapper{

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
	* 删除news
	*
	* @param id newsID
	* @return 结果
	*/
	public int deleteNewsById(Long id);

	/**
	* 批量删除news
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteNewsByIds(Long[] ids);

}
