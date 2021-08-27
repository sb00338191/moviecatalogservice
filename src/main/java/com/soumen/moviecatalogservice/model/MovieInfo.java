package com.soumen.moviecatalogservice.model;

public class MovieInfo {
	
	private int movieid;
	private String moviename;
	
	public MovieInfo() {
		super();
	}

	public MovieInfo(int movieid, String name) {
		super();
		this.movieid = movieid;
		this.moviename = name;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getName() {
		return moviename;
	}

	public void setName(String name) {
		this.moviename = name;
	}

	@Override
	public String toString() {
		return "MovieInfo [movieid=" + movieid + ", name=" + moviename + "]";
	}
	
	

}
