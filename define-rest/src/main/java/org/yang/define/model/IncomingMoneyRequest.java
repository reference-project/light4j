package org.yang.define.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IncomingMoneyRequest {

    private CustomerDetails requesterDetails;
    private java.util.List<Object> requesterNotifications;
    private MoneyRequest moneyRequest;

    public IncomingMoneyRequest () {
    }

    @JsonProperty("requesterDetails")
    public CustomerDetails getRequesterDetails() {
        return requesterDetails;
    }

    public void setRequesterDetails(CustomerDetails requesterDetails) {
        this.requesterDetails = requesterDetails;
    }

    @JsonProperty("requesterNotifications")
    public java.util.List<Object> getRequesterNotifications() {
        return requesterNotifications;
    }

    public void setRequesterNotifications(java.util.List<Object> requesterNotifications) {
        this.requesterNotifications = requesterNotifications;
    }

    @JsonProperty("moneyRequest")
    public MoneyRequest getMoneyRequest() {
        return moneyRequest;
    }

    public void setMoneyRequest(MoneyRequest moneyRequest) {
        this.moneyRequest = moneyRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        IncomingMoneyRequest IncomingMoneyRequest = (IncomingMoneyRequest) o;

        return Objects.equals(requesterDetails, IncomingMoneyRequest.requesterDetails) &&
               Objects.equals(requesterNotifications, IncomingMoneyRequest.requesterNotifications) &&
               Objects.equals(moneyRequest, IncomingMoneyRequest.moneyRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requesterDetails, requesterNotifications, moneyRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncomingMoneyRequest {\n");
        sb.append("    requesterDetails: ").append(toIndentedString(requesterDetails)).append("\n");
        sb.append("    requesterNotifications: ").append(toIndentedString(requesterNotifications)).append("\n");
        sb.append("    moneyRequest: ").append(toIndentedString(moneyRequest)).append("\n");
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
