import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;


public class JsonSerializer {
    
    private Gson gson = new Gson();

    private List<AtletaJson> deserializeAtletasJson(String path_)
    {
        Type typeAtletaJson = new TypeToken<List<AtletaJson>>(){}.getType();
        List<AtletaJson> atletas = null;

        String path = Paths.get(path_).toAbsolutePath().toString();

        try (FileReader reader = new FileReader(path)) {
            atletas = this.gson.fromJson(reader, typeAtletaJson);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return atletas;
    }

    public List<AtletaGinasta> deserializeGinastasJson()
    {
        List<AtletaJson> atletas = this.deserializeAtletasJson("ginastas.json");
        List<AtletaGinasta> ginastas = new ArrayList<AtletaGinasta>();

        for (AtletaJson atleta : atletas) {
            AtletaGinasta ginasta = new AtletaGinasta(
                atleta.getNome(),
                atleta.getDataNascimento(),
                atleta.getPeso(),
                atleta.getFlexibilidade(),
                atleta.getResistencia(),
                atleta.getFolego(),
                atleta.getForca(),
                atleta.getNumeroLesoes()
            );
            ginastas.add(ginasta);
        }

        return ginastas;
    }

    public List<AtletaNadador> deserializeNadadoresJson()
    {
        List<AtletaJson> atletas = this.deserializeAtletasJson("nadadores.json");
        List<AtletaNadador> nadadores = new ArrayList<AtletaNadador>();

        for (AtletaJson atleta : atletas) {
            AtletaNadador nadador = new AtletaNadador(
                atleta.getNome(),
                atleta.getDataNascimento(),
                atleta.getPeso(),
                atleta.getFlexibilidade(),
                atleta.getResistencia(),
                atleta.getFolego(),
                atleta.getForca(),
                atleta.getNumeroLesoes()
            );
            nadadores.add(nadador);
        }

        return nadadores;
    }

    public List<AtletaHalterofilista> deserializeHalterofilistasJson()
    {
        List<AtletaJson> atletas = this.deserializeAtletasJson("halterofilistas.json");
        List<AtletaHalterofilista> halterofilistas = new ArrayList<AtletaHalterofilista>();

        for (AtletaJson atleta : atletas) {
            AtletaHalterofilista halterofilista = new AtletaHalterofilista(
                atleta.getNome(),
                atleta.getDataNascimento(),
                atleta.getPeso(),
                atleta.getFlexibilidade(),
                atleta.getResistencia(),
                atleta.getFolego(),
                atleta.getForca(),
                atleta.getNumeroLesoes()
            );
            halterofilistas.add(halterofilista);
        }

        return halterofilistas;
    }

    public void serializeInscricoesNegadasJson(InscricaoNegadaTotal inscricoesNegadas, String string) {
        Gson gson_ = new GsonBuilder().setPrettyPrinting().create();
        try{
            FileWriter writer = new FileWriter(string);
            gson_.toJson(inscricoesNegadas, writer);
            writer.close();
        } catch (JsonIOException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void serializeResultadoJson(Resultado resultadoGinastas, String string) {
        Gson gson_ = new GsonBuilder().setPrettyPrinting().create();
        try{
            FileWriter writer = new FileWriter(string);
            gson_.toJson(resultadoGinastas, writer);
            writer.close();
        } catch (JsonIOException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
