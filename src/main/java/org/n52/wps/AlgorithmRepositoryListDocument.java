/*
 * An XML document type.
 * Localname: AlgorithmRepositoryList
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.AlgorithmRepositoryListDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps;


/**
 * A document containing one AlgorithmRepositoryList(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public interface AlgorithmRepositoryListDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlgorithmRepositoryListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FC5A1EE3CEAF1BF777053E793444579").resolveHandle("algorithmrepositorylist813cdoctype");
    
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
     * An XML AlgorithmRepositoryList(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public interface AlgorithmRepositoryList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlgorithmRepositoryList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1FC5A1EE3CEAF1BF777053E793444579").resolveHandle("algorithmrepositorylistcc79elemtype");
        
        /**
         * Gets array of all "Repository" elements
         */
        org.n52.wps.RepositoryDocument.Repository[] getRepositoryArray();
        
        /**
         * Gets ith "Repository" element
         */
        org.n52.wps.RepositoryDocument.Repository getRepositoryArray(int i);
        
        /**
         * Returns number of "Repository" element
         */
        int sizeOfRepositoryArray();
        
        /**
         * Sets array of all "Repository" element
         */
        void setRepositoryArray(org.n52.wps.RepositoryDocument.Repository[] repositoryArray);
        
        /**
         * Sets ith "Repository" element
         */
        void setRepositoryArray(int i, org.n52.wps.RepositoryDocument.Repository repository);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Repository" element
         */
        org.n52.wps.RepositoryDocument.Repository insertNewRepository(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Repository" element
         */
        org.n52.wps.RepositoryDocument.Repository addNewRepository();
        
        /**
         * Removes the ith "Repository" element
         */
        void removeRepository(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList newInstance() {
              return (org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.n52.wps.AlgorithmRepositoryListDocument newInstance() {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.n52.wps.AlgorithmRepositoryListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.n52.wps.AlgorithmRepositoryListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.n52.wps.AlgorithmRepositoryListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
