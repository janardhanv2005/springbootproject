package com.mycompany.springbootproject.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskEntity {

    private long id;
    private String title;
    private String description;
    private boolean isCompleted;
}
