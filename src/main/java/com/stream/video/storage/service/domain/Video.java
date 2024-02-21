package com.stream.video.storage.service.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.nio.file.Path;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "video")

public class Video {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false )
    int id;

    @Column(nullable = false)
    String name;

    @Column( nullable = false, columnDefinition = "TEXT")
    private String path;

    @CreationTimestamp
    private LocalDateTime createdTime;

    @Column(name = "publisher_name", nullable = true, columnDefinition = "VARCHAR(255) DEFAULT 'anonymous'")
    private String publisherName;


}
