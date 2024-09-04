package br.com.wandersonhonorato.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wandersonhonorato.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
