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
 * Description: [poundage服务实现]
 */
@Service
public class PoundageConvertEthServiceImpl implements IPoundageConvertEthService {
	@Autowired
	private PoundageConvertEthMapper poundageConvertEthMapper;

	/**
	* 查询poundage
	*
	* @param id poundageID
	* @return poundage
	*/
	@Override
	public PoundageConvertEth selectPoundageConvertEthById(Long id) {
		return poundageConvertEthMapper.selectPoundageConvertEthById(id);
	}

	/**
	* 查询poundage列表
	*
	* @param poundageConvertEth poundage
	* @return poundage
	*/
	@Override
	public List<PoundageConvertEth> selectPoundageConvertEthList(PoundageConvertEth poundageConvertEth) {
		return poundageConvertEthMapper.selectPoundageConvertEthList(poundageConvertEth);
	}

	/**
	* 新增poundage
	*
	* @param poundageConvertEth poundage
	* @return 结果
	*/
	@Override
	public int insertPoundageConvertEth(PoundageConvertEth poundageConvertEth) {
		return poundageConvertEthMapper.insertPoundageConvertEth(poundageConvertEth);
	}

	/**
	* 修改poundage
	*
	* @param poundageConvertEth poundage
	* @return 结果
	*/
	@Override
	public int updatePoundageConvertEth(PoundageConvertEth poundageConvertEth) {
		return poundageConvertEthMapper.updatePoundageConvertEth(poundageConvertEth);
	}

	/**
	* 批量删除poundage
	*
	* @param ids 需要删除的poundageID
	* @return 结果
	*/
	@Override
	public int deletePoundageConvertEthByIds(Long[] ids) {
		return poundageConvertEthMapper.deletePoundageConvertEthByIds(ids);
	}

	/**
	* 删除poundage信息
	*
	* @param id poundageID
	* @return 结果
	*/
	@Override
	public int deletePoundageConvertEthById(Long id) {
		return poundageConvertEthMapper.deletePoundageConvertEthById(id);
	}

}
