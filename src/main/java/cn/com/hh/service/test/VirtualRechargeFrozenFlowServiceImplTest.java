package com.common.api.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.annotation.Resource;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/** 
 * @author  Gavin Lee
 * @version 1.0
 * @date 2020-12-08 18:16:09
 * Description: [virtual单元测试类]
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class VirtualRechargeFrozenFlowServiceImplTest  {

	@Autowired
	private IVirtualRechargeFrozenFlowService virtualRechargeFrozenFlowService;

	/**
	* 查询virtual
	*/
	@Test
	public void selectVirtualRechargeFrozenFlowById() {
		VirtualRechargeFrozenFlow virtualRechargeFrozenFlow = virtualRechargeFrozenFlowService.selectVirtualRechargeFrozenFlowById(1);
		System.out.println(virtualRechargeFrozenFlow.toString());
	}

	/**
	* 查询virtual列表
	*/
	@Test
	public void selectVirtualRechargeFrozenFlowList() {
		List<VirtualRechargeFrozenFlow> list = virtualRechargeFrozenFlowService.selectVirtualRechargeFrozenFlowList(new VirtualRechargeFrozenFlow());
		for(VirtualRechargeFrozenFlow model: list){
			System.out.println(model.toString());
		}
	}

	/**
	* 新增virtual
	*/
	@Test
	public void insertVirtualRechargeFrozenFlow() {
		for (int i = 1;i < 30; i++) {
			VirtualRechargeFrozenFlow virtualRechargeFrozenFlow = new VirtualRechargeFrozenFlow();
			virtualRechargeFrozenFlowService.insertVirtualRechargeFrozenFlow(virtualRechargeFrozenFlow);
		}
	}

	/**
	* 修改virtual
	*/
	@Test
	public void updateVirtualRechargeFrozenFlow() {
		VirtualRechargeFrozenFlow virtualRechargeFrozenFlow = new VirtualRechargeFrozenFlow();
		virtualRechargeFrozenFlowService.updateVirtualRechargeFrozenFlow(virtualRechargeFrozenFlow);
	}

	/**
	* 批量删除virtual
	*/
	@Test
	public void deleteVirtualRechargeFrozenFlowByIds() {
	}

	/**
	* 删除virtual信息
	*/
	@Test
	public void deleteVirtualRechargeFrozenFlowById() {
	}

}
