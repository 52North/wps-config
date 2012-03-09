/*
 * An XML document type.
 * Localname: GeneratorList
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.GeneratorListDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one GeneratorList(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class GeneratorListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.GeneratorListDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneratorListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERATORLIST$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "GeneratorList");
    
    
    /**
     * Gets the "GeneratorList" element
     */
    public org.n52.wps.GeneratorListDocument.GeneratorList getGeneratorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.GeneratorListDocument.GeneratorList target = null;
            target = (org.n52.wps.GeneratorListDocument.GeneratorList)get_store().find_element_user(GENERATORLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeneratorList" element
     */
    public void setGeneratorList(org.n52.wps.GeneratorListDocument.GeneratorList generatorList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.GeneratorListDocument.GeneratorList target = null;
            target = (org.n52.wps.GeneratorListDocument.GeneratorList)get_store().find_element_user(GENERATORLIST$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.GeneratorListDocument.GeneratorList)get_store().add_element_user(GENERATORLIST$0);
            }
            target.set(generatorList);
        }
    }
    
    /**
     * Appends and returns a new empty "GeneratorList" element
     */
    public org.n52.wps.GeneratorListDocument.GeneratorList addNewGeneratorList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.GeneratorListDocument.GeneratorList target = null;
            target = (org.n52.wps.GeneratorListDocument.GeneratorList)get_store().add_element_user(GENERATORLIST$0);
            return target;
        }
    }
    /**
     * An XML GeneratorList(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public static class GeneratorListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.GeneratorListDocument.GeneratorList
    {
        private static final long serialVersionUID = 1L;
        
        public GeneratorListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GENERATOR$0 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "Generator");
        
        
        /**
         * Gets array of all "Generator" elements
         */
        public org.n52.wps.GeneratorDocument.Generator[] getGeneratorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GENERATOR$0, targetList);
                org.n52.wps.GeneratorDocument.Generator[] result = new org.n52.wps.GeneratorDocument.Generator[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Generator" element
         */
        public org.n52.wps.GeneratorDocument.Generator getGeneratorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.GeneratorDocument.Generator target = null;
                target = (org.n52.wps.GeneratorDocument.Generator)get_store().find_element_user(GENERATOR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Generator" element
         */
        public int sizeOfGeneratorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENERATOR$0);
            }
        }
        
        /**
         * Sets array of all "Generator" element
         */
        public void setGeneratorArray(org.n52.wps.GeneratorDocument.Generator[] generatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(generatorArray, GENERATOR$0);
            }
        }
        
        /**
         * Sets ith "Generator" element
         */
        public void setGeneratorArray(int i, org.n52.wps.GeneratorDocument.Generator generator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.GeneratorDocument.Generator target = null;
                target = (org.n52.wps.GeneratorDocument.Generator)get_store().find_element_user(GENERATOR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(generator);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Generator" element
         */
        public org.n52.wps.GeneratorDocument.Generator insertNewGenerator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.GeneratorDocument.Generator target = null;
                target = (org.n52.wps.GeneratorDocument.Generator)get_store().insert_element_user(GENERATOR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Generator" element
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
         * Removes the ith "Generator" element
         */
        public void removeGenerator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENERATOR$0, i);
            }
        }
    }
}
