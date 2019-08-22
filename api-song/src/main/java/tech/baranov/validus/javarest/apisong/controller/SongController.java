package tech.baranov.validus.javarest.apisong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.baranov.validus.javarest.apisong.service.SongService;
import tech.baranov.validus.javarest.model.Song;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(path = "api/songs")
public class SongController {

    private SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @RequestMapping(
            method = GET,
            path = "",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Song> getAll() {
        return songService.getAll();
    }

    @RequestMapping(
            method = GET,
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Song getById(@PathVariable Long id) {
        return songService.getById(id);
    }

    @RequestMapping(
            method = GET,
            path = "/album/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Song> getByAlbumId(@PathVariable Long id) {
        return songService.getByAlbumId(id);
    }
}
