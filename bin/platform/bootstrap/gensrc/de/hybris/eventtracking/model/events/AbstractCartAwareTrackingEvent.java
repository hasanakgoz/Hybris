/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Mar 15, 2018 5:02:41 PM
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
package de.hybris.eventtracking.model.events;

import java.io.Serializable;

import de.hybris.eventtracking.model.events.AbstractTrackingEvent;

public  class AbstractCartAwareTrackingEvent extends AbstractTrackingEvent {


	/** <i>Generated property</i> for <code>AbstractCartAwareTrackingEvent.cartId</code> property defined at extension <code>eventtrackingmodel</code>. */
		
	private String cartId;
	
	public AbstractCartAwareTrackingEvent()
	{
		super();
	}

	public AbstractCartAwareTrackingEvent(final Serializable source)
	{
		super(source);
	}
	
	
	
	public void setCartId(final String cartId)
	{
		this.cartId = cartId;
	}
	
	
	
	public String getCartId() 
	{
		return cartId;
	}
	


}