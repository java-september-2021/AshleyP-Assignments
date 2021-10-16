package com.ashley.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashley.lookify.models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long>{
	List<Song> findAll(); // SELECT * FROM songs
	List<Song> findTop10ByOrderByRatingDesc();
	List<Song> findByArtistContaining(String artist); // Finds songs from artist
}
