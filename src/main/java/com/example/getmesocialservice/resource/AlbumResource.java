package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    /*@GetMapping("/album")
    public Album getAlbum(){
        return albumService.getAlbum();
    }*/

    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }

    @GetMapping("/album")
    public List<Album> getAllAlbums(){
        return albumService.getAllAlbums();
    }

    @GetMapping("/album/{albumId}")
    public Album getAlbumById(@PathVariable("albumId") int albumId){
        return albumService.getAlbumById(albumId);
    }

    @PutMapping("/album/{albumId}")
    public Album updateAlbum(@PathVariable(name="albumId") int albumId, @RequestBody Album album) {
        return albumService.updateAlbum(albumId, album);
    }

    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam(name="albumId") int albumId){
        System.out.println("Deleted............");
        return albumService.deleteAlbum(albumId);
    }
}
