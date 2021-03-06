/*
 * FutDB
 * The Fifa Ultimate Team Database API is a JSON REST API.<br> We offer a complete, easy to understand JSON REST API with a complete database of players, prices, nations, leagues, clubs, and card-types.<br> Please note that some data fields are only delivered with a premium account.
 *
 * OpenAPI spec version: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package model;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

/**
 * PlayerGoalkeeper
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T14:15:34.912+02:00")
public class PlayerGoalkeeper {
  @SerializedName("diving")
  private Integer diving = null;

  @SerializedName("handling")
  private Integer handling = null;

  @SerializedName("kicking")
  private Integer kicking = null;

  @SerializedName("positioning")
  private Integer positioning = null;

  @SerializedName("reflexes")
  private Integer reflexes = null;

  public PlayerGoalkeeper diving(Integer diving) {
    this.diving = diving;
    return this;
  }

   /**
   * Get diving
   * @return diving
  **/

  public Integer getDiving() {
    return diving;
  }

  public void setDiving(Integer diving) {
    this.diving = diving;
  }

  public PlayerGoalkeeper handling(Integer handling) {
    this.handling = handling;
    return this;
  }

   /**
   * Get handling
   * @return handling
  **/

  public Integer getHandling() {
    return handling;
  }

  public void setHandling(Integer handling) {
    this.handling = handling;
  }

  public PlayerGoalkeeper kicking(Integer kicking) {
    this.kicking = kicking;
    return this;
  }

   /**
   * Get kicking
   * @return kicking
  **/

  public Integer getKicking() {
    return kicking;
  }

  public void setKicking(Integer kicking) {
    this.kicking = kicking;
  }

  public PlayerGoalkeeper positioning(Integer positioning) {
    this.positioning = positioning;
    return this;
  }

   /**
   * Get positioning
   * @return positioning
  **/

  public Integer getPositioning() {
    return positioning;
  }

  public void setPositioning(Integer positioning) {
    this.positioning = positioning;
  }

  public PlayerGoalkeeper reflexes(Integer reflexes) {
    this.reflexes = reflexes;
    return this;
  }

   /**
   * Get reflexes
   * @return reflexes
  **/

  public Integer getReflexes() {
    return reflexes;
  }

  public void setReflexes(Integer reflexes) {
    this.reflexes = reflexes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerGoalkeeper playerGoalkeeper = (PlayerGoalkeeper) o;
    return Objects.equals(this.diving, playerGoalkeeper.diving) &&
        Objects.equals(this.handling, playerGoalkeeper.handling) &&
        Objects.equals(this.kicking, playerGoalkeeper.kicking) &&
        Objects.equals(this.positioning, playerGoalkeeper.positioning) &&
        Objects.equals(this.reflexes, playerGoalkeeper.reflexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diving, handling, kicking, positioning, reflexes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerGoalkeeper {\n");
    
    sb.append("    diving: ").append(toIndentedString(diving)).append("\n");
    sb.append("    handling: ").append(toIndentedString(handling)).append("\n");
    sb.append("    kicking: ").append(toIndentedString(kicking)).append("\n");
    sb.append("    positioning: ").append(toIndentedString(positioning)).append("\n");
    sb.append("    reflexes: ").append(toIndentedString(reflexes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

