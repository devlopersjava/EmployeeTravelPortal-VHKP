package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.pojo.TravelAgentDetails;
import com.mindgate.main.service.TravelAgentDetailsServiceInterface;

@RestController
@RequestMapping("travelAgentDetails")
public class TravelAgentDetailsController {
	@Autowired
	private TravelAgentDetailsServiceInterface travelAgentDetailsService;

	@RequestMapping(value = "travelAgent/{id}", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public @ResponseBody TravelAgentDetails getTravelAgentDetailsById(@PathVariable("id") int agentId) {

		System.out.println("in TravelAgentDetails service Byid");
		return travelAgentDetailsService.getAgentDetailsById(agentId);

	}

	@RequestMapping(value = "travelAgent", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public @ResponseBody List<TravelAgentDetails> getProducts() {
		return travelAgentDetailsService.getAllAgentDetails();
	}

}
