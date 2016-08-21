package org.nil.structural.bridge;

public class BeidgeDemo {
	public static void main(String[] args) {
		Movie movie = new Movie("Drama", "The Shawshank Redemption", "9.4", "1994");
		
		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);
		
		System.out.println(moviePrinter.print(printFormatter));
	}
}
