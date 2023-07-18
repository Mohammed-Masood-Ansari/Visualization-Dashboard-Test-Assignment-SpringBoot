package com.blackcoffer.blackcofferdatavisualization.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@lombok.Data
public class Data {

	@Id
	private int id;
	private int end_year;
	private String citylng;
	private String citylat;
	private int intensity;
	private String sector;
	private String topic;
	private String insight;
	private String swot;
	private String url;
	private String region;
	private String start_year;
	private String impact;
	private String added;
	private String published;
	private String city;
	private String country;
	private int relevance;
	private String pestal;
	private String source;
	private String title;
	private int likelihood;
	
}
