/*
 * An XML document type.
 * Localname: Server
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.ServerDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one Server(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class ServerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.ServerDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVER$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "Server");
    
    
    /**
     * Gets the "Server" element
     */
    public org.n52.wps.ServerDocument.Server getServer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.ServerDocument.Server target = null;
            target = (org.n52.wps.ServerDocument.Server)get_store().find_element_user(SERVER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Server" element
     */
    public void setServer(org.n52.wps.ServerDocument.Server server)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.ServerDocument.Server target = null;
            target = (org.n52.wps.ServerDocument.Server)get_store().find_element_user(SERVER$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.ServerDocument.Server)get_store().add_element_user(SERVER$0);
            }
            target.set(server);
        }
    }
    
    /**
     * Appends and returns a new empty "Server" element
     */
    public org.n52.wps.ServerDocument.Server addNewServer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.ServerDocument.Server target = null;
            target = (org.n52.wps.ServerDocument.Server)get_store().add_element_user(SERVER$0);
            return target;
        }
    }
    /**
     * An XML Server(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public static class ServerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.ServerDocument.Server
    {
        private static final long serialVersionUID = 1L;
        
        public ServerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROPERTY$0 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "Property");
        private static final javax.xml.namespace.QName DATABASE$2 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "Database");
        private static final javax.xml.namespace.QName HOSTNAME$4 = 
            new javax.xml.namespace.QName("", "hostname");
        private static final javax.xml.namespace.QName HOSTPORT$6 = 
            new javax.xml.namespace.QName("", "hostport");
        private static final javax.xml.namespace.QName INCLUDEDATAINPUTSINRESPONSE$8 = 
            new javax.xml.namespace.QName("", "includeDataInputsInResponse");
        private static final javax.xml.namespace.QName COMPUTATIONTIMEOUTMILLISECONDS$10 = 
            new javax.xml.namespace.QName("", "computationTimeoutMilliSeconds");
        private static final javax.xml.namespace.QName CACHECAPABILITES$12 = 
            new javax.xml.namespace.QName("", "cacheCapabilites");
        private static final javax.xml.namespace.QName WEBAPPPATH$14 = 
            new javax.xml.namespace.QName("", "webappPath");
        private static final javax.xml.namespace.QName REPORELOADINTERVAL$16 = 
            new javax.xml.namespace.QName("", "repoReloadInterval");
        
        
        /**
         * Gets array of all "Property" elements
         */
        public org.n52.wps.PropertyDocument.Property[] getPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTY$0, targetList);
                org.n52.wps.PropertyDocument.Property[] result = new org.n52.wps.PropertyDocument.Property[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Property" element
         */
        public org.n52.wps.PropertyDocument.Property getPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.PropertyDocument.Property target = null;
                target = (org.n52.wps.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Property" element
         */
        public int sizeOfPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTY$0);
            }
        }
        
        /**
         * Sets array of all "Property" element
         */
        public void setPropertyArray(org.n52.wps.PropertyDocument.Property[] propertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(propertyArray, PROPERTY$0);
            }
        }
        
        /**
         * Sets ith "Property" element
         */
        public void setPropertyArray(int i, org.n52.wps.PropertyDocument.Property property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.PropertyDocument.Property target = null;
                target = (org.n52.wps.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(property);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Property" element
         */
        public org.n52.wps.PropertyDocument.Property insertNewProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.PropertyDocument.Property target = null;
                target = (org.n52.wps.PropertyDocument.Property)get_store().insert_element_user(PROPERTY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Property" element
         */
        public org.n52.wps.PropertyDocument.Property addNewProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.PropertyDocument.Property target = null;
                target = (org.n52.wps.PropertyDocument.Property)get_store().add_element_user(PROPERTY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Property" element
         */
        public void removeProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTY$0, i);
            }
        }
        
        /**
         * Gets the "Database" element
         */
        public org.n52.wps.DatabaseDocument.Database getDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.DatabaseDocument.Database target = null;
                target = (org.n52.wps.DatabaseDocument.Database)get_store().find_element_user(DATABASE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Database" element
         */
        public boolean isSetDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATABASE$2) != 0;
            }
        }
        
        /**
         * Sets the "Database" element
         */
        public void setDatabase(org.n52.wps.DatabaseDocument.Database database)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.DatabaseDocument.Database target = null;
                target = (org.n52.wps.DatabaseDocument.Database)get_store().find_element_user(DATABASE$2, 0);
                if (target == null)
                {
                    target = (org.n52.wps.DatabaseDocument.Database)get_store().add_element_user(DATABASE$2);
                }
                target.set(database);
            }
        }
        
        /**
         * Appends and returns a new empty "Database" element
         */
        public org.n52.wps.DatabaseDocument.Database addNewDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.DatabaseDocument.Database target = null;
                target = (org.n52.wps.DatabaseDocument.Database)get_store().add_element_user(DATABASE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Database" element
         */
        public void unsetDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATABASE$2, 0);
            }
        }
        
        /**
         * Gets the "hostname" attribute
         */
        public java.lang.String getHostname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "hostname" attribute
         */
        public org.n52.wps.ServerDocument.Server.Hostname xgetHostname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server.Hostname target = null;
                target = (org.n52.wps.ServerDocument.Server.Hostname)get_store().find_attribute_user(HOSTNAME$4);
                return target;
            }
        }
        
        /**
         * Sets the "hostname" attribute
         */
        public void setHostname(java.lang.String hostname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTNAME$4);
                }
                target.setStringValue(hostname);
            }
        }
        
        /**
         * Sets (as xml) the "hostname" attribute
         */
        public void xsetHostname(org.n52.wps.ServerDocument.Server.Hostname hostname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server.Hostname target = null;
                target = (org.n52.wps.ServerDocument.Server.Hostname)get_store().find_attribute_user(HOSTNAME$4);
                if (target == null)
                {
                    target = (org.n52.wps.ServerDocument.Server.Hostname)get_store().add_attribute_user(HOSTNAME$4);
                }
                target.set(hostname);
            }
        }
        
        /**
         * Gets the "hostport" attribute
         */
        public java.lang.String getHostport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTPORT$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "hostport" attribute
         */
        public org.n52.wps.ServerDocument.Server.Hostport xgetHostport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server.Hostport target = null;
                target = (org.n52.wps.ServerDocument.Server.Hostport)get_store().find_attribute_user(HOSTPORT$6);
                return target;
            }
        }
        
        /**
         * Sets the "hostport" attribute
         */
        public void setHostport(java.lang.String hostport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTPORT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTPORT$6);
                }
                target.setStringValue(hostport);
            }
        }
        
        /**
         * Sets (as xml) the "hostport" attribute
         */
        public void xsetHostport(org.n52.wps.ServerDocument.Server.Hostport hostport)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server.Hostport target = null;
                target = (org.n52.wps.ServerDocument.Server.Hostport)get_store().find_attribute_user(HOSTPORT$6);
                if (target == null)
                {
                    target = (org.n52.wps.ServerDocument.Server.Hostport)get_store().add_attribute_user(HOSTPORT$6);
                }
                target.set(hostport);
            }
        }
        
        /**
         * Gets the "includeDataInputsInResponse" attribute
         */
        public boolean getIncludeDataInputsInResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDEDATAINPUTSINRESPONSE$8);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "includeDataInputsInResponse" attribute
         */
        public org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse xgetIncludeDataInputsInResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse target = null;
                target = (org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse)get_store().find_attribute_user(INCLUDEDATAINPUTSINRESPONSE$8);
                return target;
            }
        }
        
        /**
         * Sets the "includeDataInputsInResponse" attribute
         */
        public void setIncludeDataInputsInResponse(boolean includeDataInputsInResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDEDATAINPUTSINRESPONSE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUDEDATAINPUTSINRESPONSE$8);
                }
                target.setBooleanValue(includeDataInputsInResponse);
            }
        }
        
        /**
         * Sets (as xml) the "includeDataInputsInResponse" attribute
         */
        public void xsetIncludeDataInputsInResponse(org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse includeDataInputsInResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse target = null;
                target = (org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse)get_store().find_attribute_user(INCLUDEDATAINPUTSINRESPONSE$8);
                if (target == null)
                {
                    target = (org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse)get_store().add_attribute_user(INCLUDEDATAINPUTSINRESPONSE$8);
                }
                target.set(includeDataInputsInResponse);
            }
        }
        
        /**
         * Gets the "computationTimeoutMilliSeconds" attribute
         */
        public java.lang.String getComputationTimeoutMilliSeconds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPUTATIONTIMEOUTMILLISECONDS$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "computationTimeoutMilliSeconds" attribute
         */
        public org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds xgetComputationTimeoutMilliSeconds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds target = null;
                target = (org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds)get_store().find_attribute_user(COMPUTATIONTIMEOUTMILLISECONDS$10);
                return target;
            }
        }
        
        /**
         * Sets the "computationTimeoutMilliSeconds" attribute
         */
        public void setComputationTimeoutMilliSeconds(java.lang.String computationTimeoutMilliSeconds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPUTATIONTIMEOUTMILLISECONDS$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPUTATIONTIMEOUTMILLISECONDS$10);
                }
                target.setStringValue(computationTimeoutMilliSeconds);
            }
        }
        
        /**
         * Sets (as xml) the "computationTimeoutMilliSeconds" attribute
         */
        public void xsetComputationTimeoutMilliSeconds(org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds computationTimeoutMilliSeconds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds target = null;
                target = (org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds)get_store().find_attribute_user(COMPUTATIONTIMEOUTMILLISECONDS$10);
                if (target == null)
                {
                    target = (org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds)get_store().add_attribute_user(COMPUTATIONTIMEOUTMILLISECONDS$10);
                }
                target.set(computationTimeoutMilliSeconds);
            }
        }
        
        /**
         * Gets the "cacheCapabilites" attribute
         */
        public boolean getCacheCapabilites()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHECAPABILITES$12);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "cacheCapabilites" attribute
         */
        public org.n52.wps.ServerDocument.Server.CacheCapabilites xgetCacheCapabilites()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server.CacheCapabilites target = null;
                target = (org.n52.wps.ServerDocument.Server.CacheCapabilites)get_store().find_attribute_user(CACHECAPABILITES$12);
                return target;
            }
        }
        
        /**
         * Sets the "cacheCapabilites" attribute
         */
        public void setCacheCapabilites(boolean cacheCapabilites)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHECAPABILITES$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CACHECAPABILITES$12);
                }
                target.setBooleanValue(cacheCapabilites);
            }
        }
        
        /**
         * Sets (as xml) the "cacheCapabilites" attribute
         */
        public void xsetCacheCapabilites(org.n52.wps.ServerDocument.Server.CacheCapabilites cacheCapabilites)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server.CacheCapabilites target = null;
                target = (org.n52.wps.ServerDocument.Server.CacheCapabilites)get_store().find_attribute_user(CACHECAPABILITES$12);
                if (target == null)
                {
                    target = (org.n52.wps.ServerDocument.Server.CacheCapabilites)get_store().add_attribute_user(CACHECAPABILITES$12);
                }
                target.set(cacheCapabilites);
            }
        }
        
        /**
         * Gets the "webappPath" attribute
         */
        public java.lang.String getWebappPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBAPPPATH$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "webappPath" attribute
         */
        public org.n52.wps.ServerDocument.Server.WebappPath xgetWebappPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server.WebappPath target = null;
                target = (org.n52.wps.ServerDocument.Server.WebappPath)get_store().find_attribute_user(WEBAPPPATH$14);
                return target;
            }
        }
        
        /**
         * Sets the "webappPath" attribute
         */
        public void setWebappPath(java.lang.String webappPath)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBAPPPATH$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEBAPPPATH$14);
                }
                target.setStringValue(webappPath);
            }
        }
        
        /**
         * Sets (as xml) the "webappPath" attribute
         */
        public void xsetWebappPath(org.n52.wps.ServerDocument.Server.WebappPath webappPath)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server.WebappPath target = null;
                target = (org.n52.wps.ServerDocument.Server.WebappPath)get_store().find_attribute_user(WEBAPPPATH$14);
                if (target == null)
                {
                    target = (org.n52.wps.ServerDocument.Server.WebappPath)get_store().add_attribute_user(WEBAPPPATH$14);
                }
                target.set(webappPath);
            }
        }
        
        /**
         * Gets the "repoReloadInterval" attribute
         */
        public double getRepoReloadInterval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORELOADINTERVAL$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "repoReloadInterval" attribute
         */
        public org.n52.wps.ServerDocument.Server.RepoReloadInterval xgetRepoReloadInterval()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server.RepoReloadInterval target = null;
                target = (org.n52.wps.ServerDocument.Server.RepoReloadInterval)get_store().find_attribute_user(REPORELOADINTERVAL$16);
                return target;
            }
        }
        
        /**
         * Sets the "repoReloadInterval" attribute
         */
        public void setRepoReloadInterval(double repoReloadInterval)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORELOADINTERVAL$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPORELOADINTERVAL$16);
                }
                target.setDoubleValue(repoReloadInterval);
            }
        }
        
        /**
         * Sets (as xml) the "repoReloadInterval" attribute
         */
        public void xsetRepoReloadInterval(org.n52.wps.ServerDocument.Server.RepoReloadInterval repoReloadInterval)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server.RepoReloadInterval target = null;
                target = (org.n52.wps.ServerDocument.Server.RepoReloadInterval)get_store().find_attribute_user(REPORELOADINTERVAL$16);
                if (target == null)
                {
                    target = (org.n52.wps.ServerDocument.Server.RepoReloadInterval)get_store().add_attribute_user(REPORELOADINTERVAL$16);
                }
                target.set(repoReloadInterval);
            }
        }
        /**
         * An XML hostname(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ServerDocument$Server$Hostname.
         */
        public static class HostnameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.n52.wps.ServerDocument.Server.Hostname
        {
            private static final long serialVersionUID = 1L;
            
            public HostnameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected HostnameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML hostport(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ServerDocument$Server$Hostport.
         */
        public static class HostportImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.n52.wps.ServerDocument.Server.Hostport
        {
            private static final long serialVersionUID = 1L;
            
            public HostportImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected HostportImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML includeDataInputsInResponse(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ServerDocument$Server$IncludeDataInputsInResponse.
         */
        public static class IncludeDataInputsInResponseImpl extends org.apache.xmlbeans.impl.values.JavaBooleanHolderEx implements org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse
        {
            private static final long serialVersionUID = 1L;
            
            public IncludeDataInputsInResponseImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected IncludeDataInputsInResponseImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML computationTimeoutMilliSeconds(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ServerDocument$Server$ComputationTimeoutMilliSeconds.
         */
        public static class ComputationTimeoutMilliSecondsImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds
        {
            private static final long serialVersionUID = 1L;
            
            public ComputationTimeoutMilliSecondsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ComputationTimeoutMilliSecondsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML cacheCapabilites(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ServerDocument$Server$CacheCapabilites.
         */
        public static class CacheCapabilitesImpl extends org.apache.xmlbeans.impl.values.JavaBooleanHolderEx implements org.n52.wps.ServerDocument.Server.CacheCapabilites
        {
            private static final long serialVersionUID = 1L;
            
            public CacheCapabilitesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected CacheCapabilitesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML webappPath(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ServerDocument$Server$WebappPath.
         */
        public static class WebappPathImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.n52.wps.ServerDocument.Server.WebappPath
        {
            private static final long serialVersionUID = 1L;
            
            public WebappPathImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected WebappPathImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML repoReloadInterval(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ServerDocument$Server$RepoReloadInterval.
         */
        public static class RepoReloadIntervalImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements org.n52.wps.ServerDocument.Server.RepoReloadInterval
        {
            private static final long serialVersionUID = 1L;
            
            public RepoReloadIntervalImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RepoReloadIntervalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
