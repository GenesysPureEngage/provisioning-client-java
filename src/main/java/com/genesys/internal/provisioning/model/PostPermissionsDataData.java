/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.91.4963
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.provisioning.model;

import java.util.Objects;
import java.util.Arrays;
import com.genesys.internal.provisioning.model.PostPermissionsDataDataObjectIds;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PostPermissionsDataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-03T19:44:33.854Z")
public class PostPermissionsDataData {
  @SerializedName("dn_type")
  private String dnType = null;

  @SerializedName("folder_type")
  private String folderType = null;

  @SerializedName("objectIds")
  private List<PostPermissionsDataDataObjectIds> objectIds = new ArrayList<PostPermissionsDataDataObjectIds>();

  public PostPermissionsDataData dnType(String dnType) {
    this.dnType = dnType;
    return this;
  }

   /**
   * If the object_type is &#39;dns&#39;, then you may specify the DN type (for example, CFGRoutingPoint). This parameter does not affect request results but may increase performance For possible values, see [CfgDNType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDNType) in the Platform SDK documentation. 
   * @return dnType
  **/
  @ApiModelProperty(value = "If the object_type is 'dns', then you may specify the DN type (for example, CFGRoutingPoint). This parameter does not affect request results but may increase performance For possible values, see [CfgDNType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDNType) in the Platform SDK documentation. ")
  public String getDnType() {
    return dnType;
  }

  public void setDnType(String dnType) {
    this.dnType = dnType;
  }

  public PostPermissionsDataData folderType(String folderType) {
    this.folderType = folderType;
    return this;
  }

   /**
   * If the object_type is &#39;folders&#39;, then you may specify the object type of the folders  (for example, CFGPerson). This parameter does not affect request results but may increase performance For possible values, see [CfgObjectType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgObjectType) in the Platform SDK documentation. 
   * @return folderType
  **/
  @ApiModelProperty(value = "If the object_type is 'folders', then you may specify the object type of the folders  (for example, CFGPerson). This parameter does not affect request results but may increase performance For possible values, see [CfgObjectType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgObjectType) in the Platform SDK documentation. ")
  public String getFolderType() {
    return folderType;
  }

  public void setFolderType(String folderType) {
    this.folderType = folderType;
  }

  public PostPermissionsDataData objectIds(List<PostPermissionsDataDataObjectIds> objectIds) {
    this.objectIds = objectIds;
    return this;
  }

  public PostPermissionsDataData addObjectIdsItem(PostPermissionsDataDataObjectIds objectIdsItem) {
    this.objectIds.add(objectIdsItem);
    return this;
  }

   /**
   * Array of object DBIDs to query permissions. 
   * @return objectIds
  **/
  @ApiModelProperty(required = true, value = "Array of object DBIDs to query permissions. ")
  public List<PostPermissionsDataDataObjectIds> getObjectIds() {
    return objectIds;
  }

  public void setObjectIds(List<PostPermissionsDataDataObjectIds> objectIds) {
    this.objectIds = objectIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPermissionsDataData postPermissionsDataData = (PostPermissionsDataData) o;
    return Objects.equals(this.dnType, postPermissionsDataData.dnType) &&
        Objects.equals(this.folderType, postPermissionsDataData.folderType) &&
        Objects.equals(this.objectIds, postPermissionsDataData.objectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnType, folderType, objectIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPermissionsDataData {\n");
    
    sb.append("    dnType: ").append(toIndentedString(dnType)).append("\n");
    sb.append("    folderType: ").append(toIndentedString(folderType)).append("\n");
    sb.append("    objectIds: ").append(toIndentedString(objectIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

