package organice.lembrete;


import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record LembreteIn (
    String title,
    String description,
    String inicio,
    String fim
) {
    
}
