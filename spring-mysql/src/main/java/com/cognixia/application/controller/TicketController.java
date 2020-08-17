package com.cognixia.application.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognixia.application.dao.TicketDAO;
import com.cognixia.application.model.Ticket;

@Controller
public class TicketController {
	
	@Autowired
	TicketDAO repo;
	
	@GetMapping("/")
	public String home() {
		System.out.println("in home");
		//System.out.println(repo.selectAllFromTable());
		List<Ticket> ticketList = repo.selectAllFromTable();
		//System.out.println(ticketList);
		//System.out.println(repo.selectById(9));
		Ticket ticket = repo.selectById(7);
		System.out.println(ticket.getCategory());
		return("index.html");
	}
	
	@PostMapping("/bookTickets")
	public String bookTicket(@RequestBody Ticket ticket) {
		System.out.println(ticket.toString());
		System.out.println(ticket.getId());
		System.out.println(ticket.getCategory());
		System.out.println(ticket.getAmount());
		repo.save(ticket);
		return "ticket booked: " + ticket.toString();
	}
	
	@GetMapping("/getTickets")
	public List<Ticket> getTickets(){
		return(List<Ticket>) repo.findAll();
		
	}
	
	@GetMapping("/addTicket")
	public String addTicket(Ticket ticket) {
		repo.save(ticket);
		System.out.println("saved ticket");
		return ("index.html");
	}
	
	@GetMapping("/removeTicket")
	public String removeTicket(int id) {
		if (repo.existsById(id)) {
			System.out.println("ticket exists");
			repo.deleteById(id);
		} else {
			System.out.println("id doesnt exist");
		}
		return "index.html";
	}
	
	@GetMapping("/updateTicket")
	public String updateTicket(Ticket newTicket) {
		if (repo.existsById(newTicket.getId())) {
			System.out.println("ticket exists");
			repo.save(newTicket);
		} else {
			System.out.println("id doesnt exist");
		}
		return "index.html";
	}

}
