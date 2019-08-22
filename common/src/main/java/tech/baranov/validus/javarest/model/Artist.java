package tech.baranov.validus.javarest.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Artist extends BaseModel {
    private String name;

    @Transient
    private List<Album> albums;
}
