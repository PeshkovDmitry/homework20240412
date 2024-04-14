package ru.gb.homework20240412.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.homework20240412.domain.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>  {


}
