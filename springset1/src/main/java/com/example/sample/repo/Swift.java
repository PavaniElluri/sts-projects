package com.example.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.bean.SwiftBank;
@Repository
public interface Swift extends JpaRepository <SwiftBank,String>{

}
