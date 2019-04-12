package org.yang.define.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRegistration {

    private String indirectConnectorId;
    
    
    public enum RegistrationStatusEnum {
        
        IN_REVIEW ("in-review"), 
        
        ACTIVE ("active"), 
        
        FAILED ("failed"), 
        
        INACTIVE ("inactive"), 
        
        PENDING ("pending"); 
        

        private final String value;

        RegistrationStatusEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RegistrationStatusEnum fromValue(String text) {
            for (RegistrationStatusEnum b : RegistrationStatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                return b;
                }
            }
            return null;
        }
    }

    private RegistrationStatusEnum registrationStatus;

    
    private DirectDepositRegistration directDepositRegistration;
    private String participantUserId;
    private String thirdPartyUserId;
    private java.util.List<String> allowedFeatures;
    private String participantApiRegistrationId;
    private String apiRegistrationId;
    private String logoUrl;
    private String fiAccountId;
    private String participantId;
    private String websiteUrl;
    private String name;
    private CustomerDetails customerDetails;

    public UserRegistration () {
    }

    @JsonProperty("indirectConnectorId")
    public String getIndirectConnectorId() {
        return indirectConnectorId;
    }

    public void setIndirectConnectorId(String indirectConnectorId) {
        this.indirectConnectorId = indirectConnectorId;
    }

    @JsonProperty("registrationStatus")
    public RegistrationStatusEnum getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(RegistrationStatusEnum registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    @JsonProperty("directDepositRegistration")
    public DirectDepositRegistration getDirectDepositRegistration() {
        return directDepositRegistration;
    }

    public void setDirectDepositRegistration(DirectDepositRegistration directDepositRegistration) {
        this.directDepositRegistration = directDepositRegistration;
    }

    @JsonProperty("participantUserId")
    public String getParticipantUserId() {
        return participantUserId;
    }

    public void setParticipantUserId(String participantUserId) {
        this.participantUserId = participantUserId;
    }

    @JsonProperty("thirdPartyUserId")
    public String getThirdPartyUserId() {
        return thirdPartyUserId;
    }

    public void setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
    }

    @JsonProperty("allowedFeatures")
    public java.util.List<String> getAllowedFeatures() {
        return allowedFeatures;
    }

    public void setAllowedFeatures(java.util.List<String> allowedFeatures) {
        this.allowedFeatures = allowedFeatures;
    }

    @JsonProperty("participantApiRegistrationId")
    public String getParticipantApiRegistrationId() {
        return participantApiRegistrationId;
    }

    public void setParticipantApiRegistrationId(String participantApiRegistrationId) {
        this.participantApiRegistrationId = participantApiRegistrationId;
    }

    @JsonProperty("apiRegistrationId")
    public String getApiRegistrationId() {
        return apiRegistrationId;
    }

    public void setApiRegistrationId(String apiRegistrationId) {
        this.apiRegistrationId = apiRegistrationId;
    }

    @JsonProperty("logoUrl")
    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @JsonProperty("fiAccountId")
    public String getFiAccountId() {
        return fiAccountId;
    }

    public void setFiAccountId(String fiAccountId) {
        this.fiAccountId = fiAccountId;
    }

    @JsonProperty("participantId")
    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    @JsonProperty("websiteUrl")
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("customerDetails")
    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UserRegistration UserRegistration = (UserRegistration) o;

        return Objects.equals(indirectConnectorId, UserRegistration.indirectConnectorId) &&
               Objects.equals(registrationStatus, UserRegistration.registrationStatus) &&
               Objects.equals(directDepositRegistration, UserRegistration.directDepositRegistration) &&
               Objects.equals(participantUserId, UserRegistration.participantUserId) &&
               Objects.equals(thirdPartyUserId, UserRegistration.thirdPartyUserId) &&
               Objects.equals(allowedFeatures, UserRegistration.allowedFeatures) &&
               Objects.equals(participantApiRegistrationId, UserRegistration.participantApiRegistrationId) &&
               Objects.equals(apiRegistrationId, UserRegistration.apiRegistrationId) &&
               Objects.equals(logoUrl, UserRegistration.logoUrl) &&
               Objects.equals(fiAccountId, UserRegistration.fiAccountId) &&
               Objects.equals(participantId, UserRegistration.participantId) &&
               Objects.equals(websiteUrl, UserRegistration.websiteUrl) &&
               Objects.equals(name, UserRegistration.name) &&
               Objects.equals(customerDetails, UserRegistration.customerDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indirectConnectorId, registrationStatus, directDepositRegistration, participantUserId, thirdPartyUserId, allowedFeatures, participantApiRegistrationId, apiRegistrationId, logoUrl, fiAccountId, participantId, websiteUrl, name, customerDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserRegistration {\n");
        sb.append("    indirectConnectorId: ").append(toIndentedString(indirectConnectorId)).append("\n");
        sb.append("    registrationStatus: ").append(toIndentedString(registrationStatus)).append("\n");
        sb.append("    directDepositRegistration: ").append(toIndentedString(directDepositRegistration)).append("\n");
        sb.append("    participantUserId: ").append(toIndentedString(participantUserId)).append("\n");
        sb.append("    thirdPartyUserId: ").append(toIndentedString(thirdPartyUserId)).append("\n");
        sb.append("    allowedFeatures: ").append(toIndentedString(allowedFeatures)).append("\n");
        sb.append("    participantApiRegistrationId: ").append(toIndentedString(participantApiRegistrationId)).append("\n");
        sb.append("    apiRegistrationId: ").append(toIndentedString(apiRegistrationId)).append("\n");
        sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
        sb.append("    fiAccountId: ").append(toIndentedString(fiAccountId)).append("\n");
        sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
        sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
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
