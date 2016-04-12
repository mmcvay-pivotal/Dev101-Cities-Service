package io.pivotal.fe.demos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.pivotal.fe.demos.domain.City;

/**
 * Class to return a list of cities
 * @author skazi
 *
 */
@RestController
public class WebController {
	private List<City> listOfCities = new ArrayList<>();
	
	public WebController() {
		listOfCities.add(new City("London","London",null,null));
		listOfCities.add(new City("Guildford","Surrey",null,null));
		listOfCities.add(new City("Farnborough","Hampshire",null,null));
	}
	
	@RequestMapping("/cities_all")
	public Iterable<City> showCities() {
		return listOfCities;
	}
	
	@RequestMapping("/city")
	public City showCity(@RequestParam(value="cityToShow", required=false, defaultValue="London") String city) {
		for(City temp: listOfCities) {
			if(temp.getName().equals(city)) {
				return temp;
			}
		}
		return null;
	}
}
