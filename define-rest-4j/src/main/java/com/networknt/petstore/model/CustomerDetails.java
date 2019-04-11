package com.networknt.petstore.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDetails {

    private Object legalName;
    
    
    public enum CustomerTypeEnum {
        
        RETAIL ("retail"), 
        
        SMALL_BUSINESS ("small_business"), 
        
        CORPORATE ("corporate"); 
        

        private final String value;

        CustomerTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CustomerTypeEnum fromValue(String text) {
            for (CustomerTypeEnum b : CustomerTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                return b;
                }
            }
            return null;
        }
    }

    private CustomerTypeEnum customerType;

    
    private String registrationName;

    public CustomerDetails () {
    }

    @JsonProperty("legalName")
    public Object getLegalName() {
        return legalName;
    }

    public void setLegalName(Object legalName) {
        this.legalName = legalName;
    }

    @JsonProperty("customerType")
    public CustomerTypeEnum getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerTypeEnum customerType) {
        this.customerType = customerType;
    }

    @JsonProperty("registrationName")
    public String getRegistrationName() {
        return registrationName;
    }

    public void setRegistrationName(String registrationName) {
        this.registrationName = registrationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CustomerDetails CustomerDetails = (CustomerDetails) o;

        return Objects.equals(legalName, CustomerDetails.legalName) &&
               Objects.equals(customerType, CustomerDetails.customerType) &&
               Objects.equals(registrationName, CustomerDetails.registrationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legalName, customerType, registrationName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerDetails {\n");
        sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
        sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
        sb.append("    registrationName: ").append(toIndentedString(registrationName)).append("\n");
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
