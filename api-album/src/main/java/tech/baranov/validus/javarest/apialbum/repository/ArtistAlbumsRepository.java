package tech.baranov.validus.javarest.apialbum.repository;

import org.springframework.data.repository.Repository;
import tech.baranov.validus.javarest.apialbum.model.ArtistAlbums;

import java.util.List;

public interface ArtistAlbumsRepository extends Repository<ArtistAlbums, Long> {
    List<ArtistAlbums> findByArtistId(Long artistId);
}
