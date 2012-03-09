/*
 * An XML document type.
 * Localname: Format
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.FormatDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps;


/**
 * A document containing one Format(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public interface FormatDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormatDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9AAA0E0157ADD16507D4BC651F836F05").resolveHandle("format06cadoctype");
    
    /**
     * Gets the "Format" element
     */
    org.n52.wps.FormatDocument.Format getFormat();
    
    /**
     * Sets the "Format" element
     */
    void setFormat(org.n52.wps.FormatDocument.Format format);
    
    /**
     * Appends and returns a new empty "Format" element
     */
    org.n52.wps.FormatDocument.Format addNewFormat();
    
    /**
     * An XML Format(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public interface Format extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Format.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9AAA0E0157ADD16507D4BC651F836F05").resolveHandle("formate6fdelemtype");
        
        /**
         * Gets the "Mimetype" element
         */
        java.lang.String getMimetype();
        
        /**
         * Gets (as xml) the "Mimetype" element
         */
        org.n52.wps.MimetypeDocument.Mimetype xgetMimetype();
        
        /**
         * Sets the "Mimetype" element
         */
        void setMimetype(java.lang.String mimetype);
        
        /**
         * Sets (as xml) the "Mimetype" element
         */
        void xsetMimetype(org.n52.wps.MimetypeDocument.Mimetype mimetype);
        
        /**
         * Gets the "SchemaList" element
         */
        java.lang.String getSchemaList();
        
        /**
         * Gets (as xml) the "SchemaList" element
         */
        org.n52.wps.SchemaListDocument.SchemaList xgetSchemaList();
        
        /**
         * True if has "SchemaList" element
         */
        boolean isSetSchemaList();
        
        /**
         * Sets the "SchemaList" element
         */
        void setSchemaList(java.lang.String schemaList);
        
        /**
         * Sets (as xml) the "SchemaList" element
         */
        void xsetSchemaList(org.n52.wps.SchemaListDocument.SchemaList schemaList);
        
        /**
         * Unsets the "SchemaList" element
         */
        void unsetSchemaList();
        
        /**
         * Gets the "FileExtension" element
         */
        java.lang.String getFileExtension();
        
        /**
         * Gets (as xml) the "FileExtension" element
         */
        org.n52.wps.FileExtensionDocument.FileExtension xgetFileExtension();
        
        /**
         * True if has "FileExtension" element
         */
        boolean isSetFileExtension();
        
        /**
         * Sets the "FileExtension" element
         */
        void setFileExtension(java.lang.String fileExtension);
        
        /**
         * Sets (as xml) the "FileExtension" element
         */
        void xsetFileExtension(org.n52.wps.FileExtensionDocument.FileExtension fileExtension);
        
        /**
         * Unsets the "FileExtension" element
         */
        void unsetFileExtension();
        
        /**
         * Gets the "Encoding" element
         */
        java.lang.String getEncoding();
        
        /**
         * Gets (as xml) the "Encoding" element
         */
        org.n52.wps.EncodingDocument.Encoding xgetEncoding();
        
        /**
         * True if has "Encoding" element
         */
        boolean isSetEncoding();
        
        /**
         * Sets the "Encoding" element
         */
        void setEncoding(java.lang.String encoding);
        
        /**
         * Sets (as xml) the "Encoding" element
         */
        void xsetEncoding(org.n52.wps.EncodingDocument.Encoding encoding);
        
        /**
         * Unsets the "Encoding" element
         */
        void unsetEncoding();
        
        /**
         * Gets the "active" attribute
         */
        boolean getActive();
        
        /**
         * Gets (as xml) the "active" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetActive();
        
        /**
         * Sets the "active" attribute
         */
        void setActive(boolean active);
        
        /**
         * Sets (as xml) the "active" attribute
         */
        void xsetActive(org.apache.xmlbeans.XmlBoolean active);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.n52.wps.FormatDocument.Format newInstance() {
              return (org.n52.wps.FormatDocument.Format) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.n52.wps.FormatDocument.Format newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.n52.wps.FormatDocument.Format) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.n52.wps.FormatDocument newInstance() {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.n52.wps.FormatDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.n52.wps.FormatDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.n52.wps.FormatDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.n52.wps.FormatDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.n52.wps.FormatDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.n52.wps.FormatDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.n52.wps.FormatDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.n52.wps.FormatDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.n52.wps.FormatDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.n52.wps.FormatDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.n52.wps.FormatDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.n52.wps.FormatDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.n52.wps.FormatDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.n52.wps.FormatDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.n52.wps.FormatDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.n52.wps.FormatDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.n52.wps.FormatDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.n52.wps.FormatDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
