package com.zomato.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zomato.entity.ZomatoEntites;
import java.util.List;


@Repository
public interface ZomatoRepository extends CrudRepository<ZomatoEntites, Integer> {


}
