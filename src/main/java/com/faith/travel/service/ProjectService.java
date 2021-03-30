package com.faith.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.travel.entity.Project;
import com.faith.travel.repo.IProjectRepo;

@Service
public class ProjectService implements IProjectService {

	@Autowired
	private IProjectRepo projectRepo;

	@Override
	public List<Project> findAll() {
		return (List<Project>) projectRepo.findAll();
	}

}
