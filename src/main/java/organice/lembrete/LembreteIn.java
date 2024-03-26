package organice.lembrete;

import java.util.Date;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record LembreteIn (
    String title,
    String description,
    String idUser,
    Date inicio,
    Date fim
) {
    
}
