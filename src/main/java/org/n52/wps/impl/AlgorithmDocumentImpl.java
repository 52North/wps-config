/*
 * An XML document type.
 * Localname: Algorithm
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.AlgorithmDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one Algorithm(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class AlgorithmDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.AlgorithmDocument
{
    private static final long serialVersionUID = 1L;
    
    public AlgorithmDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALGORITHM$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "Algorithm");
    
    
    /**
     * Gets the "Algorithm" element
     */
    public org.n52.wps.AlgorithmDocument.Algorithm getAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.AlgorithmDocument.Algorithm target = null;
            target = (org.n52.wps.AlgorithmDocument.Algorithm)get_store().find_element_user(ALGORITHM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Algorithm" element
     */
    public void setAlgorithm(org.n52.wps.AlgorithmDocument.Algorithm algorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.AlgorithmDocument.Algorithm target = null;
            target = (org.n52.wps.AlgorithmDocument.Algorithm)get_store().find_element_user(ALGORITHM$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.AlgorithmDocument.Algorithm)get_store().add_element_user(ALGORITHM$0);
            }
            target.set(algorithm);
        }
    }
    
    /**
     * Appends and returns a new empty "Algorithm" element
     */
    public org.n52.wps.AlgorithmDocument.Algorithm addNewAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.AlgorithmDocument.Algorithm target = null;
            target = (org.n52.wps.AlgorithmDocument.Algorithm)get_store().add_element_user(ALGORITHM$0);
            return target;
        }
    }
    /**
     * An XML Algorithm(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public static class AlgorithmImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.AlgorithmDocument.Algorithm
    {
        private static final long serialVersionUID = 1L;
        
        public AlgorithmImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLASSNAME$0 = 
            new javax.xml.namespace.QName("", "className");
        
        
        /**
         * Gets the "className" attribute
         */
        public java.lang.String getClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "className" attribute
         */
        public org.apache.xmlbeans.XmlString xgetClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "className" attribute
         */
        public void setClassName(java.lang.String className)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSNAME$0);
                }
                target.setStringValue(className);
            }
        }
        
        /**
         * Sets (as xml) the "className" attribute
         */
        public void xsetClassName(org.apache.xmlbeans.XmlString className)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASSNAME$0);
                }
                target.set(className);
            }
        }
    }
}
