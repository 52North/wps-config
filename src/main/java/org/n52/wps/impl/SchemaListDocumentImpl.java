/*
 * An XML document type.
 * Localname: SchemaList
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.SchemaListDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one SchemaList(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class SchemaListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.SchemaListDocument
{
    private static final long serialVersionUID = 1L;
    
    public SchemaListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEMALIST$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "SchemaList");
    
    
    /**
     * Gets the "SchemaList" element
     */
    public java.lang.String getSchemaList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMALIST$0, 0);
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
            target = (org.n52.wps.SchemaListDocument.SchemaList)get_store().find_element_user(SCHEMALIST$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMALIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEMALIST$0);
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
            target = (org.n52.wps.SchemaListDocument.SchemaList)get_store().find_element_user(SCHEMALIST$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.SchemaListDocument.SchemaList)get_store().add_element_user(SCHEMALIST$0);
            }
            target.set(schemaList);
        }
    }
    /**
     * An XML SchemaList(@http://n52.org/wps).
     *
     * This is an atomic type that is a restriction of org.n52.wps.SchemaListDocument$SchemaList.
     */
    public static class SchemaListImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.n52.wps.SchemaListDocument.SchemaList
    {
        private static final long serialVersionUID = 1L;
        
        public SchemaListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SchemaListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
