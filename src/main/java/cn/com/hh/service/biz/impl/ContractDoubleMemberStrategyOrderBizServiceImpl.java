package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.ContractDoubleMemberStrategyOrderMapper;
import com.common.api.model.ContractDoubleMemberStrategyOrder;
import com.common.api.service.IContractDoubleMemberStrategyOrderService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:03
 * Description: [contractBiz服务实现]
 */
@Service
public class ContractDoubleMemberStrategyOrderBizServiceImpl extends CommonService implements IContractDoubleMemberStrategyOrderBizService {
	@Autowired
	private IContractDoubleMemberStrategyOrderService contractDoubleMemberStrategyOrderService;

	/**
	* 查询contract
	*
	* @param id contractID
	* @return contract
	*/
	@Override
	public ContractDoubleMemberStrategyOrder selectContractDoubleMemberStrategyOrderById(Long id) {
		return contractDoubleMemberStrategyOrderService.selectContractDoubleMemberStrategyOrderById(id);
	}

	/**
	* 查询contract列表
	*
	* @param contractDoubleMemberStrategyOrder contract
	* @return contract
	*/
	@Override
	public List<ContractDoubleMemberStrategyOrder> selectContractDoubleMemberStrategyOrderList(ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder) {
		return contractDoubleMemberStrategyOrderService.selectContractDoubleMemberStrategyOrderList(contractDoubleMemberStrategyOrder);
	}

	/**
	* 新增contract
	*
	* @param contractDoubleMemberStrategyOrder contract
	* @return 结果
	*/
	@Override
	public int insertContractDoubleMemberStrategyOrder(ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder) {
		return contractDoubleMemberStrategyOrderService.insertContractDoubleMemberStrategyOrder(contractDoubleMemberStrategyOrder);
	}

	/**
	* 修改contract
	*
	* @param contractDoubleMemberStrategyOrder contract
	* @return 结果
	*/
	@Override
	public int updateContractDoubleMemberStrategyOrder(ContractDoubleMemberStrategyOrder contractDoubleMemberStrategyOrder) {
		return contractDoubleMemberStrategyOrderService.updateContractDoubleMemberStrategyOrder(contractDoubleMemberStrategyOrder);
	}

	/**
	* 批量删除contract
	*
	* @param ids 需要删除的contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleMemberStrategyOrderByIds(Long[] ids) {
		return contractDoubleMemberStrategyOrderService.deleteContractDoubleMemberStrategyOrderByIds(ids);
	}

	/**
	* 删除contract信息
	*
	* @param id contractID
	* @return 结果
	*/
	@Override
	public int deleteContractDoubleMemberStrategyOrderById(Long id) {
		return contractDoubleMemberStrategyOrderService.deleteContractDoubleMemberStrategyOrderById(id);
	}

}
