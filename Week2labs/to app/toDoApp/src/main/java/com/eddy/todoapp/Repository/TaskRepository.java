package com.eddy.todoapp.Repository;

import com.eddy.todoapp.TodoAppApplication;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, Long> {
}
