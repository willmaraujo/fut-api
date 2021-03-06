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
 * Price
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T14:15:34.912+02:00")
public class Price {
  @SerializedName("price")
  private Integer price = null;

  @SerializedName("min_price")
  private Integer minPrice = null;

  @SerializedName("max_price")
  private Integer maxPrice = null;

  @SerializedName("prp")
  private Integer prp = null;

  @SerializedName("last_checked")
  private DateTimeInterface lastChecked = null;

  public Price price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Price minPrice(Integer minPrice) {
    this.minPrice = minPrice;
    return this;
  }

   /**
   * Get minPrice
   * @return minPrice
  **/

  public Integer getMinPrice() {
    return minPrice;
  }

  public void setMinPrice(Integer minPrice) {
    this.minPrice = minPrice;
  }

  public Price maxPrice(Integer maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

   /**
   * Get maxPrice
   * @return maxPrice
  **/

  public Integer getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(Integer maxPrice) {
    this.maxPrice = maxPrice;
  }

  public Price prp(Integer prp) {
    this.prp = prp;
    return this;
  }

   /**
   * Get prp
   * @return prp
  **/

  public Integer getPrp() {
    return prp;
  }

  public void setPrp(Integer prp) {
    this.prp = prp;
  }

  public Price lastChecked(DateTimeInterface lastChecked) {
    this.lastChecked = lastChecked;
    return this;
  }

   /**
   * Get lastChecked
   * @return lastChecked
  **/

  public DateTimeInterface getLastChecked() {
    return lastChecked;
  }

  public void setLastChecked(DateTimeInterface lastChecked) {
    this.lastChecked = lastChecked;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.price, price.price) &&
        Objects.equals(this.minPrice, price.minPrice) &&
        Objects.equals(this.maxPrice, price.maxPrice) &&
        Objects.equals(this.prp, price.prp) &&
        Objects.equals(this.lastChecked, price.lastChecked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, minPrice, maxPrice, prp, lastChecked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
    sb.append("    prp: ").append(toIndentedString(prp)).append("\n");
    sb.append("    lastChecked: ").append(toIndentedString(lastChecked)).append("\n");
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

