/*
 * An XML document type.
 * Localname: FileExtension
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.FileExtensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one FileExtension(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class FileExtensionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.FileExtensionDocument
{
    private static final long serialVersionUID = 1L;
    
    public FileExtensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILEEXTENSION$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "FileExtension");
    
    
    /**
     * Gets the "FileExtension" element
     */
    public java.lang.String getFileExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEEXTENSION$0, 0);
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
            target = (org.n52.wps.FileExtensionDocument.FileExtension)get_store().find_element_user(FILEEXTENSION$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEEXTENSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEEXTENSION$0);
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
            target = (org.n52.wps.FileExtensionDocument.FileExtension)get_store().find_element_user(FILEEXTENSION$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.FileExtensionDocument.FileExtension)get_store().add_element_user(FILEEXTENSION$0);
            }
            target.set(fileExtension);
        }
    }
    /**
     * An XML FileExtension(@http://n52.org/wps).
     *
     * This is an atomic type that is a restriction of org.n52.wps.FileExtensionDocument$FileExtension.
     */
    public static class FileExtensionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.n52.wps.FileExtensionDocument.FileExtension
    {
        private static final long serialVersionUID = 1L;
        
        public FileExtensionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FileExtensionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
