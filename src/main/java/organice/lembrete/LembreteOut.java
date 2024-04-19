package organice.lembrete;


import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record LembreteOut (
    String title,
    String description,
    String id,
    String inicio,
    String fim
) {
    
}
