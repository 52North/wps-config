/*
 * An XML document type.
 * Localname: Datahandlers
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.DatahandlersDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one Datahandlers(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class DatahandlersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.DatahandlersDocument
{
    private static final long serialVersionUID = 1L;
    
    public DatahandlersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAHANDLERS$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "Datahandlers");
    
    
    /**
     * Gets the "Datahandlers" element
     */
    public org.n52.wps.DatahandlersDocument.Datahandlers getDatahandlers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.DatahandlersDocument.Datahandlers target = null;
            target = (org.n52.wps.DatahandlersDocument.Datahandlers)get_store().find_element_user(DATAHANDLERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Datahandlers" element
     */
    public void setDatahandlers(org.n52.wps.DatahandlersDocument.Datahandlers datahandlers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.DatahandlersDocument.Datahandlers target = null;
            target = (org.n52.wps.DatahandlersDocument.Datahandlers)get_store().find_element_user(DATAHANDLERS$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.DatahandlersDocument.Datahandlers)get_store().add_element_user(DATAHANDLERS$0);
            }
            target.set(datahandlers);
        }
    }
    
    /**
     * Appends and returns a new empty "Datahandlers" element
     */
    public org.n52.wps.DatahandlersDocument.Datahandlers addNewDatahandlers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.DatahandlersDocument.Datahandlers target = null;
            target = (org.n52.wps.DatahandlersDocument.Datahandlers)get_store().add_element_user(DATAHANDLERS$0);
            return target;
        }
    }
    /**
     * An XML Datahandlers(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public static class DatahandlersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.DatahandlersDocument.Datahandlers
    {
        private static final long serialVersionUID = 1L;
        
        public DatahandlersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARSERLIST$0 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "ParserList");
        private static final javax.xml.namespace.QName GENERATORLIST$2 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "GeneratorList");
        
        
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
         * Gets the "GeneratorList" element
         */
        public org.n52.wps.GeneratorListDocument.GeneratorList getGeneratorList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.GeneratorListDocument.GeneratorList target = null;
                target = (org.n52.wps.GeneratorListDocument.GeneratorList)get_store().find_element_user(GENERATORLIST$2, 0);
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
                target = (org.n52.wps.GeneratorListDocument.GeneratorList)get_store().find_element_user(GENERATORLIST$2, 0);
                if (target == null)
                {
                    target = (org.n52.wps.GeneratorListDocument.GeneratorList)get_store().add_element_user(GENERATORLIST$2);
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
                target = (org.n52.wps.GeneratorListDocument.GeneratorList)get_store().add_element_user(GENERATORLIST$2);
                return target;
            }
        }
    }
}
