package org.dx.rideshare.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Driver {

    private Integer id;
    private String name;
    private String specialisation;

}
