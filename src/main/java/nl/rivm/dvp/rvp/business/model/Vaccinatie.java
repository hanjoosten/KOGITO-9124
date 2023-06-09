package nl.rivm.dvp.rvp.business.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Vaccinatie {
    VaccinSoort vaccinSoort;
    LocalDate uitvoerdatum;
    String product;
    LocalDate expiratiedatum; // De expiratiedatum van de batch waartoe de vaccinatie behoort
}
