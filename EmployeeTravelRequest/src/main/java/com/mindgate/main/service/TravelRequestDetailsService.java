package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.pojo.TravelRequestDetails;
import com.mindgate.main.repository.TravelAgentDetailsRepositoryInterface;
import com.mindgate.main.repository.TravelRequestDetailsRepositoryInterface;

@Service
public class TravelRequestDetailsService implements TravelRequestDeatilsServiceInterface {

	@Autowired
	TravelRequestDetailsRepositoryInterface travelRequestDetailsRepositoryInterface;

	@Override
	public TravelRequestDetails getTravelRequestDetailsById(int travelRequestId) {

		return travelRequestDetailsRepositoryInterface.getSingleRequestByRequestId(travelRequestId);
	}

	@Override
	public List<TravelRequestDetails> getAllRequestDetails() {
		return travelRequestDetailsRepositoryInterface.getAllRequest();
	}

}
