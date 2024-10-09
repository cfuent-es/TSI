import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ManipuladorArquivoJson {
    
    private Gson gson;

    public ManipuladorArquivoJson() {
        gson = new GsonBuilder()
            .registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
                @Override
                public LocalDate deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                    return LocalDate.parse(json.getAsString(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                }
            })
            .create();
    }

    public List<Veiculo> lerArquivoColecao() {
        Type typeTrabalhador = new TypeToken<List<Veiculo>>(){}.getType();
        List<Veiculo> trabalhadores = null;

        String path = Paths.get("vencimentos-ipva.json").toAbsolutePath().toString();

        try (FileReader reader = new FileReader(path)) {
            trabalhadores = this.gson.fromJson(reader, typeTrabalhador);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return trabalhadores;
    }
}