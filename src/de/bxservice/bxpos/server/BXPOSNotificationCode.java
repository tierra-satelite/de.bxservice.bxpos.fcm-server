/**********************************************************************
 * This file is part of FreiBier ERP                                   *
 *                                                                     *
 *                                                                     *
 * Copyright (C) Contributors                                          *
 *                                                                     *
 * This program is free software; you can redistribute it and/or       *
 * modify it under the terms of the GNU General Public License         *
 * as published by the Free Software Foundation; either version 2      *
 * of the License, or (at your option) any later version.              *
 *                                                                     *
 * This program is distributed in the hope that it will be useful,     *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of      *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the        *
 * GNU General Public License for more details.                        *
 *                                                                     *
 * You should have received a copy of the GNU General Public License   *
 * along with this program; if not, write to the Free Software         *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,          *
 * MA 02110-1301, USA.                                                 *
 *                                                                     *
 * Contributors:                                                       *
 * - Diego Ruiz - Bx Service GmbH                                      *
 **********************************************************************/
package de.bxservice.bxpos.server;

public interface BXPOSNotificationCode {

	/**Type of update request*/
	String REQUEST_TYPE = "RT";
	
	/**update request that is not mandatory*/
	int RECOMMENDED_REQUEST_CODE = 100;

	/**Update request that is mandatory*/
	int MANDATORY_REQUEST_CODE = 200;
	
	/**Table status changed request*/
	int TABLE_STATUS_CHANGED_CODE = 300;

    /**Request actions send as click_action to perform on click in the notification*/
    /**Mandatory request action*/
    String MANDATORY_UPDATE_ACTION   = "LOAD_DATA";
    String RECOMMENDED_UPDATE_ACTION = "OPEN_ACTIVITY";

}
