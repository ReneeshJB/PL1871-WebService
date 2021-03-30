package com.faith.travel.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.travel.entity.Request;

@Repository
public interface IRequestRepo extends CrudRepository<Request, Integer> {

}
