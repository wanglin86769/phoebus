/*
 * Copyright (C) 2020 European Spallation Source ERIC.
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.phoebus.applications.credentialsmanagement;

import javafx.scene.image.Image;
import org.phoebus.framework.workbench.ApplicationService;
import org.phoebus.ui.javafx.ImageCache;
import org.phoebus.ui.spi.ToolbarEntry;

public class CredentialsManagementToolbarEntry implements ToolbarEntry {

    @Override
    public String getName() {
        return CredentialsManagementApp.DisplayName;
    }

    @Override
    public Image getIcon()
    {
        return ImageCache.getImage(CredentialsManagementApp.class, "/icons/credentials.png");
    }

    @Override
    public Void call() throws Exception {
        ApplicationService.createInstance(CredentialsManagementApp.name);
        return null;
    }

    /**
     * DO NOT CHANGE RETURN VALUE!
     * @return The unique id of this {@link ToolbarEntry}.
     */
    @Override
    public String getId(){
        return "Credentials Management";
    }
}
