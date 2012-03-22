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
            new javax.xml.namespace.QName("", "mimetype");
        private static final javax.xml.namespace.QName SCHEMA$2 = 
            new javax.xml.namespace.QName("", "schema");
        private static final javax.xml.namespace.QName ENCODING$4 = 
            new javax.xml.namespace.QName("", "encoding");
        
        
        /**
         * Gets the "mimetype" attribute
         */
        public java.lang.String getMimetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIMETYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mimetype" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMimetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIMETYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "mimetype" attribute
         */
        public boolean isSetMimetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MIMETYPE$0) != null;
            }
        }
        
        /**
         * Sets the "mimetype" attribute
         */
        public void setMimetype(java.lang.String mimetype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIMETYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIMETYPE$0);
                }
                target.setStringValue(mimetype);
            }
        }
        
        /**
         * Sets (as xml) the "mimetype" attribute
         */
        public void xsetMimetype(org.apache.xmlbeans.XmlString mimetype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIMETYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MIMETYPE$0);
                }
                target.set(mimetype);
            }
        }
        
        /**
         * Unsets the "mimetype" attribute
         */
        public void unsetMimetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MIMETYPE$0);
            }
        }
        
        /**
         * Gets the "schema" attribute
         */
        public java.lang.String getSchema()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMA$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "schema" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSchema()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCHEMA$2);
                return target;
            }
        }
        
        /**
         * True if has "schema" attribute
         */
        public boolean isSetSchema()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SCHEMA$2) != null;
            }
        }
        
        /**
         * Sets the "schema" attribute
         */
        public void setSchema(java.lang.String schema)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMA$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMA$2);
                }
                target.setStringValue(schema);
            }
        }
        
        /**
         * Sets (as xml) the "schema" attribute
         */
        public void xsetSchema(org.apache.xmlbeans.XmlString schema)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCHEMA$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCHEMA$2);
                }
                target.set(schema);
            }
        }
        
        /**
         * Unsets the "schema" attribute
         */
        public void unsetSchema()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SCHEMA$2);
            }
        }
        
        /**
         * Gets the "encoding" attribute
         */
        public java.lang.String getEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODING$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "encoding" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODING$4);
                return target;
            }
        }
        
        /**
         * True if has "encoding" attribute
         */
        public boolean isSetEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENCODING$4) != null;
            }
        }
        
        /**
         * Sets the "encoding" attribute
         */
        public void setEncoding(java.lang.String encoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODING$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODING$4);
                }
                target.setStringValue(encoding);
            }
        }
        
        /**
         * Sets (as xml) the "encoding" attribute
         */
        public void xsetEncoding(org.apache.xmlbeans.XmlString encoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODING$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODING$4);
                }
                target.set(encoding);
            }
        }
        
        /**
         * Unsets the "encoding" attribute
         */
        public void unsetEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENCODING$4);
            }
        }
    }
}
