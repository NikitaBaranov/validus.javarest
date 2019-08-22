package tech.baranov.validus.javarest.apiartist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.baranov.validus.javarest.apiartist.client.AlbumFeignClient;
import tech.baranov.validus.javarest.apiartist.repository.ArtistRepository;
import tech.baranov.validus.javarest.model.Artist;

import java.util.List;

@Service
public class ArtistService {

    private ArtistRepository artistRepository;
    private AlbumFeignClient albumFeignClient;

    @Autowired
    public ArtistService(ArtistRepository artistRepository, AlbumFeignClient albumFeignClient) {
        this.artistRepository = artistRepository;
        this.albumFeignClient = albumFeignClient;
    }

    public List<Artist> getAll() {
        List<Artist> artists = artistRepository.findAll();
//        artists.stream().map(artist -> artist.setAlbums(getById()))
        return artists;
    }

    public Artist getById(Long artistId) {
        Artist artist = artistRepository.findById(artistId);
        artist.setAlbums(albumFeignClient.getByArtistId(artistId));
        return artist;
    }
}
