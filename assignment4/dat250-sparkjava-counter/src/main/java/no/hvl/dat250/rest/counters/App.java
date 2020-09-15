package no.hvl.dat250.rest.counters;

import com.google.gson.Gson;

import static spark.Spark.*;

/**
 * Hello world!
 */
public class App {

    static Counters counters = null;

    public static void main(String[] args) {

        if (args.length > 0) {
            port(Integer.parseInt(args[0]));
        } else {
            port(8080);
        }

        counters = new Counters();

        after((req, res) -> {
            res.type("application/json");
        });

        get("/hello", (req, res) -> "Hello World!");

        get("/counters", (req, res) -> counters.toJson());

        put("/counters", (req, res) -> {

            Gson gson = new Gson();

            counters = gson.fromJson(req.body(), Counters.class);

            return counters.toJson();

        });
    }

}
