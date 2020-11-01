package com.cleitons.silvar.devBlog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter private Long id;

    @Column(name = "titulo", nullable = false)
    @Getter @Setter private String titulo;

    @Column(name = "autor", nullable = false)
    @Getter @Setter private String autor;

    @Lob
    @Column(name = "texto", nullable = false)
    @Getter @Setter private String texto;

    @Column(name = "data_cadastro")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Getter @Setter private LocalDate dataCadastro;
    
}
