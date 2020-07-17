package com.proileexample.curdexample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="image_model")
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class ImageModel {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String type;

    @Lob
    private byte[] pic;





    public ImageModel(String name, String type, byte[] pic) {
        this.name = name;
        this.type = type;
        this.pic = pic;
    }
}
