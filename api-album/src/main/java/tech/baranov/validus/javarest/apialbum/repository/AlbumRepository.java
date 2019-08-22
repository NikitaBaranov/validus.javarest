package tech.baranov.validus.javarest.apialbum.repository;

import org.springframework.data.repository.Repository;
import tech.baranov.validus.javarest.model.Album;

import java.util.List;

public interface AlbumRepository extends Repository<Album, Long> {
    List<Album> findAll();

    Album findById (Long id);

    List<Album> findByIdIn (List<Long> ids);
}