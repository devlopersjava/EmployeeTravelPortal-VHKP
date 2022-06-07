package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.pojo.BookingDetails;
import com.mindgate.main.service.BookingDetailsServiceInterface;

@RestController
@RequestMapping("bookingDetails")
public class BookingDetailsController {
	
	@Autowired
	private BookingDetailsServiceInterface bookingDetailsService;
	
	
	@RequestMapping(value = "booking/{id}", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public @ResponseBody BookingDetails getBookingDetailsById(@PathVariable("id") int bookingId) {

		System.out.println("in Booking Service Byid");
		return bookingDetailsService.getBookingDetailsById(bookingId);

	}

	@RequestMapping(value = "booking", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public @ResponseBody List<BookingDetails> getProducts() {
		return bookingDetailsService.getAllBookingDetails();
	}

}
