package org.nil.structural.bridge;

public class Movie {
	private String genre;
	private String title;
	private String rating;
	private String year;	
	
	public Movie(String genre, String title, String rating, String year) {
		super();
		this.genre = genre;
		this.title = title;
		this.rating = rating;
		this.year = year;
	}
	
	public String getGenre() {
		return genre;
	}
	public String getTitle() {
		return title;
	}
	public String getRating() {
		return rating;
	}
	public String getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Movie [genre=" + genre + ", title=" + title + ", rating=" + rating + ", year=" + year + "]";
	}		
}
