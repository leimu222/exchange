package com.common.api.mapper;

import com.common.api.model.DepositProfitInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [deposit服务实现]
 */
public interface DepositProfitInfoMapper{

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	public DepositProfitInfo selectDepositProfitInfoById(Long id);

	/**
	* 查询deposit列表
	*
	* @param depositProfitInfo deposit
	* @return deposit集合
	*/
	public List<DepositProfitInfo> selectDepositProfitInfoList(DepositProfitInfo depositProfitInfo);

	/**
	* 新增deposit
	*
	* @param depositProfitInfo deposit
	* @return 结果
	*/
	public int insertDepositProfitInfo(DepositProfitInfo depositProfitInfo);

	/**
	* 修改deposit
	*
	* @param depositProfitInfo deposit
	* @return 结果
	*/
	public int updateDepositProfitInfo(DepositProfitInfo depositProfitInfo);

	/**
	* 删除deposit
	*
	* @param id depositID
	* @return 结果
	*/
	public int deleteDepositProfitInfoById(Long id);

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteDepositProfitInfoByIds(Long[] ids);

}
