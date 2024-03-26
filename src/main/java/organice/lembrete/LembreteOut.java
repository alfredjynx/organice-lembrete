package organice.lembrete;

import java.util.Date;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record LembreteOut (
    String title,
    String description,
    String id,
    Date inicio,
    Date fim
) {
    
}
