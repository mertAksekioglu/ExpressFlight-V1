package com.lunex.LunEx1.repository;

import com.lunex.LunEx1.domain.Flight;
import com.lunex.LunEx1.domain.FlightSegment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
@Service
public interface IFlightRepository extends JpaRepository<Flight,Long> {

   // Optional<Flight> findByFlightCode(String flightCode);
}

