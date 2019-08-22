package tech.baranov.validus.javarest.apialbum.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import tech.baranov.validus.javarest.model.BaseModel;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class ArtistAlbums extends BaseModel {

    private Long albumsId;
    private Long artistId;
}
