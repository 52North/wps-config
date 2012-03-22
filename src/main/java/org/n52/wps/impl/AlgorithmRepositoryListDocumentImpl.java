/*
 * An XML document type.
 * Localname: AlgorithmRepositoryList
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.AlgorithmRepositoryListDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one AlgorithmRepositoryList(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class AlgorithmRepositoryListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.AlgorithmRepositoryListDocument
{
    private static final long serialVersionUID = 1L;
    
    public AlgorithmRepositoryListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALGORITHMREPOSITORYLIST$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "AlgorithmRepositoryList");
    
    
    /**
     * Gets the "AlgorithmRepositoryList" element
     */
    public org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList getAlgorithmRepositoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList target = null;
            target = (org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList)get_store().find_element_user(ALGORITHMREPOSITORYLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AlgorithmRepositoryList" element
     */
    public void setAlgorithmRepositoryList(org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList algorithmRepositoryList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList target = null;
            target = (org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList)get_store().find_element_user(ALGORITHMREPOSITORYLIST$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList)get_store().add_element_user(ALGORITHMREPOSITORYLIST$0);
            }
            target.set(algorithmRepositoryList);
        }
    }
    
    /**
     * Appends and returns a new empty "AlgorithmRepositoryList" element
     */
    public org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList addNewAlgorithmRepositoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList target = null;
            target = (org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList)get_store().add_element_user(ALGORITHMREPOSITORYLIST$0);
            return target;
        }
    }
    /**
     * An XML AlgorithmRepositoryList(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public static class AlgorithmRepositoryListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.AlgorithmRepositoryListDocument.AlgorithmRepositoryList
    {
        private static final long serialVersionUID = 1L;
        
        public AlgorithmRepositoryListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPOSITORY$0 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "Repository");
        
        
        /**
         * Gets array of all "Repository" elements
         */
        public org.n52.wps.RepositoryDocument.Repository[] getRepositoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPOSITORY$0, targetList);
                org.n52.wps.RepositoryDocument.Repository[] result = new org.n52.wps.RepositoryDocument.Repository[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Repository" element
         */
        public org.n52.wps.RepositoryDocument.Repository getRepositoryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.RepositoryDocument.Repository target = null;
                target = (org.n52.wps.RepositoryDocument.Repository)get_store().find_element_user(REPOSITORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Repository" element
         */
        public int sizeOfRepositoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPOSITORY$0);
            }
        }
        
        /**
         * Sets array of all "Repository" element
         */
        public void setRepositoryArray(org.n52.wps.RepositoryDocument.Repository[] repositoryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(repositoryArray, REPOSITORY$0);
            }
        }
        
        /**
         * Sets ith "Repository" element
         */
        public void setRepositoryArray(int i, org.n52.wps.RepositoryDocument.Repository repository)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.RepositoryDocument.Repository target = null;
                target = (org.n52.wps.RepositoryDocument.Repository)get_store().find_element_user(REPOSITORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(repository);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Repository" element
         */
        public org.n52.wps.RepositoryDocument.Repository insertNewRepository(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.RepositoryDocument.Repository target = null;
                target = (org.n52.wps.RepositoryDocument.Repository)get_store().insert_element_user(REPOSITORY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Repository" element
         */
        public org.n52.wps.RepositoryDocument.Repository addNewRepository()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.RepositoryDocument.Repository target = null;
                target = (org.n52.wps.RepositoryDocument.Repository)get_store().add_element_user(REPOSITORY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Repository" element
         */
        public void removeRepository(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPOSITORY$0, i);
            }
        }
    }
}
