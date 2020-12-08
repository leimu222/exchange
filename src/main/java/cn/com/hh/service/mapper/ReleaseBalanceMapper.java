package com.common.api.mapper;

import com.common.api.model.ReleaseBalance;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:08
  * Description: [release服务实现]
 */
public interface ReleaseBalanceMapper{

	/**
	* 查询release
	*
	* @param id releaseID
	* @return release
	*/
	public ReleaseBalance selectReleaseBalanceById(Long id);

	/**
	* 查询release列表
	*
	* @param releaseBalance release
	* @return release集合
	*/
	public List<ReleaseBalance> selectReleaseBalanceList(ReleaseBalance releaseBalance);

	/**
	* 新增release
	*
	* @param releaseBalance release
	* @return 结果
	*/
	public int insertReleaseBalance(ReleaseBalance releaseBalance);

	/**
	* 修改release
	*
	* @param releaseBalance release
	* @return 结果
	*/
	public int updateReleaseBalance(ReleaseBalance releaseBalance);

	/**
	* 删除release
	*
	* @param id releaseID
	* @return 结果
	*/
	public int deleteReleaseBalanceById(Long id);

	/**
	* 批量删除release
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteReleaseBalanceByIds(Long[] ids);

}
