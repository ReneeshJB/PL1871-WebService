package com.faith.travel.service;

import java.util.List;

import com.faith.travel.entity.Request;

public interface IRequestService {

	public List<Request> findAllRequests();

	public Request insertRequest(Request employee);

	public Request updateRequest(Request employee);
}
