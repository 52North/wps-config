/*
 * An XML document type.
 * Localname: RemoteRepositoryList
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.RemoteRepositoryListDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps;


/**
 * A document containing one RemoteRepositoryList(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public interface RemoteRepositoryListDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RemoteRepositoryListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC48AB9F2ECCE92D00870263D17307532").resolveHandle("remoterepositorylist8033doctype");
    
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
     * An XML RemoteRepositoryList(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public interface RemoteRepositoryList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RemoteRepositoryList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC48AB9F2ECCE92D00870263D17307532").resolveHandle("remoterepositoryliste95delemtype");
        
        /**
         * Gets array of all "RemoteRepository" elements
         */
        org.n52.wps.RemoteRepositoryDocument.RemoteRepository[] getRemoteRepositoryArray();
        
        /**
         * Gets ith "RemoteRepository" element
         */
        org.n52.wps.RemoteRepositoryDocument.RemoteRepository getRemoteRepositoryArray(int i);
        
        /**
         * Returns number of "RemoteRepository" element
         */
        int sizeOfRemoteRepositoryArray();
        
        /**
         * Sets array of all "RemoteRepository" element
         */
        void setRemoteRepositoryArray(org.n52.wps.RemoteRepositoryDocument.RemoteRepository[] remoteRepositoryArray);
        
        /**
         * Sets ith "RemoteRepository" element
         */
        void setRemoteRepositoryArray(int i, org.n52.wps.RemoteRepositoryDocument.RemoteRepository remoteRepository);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RemoteRepository" element
         */
        org.n52.wps.RemoteRepositoryDocument.RemoteRepository insertNewRemoteRepository(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RemoteRepository" element
         */
        org.n52.wps.RemoteRepositoryDocument.RemoteRepository addNewRemoteRepository();
        
        /**
         * Removes the ith "RemoteRepository" element
         */
        void removeRemoteRepository(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList newInstance() {
              return (org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.n52.wps.RemoteRepositoryListDocument newInstance() {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.n52.wps.RemoteRepositoryListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.n52.wps.RemoteRepositoryListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.n52.wps.RemoteRepositoryListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.n52.wps.RemoteRepositoryListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.n52.wps.RemoteRepositoryListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.n52.wps.RemoteRepositoryListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.n52.wps.RemoteRepositoryListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.n52.wps.RemoteRepositoryListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.n52.wps.RemoteRepositoryListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.n52.wps.RemoteRepositoryListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.n52.wps.RemoteRepositoryListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.n52.wps.RemoteRepositoryListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.n52.wps.RemoteRepositoryListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.n52.wps.RemoteRepositoryListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.n52.wps.RemoteRepositoryListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.n52.wps.RemoteRepositoryListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.n52.wps.RemoteRepositoryListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.n52.wps.RemoteRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
