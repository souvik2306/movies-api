package com.moviesapi.movie;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")
//@Data takes cares of getters,setters and all toString methods
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	
	@Id
	private ObjectId id;
	
	private String imdbId;
	
	private String title;
	
	private String trailerLink;
	
	private String poster;
	
	private List<String> genres;
	
	private List<String> backdrops;
	
	//This will cause the database to store the ids of the review and the reviews will be in separate collection 
	@DocumentReference
	private List<String> reviewIds;

}
