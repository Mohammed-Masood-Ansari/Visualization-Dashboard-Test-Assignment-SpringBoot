package com.blackcoffer.blackcofferdatavisualization.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blackcoffer.blackcofferdatavisualization.dto.Data;
import com.blackcoffer.blackcofferdatavisualization.repository.DataRepository;

@Repository
public class DataDao {

	@Autowired
	private DataRepository dataRepository;
	
	public List<Data> getAllData() {
		
		return dataRepository.findAll();
	}
	
	public List<Data> getDataByUsingSector(String sector) {
		
		List<Data> datas1 = new ArrayList<Data>();
		
		for (Data datas : getAllData()) {
			if(datas.getSector().equalsIgnoreCase(sector)) {
				datas1.add(datas);
			}
		}
		return datas1;
	}
}
