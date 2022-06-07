package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.pojo.TravelRequestDetails;
import com.mindgate.main.rowmapper.TravelRequestDetailsRowMapper;

@Repository
public class TravelRequestDetailsRepository implements TravelRequestDetailsRepositoryInterface{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private TravelRequestDetailsRowMapper travelRequestDetailsRowMapper;

	private int result;
	
	private static final String GET_TRAVEL_REQUEST_DETAILS_BY_ID = "SELECT * FROM TRAVEL_REQUEST WHERE TRAVEL_REQUEST_ID=?";
	private static final String GET_ALL_TRAVEL_REQUEST_DETAILS = "SELECT * FROM TRAVEL_REQUEST";
	
	@Override
	public TravelRequestDetails getSingleRequestByRequestId(int travelRequestId) {
		TravelRequestDetails travelRequestDetails = jdbcTemplate.queryForObject(GET_TRAVEL_REQUEST_DETAILS_BY_ID, travelRequestDetailsRowMapper,
				new Object[] { travelRequestId });
		return travelRequestDetails;
	}

	@Override
	public List<TravelRequestDetails> getAllRequest() {
		List<TravelRequestDetails> requestDetails = jdbcTemplate.query(GET_ALL_TRAVEL_REQUEST_DETAILS, travelRequestDetailsRowMapper) ;
		return requestDetails;
	}
	
//	public static final class TravelRequestDetailsRowMapper implements  RowMapper<TravelRequestDetails>{
//		
//		@Autowired
//		private DocumentDetailRepository detailRepository;
//		
//		@Autowired
//		private EmployeeDetailsRepository employeeDetailsRepository;
//		
//		@Override
//		public TravelRequestDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
//			int travelRequestId = rs.getInt("TRAVEL_REQUEST_ID");
//			String travelPurpose = rs.getString("TRAVEL_PURPOSE"); 
//			Date startDate = rs.getDate("TRAVEL_START_DATE");
//			LocalDate newStartDate = startDate.toLocalDate();
//			Date endDate = rs.getDate("TRAVEL_END_DATE");
//			LocalDate newEndDate = endDate.toLocalDate();
//			String managerStatus = rs.getString("MANAGER_STATUS");
//			String agentStatus = rs.getString("AGENT_STATUS");
//			String directorStatus = rs.getString("DIRECTOR_STATUS");
//			String destinationFrom = rs.getString("DESTINATION_FROM");
//			String destinationTo = rs.getString("DESTINATION_TO");
//			int documentId = rs.getInt("DOCUMENT_ID");
//			int employeeId = rs.getInt("EMPLOYEE_ID");
//			DocumentDetails documentDetails = detailRepository.getDocumentDetailsById(documentId);
//			EmployeeDetails detailsRepository = employeeDetailsRepository.getEmployeeByEmployeeId(employeeId);
//			
//			TravelRequestDetails travelRequestDetails = new TravelRequestDetails();
//			travelRequestDetails.setTravelRequestId(travelRequestId);
//			travelRequestDetails.setTravelPurpose(travelPurpose);
//			travelRequestDetails.setStartDate(newStartDate);
//			travelRequestDetails.setEndDate(newEndDate);
//			travelRequestDetails.setManagerStatus(managerStatus);
//			travelRequestDetails.setAgentStatus(agentStatus);
//			travelRequestDetails.setDirectorStatus(directorStatus);
//			travelRequestDetails.setDestinationFrom(destinationFrom);
//			travelRequestDetails.setDestinationTo(destinationTo);
//			travelRequestDetails.setDocumentDetails(documentDetails);
//			travelRequestDetails.setEmployeeDetails(detailsRepository);
//			return travelRequestDetails;
//		}
//		
//	}


}
