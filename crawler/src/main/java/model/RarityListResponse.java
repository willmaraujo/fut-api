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


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * RarityListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T14:15:34.912+02:00")
public class RarityListResponse {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("count_total")
  private Integer countTotal = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("page_total")
  private Integer pageTotal = null;

  @SerializedName("items_per_page")
  private Integer itemsPerPage = null;

  @SerializedName("items")
  private List<Rarity> items = null;

  public RarityListResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public RarityListResponse countTotal(Integer countTotal) {
    this.countTotal = countTotal;
    return this;
  }

   /**
   * Get countTotal
   * @return countTotal
  **/

  public Integer getCountTotal() {
    return countTotal;
  }

  public void setCountTotal(Integer countTotal) {
    this.countTotal = countTotal;
  }

  public RarityListResponse page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public RarityListResponse pageTotal(Integer pageTotal) {
    this.pageTotal = pageTotal;
    return this;
  }

   /**
   * Get pageTotal
   * @return pageTotal
  **/

  public Integer getPageTotal() {
    return pageTotal;
  }

  public void setPageTotal(Integer pageTotal) {
    this.pageTotal = pageTotal;
  }

  public RarityListResponse itemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

   /**
   * Get itemsPerPage
   * @return itemsPerPage
  **/

  public Integer getItemsPerPage() {
    return itemsPerPage;
  }

  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }

  public RarityListResponse items(List<Rarity> items) {
    this.items = items;
    return this;
  }

  public RarityListResponse addItemsItem(Rarity itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Rarity>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/

  public List<Rarity> getItems() {
    return items;
  }

  public void setItems(List<Rarity> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RarityListResponse rarityListResponse = (RarityListResponse) o;
    return Objects.equals(this.count, rarityListResponse.count) &&
        Objects.equals(this.countTotal, rarityListResponse.countTotal) &&
        Objects.equals(this.page, rarityListResponse.page) &&
        Objects.equals(this.pageTotal, rarityListResponse.pageTotal) &&
        Objects.equals(this.itemsPerPage, rarityListResponse.itemsPerPage) &&
        Objects.equals(this.items, rarityListResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, countTotal, page, pageTotal, itemsPerPage, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RarityListResponse {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    countTotal: ").append(toIndentedString(countTotal)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageTotal: ").append(toIndentedString(pageTotal)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
