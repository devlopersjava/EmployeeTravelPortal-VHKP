package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.pojo.TravelAgentDetails;

public interface TravelAgentDetailsRepositoryInterface 
{
//     public boolean addNewTravelAgent(TravelAgentDetails travelAgentDetails);
//     
//     public boolean updateTravelAgent(TravelAgentDetails travelAgentDetails);
//     
//     public boolean deleteTravelAgentByAgentId(int agentId);
     
     public TravelAgentDetails getAgentDetailsById(int agentId);
     
     public List<TravelAgentDetails> getAllAgentDetails();
}
