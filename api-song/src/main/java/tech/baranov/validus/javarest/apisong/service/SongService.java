package tech.baranov.validus.javarest.apisong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.baranov.validus.javarest.model.Song;
import tech.baranov.validus.javarest.apisong.repository.SongRepository;

import java.util.List;


@Service
public class SongService {

    private SongRepository songRepository;

    @Autowired
    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> getAll(){
        return songRepository.findAll();
    }

    public Song getById(Long id){
        return songRepository.findById(id);
    }

    public List<Song> getByAlbumId(Long id) {
        return songRepository.findByAlbumId(id);
    }
}
