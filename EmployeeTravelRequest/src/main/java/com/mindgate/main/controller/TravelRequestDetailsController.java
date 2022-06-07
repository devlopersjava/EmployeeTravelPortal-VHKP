package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.pojo.TravelRequestDetails;
import com.mindgate.main.service.TravelRequestDeatilsServiceInterface;

@RestController
@RequestMapping("travelRequestDetails")

public class TravelRequestDetailsController {
	@Autowired
	private TravelRequestDeatilsServiceInterface travelRequestDeatilsService;

	@RequestMapping(value = "travelRequest/{id}", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public @ResponseBody TravelRequestDetails getTravelRequestDetailsById(@PathVariable("id") int travelRequestId) {

		System.out.println("in Travel Request Service Byid");
		return travelRequestDeatilsService.getTravelRequestDetailsById(travelRequestId);

	}

	@RequestMapping(value = "travelRequest", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public @ResponseBody List<TravelRequestDetails> getProducts() {
		return travelRequestDeatilsService.getAllRequestDetails();
	}

}
