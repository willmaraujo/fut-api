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
 * ClubItemResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T14:15:34.912+02:00")
public class ClubItemResponse {
  @SerializedName("item")
  private Club item = null;

  public ClubItemResponse item(Club item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  public Club getItem() {
    return item;
  }

  public void setItem(Club item) {
    this.item = item;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClubItemResponse clubItemResponse = (ClubItemResponse) o;
    return Objects.equals(this.item, clubItemResponse.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClubItemResponse {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

