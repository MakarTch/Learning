package com.cognixia.application.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.application.model.Ticket;

@Repository
public interface TicketDAO extends CrudRepository<Ticket, Integer> {
	
	@Query(value="select * from ticket", nativeQuery=true)
	List<Ticket> selectAllFromTable();
	
	@Query(value="select * from ticket where id =?1", nativeQuery = true)
	Ticket selectById(int id);
	
	//very lit these both work, sooo easy man, god damn
	
}
