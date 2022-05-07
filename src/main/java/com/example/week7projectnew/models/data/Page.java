package com.example.week7projectnew.models.data;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Size;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "pages")
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min=2, message = "Title must be at least 2 characters long")
    private String title;

    private String slug;

    private String content;
    @Size(min=5, message = "Title must be at least 5 characters long")

    private int sorting;

}
