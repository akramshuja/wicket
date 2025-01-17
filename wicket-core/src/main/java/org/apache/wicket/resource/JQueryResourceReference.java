/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wicket.resource;

import org.apache.wicket.request.resource.JavaScriptResourceReference;


/**
 * The resource reference for the jquery javascript library as released with Wicket. To add a JQuery
 * resource reference to a component, do not use this reference, but use
 * {@link org.apache.wicket.settings.JavaScriptLibrarySettings#getJQueryReference()}
 * to prevent version conflicts.
 *
 * @author papegaaij
 */
public class JQueryResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = 1L;

	/**
	 * JQuery ver. 3.x - improves on ver. 2
	 * <strong>Note</strong>: Might not work with old jQuery plugins!
	 */
	public static final String VERSION_3 = "jquery/jquery-3.6.4.js";

	public static final JQueryResourceReference INSTANCE_3 = new JQueryResourceReference(VERSION_3);

	public static JQueryResourceReference getV3()
	{
		return INSTANCE_3;
	}

	protected JQueryResourceReference(final String version)
	{
		super(JQueryResourceReference.class, version);
	}
}
