// 
// MobeelizerFile.java
// 
// Copyright (C) 2012 Mobeelizer Ltd. All Rights Reserved.
//
// Mobeelizer SDK is free software; you can redistribute it and/or modify it 
// under the terms of the GNU Affero General Public License as published by 
// the Free Software Foundation; either version 3 of the License, or (at your
// option) any later version.
//
// This program is distributed in the hope that it will be useful, but WITHOUT
// ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or 
// FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
// for more details.
//
// You should have received a copy of the GNU Affero General Public License 
// along with this program; if not, write to the Free Software Foundation, Inc., 
// 51 Franklin St, Fifth Floor, Boston, MA  02110-1301 USA
// 

package com.mobeelizer.java.api;

import java.io.File;
import java.io.InputStream;

/**
 * Representation of file shared in the cloud.
 * 
 * @since 1.0
 */
public interface MobeelizerFile {

    /**
     * Return the name of the file.
     * 
     * @return name
     * @since 1.0
     */
    String getName();

    /**
     * Return the guid of the file. Guid uniquely identifies the file.
     * 
     * @return guid
     * @since 1.0
     */
    String getGuid();

    /**
     * Return the content of the file.
     * 
     * @return stream
     * @since 1.0
     */
    InputStream getInputStream();

    /**
     * Return the file.
     * 
     * @return stream
     * @since 1.2
     */
    File getFile();

}
