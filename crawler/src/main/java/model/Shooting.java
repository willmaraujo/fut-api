package model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Shooting {

    private Integer heading;
    private Integer shotPower;
    private Integer finishing;
    private Integer longShots;
    private Integer curve;
    private Integer fkAcc;
    private Integer penalties;
    private Integer volleys;
}
