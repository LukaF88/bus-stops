package learn.course.springboot.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import learn.course.springboot.example.entity.Arrivals;
import learn.course.springboot.example.service.ArrivalsService;

@RestController
public class ArrivalsController {

	@Autowired
	ArrivalsService arrivalService;
	
	@RequestMapping("/{stopId}")
	public Arrivals nextBuses(@PathVariable int stopId) {
		return arrivalService.getArrivals(stopId);
	}
	
	@RequestMapping("/{stopId}/{lineId}")
	public Arrivals nextBuses(@PathVariable int stopId, @PathVariable String lineId) {
		return arrivalService.getArrivals(stopId, lineId);
	}
}
