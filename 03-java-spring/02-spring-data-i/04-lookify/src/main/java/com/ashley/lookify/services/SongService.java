package com.ashley.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashley.lookify.models.Song;
import com.ashley.lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository sRepo;
	
	public SongService(SongRepository repo) {
		this.sRepo = repo;
	}
	
	// Finds all songs
	public List<Song> allSongs(){
		return this.sRepo.findAll();
	}
	
	// Find One Song
	public Song findSong(Long id) {
		return this.sRepo.findById(id).orElse(null);
	}
	
	// Finds Top Ten Songs
	public List<Song> topTenByRating() {
		return sRepo.findTop10ByOrderByRatingDesc();
	}
	
	// Search By Artist
	public List<Song> songsContainingArtist(String artist) {
		return sRepo.findByArtistContaining(artist);
	}
		
	// Create
	public Song createSong(Song newSong) {
		return this.sRepo.save(newSong);
	}
		
	// Update
	public Song updateSong(Song updatedSong) {
		return this.sRepo.save(updatedSong);
	}
		
	// Delete
	public void deleteSong(Long id) {
		this.sRepo.deleteById(id);
	}
	
}
