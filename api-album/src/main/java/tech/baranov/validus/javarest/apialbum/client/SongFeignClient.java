package tech.baranov.validus.javarest.apialbum.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.baranov.validus.javarest.model.Song;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "songClient", url = "http://localhost:8282/api/songs")
public interface SongFeignClient {

    @RequestMapping(
            method = GET,
            path = "/"
    )
    List<Song> getAll();

    @RequestMapping(
            method = GET,
            path = "/{id}"
    )
    Song getById(@PathVariable() Long id);

    @RequestMapping(
            method = GET,
            path = "/album/{id}"
    )
    List<Song> getByAlbumId(@PathVariable() Long id);
}
