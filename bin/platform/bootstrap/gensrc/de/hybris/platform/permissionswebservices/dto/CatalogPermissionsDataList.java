/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Mar 15, 2018 5:02:40 PM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.permissionswebservices.dto;

import java.io.Serializable;
import de.hybris.platform.permissionsfacades.data.CatalogPermissionsData;
import java.util.List;

public  class CatalogPermissionsDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CatalogPermissionsDataList.permissionsList</code> property defined at extension <code>permissionswebservices</code>. */
		
	private List<CatalogPermissionsData> permissionsList;
	
	public CatalogPermissionsDataList()
	{
		// default constructor
	}
	
		
	
	public void setPermissionsList(final List<CatalogPermissionsData> permissionsList)
	{
		this.permissionsList = permissionsList;
	}

		
	
	public List<CatalogPermissionsData> getPermissionsList() 
	{
		return permissionsList;
	}
	


}
