package com.ashley.lookify.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashley.lookify.models.Song;
import com.ashley.lookify.services.SongService;

@Controller
public class SongController {
	private final SongService sService;
	public SongController(SongService service) {
		this.sService = service;
	}
	
	// @RequestMapping shorthand
		@GetMapping("/")
		public String index(){
			return "index.jsp";
		}
		
		@GetMapping("/dashboard")
		public String index(Model model, @ModelAttribute("song") Song song) {
			model.addAttribute("allSongs", this.sService.allSongs());
			return "allsongs.jsp";
		}
		
		@GetMapping("/songs/new")
		public String newSong(@ModelAttribute("song") Song song) {
			return "new.jsp";
		}
		
		@PostMapping("/songs/new")
		public String addSong(@Valid @ModelAttribute("song") Song song, BindingResult result, Model model) {
			if(result.hasErrors()) {
				model.addAttribute("allSongs", this.sService.allSongs());
				return "new.jsp";
			}
			this.sService.createSong(song);
			return "redirect:/dashboard";
		}
		
		@RequestMapping("/search")
		public String Search(@RequestParam("artist") String artist, Model model) {
			model.addAttribute("songs",	sService.songsContainingArtist(artist));
			model.addAttribute("artist", artist);
			return "search.jsp";
		}
		
		
		@GetMapping("/show/{id}")
		public String showSong(Model model, @PathVariable("id") Long id) {
			model.addAttribute("thisSong", this.sService.findSong(id));
			return "show.jsp";
		}
		
		@RequestMapping("/search/topTen")
		public String TopTen(Model model) {
			model.addAttribute("songs", sService.topTenByRating());
			return "topten.jsp";
		}
		
		@DeleteMapping("/delete/{id}")
		public String deleteSong(@PathVariable("id") Long id) {
			this.sService.deleteSong(id);
			return "redirect:/dashboard";
		}
}
