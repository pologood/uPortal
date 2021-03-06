/**
 * Licensed to Apereo under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright ownership. Apereo
 * licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the License at the
 * following location:
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apereo.portal.channel;

import java.util.List;
import org.apereo.portal.groups.IGroupMember;
import org.apereo.portal.portlet.om.IPortletDefinition;
import org.apereo.portal.portlet.om.PortletCategory;
import org.apereo.portal.security.IPerson;

public interface IPortletPublishingService {

    public IPortletDefinition savePortletDefinition(
            IPortletDefinition definition,
            IPerson publisher,
            List<PortletCategory> categories,
            List<IGroupMember> groupMembers);

    public void removePortletDefinition(IPortletDefinition definition, IPerson person);
}
