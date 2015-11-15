/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph;





/**
 * The type Message.
*/
public class Message extends OutlookItem {

    public Message(){
        setODataType("#microsoft.graph.message");
    }
            
    private java.util.Calendar ReceivedDateTime;
     
    /**
    * Gets the Received Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getReceivedDateTime() {
        return this.ReceivedDateTime; 
    }

    /**
    * Sets the Received Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setReceivedDateTime(java.util.Calendar value) { 
        this.ReceivedDateTime = value; 
        valueChanged("ReceivedDateTime", value);

    }
            
    private java.util.Calendar SentDateTime;
     
    /**
    * Gets the Sent Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getSentDateTime() {
        return this.SentDateTime; 
    }

    /**
    * Sets the Sent Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setSentDateTime(java.util.Calendar value) { 
        this.SentDateTime = value; 
        valueChanged("SentDateTime", value);

    }
            
    private Boolean HasAttachments;
     
    /**
    * Gets the Has Attachments.
    *
    * @return the Boolean
    */
    public Boolean getHasAttachments() {
        return this.HasAttachments; 
    }

    /**
    * Sets the Has Attachments.
    *
    * @param value the Boolean
    */
    public void setHasAttachments(Boolean value) { 
        this.HasAttachments = value; 
        valueChanged("HasAttachments", value);

    }
            
    private String Subject;
     
    /**
    * Gets the Subject.
    *
    * @return the String
    */
    public String getSubject() {
        return this.Subject; 
    }

    /**
    * Sets the Subject.
    *
    * @param value the String
    */
    public void setSubject(String value) { 
        this.Subject = value; 
        valueChanged("Subject", value);

    }
            
    private ItemBody Body;
     
    /**
    * Gets the Body.
    *
    * @return the ItemBody
    */
    public ItemBody getBody() {
        return this.Body; 
    }

    /**
    * Sets the Body.
    *
    * @param value the ItemBody
    */
    public void setBody(ItemBody value) { 
        this.Body = value; 
        valueChanged("Body", value);

    }
            
    private String BodyPreview;
     
    /**
    * Gets the Body Preview.
    *
    * @return the String
    */
    public String getBodyPreview() {
        return this.BodyPreview; 
    }

    /**
    * Sets the Body Preview.
    *
    * @param value the String
    */
    public void setBodyPreview(String value) { 
        this.BodyPreview = value; 
        valueChanged("BodyPreview", value);

    }
            
    private Importance Importance;
     
    /**
    * Gets the Importance.
    *
    * @return the Importance
    */
    public Importance getImportance() {
        return this.Importance; 
    }

    /**
    * Sets the Importance.
    *
    * @param value the Importance
    */
    public void setImportance(Importance value) { 
        this.Importance = value; 
        valueChanged("Importance", value);

    }
            
    private String ParentFolderId;
     
    /**
    * Gets the Parent Folder Id.
    *
    * @return the String
    */
    public String getParentFolderId() {
        return this.ParentFolderId; 
    }

    /**
    * Sets the Parent Folder Id.
    *
    * @param value the String
    */
    public void setParentFolderId(String value) { 
        this.ParentFolderId = value; 
        valueChanged("ParentFolderId", value);

    }
            
    private Recipient Sender;
     
    /**
    * Gets the Sender.
    *
    * @return the Recipient
    */
    public Recipient getSender() {
        return this.Sender; 
    }

    /**
    * Sets the Sender.
    *
    * @param value the Recipient
    */
    public void setSender(Recipient value) { 
        this.Sender = value; 
        valueChanged("Sender", value);

    }
            
    private Recipient From;
     
    /**
    * Gets the From.
    *
    * @return the Recipient
    */
    public Recipient getFrom() {
        return this.From; 
    }

    /**
    * Sets the From.
    *
    * @param value the Recipient
    */
    public void setFrom(Recipient value) { 
        this.From = value; 
        valueChanged("From", value);

    }
    
        
    private java.util.List<Recipient> ToRecipients = null;
    
    
     
    /**
    * Gets the To Recipients.
    *
    * @return the java.util.List<Recipient>
    */
    public java.util.List<Recipient> getToRecipients() {
        return this.ToRecipients; 
    }

    /**
    * Sets the To Recipients.
    *
    * @param value the java.util.List<Recipient>
    */
    public void setToRecipients(java.util.List<Recipient> value) { 
        this.ToRecipients = value; 
        valueChanged("ToRecipients", value);

    }
    
        
    private java.util.List<Recipient> CcRecipients = null;
    
    
     
    /**
    * Gets the Cc Recipients.
    *
    * @return the java.util.List<Recipient>
    */
    public java.util.List<Recipient> getCcRecipients() {
        return this.CcRecipients; 
    }

    /**
    * Sets the Cc Recipients.
    *
    * @param value the java.util.List<Recipient>
    */
    public void setCcRecipients(java.util.List<Recipient> value) { 
        this.CcRecipients = value; 
        valueChanged("CcRecipients", value);

    }
    
        
    private java.util.List<Recipient> BccRecipients = null;
    
    
     
    /**
    * Gets the Bcc Recipients.
    *
    * @return the java.util.List<Recipient>
    */
    public java.util.List<Recipient> getBccRecipients() {
        return this.BccRecipients; 
    }

    /**
    * Sets the Bcc Recipients.
    *
    * @param value the java.util.List<Recipient>
    */
    public void setBccRecipients(java.util.List<Recipient> value) { 
        this.BccRecipients = value; 
        valueChanged("BccRecipients", value);

    }
    
        
    private java.util.List<Recipient> ReplyTo = null;
    
    
     
    /**
    * Gets the Reply To.
    *
    * @return the java.util.List<Recipient>
    */
    public java.util.List<Recipient> getReplyTo() {
        return this.ReplyTo; 
    }

    /**
    * Sets the Reply To.
    *
    * @param value the java.util.List<Recipient>
    */
    public void setReplyTo(java.util.List<Recipient> value) { 
        this.ReplyTo = value; 
        valueChanged("ReplyTo", value);

    }
            
    private String ConversationId;
     
    /**
    * Gets the Conversation Id.
    *
    * @return the String
    */
    public String getConversationId() {
        return this.ConversationId; 
    }

    /**
    * Sets the Conversation Id.
    *
    * @param value the String
    */
    public void setConversationId(String value) { 
        this.ConversationId = value; 
        valueChanged("ConversationId", value);

    }
            
    private ItemBody UniqueBody;
     
    /**
    * Gets the Unique Body.
    *
    * @return the ItemBody
    */
    public ItemBody getUniqueBody() {
        return this.UniqueBody; 
    }

    /**
    * Sets the Unique Body.
    *
    * @param value the ItemBody
    */
    public void setUniqueBody(ItemBody value) { 
        this.UniqueBody = value; 
        valueChanged("UniqueBody", value);

    }
            
    private Boolean IsDeliveryReceiptRequested;
     
    /**
    * Gets the Is Delivery Receipt Requested.
    *
    * @return the Boolean
    */
    public Boolean getIsDeliveryReceiptRequested() {
        return this.IsDeliveryReceiptRequested; 
    }

    /**
    * Sets the Is Delivery Receipt Requested.
    *
    * @param value the Boolean
    */
    public void setIsDeliveryReceiptRequested(Boolean value) { 
        this.IsDeliveryReceiptRequested = value; 
        valueChanged("IsDeliveryReceiptRequested", value);

    }
            
    private Boolean IsReadReceiptRequested;
     
    /**
    * Gets the Is Read Receipt Requested.
    *
    * @return the Boolean
    */
    public Boolean getIsReadReceiptRequested() {
        return this.IsReadReceiptRequested; 
    }

    /**
    * Sets the Is Read Receipt Requested.
    *
    * @param value the Boolean
    */
    public void setIsReadReceiptRequested(Boolean value) { 
        this.IsReadReceiptRequested = value; 
        valueChanged("IsReadReceiptRequested", value);

    }
            
    private Boolean IsRead;
     
    /**
    * Gets the Is Read.
    *
    * @return the Boolean
    */
    public Boolean getIsRead() {
        return this.IsRead; 
    }

    /**
    * Sets the Is Read.
    *
    * @param value the Boolean
    */
    public void setIsRead(Boolean value) { 
        this.IsRead = value; 
        valueChanged("IsRead", value);

    }
            
    private Boolean IsDraft;
     
    /**
    * Gets the Is Draft.
    *
    * @return the Boolean
    */
    public Boolean getIsDraft() {
        return this.IsDraft; 
    }

    /**
    * Sets the Is Draft.
    *
    * @param value the Boolean
    */
    public void setIsDraft(Boolean value) { 
        this.IsDraft = value; 
        valueChanged("IsDraft", value);

    }
            
    private String WebLink;
     
    /**
    * Gets the Web Link.
    *
    * @return the String
    */
    public String getWebLink() {
        return this.WebLink; 
    }

    /**
    * Sets the Web Link.
    *
    * @param value the String
    */
    public void setWebLink(String value) { 
        this.WebLink = value; 
        valueChanged("WebLink", value);

    }
    
        
    private java.util.List<Attachment> Attachments = null;
    
    
     
    /**
    * Gets the Attachments.
    *
    * @return the java.util.List<Attachment>
    */
    public java.util.List<Attachment> getAttachments() {
        return this.Attachments; 
    }

    /**
    * Sets the Attachments.
    *
    * @param value the java.util.List<Attachment>
    */
    public void setAttachments(java.util.List<Attachment> value) { 
        this.Attachments = value; 
        valueChanged("Attachments", value);

    }
}

