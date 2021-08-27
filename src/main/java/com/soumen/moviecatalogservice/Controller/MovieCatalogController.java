package com.soumen.moviecatalogservice.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.soumen.moviecatalogservice.model.MovieCatalogModel;
import com.soumen.moviecatalogservice.model.MovieInfo;
import com.soumen.moviecatalogservice.model.Rating;
import com.soumen.moviecatalogservice.model.RatingList;

@RestController
public class MovieCatalogController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/movieCatalog/{userid}")
	public List<MovieCatalogModel> getMovieCatalog(@PathVariable(value="userid") int userid){
		
		
		RatingList ratingList = restTemplate.getForObject("http://localhost:8082/users/" +userid, RatingList.class);
		
		return ratingList.getRatings().stream().map(rating -> {
			
		MovieInfo movieInfo = restTemplate.getForObject("http://localhost:8081/movieinfo/" +rating.getMovieid(), MovieInfo.class);
		return new MovieCatalogModel(movieInfo.getMovieid(), movieInfo.getName(),rating.getRating());
				
		}).collect(Collectors.toList());
		
	
		
		
		
	}

}
