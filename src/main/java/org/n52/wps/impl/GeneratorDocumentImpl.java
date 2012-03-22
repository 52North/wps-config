/*
 * An XML document type.
 * Localname: Generator
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.GeneratorDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one Generator(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class GeneratorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.GeneratorDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneratorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERATOR$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "Generator");
    
    
    /**
     * Gets the "Generator" element
     */
    public org.n52.wps.GeneratorDocument.Generator getGenerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.GeneratorDocument.Generator target = null;
            target = (org.n52.wps.GeneratorDocument.Generator)get_store().find_element_user(GENERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Generator" element
     */
    public void setGenerator(org.n52.wps.GeneratorDocument.Generator generator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.GeneratorDocument.Generator target = null;
            target = (org.n52.wps.GeneratorDocument.Generator)get_store().find_element_user(GENERATOR$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.GeneratorDocument.Generator)get_store().add_element_user(GENERATOR$0);
            }
            target.set(generator);
        }
    }
    
    /**
     * Appends and returns a new empty "Generator" element
     */
    public org.n52.wps.GeneratorDocument.Generator addNewGenerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.GeneratorDocument.Generator target = null;
            target = (org.n52.wps.GeneratorDocument.Generator)get_store().add_element_user(GENERATOR$0);
            return target;
        }
    }
    /**
     * An XML Generator(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public static class GeneratorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.GeneratorDocument.Generator
    {
        private static final long serialVersionUID = 1L;
        
        public GeneratorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FORMAT$0 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "Format");
        private static final javax.xml.namespace.QName PROPERTY$2 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "Property");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName CLASSNAME$6 = 
            new javax.xml.namespace.QName("", "className");
        private static final javax.xml.namespace.QName ACTIVE$8 = 
            new javax.xml.namespace.QName("", "active");
        
        
        /**
         * Gets array of all "Format" elements
         */
        public org.n52.wps.FormatDocument.Format[] getFormatArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FORMAT$0, targetList);
                org.n52.wps.FormatDocument.Format[] result = new org.n52.wps.FormatDocument.Format[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Format" element
         */
        public org.n52.wps.FormatDocument.Format getFormatArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.FormatDocument.Format target = null;
                target = (org.n52.wps.FormatDocument.Format)get_store().find_element_user(FORMAT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Format" element
         */
        public int sizeOfFormatArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FORMAT$0);
            }
        }
        
        /**
         * Sets array of all "Format" element
         */
        public void setFormatArray(org.n52.wps.FormatDocument.Format[] formatArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(formatArray, FORMAT$0);
            }
        }
        
        /**
         * Sets ith "Format" element
         */
        public void setFormatArray(int i, org.n52.wps.FormatDocument.Format format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.FormatDocument.Format target = null;
                target = (org.n52.wps.FormatDocument.Format)get_store().find_element_user(FORMAT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(format);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Format" element
         */
        public org.n52.wps.FormatDocument.Format insertNewFormat(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.FormatDocument.Format target = null;
                target = (org.n52.wps.FormatDocument.Format)get_store().insert_element_user(FORMAT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Format" element
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
         * Removes the ith "Format" element
         */
        public void removeFormat(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FORMAT$0, i);
            }
        }
        
        /**
         * Gets array of all "Property" elements
         */
        public org.n52.wps.PropertyDocument.Property[] getPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTY$2, targetList);
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
                target = (org.n52.wps.PropertyDocument.Property)get_store().find_element_user(PROPERTY$2, i);
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
                return get_store().count_elements(PROPERTY$2);
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
                arraySetterHelper(propertyArray, PROPERTY$2);
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
                target = (org.n52.wps.PropertyDocument.Property)get_store().find_element_user(PROPERTY$2, i);
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
                target = (org.n52.wps.PropertyDocument.Property)get_store().insert_element_user(PROPERTY$2, i);
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
                target = (org.n52.wps.PropertyDocument.Property)get_store().add_element_user(PROPERTY$2);
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
                get_store().remove_element(PROPERTY$2, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
        public org.n52.wps.GeneratorDocument.Generator.Name xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.GeneratorDocument.Generator.Name target = null;
                target = (org.n52.wps.GeneratorDocument.Generator.Name)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.n52.wps.GeneratorDocument.Generator.Name name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.GeneratorDocument.Generator.Name target = null;
                target = (org.n52.wps.GeneratorDocument.Generator.Name)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.n52.wps.GeneratorDocument.Generator.Name)get_store().add_attribute_user(NAME$4);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "className" attribute
         */
        public java.lang.String getClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$6);
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
        public org.n52.wps.GeneratorDocument.Generator.ClassName xgetClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.GeneratorDocument.Generator.ClassName target = null;
                target = (org.n52.wps.GeneratorDocument.Generator.ClassName)get_store().find_attribute_user(CLASSNAME$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSNAME$6);
                }
                target.setStringValue(className);
            }
        }
        
        /**
         * Sets (as xml) the "className" attribute
         */
        public void xsetClassName(org.n52.wps.GeneratorDocument.Generator.ClassName className)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.GeneratorDocument.Generator.ClassName target = null;
                target = (org.n52.wps.GeneratorDocument.Generator.ClassName)get_store().find_attribute_user(CLASSNAME$6);
                if (target == null)
                {
                    target = (org.n52.wps.GeneratorDocument.Generator.ClassName)get_store().add_attribute_user(CLASSNAME$6);
                }
                target.set(className);
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
        /**
         * An XML name(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.GeneratorDocument$Generator$Name.
         */
        public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.n52.wps.GeneratorDocument.Generator.Name
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
        /**
         * An XML className(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.GeneratorDocument$Generator$ClassName.
         */
        public static class ClassNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.n52.wps.GeneratorDocument.Generator.ClassName
        {
            private static final long serialVersionUID = 1L;
            
            public ClassNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ClassNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
