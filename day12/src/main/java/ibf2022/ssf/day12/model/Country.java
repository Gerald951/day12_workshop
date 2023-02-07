package ibf2022.ssf.day12.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    private String code;
    private String name;
    private Integer population;
    
}
