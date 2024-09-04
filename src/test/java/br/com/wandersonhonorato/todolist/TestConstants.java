package br.com.wandersonhonorato.todolist;

import java.util.ArrayList;
import java.util.List;

import br.com.wandersonhonorato.todolist.entity.Todo;

public class TestConstants {
  public static final List<Todo> TODOS = new ArrayList<>() {
    {
      add(new Todo(9995L, "@wandersonhonorato", "Curtir", false, 1));
      add(new Todo(9996L, "@wandersonhonorato", "Comentar", false, 1));
      add(new Todo(9997L, "@wandersonhonorato", "Compartilhar", false, 1));
      add(new Todo(9998L, "@wandersonhonorato", "Se Inscrever", false, 1));
      add(new Todo(9999L, "@wandersonhonorato", "Ativar as Notificações", false, 1));
    }
  };

  public static final Todo TODO = TODOS.get(0);
}
