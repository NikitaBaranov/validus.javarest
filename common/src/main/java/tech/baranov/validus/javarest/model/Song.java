package tech.baranov.validus.javarest.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class Song extends BaseModel {

    private Long albumId;
    private int track;
    private String name;
}

