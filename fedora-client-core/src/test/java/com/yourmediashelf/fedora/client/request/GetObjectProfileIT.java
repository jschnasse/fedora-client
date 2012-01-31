/**
 * Copyright (C) 2010 MediaShelf <http://www.yourmediashelf.com/>
 *
 * This file is part of fedora-client.
 *
 * fedora-client is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * fedora-client is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with fedora-client.  If not, see <http://www.gnu.org/licenses/>.
 */


package com.yourmediashelf.fedora.client.request;

import static com.yourmediashelf.fedora.client.FedoraClient.getObjectProfile;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yourmediashelf.fedora.client.response.GetObjectProfileResponse;

public class GetObjectProfileIT extends BaseFedoraRequestIT {
    @Test
    public void testGetObjectXML() throws Exception {
    	GetObjectProfileResponse response = getObjectProfile(testPid).execute(fedora());
        assertEquals(200, response.getStatus());
        assertEquals(testPid, response.getPid());
        assertEquals("A", response.getState());
    }
}
