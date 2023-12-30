import java.util.List;
import com.leadify.crm.entity.Interested;
import com.leadify.crm.service.InterestedService;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;

@RestController
@CrossOrigin(origins = { "http://localhost:8080" })
@RequestMapping("api/interested")
public class FinancialController {

    @Autowired
    private InterestedService interestedService;

    @GetMapping("/getAll")
    public List<Interested> getAll() {
        return interestedService.getInterested();
    }

    @PostMapping("/create")
    public void create(@RequestBody Interested interested) {
        interestedService.save(interested);
    }

    // Custom deserializer for LocalDateTime
    public static class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {
        private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:mm:ss");

        @Override
        public LocalDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            String dateText = p.getText();
            return LocalDateTime.parse(dateText, formatter);
        }
    }
}