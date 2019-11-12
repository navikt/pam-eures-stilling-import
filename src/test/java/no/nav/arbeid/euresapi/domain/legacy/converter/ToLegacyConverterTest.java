package no.nav.arbeid.euresapi.domain.legacy.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import no.nav.arbeid.euresapi.domain.CodeRepository;
import no.nav.arbeid.euresapi.domain.eures.GetReply2018;
import no.nav.arbeid.euresapi.domain.legacy.GetCodeListsReply;
import no.nav.arbeid.euresapi.domain.legacy.SearchJobsReply;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class ToLegacyConverterTest {

    private ToLegacyConverter toLegacyConverter;

    private ObjectMapper mapper = new ObjectMapper();
    @Before
    public void setUp() throws JsonProcessingException {

        GetCodeListsReply codeListsReply = mapper.readValue(readGetCodeLists(), GetCodeListsReply.class);
        CodeRepository codeRepository = new CodeRepository(codeListsReply);
        toLegacyConverter = new ToLegacyConverter(codeRepository);

    }


    @Test
    public void testConversion() throws JsonProcessingException {
        GetReply2018 reply2018 = mapper.readValue(readGetReply(), GetReply2018.class);

        SearchJobsReply searchJobsReply = toLegacyConverter.convert(reply2018);

        String output = mapper.writer(new DefaultPrettyPrinter()).writeValueAsString(searchJobsReply);

        assertThat(output).isEqualTo(readConvertedValue());

    }

    private String readConvertedValue() {
        return readFile("ConvertedValue.json");
    }

    private String readGetCodeLists() {
        return readFile("GetCodeLists.json");
    }

    private String readGetReply() {
        return readFile("GetReply.json");
    }

    private String readFile(String path) {
        try {
            URL url = getClass().getClassLoader().getResource(path);
            return new String(Files.readAllBytes(Paths.get(url.toURI())));
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }



}
