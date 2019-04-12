package org.yang.define.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MoneyRequest {

    private java.lang.Double amount;
    private Integer notificationStatus;
    private Boolean supressResponderNotifications;
    private String creationDate;
    private java.lang.Double fulfillAmount;
    private Object requestedFrom;
    private String expiryDate;
    private Boolean editableFulfillAmount;
    private String referenceNumber;
    private String currency;
    private String responderMessage;
    private String requesterMessage;
    private Invoice invoice;
    private String returnURL;
    private String sourceMoneyRequestId;
    private Integer status;

    public MoneyRequest () {
    }

    @JsonProperty("amount")
    public java.lang.Double getAmount() {
        return amount;
    }

    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }

    @JsonProperty("notificationStatus")
    public Integer getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(Integer notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    @JsonProperty("supressResponderNotifications")
    public Boolean getSupressResponderNotifications() {
        return supressResponderNotifications;
    }

    public void setSupressResponderNotifications(Boolean supressResponderNotifications) {
        this.supressResponderNotifications = supressResponderNotifications;
    }

    @JsonProperty("creationDate")
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("fulfillAmount")
    public java.lang.Double getFulfillAmount() {
        return fulfillAmount;
    }

    public void setFulfillAmount(java.lang.Double fulfillAmount) {
        this.fulfillAmount = fulfillAmount;
    }

    @JsonProperty("requestedFrom")
    public Object getRequestedFrom() {
        return requestedFrom;
    }

    public void setRequestedFrom(Object requestedFrom) {
        this.requestedFrom = requestedFrom;
    }

    @JsonProperty("expiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @JsonProperty("editableFulfillAmount")
    public Boolean getEditableFulfillAmount() {
        return editableFulfillAmount;
    }

    public void setEditableFulfillAmount(Boolean editableFulfillAmount) {
        this.editableFulfillAmount = editableFulfillAmount;
    }

    @JsonProperty("referenceNumber")
    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("responderMessage")
    public String getResponderMessage() {
        return responderMessage;
    }

    public void setResponderMessage(String responderMessage) {
        this.responderMessage = responderMessage;
    }

    @JsonProperty("requesterMessage")
    public String getRequesterMessage() {
        return requesterMessage;
    }

    public void setRequesterMessage(String requesterMessage) {
        this.requesterMessage = requesterMessage;
    }

    @JsonProperty("invoice")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @JsonProperty("returnURL")
    public String getReturnURL() {
        return returnURL;
    }

    public void setReturnURL(String returnURL) {
        this.returnURL = returnURL;
    }

    @JsonProperty("sourceMoneyRequestId")
    public String getSourceMoneyRequestId() {
        return sourceMoneyRequestId;
    }

    public void setSourceMoneyRequestId(String sourceMoneyRequestId) {
        this.sourceMoneyRequestId = sourceMoneyRequestId;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MoneyRequest MoneyRequest = (MoneyRequest) o;

        return Objects.equals(amount, MoneyRequest.amount) &&
               Objects.equals(notificationStatus, MoneyRequest.notificationStatus) &&
               Objects.equals(supressResponderNotifications, MoneyRequest.supressResponderNotifications) &&
               Objects.equals(creationDate, MoneyRequest.creationDate) &&
               Objects.equals(fulfillAmount, MoneyRequest.fulfillAmount) &&
               Objects.equals(requestedFrom, MoneyRequest.requestedFrom) &&
               Objects.equals(expiryDate, MoneyRequest.expiryDate) &&
               Objects.equals(editableFulfillAmount, MoneyRequest.editableFulfillAmount) &&
               Objects.equals(referenceNumber, MoneyRequest.referenceNumber) &&
               Objects.equals(currency, MoneyRequest.currency) &&
               Objects.equals(responderMessage, MoneyRequest.responderMessage) &&
               Objects.equals(requesterMessage, MoneyRequest.requesterMessage) &&
               Objects.equals(invoice, MoneyRequest.invoice) &&
               Objects.equals(returnURL, MoneyRequest.returnURL) &&
               Objects.equals(sourceMoneyRequestId, MoneyRequest.sourceMoneyRequestId) &&
               Objects.equals(status, MoneyRequest.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, notificationStatus, supressResponderNotifications, creationDate, fulfillAmount, requestedFrom, expiryDate, editableFulfillAmount, referenceNumber, currency, responderMessage, requesterMessage, invoice, returnURL, sourceMoneyRequestId, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoneyRequest {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    notificationStatus: ").append(toIndentedString(notificationStatus)).append("\n");
        sb.append("    supressResponderNotifications: ").append(toIndentedString(supressResponderNotifications)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    fulfillAmount: ").append(toIndentedString(fulfillAmount)).append("\n");
        sb.append("    requestedFrom: ").append(toIndentedString(requestedFrom)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    editableFulfillAmount: ").append(toIndentedString(editableFulfillAmount)).append("\n");
        sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    responderMessage: ").append(toIndentedString(responderMessage)).append("\n");
        sb.append("    requesterMessage: ").append(toIndentedString(requesterMessage)).append("\n");
        sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
        sb.append("    returnURL: ").append(toIndentedString(returnURL)).append("\n");
        sb.append("    sourceMoneyRequestId: ").append(toIndentedString(sourceMoneyRequestId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
