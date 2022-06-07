package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.pojo.TravelAgentDetails;

public interface TravelAgentDetailsServiceInterface
{
//	public boolean addNewTravelAgent(TravelAgentDetails travelAgentDetails);
//    
//    public boolean updateTravelAgent(TravelAgentDetails travelAgentDetails);
//    
//    public boolean deleteTravelAgentByAgentId(int agentId);
    
    public TravelAgentDetails getAgentDetailsById(int agentId);
    
    public List<TravelAgentDetails> getAllAgentDetails();
}
