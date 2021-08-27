package com.soumen.moviecatalogservice.model;

public class MovieCatalogModel {
	
	private int movieid;
	private String moviename;
	private int rating;
	
	public MovieCatalogModel() {
		super();
	}

	public MovieCatalogModel(int movieid, String moviename, int rating) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.rating = rating;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MovieCatalogModel [movieid=" + movieid + ", moviename=" + moviename + ", rating=" + rating + "]";
	}
	
	

}
