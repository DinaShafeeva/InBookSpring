package ru.itis.inbook.dto;

import lombok.*;
import ru.itis.inbook.models.Quote;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuoteDto {
    private Long idQuote;
    private String quoteText;
    private List<Quote> quoteList;

    static QuoteDto from(Quote quote) {
        return QuoteDto.builder()
                .idQuote(quote.getIdQuote())
                .quoteText(quote.getQuoteText())
                .build();
    }

    public List<QuoteDto> from(List<Quote> quotes) {
        return quotes.stream()
                .map(QuoteDto::from)
                .collect(Collectors.toList());
    }
}
