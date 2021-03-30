package com.faith.travel.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.travel.entity.Project;

@Repository
public interface IProjectRepo extends CrudRepository<Project, Integer> {

}
