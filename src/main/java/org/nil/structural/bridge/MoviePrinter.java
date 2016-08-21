package org.nil.structural.bridge;

import java.util.HashMap;
import java.util.Map;

public class MoviePrinter extends Printer {

	private Movie movie;	
	
	public MoviePrinter(Movie movie) {
		super();
		this.movie = movie;
	}

	@Override
	String getHeader() {
		return movie.getGenre();
	}

	@Override
	Map<String, String> getInfo() {
		Map<String, String> movieInfo = new HashMap<>();
		
		movieInfo.put("Title", movie.getTitle());
		movieInfo.put("rating", movie.getRating());
		movieInfo.put("year", movie.getYear());
		
		return movieInfo;
	}

}
