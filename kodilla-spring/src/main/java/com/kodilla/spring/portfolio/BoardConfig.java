package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {


    @Bean(name = "taskList1")
    public TaskList getTaskList() {
        return new TaskList();
    }

    @Bean(name = "taskList2")
    public TaskList getTaskList1() {
        return new TaskList();
    }


    @Bean(name = "taskList3")
    public TaskList getTaskList2() {
        return new TaskList();
    }

    @Bean//metoda faktoryzująca/ factory method
    public Board newTask(@Qualifier("taskList1") TaskList taskList1,
                         @Qualifier("taskList2") TaskList taskList2,
                         @Qualifier("taskList3") TaskList taskList3) {
        return new Board(taskList1, taskList2, taskList3);
    }

//    @Bean(name = "Tasks To Do")
//    public TaskList getTaskToDo() {
//        return new TaskList();
//    }
//
//
//    @Bean(name = "Task In Progress")
//    public TaskList getTaskInProgress() {
//        return new TaskList();
//    }
//
//    @Bean(name = "Done Tasks ")
//    public TaskList getFinishedTasks() {
//        return new TaskList();
//    }
//
//    @Bean
//    public Board newTask(@Qualifier("taskToDo") TaskList taskToDo,
//                         @Qualifier("taskInProgress") TaskList taskInProgress,
//                         @Qualifier("doneTasks") TaskList doneTasks) {
//        return new Board(taskToDo, taskInProgress, doneTasks);
//    }

}
