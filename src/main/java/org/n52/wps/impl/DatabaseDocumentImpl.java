/*
 * An XML document type.
 * Localname: Database
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.DatabaseDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one Database(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class DatabaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.DatabaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DatabaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATABASE$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "Database");
    
    
    /**
     * Gets the "Database" element
     */
    public org.n52.wps.DatabaseDocument.Database getDatabase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.DatabaseDocument.Database target = null;
            target = (org.n52.wps.DatabaseDocument.Database)get_store().find_element_user(DATABASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Database" element
     */
    public void setDatabase(org.n52.wps.DatabaseDocument.Database database)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.DatabaseDocument.Database target = null;
            target = (org.n52.wps.DatabaseDocument.Database)get_store().find_element_user(DATABASE$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.DatabaseDocument.Database)get_store().add_element_user(DATABASE$0);
            }
            target.set(database);
        }
    }
    
    /**
     * Appends and returns a new empty "Database" element
     */
    public org.n52.wps.DatabaseDocument.Database addNewDatabase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.DatabaseDocument.Database target = null;
            target = (org.n52.wps.DatabaseDocument.Database)get_store().add_element_user(DATABASE$0);
            return target;
        }
    }
    /**
     * An XML Database(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public static class DatabaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.DatabaseDocument.Database
    {
        private static final long serialVersionUID = 1L;
        
        public DatabaseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROPERTY$0 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "Property");
        
        
        /**
         * Gets array of all "Property" elements
         */
        public org.n52.wps.PropertyDocument.Property[] getPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTY$0, targetList);
                org.n52.wps.PropertyDocument.Property[] result = new org.n52.wps.PropertyDocument.Property[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Property" element
         */
        public org.n52.wps.PropertyDocument.Property getPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.PropertyDocument.Property target = null;
                target = (org.n52.wps.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Property" element
         */
        public int sizeOfPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTY$0);
            }
        }
        
        /**
         * Sets array of all "Property" element
         */
        public void setPropertyArray(org.n52.wps.PropertyDocument.Property[] propertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(propertyArray, PROPERTY$0);
            }
        }
        
        /**
         * Sets ith "Property" element
         */
        public void setPropertyArray(int i, org.n52.wps.PropertyDocument.Property property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.PropertyDocument.Property target = null;
                target = (org.n52.wps.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(property);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Property" element
         */
        public org.n52.wps.PropertyDocument.Property insertNewProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.PropertyDocument.Property target = null;
                target = (org.n52.wps.PropertyDocument.Property)get_store().insert_element_user(PROPERTY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Property" element
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
         * Removes the ith "Property" element
         */
        public void removeProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTY$0, i);
            }
        }
    }
}
