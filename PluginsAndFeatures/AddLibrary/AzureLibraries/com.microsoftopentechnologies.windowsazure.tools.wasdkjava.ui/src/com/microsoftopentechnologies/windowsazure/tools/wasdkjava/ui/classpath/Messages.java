/**
 * Copyright 2013 Persistent Systems Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoftopentechnologies.windowsazure.tools.wasdkjava.ui.classpath;

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {
    private static final String BUNDLE_NAME = "com.microsoftopentechnologies.windowsazure.tools.wasdkjava.ui.classpath.messages"; //$NON-NLS-1$
    public static String containerID;
    public static String containerDesc;
    public static String desc;
    public static String excp;
    public static String lblLocation;
    public static String lblVersion;
    public static String libNotAvail;
    public static String notFound;
    public static String sdkID;
    public static String sdkJar;
    public static String sdkJarDoc;
    public static String title;
    public static String verNotAvail;
    public static String version1;
    public static String version2;
    public static String depLocation;
    public static String depChkBox;
    public static String jstDep;
    public static String edtLbrTtl;
    public static String src;
    
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
        super();
    }
}
