package java11and17featuresdaythree.java17features.recordclasses.usage;

import java.time.LocalDate;

public record Sale(Merchant merchant, LocalDate date, double value) {

}
