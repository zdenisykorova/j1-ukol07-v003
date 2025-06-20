package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KnihaSluzba {
    private List<Kniha> knihy = new ArrayList<>();
    public void nacistKnihy() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        try (InputStream inputStream = KnihaSluzba.class.getResourceAsStream("/knihy.json")) {
            if (inputStream == null) {
                throw new FileNotFoundException("Soubor nenalezen.");
            }
            knihy = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {
            });
        }
    }
}
