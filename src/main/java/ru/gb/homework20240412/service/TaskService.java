package ru.gb.homework20240412.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.homework20240412.domain.Task;
import ru.gb.homework20240412.domain.TaskStatus;
import ru.gb.homework20240412.repository.TaskRepository;

/**
 * Сервис, реализующий взаимодействие между контроллером задач и репозиторием
 */

@Service
@AllArgsConstructor
public class TaskService {

    private final TaskRepository repository;

    /**
     * Метод добавления задачи в репозиторий
     * @param task
     * @return
     */

    public Task add(Task task) {
        return repository.save(task);
    }

    /**
     * Метод получения всех задач из репозитория
     * @return
     */

    public Iterable<Task> getAll() {
        return repository.findAll();
    }

//    public Iterable<Task> getByStatus(TaskStatus status) {
//
//    }
}
