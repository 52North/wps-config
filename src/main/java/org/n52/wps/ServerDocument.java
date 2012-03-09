/*
 * An XML document type.
 * Localname: Server
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.ServerDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps;


/**
 * A document containing one Server(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public interface ServerDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServerDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FC5A1EE3CEAF1BF777053E793444579").resolveHandle("server13fedoctype");
    
    /**
     * Gets the "Server" element
     */
    org.n52.wps.ServerDocument.Server getServer();
    
    /**
     * Sets the "Server" element
     */
    void setServer(org.n52.wps.ServerDocument.Server server);
    
    /**
     * Appends and returns a new empty "Server" element
     */
    org.n52.wps.ServerDocument.Server addNewServer();
    
    /**
     * An XML Server(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public interface Server extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Server.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FC5A1EE3CEAF1BF777053E793444579").resolveHandle("server817delemtype");
        
        /**
         * Gets array of all "Property" elements
         */
        org.n52.wps.PropertyDocument.Property[] getPropertyArray();
        
        /**
         * Gets ith "Property" element
         */
        org.n52.wps.PropertyDocument.Property getPropertyArray(int i);
        
        /**
         * Returns number of "Property" element
         */
        int sizeOfPropertyArray();
        
        /**
         * Sets array of all "Property" element
         */
        void setPropertyArray(org.n52.wps.PropertyDocument.Property[] propertyArray);
        
        /**
         * Sets ith "Property" element
         */
        void setPropertyArray(int i, org.n52.wps.PropertyDocument.Property property);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Property" element
         */
        org.n52.wps.PropertyDocument.Property insertNewProperty(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Property" element
         */
        org.n52.wps.PropertyDocument.Property addNewProperty();
        
        /**
         * Removes the ith "Property" element
         */
        void removeProperty(int i);
        
        /**
         * Gets the "Database" element
         */
        org.n52.wps.DatabaseDocument.Database getDatabase();
        
        /**
         * True if has "Database" element
         */
        boolean isSetDatabase();
        
        /**
         * Sets the "Database" element
         */
        void setDatabase(org.n52.wps.DatabaseDocument.Database database);
        
        /**
         * Appends and returns a new empty "Database" element
         */
        org.n52.wps.DatabaseDocument.Database addNewDatabase();
        
        /**
         * Unsets the "Database" element
         */
        void unsetDatabase();
        
        /**
         * Gets the "hostname" attribute
         */
        java.lang.String getHostname();
        
        /**
         * Gets (as xml) the "hostname" attribute
         */
        org.n52.wps.ServerDocument.Server.Hostname xgetHostname();
        
        /**
         * Sets the "hostname" attribute
         */
        void setHostname(java.lang.String hostname);
        
        /**
         * Sets (as xml) the "hostname" attribute
         */
        void xsetHostname(org.n52.wps.ServerDocument.Server.Hostname hostname);
        
        /**
         * Gets the "hostport" attribute
         */
        java.lang.String getHostport();
        
        /**
         * Gets (as xml) the "hostport" attribute
         */
        org.n52.wps.ServerDocument.Server.Hostport xgetHostport();
        
        /**
         * Sets the "hostport" attribute
         */
        void setHostport(java.lang.String hostport);
        
        /**
         * Sets (as xml) the "hostport" attribute
         */
        void xsetHostport(org.n52.wps.ServerDocument.Server.Hostport hostport);
        
        /**
         * Gets the "includeDataInputsInResponse" attribute
         */
        boolean getIncludeDataInputsInResponse();
        
        /**
         * Gets (as xml) the "includeDataInputsInResponse" attribute
         */
        org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse xgetIncludeDataInputsInResponse();
        
        /**
         * Sets the "includeDataInputsInResponse" attribute
         */
        void setIncludeDataInputsInResponse(boolean includeDataInputsInResponse);
        
        /**
         * Sets (as xml) the "includeDataInputsInResponse" attribute
         */
        void xsetIncludeDataInputsInResponse(org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse includeDataInputsInResponse);
        
        /**
         * Gets the "computationTimeoutMilliSeconds" attribute
         */
        java.lang.String getComputationTimeoutMilliSeconds();
        
        /**
         * Gets (as xml) the "computationTimeoutMilliSeconds" attribute
         */
        org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds xgetComputationTimeoutMilliSeconds();
        
        /**
         * Sets the "computationTimeoutMilliSeconds" attribute
         */
        void setComputationTimeoutMilliSeconds(java.lang.String computationTimeoutMilliSeconds);
        
        /**
         * Sets (as xml) the "computationTimeoutMilliSeconds" attribute
         */
        void xsetComputationTimeoutMilliSeconds(org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds computationTimeoutMilliSeconds);
        
        /**
         * Gets the "cacheCapabilites" attribute
         */
        boolean getCacheCapabilites();
        
        /**
         * Gets (as xml) the "cacheCapabilites" attribute
         */
        org.n52.wps.ServerDocument.Server.CacheCapabilites xgetCacheCapabilites();
        
        /**
         * Sets the "cacheCapabilites" attribute
         */
        void setCacheCapabilites(boolean cacheCapabilites);
        
        /**
         * Sets (as xml) the "cacheCapabilites" attribute
         */
        void xsetCacheCapabilites(org.n52.wps.ServerDocument.Server.CacheCapabilites cacheCapabilites);
        
        /**
         * Gets the "webappPath" attribute
         */
        java.lang.String getWebappPath();
        
        /**
         * Gets (as xml) the "webappPath" attribute
         */
        org.n52.wps.ServerDocument.Server.WebappPath xgetWebappPath();
        
        /**
         * Sets the "webappPath" attribute
         */
        void setWebappPath(java.lang.String webappPath);
        
        /**
         * Sets (as xml) the "webappPath" attribute
         */
        void xsetWebappPath(org.n52.wps.ServerDocument.Server.WebappPath webappPath);
        
        /**
         * Gets the "repoReloadInterval" attribute
         */
        double getRepoReloadInterval();
        
        /**
         * Gets (as xml) the "repoReloadInterval" attribute
         */
        org.n52.wps.ServerDocument.Server.RepoReloadInterval xgetRepoReloadInterval();
        
        /**
         * Sets the "repoReloadInterval" attribute
         */
        void setRepoReloadInterval(double repoReloadInterval);
        
        /**
         * Sets (as xml) the "repoReloadInterval" attribute
         */
        void xsetRepoReloadInterval(org.n52.wps.ServerDocument.Server.RepoReloadInterval repoReloadInterval);
        
        /**
         * An XML hostname(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ServerDocument$Server$Hostname.
         */
        public interface Hostname extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Hostname.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FC5A1EE3CEAF1BF777053E793444579").resolveHandle("hostnamec10aattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.n52.wps.ServerDocument.Server.Hostname newValue(java.lang.Object obj) {
                  return (org.n52.wps.ServerDocument.Server.Hostname) type.newValue( obj ); }
                
                public static org.n52.wps.ServerDocument.Server.Hostname newInstance() {
                  return (org.n52.wps.ServerDocument.Server.Hostname) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.n52.wps.ServerDocument.Server.Hostname newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.n52.wps.ServerDocument.Server.Hostname) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML hostport(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ServerDocument$Server$Hostport.
         */
        public interface Hostport extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Hostport.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FC5A1EE3CEAF1BF777053E793444579").resolveHandle("hostport44d4attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.n52.wps.ServerDocument.Server.Hostport newValue(java.lang.Object obj) {
                  return (org.n52.wps.ServerDocument.Server.Hostport) type.newValue( obj ); }
                
                public static org.n52.wps.ServerDocument.Server.Hostport newInstance() {
                  return (org.n52.wps.ServerDocument.Server.Hostport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.n52.wps.ServerDocument.Server.Hostport newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.n52.wps.ServerDocument.Server.Hostport) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML includeDataInputsInResponse(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ServerDocument$Server$IncludeDataInputsInResponse.
         */
        public interface IncludeDataInputsInResponse extends org.apache.xmlbeans.XmlBoolean
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IncludeDataInputsInResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FC5A1EE3CEAF1BF777053E793444579").resolveHandle("includedatainputsinresponsee0d4attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse newValue(java.lang.Object obj) {
                  return (org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse) type.newValue( obj ); }
                
                public static org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse newInstance() {
                  return (org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.n52.wps.ServerDocument.Server.IncludeDataInputsInResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML computationTimeoutMilliSeconds(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ServerDocument$Server$ComputationTimeoutMilliSeconds.
         */
        public interface ComputationTimeoutMilliSeconds extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComputationTimeoutMilliSeconds.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FC5A1EE3CEAF1BF777053E793444579").resolveHandle("computationtimeoutmillisecondsd531attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds newValue(java.lang.Object obj) {
                  return (org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds) type.newValue( obj ); }
                
                public static org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds newInstance() {
                  return (org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.n52.wps.ServerDocument.Server.ComputationTimeoutMilliSeconds) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML cacheCapabilites(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ServerDocument$Server$CacheCapabilites.
         */
        public interface CacheCapabilites extends org.apache.xmlbeans.XmlBoolean
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CacheCapabilites.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FC5A1EE3CEAF1BF777053E793444579").resolveHandle("cachecapabilites0a70attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.n52.wps.ServerDocument.Server.CacheCapabilites newValue(java.lang.Object obj) {
                  return (org.n52.wps.ServerDocument.Server.CacheCapabilites) type.newValue( obj ); }
                
                public static org.n52.wps.ServerDocument.Server.CacheCapabilites newInstance() {
                  return (org.n52.wps.ServerDocument.Server.CacheCapabilites) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.n52.wps.ServerDocument.Server.CacheCapabilites newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.n52.wps.ServerDocument.Server.CacheCapabilites) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML webappPath(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ServerDocument$Server$WebappPath.
         */
        public interface WebappPath extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WebappPath.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FC5A1EE3CEAF1BF777053E793444579").resolveHandle("webapppathbb8battrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.n52.wps.ServerDocument.Server.WebappPath newValue(java.lang.Object obj) {
                  return (org.n52.wps.ServerDocument.Server.WebappPath) type.newValue( obj ); }
                
                public static org.n52.wps.ServerDocument.Server.WebappPath newInstance() {
                  return (org.n52.wps.ServerDocument.Server.WebappPath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.n52.wps.ServerDocument.Server.WebappPath newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.n52.wps.ServerDocument.Server.WebappPath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML repoReloadInterval(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ServerDocument$Server$RepoReloadInterval.
         */
        public interface RepoReloadInterval extends org.apache.xmlbeans.XmlDouble
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RepoReloadInterval.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FC5A1EE3CEAF1BF777053E793444579").resolveHandle("reporeloadinterval5ccdattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.n52.wps.ServerDocument.Server.RepoReloadInterval newValue(java.lang.Object obj) {
                  return (org.n52.wps.ServerDocument.Server.RepoReloadInterval) type.newValue( obj ); }
                
                public static org.n52.wps.ServerDocument.Server.RepoReloadInterval newInstance() {
                  return (org.n52.wps.ServerDocument.Server.RepoReloadInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.n52.wps.ServerDocument.Server.RepoReloadInterval newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.n52.wps.ServerDocument.Server.RepoReloadInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.n52.wps.ServerDocument.Server newInstance() {
              return (org.n52.wps.ServerDocument.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.n52.wps.ServerDocument.Server newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.n52.wps.ServerDocument.Server) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.n52.wps.ServerDocument newInstance() {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.n52.wps.ServerDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.n52.wps.ServerDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.n52.wps.ServerDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.n52.wps.ServerDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.n52.wps.ServerDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.n52.wps.ServerDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.n52.wps.ServerDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.n52.wps.ServerDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.n52.wps.ServerDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.n52.wps.ServerDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.n52.wps.ServerDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.n52.wps.ServerDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.n52.wps.ServerDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.n52.wps.ServerDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.n52.wps.ServerDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.n52.wps.ServerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.n52.wps.ServerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.n52.wps.ServerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
