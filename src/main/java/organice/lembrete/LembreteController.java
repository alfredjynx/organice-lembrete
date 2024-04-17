package organice.lembrete;

import java.util.Date;
import java.util.List;

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
        @RequestHeader(required = true, name = "id-user") String UserId,
        @RequestBody(required = true) LembreteIn in
    );

    @PostMapping("/lembretes/data")
    public ResponseEntity<List<LembreteOut>> getByDate(
        @RequestHeader(required = true, name = "id-user") String UserId,
        @RequestBody(required = true) LembreteDateIn data
    );

    @PutMapping("/lembretes/{id}")
    public ResponseEntity<LembreteOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) LembreteIn in
    );

    @GetMapping("/lembretes/{id}")
    public ResponseEntity<LembreteOut> read(
        @PathVariable("id") String idLembrete
    );


    @GetMapping("/lembretes/teste")
    public ResponseEntity<String> read_teste();
} 
