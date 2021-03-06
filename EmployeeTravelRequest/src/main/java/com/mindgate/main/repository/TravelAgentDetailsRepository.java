package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.main.pojo.LoginDetails;
import com.mindgate.main.pojo.TravelAgentDetails;
import com.mindgate.main.rowmapper.TravelAgentDetailsRowMapper;

@Repository
public class TravelAgentDetailsRepository implements TravelAgentDetailsRepositoryInterface {
	
	@Autowired
	private TravelAgentDetailsRowMapper agentDetailsRowMapper;
	@Autowired
	JdbcTemplate jdbcTemplate;
	private int result;

	private static final String GET_TRAVEL_AGENT_DETAILS_BY_ID = "SELECT * FROM TRAVEL_AGENT_DETAILS WHERE AGENT_ID=?";
	private static final String GET_ALL_TRAVEL_AGENT_DETAILS = "SELECT* FROM TRAVEL_AGENT_DETAILS";

//	@Override
//	public boolean addNewTravelAgent(TravelAgentDetails travelAgentDetails) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean updateTravelAgent(TravelAgentDetails travelAgentDetails) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean deleteTravelAgentByAgentId(int agentId) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public TravelAgentDetails getAgentDetailsById(int agentId) {

		TravelAgentDetails tarvelAgentDetails = jdbcTemplate.queryForObject(GET_TRAVEL_AGENT_DETAILS_BY_ID,
				agentDetailsRowMapper, new Object[] { agentId });
		return tarvelAgentDetails;
	}

	@Override
	public List<TravelAgentDetails> getAllAgentDetails() {
		List<TravelAgentDetails> listOfAgent = jdbcTemplate.query(GET_ALL_TRAVEL_AGENT_DETAILS,
				agentDetailsRowMapper);
		return listOfAgent;

	}

//	public static final class TravelAgentDetailsRowMapper implements RowMapper<TravelAgentDetails> {
//
//		@Autowired
//		private LoginDetailsRepository loginDetailsRepository;
//		@Override
//		public TravelAgentDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//			int agentId =rs.getInt("AGENT_ID");
//			int loginId= rs.getInt("LOGIN_ID");
//			LoginDetails loginDetails = loginDetailsRepository.getLoginDetailsById(loginId);
//			String agentName=rs.getString("AGENT_NAME");
//			
//			TravelAgentDetails travelAgentDetails=new TravelAgentDetails();
//			
//			travelAgentDetails.setAgentId(agentId);
//			travelAgentDetails.setLoginDetails(loginDetails);
//			travelAgentDetails.setAgentName(agentName);
//			return travelAgentDetails;
//		}
//
//	}

	

}
