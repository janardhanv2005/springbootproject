package com.mycompany.springbootproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "task")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name ="title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "iscompleted")
    private boolean isCompleted;

    public TaskEntity() {
    }
    public TaskEntity(String title, String description, boolean isCompleted) {
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
    }
}
