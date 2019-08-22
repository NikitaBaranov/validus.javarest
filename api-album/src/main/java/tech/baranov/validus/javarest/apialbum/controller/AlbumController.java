package tech.baranov.validus.javarest.apialbum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.baranov.validus.javarest.apialbum.service.AlbumService;
import tech.baranov.validus.javarest.model.Album;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(path = "api/albums")
public class AlbumController {

    private AlbumService albumService;

    @Autowired
    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @RequestMapping(
            method = GET,
            path = "",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Album> getAll() {
        return albumService.getAll();
    }

    @RequestMapping(
            method = GET,
            path = "/{albumId}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Album getById(@PathVariable Long albumId) {
        return albumService.getById(albumId);
    }

    @RequestMapping(
            method = GET,
            path = "/artists/{artistId}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Album> getByArtistId(@PathVariable Long artistId) {
        return albumService.getByArtistId(artistId);
    }

}
