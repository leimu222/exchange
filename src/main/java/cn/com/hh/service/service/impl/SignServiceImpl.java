package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.common.api.dao.SignMapper;
import com.common.api.model.Sign;
import com.common.api.service.ISignService;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:08
 * Description: [sign服务实现]
 */
@Service
public class SignServiceImpl implements ISignService {
	@Autowired
	private SignMapper signMapper;

	/**
	* 查询sign
	*
	* @param id signID
	* @return sign
	*/
	@Override
	public Sign selectSignById(Long id) {
		return signMapper.selectSignById(id);
	}

	/**
	* 查询sign列表
	*
	* @param sign sign
	* @return sign
	*/
	@Override
	public List<Sign> selectSignList(Sign sign) {
		return signMapper.selectSignList(sign);
	}

	/**
	* 新增sign
	*
	* @param sign sign
	* @return 结果
	*/
	@Override
	public int insertSign(Sign sign) {
		return signMapper.insertSign(sign);
	}

	/**
	* 修改sign
	*
	* @param sign sign
	* @return 结果
	*/
	@Override
	public int updateSign(Sign sign) {
		return signMapper.updateSign(sign);
	}

	/**
	* 批量删除sign
	*
	* @param ids 需要删除的signID
	* @return 结果
	*/
	@Override
	public int deleteSignByIds(Long[] ids) {
		return signMapper.deleteSignByIds(ids);
	}

	/**
	* 删除sign信息
	*
	* @param id signID
	* @return 结果
	*/
	@Override
	public int deleteSignById(Long id) {
		return signMapper.deleteSignById(id);
	}

}
