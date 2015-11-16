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
 * The type Attachment.
*/
public class Attachment extends Entity {

    public Attachment(){
        setODataType("#microsoft.graph.attachment");
    }
            
    private java.util.Calendar lastModifiedDateTime;
     
    /**
    * Gets the last Modified Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getLastModifiedDateTime() {
        return this.lastModifiedDateTime; 
    }

    /**
    * Sets the last Modified Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setLastModifiedDateTime(java.util.Calendar value) { 
        this.lastModifiedDateTime = value; 
        valueChanged("lastModifiedDateTime", value);

    }
            
    private String name;
     
    /**
    * Gets the name.
    *
    * @return the String
    */
    public String getName() {
        return this.name; 
    }

    /**
    * Sets the name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.name = value; 
        valueChanged("name", value);

    }
            
    private String contentType;
     
    /**
    * Gets the content Type.
    *
    * @return the String
    */
    public String getContentType() {
        return this.contentType; 
    }

    /**
    * Sets the content Type.
    *
    * @param value the String
    */
    public void setContentType(String value) { 
        this.contentType = value; 
        valueChanged("contentType", value);

    }
            
    private Integer size;
     
    /**
    * Gets the size.
    *
    * @return the Integer
    */
    public Integer getSize() {
        return this.size; 
    }

    /**
    * Sets the size.
    *
    * @param value the Integer
    */
    public void setSize(Integer value) { 
        this.size = value; 
        valueChanged("size", value);

    }
            
    private Boolean isInline;
     
    /**
    * Gets the is Inline.
    *
    * @return the Boolean
    */
    public Boolean getIsInline() {
        return this.isInline; 
    }

    /**
    * Sets the is Inline.
    *
    * @param value the Boolean
    */
    public void setIsInline(Boolean value) { 
        this.isInline = value; 
        valueChanged("isInline", value);

    }
}

