package tech.baranov.validus.javarest.apialbum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.baranov.validus.javarest.apialbum.client.SongFeignClient;
import tech.baranov.validus.javarest.apialbum.model.ArtistAlbums;
import tech.baranov.validus.javarest.apialbum.repository.AlbumRepository;
import tech.baranov.validus.javarest.apialbum.repository.ArtistAlbumsRepository;
import tech.baranov.validus.javarest.model.Album;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlbumService {

    private AlbumRepository albumRepository;
    private ArtistAlbumsRepository artistAlbumsRepository;
    private SongFeignClient songFeignClient;

    @Autowired
    public AlbumService(AlbumRepository albumRepository, ArtistAlbumsRepository artistAlbumsRepository, SongFeignClient songFeignClient) {
        this.albumRepository = albumRepository;
        this.songFeignClient = songFeignClient;
        this.artistAlbumsRepository = artistAlbumsRepository;
    }

    public List<Album> getAll(){
        return albumRepository.findAll();
    }

    public Album getById(Long id){
        Album album = albumRepository.findById(id);
        album.setSongs(songFeignClient.getByAlbumId(id));
        return album;
    }

    public List<Album> getByArtistId(Long artistId){
        List<ArtistAlbums> artistAlbums = artistAlbumsRepository.findByArtistId(artistId);
        return artistAlbums.stream().map(aa -> getById(aa.getAlbumsId())).collect(Collectors.toList());
    }
}
