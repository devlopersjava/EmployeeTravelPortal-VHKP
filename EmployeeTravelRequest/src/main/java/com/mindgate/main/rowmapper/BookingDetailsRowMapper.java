package com.mindgate.main.rowmapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mindgate.main.pojo.BookingDetails;
import com.mindgate.main.pojo.TravelAgentDetails;
import com.mindgate.main.pojo.TravelRequestDetails;
import com.mindgate.main.repository.TravelAgentDetailsRepository;
import com.mindgate.main.repository.TravelRequestDetailsRepository;
@Component
public final class BookingDetailsRowMapper implements RowMapper<BookingDetails> {
		
		@Autowired
		private TravelRequestDetailsRepository requestDetailsRepository;
		@Autowired
		private TravelAgentDetailsRepository travelAgentDetailsRepository;
		@Override
		public BookingDetails mapRow(ResultSet resultSet, int arg1) throws SQLException {
			int bookingId =resultSet.getInt("BOOKING_ID");
			int travelRequestId= resultSet.getInt("Travel_request_id");
			int agentId = resultSet.getInt("agent_id");
			Date travellingStartDate = resultSet.getDate("TRAVELLING_START_DATE");
			LocalDate newTravellingStartDate = travellingStartDate.toLocalDate();
			Date travellingEndDate = resultSet.getDate("TRAVELLING_END_DATE");
			LocalDate newTravellingEndDate = travellingEndDate.toLocalDate();
			
			TravelRequestDetails travelRequestDetails = requestDetailsRepository.getSingleRequestByRequestId(travelRequestId);
			TravelAgentDetails travelAgentDetails = travelAgentDetailsRepository.getAgentDetailsById(agentId);
			BookingDetails bookingDetails = new BookingDetails(bookingId, travelRequestDetails, travelAgentDetails, newTravellingStartDate, newTravellingEndDate, "GET_ALL_BOOKING_DETAILS", agentId);
					
			return bookingDetails;
		}
		}