package T2Old;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.lang.reflect.Type;
import java.util.List;

public class JsonSerializer {
    
    private Gson gson = new Gson();

    public List<AtletaGinasta> unserilizeAtletaGinasta()
    {
        Type typeAtletaGinasta = new TypeToken<List<AtletaGinasta>>(){}.getType();
        List<AtletaGinasta> ginastas = null;
        String path = Paths.get("T2/ginastas.json").toAbsolutePath().toString();

        try (FileReader reader = new FileReader(path)) {
            ginastas = this.gson.fromJson(reader, typeAtletaGinasta);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ginastas;
    }

}
