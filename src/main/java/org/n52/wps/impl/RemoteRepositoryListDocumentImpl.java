/*
 * An XML document type.
 * Localname: RemoteRepositoryList
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.RemoteRepositoryListDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one RemoteRepositoryList(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class RemoteRepositoryListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.RemoteRepositoryListDocument
{
    private static final long serialVersionUID = 1L;
    
    public RemoteRepositoryListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOTEREPOSITORYLIST$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "RemoteRepositoryList");
    
    
    /**
     * Gets the "RemoteRepositoryList" element
     */
    public org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList getRemoteRepositoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList target = null;
            target = (org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList)get_store().find_element_user(REMOTEREPOSITORYLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RemoteRepositoryList" element
     */
    public void setRemoteRepositoryList(org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList remoteRepositoryList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList target = null;
            target = (org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList)get_store().find_element_user(REMOTEREPOSITORYLIST$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList)get_store().add_element_user(REMOTEREPOSITORYLIST$0);
            }
            target.set(remoteRepositoryList);
        }
    }
    
    /**
     * Appends and returns a new empty "RemoteRepositoryList" element
     */
    public org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList addNewRemoteRepositoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList target = null;
            target = (org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList)get_store().add_element_user(REMOTEREPOSITORYLIST$0);
            return target;
        }
    }
    /**
     * An XML RemoteRepositoryList(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public static class RemoteRepositoryListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.RemoteRepositoryListDocument.RemoteRepositoryList
    {
        private static final long serialVersionUID = 1L;
        
        public RemoteRepositoryListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REMOTEREPOSITORY$0 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "RemoteRepository");
        
        
        /**
         * Gets array of all "RemoteRepository" elements
         */
        public org.n52.wps.RemoteRepositoryDocument.RemoteRepository[] getRemoteRepositoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REMOTEREPOSITORY$0, targetList);
                org.n52.wps.RemoteRepositoryDocument.RemoteRepository[] result = new org.n52.wps.RemoteRepositoryDocument.RemoteRepository[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "RemoteRepository" element
         */
        public org.n52.wps.RemoteRepositoryDocument.RemoteRepository getRemoteRepositoryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.RemoteRepositoryDocument.RemoteRepository target = null;
                target = (org.n52.wps.RemoteRepositoryDocument.RemoteRepository)get_store().find_element_user(REMOTEREPOSITORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "RemoteRepository" element
         */
        public int sizeOfRemoteRepositoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REMOTEREPOSITORY$0);
            }
        }
        
        /**
         * Sets array of all "RemoteRepository" element
         */
        public void setRemoteRepositoryArray(org.n52.wps.RemoteRepositoryDocument.RemoteRepository[] remoteRepositoryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(remoteRepositoryArray, REMOTEREPOSITORY$0);
            }
        }
        
        /**
         * Sets ith "RemoteRepository" element
         */
        public void setRemoteRepositoryArray(int i, org.n52.wps.RemoteRepositoryDocument.RemoteRepository remoteRepository)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.RemoteRepositoryDocument.RemoteRepository target = null;
                target = (org.n52.wps.RemoteRepositoryDocument.RemoteRepository)get_store().find_element_user(REMOTEREPOSITORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(remoteRepository);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RemoteRepository" element
         */
        public org.n52.wps.RemoteRepositoryDocument.RemoteRepository insertNewRemoteRepository(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.RemoteRepositoryDocument.RemoteRepository target = null;
                target = (org.n52.wps.RemoteRepositoryDocument.RemoteRepository)get_store().insert_element_user(REMOTEREPOSITORY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RemoteRepository" element
         */
        public org.n52.wps.RemoteRepositoryDocument.RemoteRepository addNewRemoteRepository()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.RemoteRepositoryDocument.RemoteRepository target = null;
                target = (org.n52.wps.RemoteRepositoryDocument.RemoteRepository)get_store().add_element_user(REMOTEREPOSITORY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "RemoteRepository" element
         */
        public void removeRemoteRepository(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REMOTEREPOSITORY$0, i);
            }
        }
    }
}
