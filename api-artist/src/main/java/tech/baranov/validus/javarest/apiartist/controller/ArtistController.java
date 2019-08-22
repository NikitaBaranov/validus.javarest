package tech.baranov.validus.javarest.apiartist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.baranov.validus.javarest.apiartist.service.ArtistService;
import tech.baranov.validus.javarest.model.Artist;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(path = "api/artists")
public class ArtistController {

    private ArtistService artistService;

    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @RequestMapping(
            method = GET,
            path = "",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Artist> getAll() {
        return artistService.getAll();
    }

    @RequestMapping(
            method = GET,
            path = "/{albumId}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Artist getById(@PathVariable Long albumId) {
        return artistService.getById(albumId);
    }
}
