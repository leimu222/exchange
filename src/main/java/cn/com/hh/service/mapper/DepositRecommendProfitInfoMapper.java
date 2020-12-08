package com.common.api.mapper;

import com.common.api.model.DepositRecommendProfitInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
  * @author  Gavin Lee
  * @version 1.0
  * @date 2020-12-08 18:16:04
  * Description: [deposit服务实现]
 */
public interface DepositRecommendProfitInfoMapper{

	/**
	* 查询deposit
	*
	* @param id depositID
	* @return deposit
	*/
	public DepositRecommendProfitInfo selectDepositRecommendProfitInfoById(Long id);

	/**
	* 查询deposit列表
	*
	* @param depositRecommendProfitInfo deposit
	* @return deposit集合
	*/
	public List<DepositRecommendProfitInfo> selectDepositRecommendProfitInfoList(DepositRecommendProfitInfo depositRecommendProfitInfo);

	/**
	* 新增deposit
	*
	* @param depositRecommendProfitInfo deposit
	* @return 结果
	*/
	public int insertDepositRecommendProfitInfo(DepositRecommendProfitInfo depositRecommendProfitInfo);

	/**
	* 修改deposit
	*
	* @param depositRecommendProfitInfo deposit
	* @return 结果
	*/
	public int updateDepositRecommendProfitInfo(DepositRecommendProfitInfo depositRecommendProfitInfo);

	/**
	* 删除deposit
	*
	* @param id depositID
	* @return 结果
	*/
	public int deleteDepositRecommendProfitInfoById(Long id);

	/**
	* 批量删除deposit
	*
	* @param ids 需要删除的数据ID
	* @return 结果
	*/
	public int deleteDepositRecommendProfitInfoByIds(Long[] ids);

}
