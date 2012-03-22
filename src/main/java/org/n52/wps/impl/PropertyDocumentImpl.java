/*
 * An XML document type.
 * Localname: Property
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.PropertyDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one Property(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class PropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.PropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "Property");
    
    
    /**
     * Gets the "Property" element
     */
    public org.n52.wps.PropertyDocument.Property getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.PropertyDocument.Property target = null;
            target = (org.n52.wps.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Property" element
     */
    public void setProperty(org.n52.wps.PropertyDocument.Property property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.PropertyDocument.Property target = null;
            target = (org.n52.wps.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.PropertyDocument.Property)get_store().add_element_user(PROPERTY$0);
            }
            target.set(property);
        }
    }
    
    /**
     * Appends and returns a new empty "Property" element
     */
    public org.n52.wps.PropertyDocument.Property addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.PropertyDocument.Property target = null;
            target = (org.n52.wps.PropertyDocument.Property)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
    /**
     * An XML Property(@http://n52.org/wps).
     *
     * This is an atomic type that is a restriction of org.n52.wps.PropertyDocument$Property.
     */
    public static class PropertyImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.n52.wps.PropertyDocument.Property
    {
        private static final long serialVersionUID = 1L;
        
        public PropertyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected PropertyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName ACTIVE$2 = 
            new javax.xml.namespace.QName("", "active");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.n52.wps.PropertyDocument.Property.Name xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.PropertyDocument.Property.Name target = null;
                target = (org.n52.wps.PropertyDocument.Property.Name)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.n52.wps.PropertyDocument.Property.Name name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.PropertyDocument.Property.Name target = null;
                target = (org.n52.wps.PropertyDocument.Property.Name)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.n52.wps.PropertyDocument.Property.Name)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVE$2);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ACTIVE$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIVE$2);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ACTIVE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ACTIVE$2);
                }
                target.set(active);
            }
        }
        /**
         * An XML name(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.PropertyDocument$Property$Name.
         */
        public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.n52.wps.PropertyDocument.Property.Name
        {
            private static final long serialVersionUID = 1L;
            
            public NameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected NameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
