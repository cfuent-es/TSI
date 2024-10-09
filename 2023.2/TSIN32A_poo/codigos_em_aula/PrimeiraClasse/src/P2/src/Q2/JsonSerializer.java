import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Paths;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class JsonSerializer {
    
    private Gson gson = new Gson();

    public List<TrabalhadorJson> deserializeTrabalhadores(String path_)
    {
        Type typeTrabalhador = new TypeToken<List<TrabalhadorJson>>(){}.getType();
        List<TrabalhadorJson> trabalhadores = null;

        String path = Paths.get(path_).toAbsolutePath().toString();

        try (FileReader reader = new FileReader(path)) {
            trabalhadores = this.gson.fromJson(reader, typeTrabalhador);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return trabalhadores;
    }
}