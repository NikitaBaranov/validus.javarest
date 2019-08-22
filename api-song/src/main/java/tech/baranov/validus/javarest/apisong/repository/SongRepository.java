package tech.baranov.validus.javarest.apisong.repository;

import org.springframework.data.repository.Repository;
import tech.baranov.validus.javarest.model.Song;

import java.util.List;

public interface SongRepository extends Repository<Song, Long> {
    List<Song> findAll();

    Song findById(Long id);

    List<Song> findByAlbumId(Long id);
}