package no.hvl.dat250.rest.todos;

import com.google.gson.Gson;

import java.util.List;

import static spark.Spark.*;

public class App {

    static TodoDAO todoDAO = new TodoDAO();

    public static void main(String[] args) {

        if (args.length > 0) {
            port(Integer.parseInt(args[0]));
        } else {
            port(8080);
        }

        after((req, res) -> {
            res.type("application/json");
        });

        get("/todos", (req, res) -> {
            List<Todo> todos = todoDAO.read();
            Gson gson = new Gson();
            return gson.toJson(todos.toArray());
        });

        get("/todo/:id", (req, res) -> {
            Todo todo = todoDAO.read(Long.parseLong(req.params(":id")));
            return todo.toJson();
        });

        put("/todo", (req, res) -> {
            Todo todo = Todo.fromJson(req.body());
            todoDAO.update(todo);
            return "Success";
        });

        post("/todo", (req, res) -> {
            Todo todo = Todo.fromJson(req.body());
            todoDAO.create(todo);
            return todo.toJson();
        });

        delete("/todo/:id", (req, res) -> {
            todoDAO.delete(Long.parseLong(req.params(":id")));
            return "Success";
        });
    }

}
