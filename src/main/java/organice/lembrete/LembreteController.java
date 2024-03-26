package organice.lembrete;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "organice-lembrete")
public interface LembreteController {

    @PostMapping("/lembretes")
    public ResponseEntity<LembreteOut> create(
        @RequestBody(required = true) LembreteIn in
    );

    @PutMapping("/lembretes/{id}")
    public ResponseEntity<LembreteOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) LembreteIn in
    );

    @GetMapping("/lembretes")
    public ResponseEntity<LembreteOut> read(
        @RequestHeader(required = true, name = "id-lembrete") String idLembrete
    );
} 
