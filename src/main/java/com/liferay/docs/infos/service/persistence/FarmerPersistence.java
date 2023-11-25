package com.liferay.docs.infos.service.persistence;

import com.liferay.docs.infos.model.Farmer;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the farmer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joe Bloggs
 * @see FarmerPersistenceImpl
 * @see FarmerUtil
 * @generated
 */
public interface FarmerPersistence extends BasePersistence<Farmer> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link FarmerUtil} to access the farmer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the farmers where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63;.
    *
    * @param farmerId the primary key of the current farmer
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer[] findByGroupId_PrevAndNext(
        long farmerId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where groupId = &#63; and orgName = &#63;.
    *
    * @param groupId the group ID
    * @param orgName the org name
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_O(
        long groupId, java.lang.String orgName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where groupId = &#63; and orgName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param orgName the org name
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_O(
        long groupId, java.lang.String orgName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where groupId = &#63; and orgName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param orgName the org name
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_O(
        long groupId, java.lang.String orgName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and orgName = &#63;.
    *
    * @param groupId the group ID
    * @param orgName the org name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer findByG_O_First(long groupId,
        java.lang.String orgName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and orgName = &#63;.
    *
    * @param groupId the group ID
    * @param orgName the org name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer fetchByG_O_First(long groupId,
        java.lang.String orgName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and orgName = &#63;.
    *
    * @param groupId the group ID
    * @param orgName the org name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer findByG_O_Last(long groupId,
        java.lang.String orgName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and orgName = &#63;.
    *
    * @param groupId the group ID
    * @param orgName the org name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer fetchByG_O_Last(long groupId,
        java.lang.String orgName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63; and orgName = &#63;.
    *
    * @param farmerId the primary key of the current farmer
    * @param groupId the group ID
    * @param orgName the org name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer[] findByG_O_PrevAndNext(
        long farmerId, long groupId, java.lang.String orgName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers where groupId = &#63; and orgName = &#63; from the database.
    *
    * @param groupId the group ID
    * @param orgName the org name
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_O(long groupId, java.lang.String orgName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where groupId = &#63; and orgName = &#63;.
    *
    * @param groupId the group ID
    * @param orgName the org name
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByG_O(long groupId, java.lang.String orgName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where groupId = &#63; and inn = &#63;.
    *
    * @param groupId the group ID
    * @param inn the inn
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_I(
        long groupId, java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where groupId = &#63; and inn = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param inn the inn
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_I(
        long groupId, java.lang.String inn, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where groupId = &#63; and inn = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param inn the inn
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_I(
        long groupId, java.lang.String inn, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and inn = &#63;.
    *
    * @param groupId the group ID
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer findByG_I_First(long groupId,
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and inn = &#63;.
    *
    * @param groupId the group ID
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer fetchByG_I_First(long groupId,
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and inn = &#63;.
    *
    * @param groupId the group ID
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer findByG_I_Last(long groupId,
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and inn = &#63;.
    *
    * @param groupId the group ID
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer fetchByG_I_Last(long groupId,
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63; and inn = &#63;.
    *
    * @param farmerId the primary key of the current farmer
    * @param groupId the group ID
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer[] findByG_I_PrevAndNext(
        long farmerId, long groupId, java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers where groupId = &#63; and inn = &#63; from the database.
    *
    * @param groupId the group ID
    * @param inn the inn
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_I(long groupId, java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where groupId = &#63; and inn = &#63;.
    *
    * @param groupId the group ID
    * @param inn the inn
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByG_I(long groupId, java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where groupId = &#63; and districtId = &#63;.
    *
    * @param groupId the group ID
    * @param districtId the district ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_D(
        long groupId, long districtId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where groupId = &#63; and districtId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param districtId the district ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_D(
        long groupId, long districtId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where groupId = &#63; and districtId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param districtId the district ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_D(
        long groupId, long districtId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and districtId = &#63;.
    *
    * @param groupId the group ID
    * @param districtId the district ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer findByG_D_First(long groupId,
        long districtId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and districtId = &#63;.
    *
    * @param groupId the group ID
    * @param districtId the district ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer fetchByG_D_First(long groupId,
        long districtId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and districtId = &#63;.
    *
    * @param groupId the group ID
    * @param districtId the district ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer findByG_D_Last(long groupId,
        long districtId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and districtId = &#63;.
    *
    * @param groupId the group ID
    * @param districtId the district ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer fetchByG_D_Last(long groupId,
        long districtId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63; and districtId = &#63;.
    *
    * @param farmerId the primary key of the current farmer
    * @param groupId the group ID
    * @param districtId the district ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer[] findByG_D_PrevAndNext(
        long farmerId, long groupId, long districtId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers where groupId = &#63; and districtId = &#63; from the database.
    *
    * @param groupId the group ID
    * @param districtId the district ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_D(long groupId, long districtId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where groupId = &#63; and districtId = &#63;.
    *
    * @param groupId the group ID
    * @param districtId the district ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByG_D(long groupId, long districtId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where groupId = &#63; and regDate = &#63;.
    *
    * @param groupId the group ID
    * @param regDate the reg date
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_R(
        long groupId, java.util.Date regDate)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where groupId = &#63; and regDate = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param regDate the reg date
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_R(
        long groupId, java.util.Date regDate, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where groupId = &#63; and regDate = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param regDate the reg date
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_R(
        long groupId, java.util.Date regDate, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and regDate = &#63;.
    *
    * @param groupId the group ID
    * @param regDate the reg date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer findByG_R_First(long groupId,
        java.util.Date regDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and regDate = &#63;.
    *
    * @param groupId the group ID
    * @param regDate the reg date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer fetchByG_R_First(long groupId,
        java.util.Date regDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and regDate = &#63;.
    *
    * @param groupId the group ID
    * @param regDate the reg date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer findByG_R_Last(long groupId,
        java.util.Date regDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and regDate = &#63;.
    *
    * @param groupId the group ID
    * @param regDate the reg date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer fetchByG_R_Last(long groupId,
        java.util.Date regDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63; and regDate = &#63;.
    *
    * @param farmerId the primary key of the current farmer
    * @param groupId the group ID
    * @param regDate the reg date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer[] findByG_R_PrevAndNext(
        long farmerId, long groupId, java.util.Date regDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers where groupId = &#63; and regDate = &#63; from the database.
    *
    * @param groupId the group ID
    * @param regDate the reg date
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_R(long groupId, java.util.Date regDate)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where groupId = &#63; and regDate = &#63;.
    *
    * @param groupId the group ID
    * @param regDate the reg date
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByG_R(long groupId, java.util.Date regDate)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_A(
        long groupId, boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where groupId = &#63; and isArchived = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_A(
        long groupId, boolean isArchived, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where groupId = &#63; and isArchived = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findByG_A(
        long groupId, boolean isArchived, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer findByG_A_First(long groupId,
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer fetchByG_A_First(long groupId,
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer findByG_A_Last(long groupId,
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer fetchByG_A_Last(long groupId,
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63; and isArchived = &#63;.
    *
    * @param farmerId the primary key of the current farmer
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer[] findByG_A_PrevAndNext(
        long farmerId, long groupId, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers where groupId = &#63; and isArchived = &#63; from the database.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_A(long groupId, boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByG_A(long groupId, boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the farmer in the entity cache if it is enabled.
    *
    * @param farmer the farmer
    */
    public void cacheResult(com.liferay.docs.infos.model.Farmer farmer);

    /**
    * Caches the farmers in the entity cache if it is enabled.
    *
    * @param farmers the farmers
    */
    public void cacheResult(
        java.util.List<com.liferay.docs.infos.model.Farmer> farmers);

    /**
    * Creates a new farmer with the primary key. Does not add the farmer to the database.
    *
    * @param farmerId the primary key for the new farmer
    * @return the new farmer
    */
    public com.liferay.docs.infos.model.Farmer create(long farmerId);

    /**
    * Removes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer that was removed
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer remove(long farmerId)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.docs.infos.model.Farmer updateImpl(
        com.liferay.docs.infos.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmer with the primary key or throws a {@link com.liferay.docs.infos.NoSuchFarmerException} if it could not be found.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer findByPrimaryKey(long farmerId)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer, or <code>null</code> if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.docs.infos.model.Farmer fetchByPrimaryKey(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers.
    *
    * @return the farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.Farmer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers.
    *
    * @return the number of farmers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the districts associated with the farmer.
    *
    * @param pk the primary key of the farmer
    * @return the districts associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.District> getDistricts(
        long pk) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the districts associated with the farmer.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the farmer
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of districts associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.District> getDistricts(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the districts associated with the farmer.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the farmer
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of districts associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.docs.infos.model.District> getDistricts(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of districts associated with the farmer.
    *
    * @param pk the primary key of the farmer
    * @return the number of districts associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public int getDistrictsSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the district is associated with the farmer.
    *
    * @param pk the primary key of the farmer
    * @param districtPK the primary key of the district
    * @return <code>true</code> if the district is associated with the farmer; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsDistrict(long pk, long districtPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the farmer has any districts associated with it.
    *
    * @param pk the primary key of the farmer to check for associations with districts
    * @return <code>true</code> if the farmer has any districts associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsDistricts(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPK the primary key of the district
    * @throws SystemException if a system exception occurred
    */
    public void addDistrict(long pk, long districtPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param district the district
    * @throws SystemException if a system exception occurred
    */
    public void addDistrict(long pk,
        com.liferay.docs.infos.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPKs the primary keys of the districts
    * @throws SystemException if a system exception occurred
    */
    public void addDistricts(long pk, long[] districtPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districts the districts
    * @throws SystemException if a system exception occurred
    */
    public void addDistricts(long pk,
        java.util.List<com.liferay.docs.infos.model.District> districts)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Clears all associations between the farmer and its districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer to clear the associated districts from
    * @throws SystemException if a system exception occurred
    */
    public void clearDistricts(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPK the primary key of the district
    * @throws SystemException if a system exception occurred
    */
    public void removeDistrict(long pk, long districtPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param district the district
    * @throws SystemException if a system exception occurred
    */
    public void removeDistrict(long pk,
        com.liferay.docs.infos.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPKs the primary keys of the districts
    * @throws SystemException if a system exception occurred
    */
    public void removeDistricts(long pk, long[] districtPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districts the districts
    * @throws SystemException if a system exception occurred
    */
    public void removeDistricts(long pk,
        java.util.List<com.liferay.docs.infos.model.District> districts)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the districts associated with the farmer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPKs the primary keys of the districts to be associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public void setDistricts(long pk, long[] districtPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the districts associated with the farmer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districts the districts to be associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public void setDistricts(long pk,
        java.util.List<com.liferay.docs.infos.model.District> districts)
        throws com.liferay.portal.kernel.exception.SystemException;
}
