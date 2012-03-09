/*
 * An XML document type.
 * Localname: ParserList
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.ParserListDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one ParserList(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class ParserListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.ParserListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParserListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARSERLIST$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "ParserList");
    
    
    /**
     * Gets the "ParserList" element
     */
    public org.n52.wps.ParserListDocument.ParserList getParserList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.ParserListDocument.ParserList target = null;
            target = (org.n52.wps.ParserListDocument.ParserList)get_store().find_element_user(PARSERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ParserList" element
     */
    public void setParserList(org.n52.wps.ParserListDocument.ParserList parserList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.ParserListDocument.ParserList target = null;
            target = (org.n52.wps.ParserListDocument.ParserList)get_store().find_element_user(PARSERLIST$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.ParserListDocument.ParserList)get_store().add_element_user(PARSERLIST$0);
            }
            target.set(parserList);
        }
    }
    
    /**
     * Appends and returns a new empty "ParserList" element
     */
    public org.n52.wps.ParserListDocument.ParserList addNewParserList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.ParserListDocument.ParserList target = null;
            target = (org.n52.wps.ParserListDocument.ParserList)get_store().add_element_user(PARSERLIST$0);
            return target;
        }
    }
    /**
     * An XML ParserList(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public static class ParserListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.ParserListDocument.ParserList
    {
        private static final long serialVersionUID = 1L;
        
        public ParserListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARSER$0 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "Parser");
        
        
        /**
         * Gets array of all "Parser" elements
         */
        public org.n52.wps.ParserDocument.Parser[] getParserArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARSER$0, targetList);
                org.n52.wps.ParserDocument.Parser[] result = new org.n52.wps.ParserDocument.Parser[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Parser" element
         */
        public org.n52.wps.ParserDocument.Parser getParserArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ParserDocument.Parser target = null;
                target = (org.n52.wps.ParserDocument.Parser)get_store().find_element_user(PARSER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Parser" element
         */
        public int sizeOfParserArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARSER$0);
            }
        }
        
        /**
         * Sets array of all "Parser" element
         */
        public void setParserArray(org.n52.wps.ParserDocument.Parser[] parserArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(parserArray, PARSER$0);
            }
        }
        
        /**
         * Sets ith "Parser" element
         */
        public void setParserArray(int i, org.n52.wps.ParserDocument.Parser parser)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ParserDocument.Parser target = null;
                target = (org.n52.wps.ParserDocument.Parser)get_store().find_element_user(PARSER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(parser);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Parser" element
         */
        public org.n52.wps.ParserDocument.Parser insertNewParser(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ParserDocument.Parser target = null;
                target = (org.n52.wps.ParserDocument.Parser)get_store().insert_element_user(PARSER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Parser" element
         */
        public org.n52.wps.ParserDocument.Parser addNewParser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ParserDocument.Parser target = null;
                target = (org.n52.wps.ParserDocument.Parser)get_store().add_element_user(PARSER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Parser" element
         */
        public void removeParser(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARSER$0, i);
            }
        }
    }
}
