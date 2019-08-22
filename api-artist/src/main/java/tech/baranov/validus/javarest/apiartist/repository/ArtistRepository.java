package tech.baranov.validus.javarest.apiartist.repository;

import org.springframework.data.repository.Repository;
import tech.baranov.validus.javarest.model.Artist;

import java.util.List;

public interface ArtistRepository extends Repository<Artist, Long> {
    List<Artist> findAll();

    Artist findById(Long id);
}
