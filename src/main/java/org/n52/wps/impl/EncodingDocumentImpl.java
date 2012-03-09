/*
 * An XML document type.
 * Localname: Encoding
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.EncodingDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one Encoding(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class EncodingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.EncodingDocument
{
    private static final long serialVersionUID = 1L;
    
    public EncodingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENCODING$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "Encoding");
    
    
    /**
     * Gets the "Encoding" element
     */
    public java.lang.String getEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCODING$0, 0);
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
            target = (org.n52.wps.EncodingDocument.Encoding)get_store().find_element_user(ENCODING$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCODING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENCODING$0);
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
            target = (org.n52.wps.EncodingDocument.Encoding)get_store().find_element_user(ENCODING$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.EncodingDocument.Encoding)get_store().add_element_user(ENCODING$0);
            }
            target.set(encoding);
        }
    }
    /**
     * An XML Encoding(@http://n52.org/wps).
     *
     * This is an atomic type that is a restriction of org.n52.wps.EncodingDocument$Encoding.
     */
    public static class EncodingImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.n52.wps.EncodingDocument.Encoding
    {
        private static final long serialVersionUID = 1L;
        
        public EncodingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected EncodingImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
