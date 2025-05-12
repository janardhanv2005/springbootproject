package com.mycompany.springbootproject.repository;

import com.mycompany.springbootproject.entity.TaskEntity;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {


    public List<TaskEntity> getAll() {

        List<TaskEntity> taskList = new ArrayList<TaskEntity>();
        TaskEntity task1 = new TaskEntity();
        task1.setId(1);
        task1.setTitle("First Task");
        task1.setDescription("This is my first task");
        task1.setCompleted(true);

        TaskEntity task2 = new TaskEntity();
        task2.setId(2);
        task2.setTitle("Second Task");
        task2.setDescription("This is my Second task");
        task2.setCompleted(false);

        taskList.add(task1);
        taskList.add(task2);
        System.out.println("test");
        return taskList;

    }
}
