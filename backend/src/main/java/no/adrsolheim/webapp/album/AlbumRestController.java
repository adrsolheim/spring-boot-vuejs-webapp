package no.adrsolheim.webapp.album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumRestController {

    private AlbumService albumService;

    @Autowired
    public AlbumRestController(AlbumService as) {
        albumService = as;
    }

    @GetMapping("/albums")
    public List<Album> findAll() {
        return albumService.findAll();
    }

    @GetMapping("/albums/{albumId}")
    public Album getAlbum(@PathVariable int albumId) {
        Album result = albumService.findById(albumId);
        if (result == null) {
            throw new RuntimeException("Could not find album by id " + albumId);
        }
        return result;
    }

    @PostMapping("/albums")
    public Album addAlbum(@RequestBody Album album) {

        album.setId(0);
        albumService.save(album);

        return album;
    }

    @DeleteMapping("/albums/{albumId}")
    public String deleteAlbum(@PathVariable int albumId) {
        Album album = albumService.findById(albumId);

        if (album == null) {
            throw new RuntimeException("Could not find album of id " + albumId);
        }
        albumService.deleteById(albumId);
        return "Deleted album id " + albumId;
    }

    @PutMapping("/albums")
    public Album updateAlbum(@RequestBody Album album) {
        albumService.save(album);

        return album;
    }
}
