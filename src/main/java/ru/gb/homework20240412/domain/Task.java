package ru.gb.homework20240412.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Класс, реализующий одну задачу
 */

@Entity
@Data
@AllArgsConstructor
public class Task {

    /**
     * Уникальный идентификатор задачи
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Описание задачи
     */

    @Column(nullable = false)
    private String description;

    /**
     * Статус задачи
     */

    @Column(nullable = false)
    private TaskStatus status;

    /**
     * Время создания задачи
     */

    private LocalDateTime creationTime = LocalDateTime.now();

}
