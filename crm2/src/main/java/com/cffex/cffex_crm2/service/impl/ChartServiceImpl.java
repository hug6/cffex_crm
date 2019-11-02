package com.cffex.cffex_crm2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cffex.cffex_crm2.service.ChartService;
import com.cffex.cffex_crm2.mapper.ChartMapper;

/**
 * 业绩报表服务层
 * @author 刘光岳 
 * @date 2019年7月2日
 */
public class ChartServiceImpl  implements ChartService{
	
	@Autowired
	private ChartMapper chartMapper; 
	public void setChartMapper(ChartMapper chartMapper) {
		this.chartMapper = chartMapper;
	}
	@Override
	public void addHouseRecoder() {
		 
		chartMapper.addHouseRecoder();
	}
	@Override
	public void ContractRecoder() { 
		chartMapper.ContractRecoder();
		
	}
	@Override
	public void addCustomerRecoder() { 
		chartMapper.addCustomerRecoder();
	}
	@Override
	public void seeHouseRecoder() { 
		chartMapper.seeHouseRecoder();
		
	}
	
}
