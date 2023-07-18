package com.blackcoffer.blackcofferdatavisualization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blackcoffer.blackcofferdatavisualization.dto.Data;

public interface DataRepository extends JpaRepository<Data, Integer> {

}
