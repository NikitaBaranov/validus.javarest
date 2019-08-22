package tech.baranov.validus.javarest.apiartist.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.baranov.validus.javarest.model.Album;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "albumClient", url = "http://localhost:8181/api/albums")
public interface AlbumFeignClient {

    @RequestMapping(
            method = GET,
            path = "/artists/{artistId}"
    )
    List<Album> getByArtistId(@PathVariable() Long artistId);
}
