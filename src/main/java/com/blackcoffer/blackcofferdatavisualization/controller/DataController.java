package com.blackcoffer.blackcofferdatavisualization.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.blackcoffer.blackcofferdatavisualization.dao.DataDao;
import com.blackcoffer.blackcofferdatavisualization.dto.Data;

@RestController
public class DataController {

	@Autowired
	private DataDao dataDao;

	@GetMapping("/getAll")
	public List<Data> getAllData() {

		return dataDao.getAllData();
	}
	
	@GetMapping(value = "getAllDataByUsingSector/{sector}")
	public List<Data> getDataByUsingSector(@PathVariable String sector) {
		return dataDao.getDataByUsingSector(sector);
	}
	
}
