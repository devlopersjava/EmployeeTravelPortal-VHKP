package com.mindgate.main.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.main.pojo.BookingDetails;
import com.mindgate.main.pojo.EmployeeDetails;
import com.mindgate.main.pojo.TravelAgentDetails;
import com.mindgate.main.pojo.TravelRequestDetails;
import com.mindgate.main.rowmapper.BookingDetailsRowMapper;

@Repository
public class BookingDetailsRepository implements BookingDetailsRepositoryInterface {
	
	@Autowired
	private BookingDetailsRowMapper bookingDetailsRowMapper;
	@Autowired
	JdbcTemplate jdbcTemplate;

	private int result;
//	private static final String INSERT_EMPLOYEE_DETAILS = "INSERT INTO EMPLOYEE_DETAILS(LOGIN_ID,EMPLOYEE_NAME,ADDRESS"
//			+ ",DATE_OF_BIRTH,CONTACT_NO,EMAIL,DATE_OF_JOINING,"
//			+ "MANAGER_NO,DESIGNATION) VALUES (?,?,?,?,?,?,?,?,?)";
//	private static final String UPDATE_EMPLOYEE_DETAILS_BY_EMPLOYEE_ID = "UPDATE EMPLOYEE_DETAILS SET LOGIN_ID=?,EMPLOYEE_NAME=?,ADDRESS=?"
//			+ ",DATE_OF_BIRTH=?,CONTACT_NO=?,EMAIL=?,DATE_OF_JOINING=?,MANAGER_NO=?,DESIGNATION=?  WHERE EMPLOYEE_ID=?)";
//	private static final String DELETE_EMPLOYEE_DETAILS_BY_ID = "DELETE FROM EMPLOYEE_DETAILS WHERE EMPLOYEE_ID=?";
	private static final String GET_BOOKING_DETAILS_BY_ID = "SELECT * FROM BOOKING_DETAILS WHERE BOOKING_ID=?";
	private static final String GET_ALL_BOOKING_DETAILS = "SELECT* FROM BOOKING_DETAILS";
//	@Override
//	public boolean addBookingDetails(BookingDetails bookingDetails) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean updateBookingDetails(BookingDetails bookingDetails) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean deleteBookingDetailsById(int bookingId) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public BookingDetails getBookingDetailsById(int bookingId) {
		
		return jdbcTemplate.queryForObject(GET_BOOKING_DETAILS_BY_ID, bookingDetailsRowMapper, new Object[] {bookingId});
		
	}

	@Override
	public List<BookingDetails> getAllBookingDetails() {

		return jdbcTemplate.query(GET_ALL_BOOKING_DETAILS, bookingDetailsRowMapper);
	}

//	public static final class BookingDetailsRowMapper implements RowMapper<BookingDetails> {
//		
//		@Autowired
//		private TravelRequestDetailsRepository requestDetailsRepository;
//		@Autowired
//		private TravelAgentDetailsRepository travelAgentDetailsRepository;
//		@Override
//		public BookingDetails mapRow(ResultSet resultSet, int arg1) throws SQLException {
//			int bookingId =resultSet.getInt("BOOKING_ID");
//			int travelRequestId= resultSet.getInt("Travel_request_id");
//			int agentId = resultSet.getInt("agent_id");
//			Date travellingStartDate = resultSet.getDate("TRAVELLING_START_DATE");
//			LocalDate newTravellingStartDate = travellingStartDate.toLocalDate();
//			Date travellingEndDate = resultSet.getDate("TRAVELLING_END_DATE");
//			LocalDate newTravellingEndDate = travellingEndDate.toLocalDate();
//			
//			TravelRequestDetails travelRequestDetails = requestDetailsRepository.getSingleRequestByRequestId(travelRequestId);
//			TravelAgentDetails travelAgentDetails = travelAgentDetailsRepository.getAgentDetailsById(agentId);
//			BookingDetails bookingDetails = new BookingDetails(bookingId, travelRequestDetails, travelAgentDetails, newTravellingStartDate, newTravellingEndDate, GET_ALL_BOOKING_DETAILS, agentId);
//					
//			return bookingDetails;
//		}
//		}
	

}
