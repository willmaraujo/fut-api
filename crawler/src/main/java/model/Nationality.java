package model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Nationality {

    private String country;
    private String pictureSrc;
    private String pictureDataSrc;
    private String pictureDataSrcset;
    private String pictureSrcSet;

}
