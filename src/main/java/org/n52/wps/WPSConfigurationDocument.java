/*
 * An XML document type.
 * Localname: WPSConfiguration
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.WPSConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps;


/**
 * A document containing one WPSConfiguration(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public interface WPSConfigurationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WPSConfigurationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FC5A1EE3CEAF1BF777053E793444579").resolveHandle("wpsconfigurationfb85doctype");
    
    /**
     * Gets the "WPSConfiguration" element
     */
    org.n52.wps.WPSConfigurationDocument.WPSConfiguration getWPSConfiguration();
    
    /**
     * Sets the "WPSConfiguration" element
     */
    void setWPSConfiguration(org.n52.wps.WPSConfigurationDocument.WPSConfiguration wpsConfiguration);
    
    /**
     * Appends and returns a new empty "WPSConfiguration" element
     */
    org.n52.wps.WPSConfigurationDocument.WPSConfiguration addNewWPSConfiguration();
    
    /**
     * An XML WPSConfiguration(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public interface WPSConfiguration extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WPSConfiguration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FC5A1EE3CEAF1BF777053E793444579").resolveHandle("wpsconfiguration609delemtype");
        
        /**
         * Gets the "Datahandlers" element
         */
        org.n52.wps.DatahandlersDocument.Datahandlers getDatahandlers();
        
        /**
         * Sets the "Datahandlers" element
         */
        void setDatahandlers(org.n52.wps.DatahandlersDocument.Datahandlers datahandlers);
        
        /**
         * Appends and returns a new empty "Datahandlers" element
         */
        org.n52.wps.DatahandlersDocument.Datahandlers addNewDatahandlers();
        
        /**
         * Gets the "AlgorithmRepositoryList" element
         */
        org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList getAlgorithmRepositoryList();
        
        /**
         * Sets the "AlgorithmRepositoryList" element
         */
        void setAlgorithmRepositoryList(org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList algorithmRepositoryList);
        
        /**
         * Appends and returns a new empty "AlgorithmRepositoryList" element
         */
        org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList addNewAlgorithmRepositoryList();
        
        /**
         * Gets the "RemoteRepositoryList" element
         */
        org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList getRemoteRepositoryList();
        
        /**
         * Sets the "RemoteRepositoryList" element
         */
        void setRemoteRepositoryList(org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList remoteRepositoryList);
        
        /**
         * Appends and returns a new empty "RemoteRepositoryList" element
         */
        org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList addNewRemoteRepositoryList();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.n52.wps.WPSConfigurationDocument.WPSConfiguration newInstance() {
              return (org.n52.wps.WPSConfigurationDocument.WPSConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.n52.wps.WPSConfigurationDocument.WPSConfiguration newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.n52.wps.WPSConfigurationDocument.WPSConfiguration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.n52.wps.WPSConfigurationDocument newInstance() {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.n52.wps.WPSConfigurationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.n52.wps.WPSConfigurationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.n52.wps.WPSConfigurationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.n52.wps.WPSConfigurationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.n52.wps.WPSConfigurationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.n52.wps.WPSConfigurationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.n52.wps.WPSConfigurationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.n52.wps.WPSConfigurationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.n52.wps.WPSConfigurationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.n52.wps.WPSConfigurationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.n52.wps.WPSConfigurationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.n52.wps.WPSConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.n52.wps.WPSConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.n52.wps.WPSConfigurationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.n52.wps.WPSConfigurationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.n52.wps.WPSConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.n52.wps.WPSConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.n52.wps.WPSConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
