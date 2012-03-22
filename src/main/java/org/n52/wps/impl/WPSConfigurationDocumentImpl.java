/*
 * An XML document type.
 * Localname: WPSConfiguration
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.WPSConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one WPSConfiguration(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class WPSConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.WPSConfigurationDocument
{
    private static final long serialVersionUID = 1L;
    
    public WPSConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WPSCONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "WPSConfiguration");
    
    
    /**
     * Gets the "WPSConfiguration" element
     */
    public org.n52.wps.WPSConfigurationDocument.WPSConfiguration getWPSConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.WPSConfigurationDocument.WPSConfiguration target = null;
            target = (org.n52.wps.WPSConfigurationDocument.WPSConfiguration)get_store().find_element_user(WPSCONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WPSConfiguration" element
     */
    public void setWPSConfiguration(org.n52.wps.WPSConfigurationDocument.WPSConfiguration wpsConfiguration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.WPSConfigurationDocument.WPSConfiguration target = null;
            target = (org.n52.wps.WPSConfigurationDocument.WPSConfiguration)get_store().find_element_user(WPSCONFIGURATION$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.WPSConfigurationDocument.WPSConfiguration)get_store().add_element_user(WPSCONFIGURATION$0);
            }
            target.set(wpsConfiguration);
        }
    }
    
    /**
     * Appends and returns a new empty "WPSConfiguration" element
     */
    public org.n52.wps.WPSConfigurationDocument.WPSConfiguration addNewWPSConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.WPSConfigurationDocument.WPSConfiguration target = null;
            target = (org.n52.wps.WPSConfigurationDocument.WPSConfiguration)get_store().add_element_user(WPSCONFIGURATION$0);
            return target;
        }
    }
    /**
     * An XML WPSConfiguration(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public static class WPSConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.WPSConfigurationDocument.WPSConfiguration
    {
        private static final long serialVersionUID = 1L;
        
        public WPSConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATAHANDLERS$0 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "Datahandlers");
        private static final javax.xml.namespace.QName ALGORITHMREPOSITORYLIST$2 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "AlgorithmRepositoryList");
        private static final javax.xml.namespace.QName REMOTEREPOSITORYLIST$4 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "RemoteRepositoryList");
        private static final javax.xml.namespace.QName SERVER$6 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "Server");
        
        
        /**
         * Gets the "Datahandlers" element
         */
        public org.n52.wps.DatahandlersDocument.Datahandlers getDatahandlers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.DatahandlersDocument.Datahandlers target = null;
                target = (org.n52.wps.DatahandlersDocument.Datahandlers)get_store().find_element_user(DATAHANDLERS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Datahandlers" element
         */
        public void setDatahandlers(org.n52.wps.DatahandlersDocument.Datahandlers datahandlers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.DatahandlersDocument.Datahandlers target = null;
                target = (org.n52.wps.DatahandlersDocument.Datahandlers)get_store().find_element_user(DATAHANDLERS$0, 0);
                if (target == null)
                {
                    target = (org.n52.wps.DatahandlersDocument.Datahandlers)get_store().add_element_user(DATAHANDLERS$0);
                }
                target.set(datahandlers);
            }
        }
        
        /**
         * Appends and returns a new empty "Datahandlers" element
         */
        public org.n52.wps.DatahandlersDocument.Datahandlers addNewDatahandlers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.DatahandlersDocument.Datahandlers target = null;
                target = (org.n52.wps.DatahandlersDocument.Datahandlers)get_store().add_element_user(DATAHANDLERS$0);
                return target;
            }
        }
        
        /**
         * Gets the "AlgorithmRepositoryList" element
         */
        public org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList getAlgorithmRepositoryList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList target = null;
                target = (org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList)get_store().find_element_user(ALGORITHMREPOSITORYLIST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "AlgorithmRepositoryList" element
         */
        public void setAlgorithmRepositoryList(org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList algorithmRepositoryList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList target = null;
                target = (org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList)get_store().find_element_user(ALGORITHMREPOSITORYLIST$2, 0);
                if (target == null)
                {
                    target = (org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList)get_store().add_element_user(ALGORITHMREPOSITORYLIST$2);
                }
                target.set(algorithmRepositoryList);
            }
        }
        
        /**
         * Appends and returns a new empty "AlgorithmRepositoryList" element
         */
        public org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList addNewAlgorithmRepositoryList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList target = null;
                target = (org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList)get_store().add_element_user(ALGORITHMREPOSITORYLIST$2);
                return target;
            }
        }
        
        /**
         * Gets the "RemoteRepositoryList" element
         */
        public org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList getRemoteRepositoryList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList target = null;
                target = (org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList)get_store().find_element_user(REMOTEREPOSITORYLIST$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "RemoteRepositoryList" element
         */
        public void setRemoteRepositoryList(org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList remoteRepositoryList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList target = null;
                target = (org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList)get_store().find_element_user(REMOTEREPOSITORYLIST$4, 0);
                if (target == null)
                {
                    target = (org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList)get_store().add_element_user(REMOTEREPOSITORYLIST$4);
                }
                target.set(remoteRepositoryList);
            }
        }
        
        /**
         * Appends and returns a new empty "RemoteRepositoryList" element
         */
        public org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList addNewRemoteRepositoryList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList target = null;
                target = (org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList)get_store().add_element_user(REMOTEREPOSITORYLIST$4);
                return target;
            }
        }
        
        /**
         * Gets the "Server" element
         */
        public org.n52.wps.ServerDocument.Server getServer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ServerDocument.Server target = null;
                target = (org.n52.wps.ServerDocument.Server)get_store().find_element_user(SERVER$6, 0);
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
                target = (org.n52.wps.ServerDocument.Server)get_store().find_element_user(SERVER$6, 0);
                if (target == null)
                {
                    target = (org.n52.wps.ServerDocument.Server)get_store().add_element_user(SERVER$6);
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
                target = (org.n52.wps.ServerDocument.Server)get_store().add_element_user(SERVER$6);
                return target;
            }
        }
    }
}
