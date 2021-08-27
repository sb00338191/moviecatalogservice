package com.soumen.moviecatalogservice.model;

import java.util.List;

public class RatingList {
	
	private List<Rating> ratings;

	public RatingList() {
		super();
	}

	public RatingList(List<Rating> ratings) {
		super();
		this.ratings = ratings;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "RatingList [ratings=" + ratings + "]";
	}



	

}
