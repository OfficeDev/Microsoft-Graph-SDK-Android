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

import com.microsoft.services.orc.core.ODataBaseEntity;




/**
 * The type Service Plan Info.
*/
public class ServicePlanInfo extends ODataBaseEntity {

    public ServicePlanInfo(){
        setODataType("#microsoft.graph.servicePlanInfo");
    }

    private java.util.UUID servicePlanId;

    /**
    * Gets the service Plan Id.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getServicePlanId() {
        return this.servicePlanId; 
    }

    /**
    * Sets the service Plan Id.
    *
    * @param value the java.util.UUID
    */
    public void setServicePlanId(java.util.UUID value) { 
        this.servicePlanId = value;
        valueChanged("servicePlanId", value);

    }

    private String servicePlanName;

    /**
    * Gets the service Plan Name.
    *
    * @return the String
    */
    public String getServicePlanName() {
        return this.servicePlanName; 
    }

    /**
    * Sets the service Plan Name.
    *
    * @param value the String
    */
    public void setServicePlanName(String value) { 
        this.servicePlanName = value;
        valueChanged("servicePlanName", value);

    }

    private String provisioningStatus;

    /**
    * Gets the provisioning Status.
    *
    * @return the String
    */
    public String getProvisioningStatus() {
        return this.provisioningStatus; 
    }

    /**
    * Sets the provisioning Status.
    *
    * @param value the String
    */
    public void setProvisioningStatus(String value) { 
        this.provisioningStatus = value;
        valueChanged("provisioningStatus", value);

    }

    private String appliesTo;

    /**
    * Gets the applies To.
    *
    * @return the String
    */
    public String getAppliesTo() {
        return this.appliesTo; 
    }

    /**
    * Sets the applies To.
    *
    * @param value the String
    */
    public void setAppliesTo(String value) { 
        this.appliesTo = value;
        valueChanged("appliesTo", value);

    }
}