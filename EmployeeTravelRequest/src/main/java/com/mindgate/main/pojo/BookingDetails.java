package com.mindgate.main.pojo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class BookingDetails {
	private int bookingId;
	@Autowired
	private TravelRequestDetails travelRequest;
	@Autowired
	private TravelAgentDetails agentDetails;
	private LocalDate travellingStartDate;
	private LocalDate travellingEndDate;
	private String staysIn;
	private double costEstimation;

	public BookingDetails() {
	}

	public BookingDetails(int bookingId, TravelRequestDetails travelRequest, TravelAgentDetails agentDetails,
			LocalDate travellingStartDate, LocalDate travellingEndDate, String staysIn, double costEstimation) {
		super();
		this.bookingId = bookingId;
		this.travelRequest = travelRequest;
		this.agentDetails = agentDetails;
		this.travellingStartDate = travellingStartDate;
		this.travellingEndDate = travellingEndDate;
		this.staysIn = staysIn;
		this.costEstimation = costEstimation;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public TravelRequestDetails getTravelRequest() {
		return travelRequest;
	}

	public void setTravelRequest(TravelRequestDetails travelRequest) {
		this.travelRequest = travelRequest;
	}

	public TravelAgentDetails getAgentDetails() {
		return agentDetails;
	}

	public void setAgentDetails(TravelAgentDetails agentDetails) {
		this.agentDetails = agentDetails;
	}

	public LocalDate getTravellingStartDate() {
		return travellingStartDate;
	}

	public void setTravellingStartDate(LocalDate travellingStartDate) {
		this.travellingStartDate = travellingStartDate;
	}

	public LocalDate getTravellingEndDate() {
		return travellingEndDate;
	}

	public void setTravellingEndDate(LocalDate travellingEndDate) {
		this.travellingEndDate = travellingEndDate;
	}

	public String getStaysIn() {
		return staysIn;
	}

	public void setStaysIn(String staysIn) {
		this.staysIn = staysIn;
	}

	public double getCostEstimation() {
		return costEstimation;
	}

	public void setCostEstimation(double costEstimation) {
		this.costEstimation = costEstimation;
	}

	@Override
	public String toString() {
		return "BookingDetails [bookingId=" + bookingId + ", travelRequest=" + travelRequest + ", agentDetails="
				+ agentDetails + ", travellingStartDate=" + travellingStartDate + ", travellingEndDate="
				+ travellingEndDate + ", staysIn=" + staysIn + ", costEstimation=" + costEstimation + "]";
	}
	
	
}