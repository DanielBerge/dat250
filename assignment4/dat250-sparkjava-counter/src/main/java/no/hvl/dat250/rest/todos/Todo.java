package no.hvl.dat250.rest.todos;

import com.google.gson.Gson;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String summary;
    private String description;

    String toJson() {
        Gson gson = new Gson();
        String jsonInString = gson.toJson(this);

        return jsonInString;
    }

    static Todo fromJson(String json) {
        Gson gson = new Gson();
        Todo todo = gson.fromJson(json, Todo.class);
        return todo;
    }
}

