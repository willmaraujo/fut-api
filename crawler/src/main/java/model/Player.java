package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Player {

    private Metadata metadata;
    private String playerId;
    private String name;
    private String pictureSrc;
    private String pictureDataSrc;
    private String pictureDataSrcset;
    private String pictureSrcSet;
    private String ovr;
    private String pot;
    private List<String> positions;
    private Integer age;
    private Integer hits;
    private Integer height;
    private Integer weight;
    private String preferredFoot;
    private String Birth;
    private String workRate;
    private Integer weakFoot;
    private Integer skillMoves;
    private Integer value;
    private Integer wage;
    private Nationality nationality;
    private List<String> nationalPositions;
    private Integer nationalKitNumber;
    private List<String> clubPositions;
    private Integer clubKitNumber;
    private Club club;
    private String joinedClub;
    private Integer contractLength;
    private BallSkill ballSkills;
    private Defence defence;
    private Mental mental;
    private Passing passing;
    private Physical physical;
    private Shooting shooting;
    private Goalkeeper goalkeeper;
    private List<String> specialities;
    private List<String> traits;

}
