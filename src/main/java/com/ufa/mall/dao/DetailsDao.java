package com.ufa.mall.dao;

import com.ufa.mall.entity.Details;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface DetailsDao extends CrudRepository<Details,Integer>{
    public Details findById(int id);
}
