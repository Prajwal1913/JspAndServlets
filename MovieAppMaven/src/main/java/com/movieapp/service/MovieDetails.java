package com.movieapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MovieDetails {

	public List<String> showMovies(String language) {
		List<String> movies = new ArrayList<>();
		if(language.equals("English")) {
			movies = Arrays.asList("Two Brothers","Life of Pie","Fast & Furious");
		}
		if(language.equals("Kannada")) {
			movies = Arrays.asList("KGF","Kantara","Yajamana");
		}
		if(language.equals("Hindi")) {
			movies = Arrays.asList("Race","Tiger","Jawan");
		}
		if(language.equals("Tamil")) {
			movies = Arrays.asList("Leo","Surya","Liger");
		}
		if(language.equals("Telugu")) {
			movies = Arrays.asList("Eega","Master","Rajarani");
		}
		return movies;
	}

}
