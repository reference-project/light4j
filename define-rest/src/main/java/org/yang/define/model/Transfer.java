package org.yang.define.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transfer {

    private java.lang.Double amount;
    private String senderMessage;
    private Integer notificationStatus;
    private TransferAuthentication transferAuthentication;
    private String senderRegistrationName;
    private String sourceTransferId;
    private Object supplementaryInfo;
    private String creationDate;
    private String expiryDate;
    
    
    public enum TransactionTypeEnum {
        
        INCOMING ("incoming"), 
        
        OUTGOING ("outgoing"); 
        

        private final String value;

        TransactionTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TransactionTypeEnum fromValue(String text) {
            for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                return b;
                }
            }
            return null;
        }
    }

    private TransactionTypeEnum transactionType;

    
    private Object sentTo;
    private String referenceNumber;
    private String recipientMessage;
    private String requestReferenceNumber;
    
    
    public enum TransferTypeEnum {
        
        REGULAR_TRANSFER ("REGULAR_TRANSFER"), 
        
        MONEY_REQUEST_FULFILLMENT ("MONEY_REQUEST_FULFILLMENT"), 
        
        DIRECT_DEPOSIT ("DIRECT_DEPOSIT"); 
        

        private final String value;

        TransferTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TransferTypeEnum fromValue(String text) {
            for (TransferTypeEnum b : TransferTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                return b;
                }
            }
            return null;
        }
    }

    private TransferTypeEnum transferType;

    
    private String currency;
    private String receivedDate;
    private Integer status;

    public Transfer () {
    }

    @JsonProperty("amount")
    public java.lang.Double getAmount() {
        return amount;
    }

    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }

    @JsonProperty("senderMessage")
    public String getSenderMessage() {
        return senderMessage;
    }

    public void setSenderMessage(String senderMessage) {
        this.senderMessage = senderMessage;
    }

    @JsonProperty("notificationStatus")
    public Integer getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(Integer notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    @JsonProperty("transferAuthentication")
    public TransferAuthentication getTransferAuthentication() {
        return transferAuthentication;
    }

    public void setTransferAuthentication(TransferAuthentication transferAuthentication) {
        this.transferAuthentication = transferAuthentication;
    }

    @JsonProperty("senderRegistrationName")
    public String getSenderRegistrationName() {
        return senderRegistrationName;
    }

    public void setSenderRegistrationName(String senderRegistrationName) {
        this.senderRegistrationName = senderRegistrationName;
    }

    @JsonProperty("sourceTransferId")
    public String getSourceTransferId() {
        return sourceTransferId;
    }

    public void setSourceTransferId(String sourceTransferId) {
        this.sourceTransferId = sourceTransferId;
    }

    @JsonProperty("supplementaryInfo")
    public Object getSupplementaryInfo() {
        return supplementaryInfo;
    }

    public void setSupplementaryInfo(Object supplementaryInfo) {
        this.supplementaryInfo = supplementaryInfo;
    }

    @JsonProperty("creationDate")
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("expiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @JsonProperty("transactionType")
    public TransactionTypeEnum getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionTypeEnum transactionType) {
        this.transactionType = transactionType;
    }

    @JsonProperty("sentTo")
    public Object getSentTo() {
        return sentTo;
    }

    public void setSentTo(Object sentTo) {
        this.sentTo = sentTo;
    }

    @JsonProperty("referenceNumber")
    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    @JsonProperty("recipientMessage")
    public String getRecipientMessage() {
        return recipientMessage;
    }

    public void setRecipientMessage(String recipientMessage) {
        this.recipientMessage = recipientMessage;
    }

    @JsonProperty("requestReferenceNumber")
    public String getRequestReferenceNumber() {
        return requestReferenceNumber;
    }

    public void setRequestReferenceNumber(String requestReferenceNumber) {
        this.requestReferenceNumber = requestReferenceNumber;
    }

    @JsonProperty("transferType")
    public TransferTypeEnum getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferTypeEnum transferType) {
        this.transferType = transferType;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("receivedDate")
    public String getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(String receivedDate) {
        this.receivedDate = receivedDate;
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

        Transfer Transfer = (Transfer) o;

        return Objects.equals(amount, Transfer.amount) &&
               Objects.equals(senderMessage, Transfer.senderMessage) &&
               Objects.equals(notificationStatus, Transfer.notificationStatus) &&
               Objects.equals(transferAuthentication, Transfer.transferAuthentication) &&
               Objects.equals(senderRegistrationName, Transfer.senderRegistrationName) &&
               Objects.equals(sourceTransferId, Transfer.sourceTransferId) &&
               Objects.equals(supplementaryInfo, Transfer.supplementaryInfo) &&
               Objects.equals(creationDate, Transfer.creationDate) &&
               Objects.equals(expiryDate, Transfer.expiryDate) &&
               Objects.equals(transactionType, Transfer.transactionType) &&
               Objects.equals(sentTo, Transfer.sentTo) &&
               Objects.equals(referenceNumber, Transfer.referenceNumber) &&
               Objects.equals(recipientMessage, Transfer.recipientMessage) &&
               Objects.equals(requestReferenceNumber, Transfer.requestReferenceNumber) &&
               Objects.equals(transferType, Transfer.transferType) &&
               Objects.equals(currency, Transfer.currency) &&
               Objects.equals(receivedDate, Transfer.receivedDate) &&
               Objects.equals(status, Transfer.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, senderMessage, notificationStatus, transferAuthentication, senderRegistrationName, sourceTransferId, supplementaryInfo, creationDate, expiryDate, transactionType, sentTo, referenceNumber, recipientMessage, requestReferenceNumber, transferType, currency, receivedDate, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Transfer {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    senderMessage: ").append(toIndentedString(senderMessage)).append("\n");
        sb.append("    notificationStatus: ").append(toIndentedString(notificationStatus)).append("\n");
        sb.append("    transferAuthentication: ").append(toIndentedString(transferAuthentication)).append("\n");
        sb.append("    senderRegistrationName: ").append(toIndentedString(senderRegistrationName)).append("\n");
        sb.append("    sourceTransferId: ").append(toIndentedString(sourceTransferId)).append("\n");
        sb.append("    supplementaryInfo: ").append(toIndentedString(supplementaryInfo)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
        sb.append("    sentTo: ").append(toIndentedString(sentTo)).append("\n");
        sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
        sb.append("    recipientMessage: ").append(toIndentedString(recipientMessage)).append("\n");
        sb.append("    requestReferenceNumber: ").append(toIndentedString(requestReferenceNumber)).append("\n");
        sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
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
