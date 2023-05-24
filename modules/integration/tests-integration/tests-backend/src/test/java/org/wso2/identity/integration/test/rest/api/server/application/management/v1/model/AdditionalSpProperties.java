package org.wso2.identity.integration.test.rest.api.server.application.management.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

public class AdditionalSpProperties {

    private String name;
    private String value;
    private String displayName;

    /**
     *
     **/
    public AdditionalSpProperties name(String name) {

        this.name = name;
        return this;
    }

    @ApiModelProperty(example = "isB2BSelfServiceApp")
    @JsonProperty("name")
    @Valid
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     **/
    public AdditionalSpProperties value(String value) {

        this.value = value;
        return this;
    }

    @ApiModelProperty(example = "isB2BSelfServiceApp")
    @JsonProperty("value")
    @Valid
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    /**
     *
     **/
    public AdditionalSpProperties displayName(String displayName) {

        this.displayName = displayName;
        return this;
    }

    @ApiModelProperty(example = "isB2BSelfServiceApp")
    @JsonProperty("displayName")
    @Valid
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdditionalSpProperties additionalSpProperties = (AdditionalSpProperties) o;
        return Objects.equals(this.name, additionalSpProperties.name) &&
                Objects.equals(this.value, additionalSpProperties.value) &&
                Objects.equals(this.displayName, additionalSpProperties.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, displayName);
    }

    @Override
    public String toString() {

        return "class InboundProtocolListItem {\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    value: " + toIndentedString(value) + "\n" +
                "    displayName: " + toIndentedString(displayName) + "\n" +
                "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString();
    }
}
