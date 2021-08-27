package com.soumen.moviecatalogservice.model;

public class Rating {
	
	private int movieid;
	private int rating;
	public Rating() {
		super();
	}
	public Rating(int movieid, int rating) {
		super();
		this.movieid = movieid;
		this.rating = rating;
	}
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Rating [movieid=" + movieid + ", rating=" + rating + "]";
	}
	
	

}
