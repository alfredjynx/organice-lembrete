package organice.lembrete;

import java.util.Date;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record LembreteDateIn (
    Date data
) {
    
}