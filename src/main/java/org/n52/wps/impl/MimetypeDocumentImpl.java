/*
 * An XML document type.
 * Localname: Mimetype
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.MimetypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one Mimetype(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class MimetypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.MimetypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MimetypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIMETYPE$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "Mimetype");
    
    
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
     * An XML Mimetype(@http://n52.org/wps).
     *
     * This is an atomic type that is a restriction of org.n52.wps.MimetypeDocument$Mimetype.
     */
    public static class MimetypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.n52.wps.MimetypeDocument.Mimetype
    {
        private static final long serialVersionUID = 1L;
        
        public MimetypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MimetypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
