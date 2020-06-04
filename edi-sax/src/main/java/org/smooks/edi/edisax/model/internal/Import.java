/*-
 * ========================LICENSE_START=================================
 * smooks-edi-sax
 * %%
 * Copyright (C) 2020 Smooks
 * %%
 * Licensed under the terms of the Apache License Version 2.0, or
 * the GNU Lesser General Public License version 3.0 or later.
 * 
 * SPDX-License-Identifier: Apache-2.0 OR LGPL-3.0-or-later
 * 
 * ======================================================================
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * ======================================================================
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * =========================LICENSE_END==================================
 */
/*
	Milyn - Copyright (C) 2006 - 2010

	This library is free software; you can redistribute it and/or
	modify it under the terms of the GNU Lesser General Public
	License (version 2.1) as published by the Free Software
	Foundation.

	This library is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

	See the GNU Lesser General Public License for more details:
	http://www.gnu.org/licenses/lgpl.txt
*/

package org.smooks.edi.edisax.model.internal;

import java.net.URI;
import java.net.URISyntaxException;

public class Import {

    private URI resourceURI;
    private String namespace;
    private Boolean truncatableSegments;
    private Boolean truncatableFields;
    private Boolean truncatableComponents;

    public String getResource() {
        return resourceURI.toString();
    }

    public void setResource(String value) {
        try {
			this.resourceURI = new URI(value);
		} catch (URISyntaxException e) {
			throw new IllegalArgumentException("Invalid EDI import URI '" + value + "'.", e);
		}
    }

	public void setResourceURI(URI resourceURI) {
		this.resourceURI = resourceURI;
	}

	public URI getResourceURI() {
		return resourceURI;
	}

	public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String value) {
        this.namespace = value;
    }

    public Boolean isTruncatableFields() {
        return truncatableFields;
    }

    public void setTruncatableFields(Boolean value) {
        this.truncatableFields = value;
    }

    public Boolean isTruncatableComponents() {
        return truncatableComponents;
    }

    public void setTruncatableComponents(Boolean value) {
        this.truncatableComponents = value;
    }

    public Boolean isTruncatableSegments() {
        return truncatableSegments;
    }

    public void setTruncatableSegments(Boolean truncatableSegments) {
        this.truncatableSegments = truncatableSegments;
    }
}
