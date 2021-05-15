package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Metadata {

    private String language;
    private Date extractedDate;
}
