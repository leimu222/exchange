package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.PoundageConvertEthMapper;
import com.common.api.model.PoundageConvertEth;
import com.common.api.service.IPoundageConvertEthService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [poundageBiz服务实现]
 */
@Service
public class PoundageConvertEthBizServiceImpl extends CommonService implements IPoundageConvertEthBizService {
	@Autowired
	private IPoundageConvertEthService poundageConvertEthService;

	/**
	* 查询poundage
	*
	* @param id poundageID
	* @return poundage
	*/
	@Override
	public PoundageConvertEth selectPoundageConvertEthById(Long id) {
		return poundageConvertEthService.selectPoundageConvertEthById(id);
	}

	/**
	* 查询poundage列表
	*
	* @param poundageConvertEth poundage
	* @return poundage
	*/
	@Override
	public List<PoundageConvertEth> selectPoundageConvertEthList(PoundageConvertEth poundageConvertEth) {
		return poundageConvertEthService.selectPoundageConvertEthList(poundageConvertEth);
	}

	/**
	* 新增poundage
	*
	* @param poundageConvertEth poundage
	* @return 结果
	*/
	@Override
	public int insertPoundageConvertEth(PoundageConvertEth poundageConvertEth) {
		return poundageConvertEthService.insertPoundageConvertEth(poundageConvertEth);
	}

	/**
	* 修改poundage
	*
	* @param poundageConvertEth poundage
	* @return 结果
	*/
	@Override
	public int updatePoundageConvertEth(PoundageConvertEth poundageConvertEth) {
		return poundageConvertEthService.updatePoundageConvertEth(poundageConvertEth);
	}

	/**
	* 批量删除poundage
	*
	* @param ids 需要删除的poundageID
	* @return 结果
	*/
	@Override
	public int deletePoundageConvertEthByIds(Long[] ids) {
		return poundageConvertEthService.deletePoundageConvertEthByIds(ids);
	}

	/**
	* 删除poundage信息
	*
	* @param id poundageID
	* @return 结果
	*/
	@Override
	public int deletePoundageConvertEthById(Long id) {
		return poundageConvertEthService.deletePoundageConvertEthById(id);
	}

}
