package com.common.api.mapper;

import com.common.api.model.DataDictionary;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [data服务实现]
 */
public interface DataDictionaryMapper{

	/**
	* 查询data
	*
	* @param id dataID
	* @return data
	*/
	public DataDictionary selectDataDictionaryById(Long id);

	/**
	* 查询data列表
	*
	* @param dataDictionary data
	* @return data集合
	*/
	public List<DataDictionary> selectDataDictionaryList(DataDictionary dataDictionary);

	/**
	* 新增data
	*
	* @param dataDictionary data
	* @return 结果
	*/
	public int insertDataDictionary(DataDictionary dataDictionary);

	/**
	* 修改data
	*
	* @param dataDictionary data
	* @return 结果
	*/
	public int updateDataDictionary(DataDictionary dataDictionary);

	/**
	* 删除data
	*
	* @param id dataID
	* @return 结果
	*/
	public int deleteDataDictionaryById(Long id);

	/**
	* 批量删除data
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteDataDictionaryByIds(Long[] ids);

}
