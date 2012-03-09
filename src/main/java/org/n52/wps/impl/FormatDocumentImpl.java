/*
 * An XML document type.
 * Localname: Format
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.FormatDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one Format(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class FormatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.FormatDocument
{
    private static final long serialVersionUID = 1L;
    
    public FormatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMAT$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "Format");
    
    
    /**
     * Gets the "Format" element
     */
    public org.n52.wps.FormatDocument.Format getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.FormatDocument.Format target = null;
            target = (org.n52.wps.FormatDocument.Format)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Format" element
     */
    public void setFormat(org.n52.wps.FormatDocument.Format format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.FormatDocument.Format target = null;
            target = (org.n52.wps.FormatDocument.Format)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.FormatDocument.Format)get_store().add_element_user(FORMAT$0);
            }
            target.set(format);
        }
    }
    
    /**
     * Appends and returns a new empty "Format" element
     */
    public org.n52.wps.FormatDocument.Format addNewFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.FormatDocument.Format target = null;
            target = (org.n52.wps.FormatDocument.Format)get_store().add_element_user(FORMAT$0);
            return target;
        }
    }
    /**
     * An XML Format(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public static class FormatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.FormatDocument.Format
    {
        private static final long serialVersionUID = 1L;
        
        public FormatImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MIMETYPE$0 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "Mimetype");
        private static final javax.xml.namespace.QName SCHEMALIST$2 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "SchemaList");
        private static final javax.xml.namespace.QName FILEEXTENSION$4 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "FileExtension");
        private static final javax.xml.namespace.QName ENCODING$6 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "Encoding");
        private static final javax.xml.namespace.QName ACTIVE$8 = 
            new javax.xml.namespace.QName("", "active");
        
        
        /**
         * Gets the "Mimetype" element
         */
        public java.lang.String getMimetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMETYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Mimetype" element
         */
        public org.n52.wps.MimetypeDocument.Mimetype xgetMimetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.MimetypeDocument.Mimetype target = null;
                target = (org.n52.wps.MimetypeDocument.Mimetype)get_store().find_element_user(MIMETYPE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Mimetype" element
         */
        public void setMimetype(java.lang.String mimetype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMETYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIMETYPE$0);
                }
                target.setStringValue(mimetype);
            }
        }
        
        /**
         * Sets (as xml) the "Mimetype" element
         */
        public void xsetMimetype(org.n52.wps.MimetypeDocument.Mimetype mimetype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.MimetypeDocument.Mimetype target = null;
                target = (org.n52.wps.MimetypeDocument.Mimetype)get_store().find_element_user(MIMETYPE$0, 0);
                if (target == null)
                {
                    target = (org.n52.wps.MimetypeDocument.Mimetype)get_store().add_element_user(MIMETYPE$0);
                }
                target.set(mimetype);
            }
        }
        
        /**
         * Gets the "SchemaList" element
         */
        public java.lang.String getSchemaList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMALIST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SchemaList" element
         */
        public org.n52.wps.SchemaListDocument.SchemaList xgetSchemaList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.SchemaListDocument.SchemaList target = null;
                target = (org.n52.wps.SchemaListDocument.SchemaList)get_store().find_element_user(SCHEMALIST$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "SchemaList" element
         */
        public boolean isSetSchemaList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCHEMALIST$2) != 0;
            }
        }
        
        /**
         * Sets the "SchemaList" element
         */
        public void setSchemaList(java.lang.String schemaList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMALIST$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEMALIST$2);
                }
                target.setStringValue(schemaList);
            }
        }
        
        /**
         * Sets (as xml) the "SchemaList" element
         */
        public void xsetSchemaList(org.n52.wps.SchemaListDocument.SchemaList schemaList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.SchemaListDocument.SchemaList target = null;
                target = (org.n52.wps.SchemaListDocument.SchemaList)get_store().find_element_user(SCHEMALIST$2, 0);
                if (target == null)
                {
                    target = (org.n52.wps.SchemaListDocument.SchemaList)get_store().add_element_user(SCHEMALIST$2);
                }
                target.set(schemaList);
            }
        }
        
        /**
         * Unsets the "SchemaList" element
         */
        public void unsetSchemaList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCHEMALIST$2, 0);
            }
        }
        
        /**
         * Gets the "FileExtension" element
         */
        public java.lang.String getFileExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEEXTENSION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FileExtension" element
         */
        public org.n52.wps.FileExtensionDocument.FileExtension xgetFileExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.FileExtensionDocument.FileExtension target = null;
                target = (org.n52.wps.FileExtensionDocument.FileExtension)get_store().find_element_user(FILEEXTENSION$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "FileExtension" element
         */
        public boolean isSetFileExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FILEEXTENSION$4) != 0;
            }
        }
        
        /**
         * Sets the "FileExtension" element
         */
        public void setFileExtension(java.lang.String fileExtension)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEEXTENSION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEEXTENSION$4);
                }
                target.setStringValue(fileExtension);
            }
        }
        
        /**
         * Sets (as xml) the "FileExtension" element
         */
        public void xsetFileExtension(org.n52.wps.FileExtensionDocument.FileExtension fileExtension)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.FileExtensionDocument.FileExtension target = null;
                target = (org.n52.wps.FileExtensionDocument.FileExtension)get_store().find_element_user(FILEEXTENSION$4, 0);
                if (target == null)
                {
                    target = (org.n52.wps.FileExtensionDocument.FileExtension)get_store().add_element_user(FILEEXTENSION$4);
                }
                target.set(fileExtension);
            }
        }
        
        /**
         * Unsets the "FileExtension" element
         */
        public void unsetFileExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FILEEXTENSION$4, 0);
            }
        }
        
        /**
         * Gets the "Encoding" element
         */
        public java.lang.String getEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCODING$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Encoding" element
         */
        public org.n52.wps.EncodingDocument.Encoding xgetEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.EncodingDocument.Encoding target = null;
                target = (org.n52.wps.EncodingDocument.Encoding)get_store().find_element_user(ENCODING$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "Encoding" element
         */
        public boolean isSetEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENCODING$6) != 0;
            }
        }
        
        /**
         * Sets the "Encoding" element
         */
        public void setEncoding(java.lang.String encoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCODING$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENCODING$6);
                }
                target.setStringValue(encoding);
            }
        }
        
        /**
         * Sets (as xml) the "Encoding" element
         */
        public void xsetEncoding(org.n52.wps.EncodingDocument.Encoding encoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.EncodingDocument.Encoding target = null;
                target = (org.n52.wps.EncodingDocument.Encoding)get_store().find_element_user(ENCODING$6, 0);
                if (target == null)
                {
                    target = (org.n52.wps.EncodingDocument.Encoding)get_store().add_element_user(ENCODING$6);
                }
                target.set(encoding);
            }
        }
        
        /**
         * Unsets the "Encoding" element
         */
        public void unsetEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENCODING$6, 0);
            }
        }
        
        /**
         * Gets the "active" attribute
         */
        public boolean getActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVE$8);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "active" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ACTIVE$8);
                return target;
            }
        }
        
        /**
         * Sets the "active" attribute
         */
        public void setActive(boolean active)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIVE$8);
                }
                target.setBooleanValue(active);
            }
        }
        
        /**
         * Sets (as xml) the "active" attribute
         */
        public void xsetActive(org.apache.xmlbeans.XmlBoolean active)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ACTIVE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ACTIVE$8);
                }
                target.set(active);
            }
        }
    }
}
