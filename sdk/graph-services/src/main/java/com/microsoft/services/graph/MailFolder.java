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
 * The type Mail Folder.
*/
public class MailFolder extends Entity {

    public MailFolder(){
        setODataType("#microsoft.graph.mailFolder");
    }
            
    private String displayName;
     
    /**
    * Gets the display Name.
    *
    * @return the String
    */
    public String getDisplayName() {
        return this.displayName; 
    }

    /**
    * Sets the display Name.
    *
    * @param value the String
    */
    public void setDisplayName(String value) { 
        this.displayName = value; 
        valueChanged("displayName", value);

    }
            
    private String parentFolderId;
     
    /**
    * Gets the parent Folder Id.
    *
    * @return the String
    */
    public String getParentFolderId() {
        return this.parentFolderId; 
    }

    /**
    * Sets the parent Folder Id.
    *
    * @param value the String
    */
    public void setParentFolderId(String value) { 
        this.parentFolderId = value; 
        valueChanged("parentFolderId", value);

    }
            
    private Integer childFolderCount;
     
    /**
    * Gets the child Folder Count.
    *
    * @return the Integer
    */
    public Integer getChildFolderCount() {
        return this.childFolderCount; 
    }

    /**
    * Sets the child Folder Count.
    *
    * @param value the Integer
    */
    public void setChildFolderCount(Integer value) { 
        this.childFolderCount = value; 
        valueChanged("childFolderCount", value);

    }
            
    private Integer unreadItemCount;
     
    /**
    * Gets the unread Item Count.
    *
    * @return the Integer
    */
    public Integer getUnreadItemCount() {
        return this.unreadItemCount; 
    }

    /**
    * Sets the unread Item Count.
    *
    * @param value the Integer
    */
    public void setUnreadItemCount(Integer value) { 
        this.unreadItemCount = value; 
        valueChanged("unreadItemCount", value);

    }
            
    private Integer totalItemCount;
     
    /**
    * Gets the total Item Count.
    *
    * @return the Integer
    */
    public Integer getTotalItemCount() {
        return this.totalItemCount; 
    }

    /**
    * Sets the total Item Count.
    *
    * @param value the Integer
    */
    public void setTotalItemCount(Integer value) { 
        this.totalItemCount = value; 
        valueChanged("totalItemCount", value);

    }
    
        
    private java.util.List<Message> messages = null;
    
    
     
    /**
    * Gets the messages.
    *
    * @return the java.util.List<Message>
    */
    public java.util.List<Message> getMessages() {
        return this.messages; 
    }

    /**
    * Sets the messages.
    *
    * @param value the java.util.List<Message>
    */
    public void setMessages(java.util.List<Message> value) { 
        this.messages = value; 
        valueChanged("messages", value);

    }
    
        
    private java.util.List<MailFolder> childFolders = null;
    
    
     
    /**
    * Gets the child Folders.
    *
    * @return the java.util.List<MailFolder>
    */
    public java.util.List<MailFolder> getChildFolders() {
        return this.childFolders; 
    }

    /**
    * Sets the child Folders.
    *
    * @param value the java.util.List<MailFolder>
    */
    public void setChildFolders(java.util.List<MailFolder> value) { 
        this.childFolders = value; 
        valueChanged("childFolders", value);

    }
}

