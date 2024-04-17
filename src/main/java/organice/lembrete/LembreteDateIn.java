package organice.lembrete;


import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record LembreteDateIn (
    String data
) {
    
}