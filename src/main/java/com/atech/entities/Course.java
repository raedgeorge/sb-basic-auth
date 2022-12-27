package com.atech.entities;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author raed abu Sa'da
 * on 27/12/2022
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String title;

}
