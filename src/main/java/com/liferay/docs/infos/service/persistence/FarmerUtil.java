package com.liferay.docs.infos.service.persistence;

import com.liferay.docs.infos.model.Farmer;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the farmer service. This utility wraps {@link FarmerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joe Bloggs
 * @see FarmerPersistence
 * @see FarmerPersistenceImpl
 * @generated
 */
public class FarmerUtil {
    private static FarmerPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Farmer farmer) {
        getPersistence().clearCache(farmer);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Farmer> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Farmer> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Farmer> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Farmer update(Farmer farmer) throws SystemException {
        return getPersistence().update(farmer);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Farmer update(Farmer farmer, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(farmer, serviceContext);
    }

    /**
    * Returns all the farmers where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer[] findByGroupId_PrevAndNext(
        long farmerId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(farmerId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the farmers where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Returns the number of farmers where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns all the farmers where groupId = &#63; and orgName = &#63;.
    *
    * @param groupId the group ID
    * @param orgName the org name
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_O(
        long groupId, java.lang.String orgName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_O(groupId, orgName);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_O(
        long groupId, java.lang.String orgName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_O(groupId, orgName, start, end);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_O(
        long groupId, java.lang.String orgName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_O(groupId, orgName, start, end, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer findByG_O_First(
        long groupId, java.lang.String orgName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_O_First(groupId, orgName, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and orgName = &#63;.
    *
    * @param groupId the group ID
    * @param orgName the org name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer fetchByG_O_First(
        long groupId, java.lang.String orgName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_O_First(groupId, orgName, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer findByG_O_Last(
        long groupId, java.lang.String orgName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_O_Last(groupId, orgName, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and orgName = &#63;.
    *
    * @param groupId the group ID
    * @param orgName the org name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer fetchByG_O_Last(
        long groupId, java.lang.String orgName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_O_Last(groupId, orgName, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer[] findByG_O_PrevAndNext(
        long farmerId, long groupId, java.lang.String orgName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_O_PrevAndNext(farmerId, groupId, orgName,
            orderByComparator);
    }

    /**
    * Removes all the farmers where groupId = &#63; and orgName = &#63; from the database.
    *
    * @param groupId the group ID
    * @param orgName the org name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_O(long groupId, java.lang.String orgName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_O(groupId, orgName);
    }

    /**
    * Returns the number of farmers where groupId = &#63; and orgName = &#63;.
    *
    * @param groupId the group ID
    * @param orgName the org name
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_O(long groupId, java.lang.String orgName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_O(groupId, orgName);
    }

    /**
    * Returns all the farmers where groupId = &#63; and inn = &#63;.
    *
    * @param groupId the group ID
    * @param inn the inn
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_I(
        long groupId, java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_I(groupId, inn);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_I(
        long groupId, java.lang.String inn, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_I(groupId, inn, start, end);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_I(
        long groupId, java.lang.String inn, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_I(groupId, inn, start, end, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer findByG_I_First(
        long groupId, java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_I_First(groupId, inn, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and inn = &#63;.
    *
    * @param groupId the group ID
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer fetchByG_I_First(
        long groupId, java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByG_I_First(groupId, inn, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer findByG_I_Last(
        long groupId, java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_I_Last(groupId, inn, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and inn = &#63;.
    *
    * @param groupId the group ID
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer fetchByG_I_Last(
        long groupId, java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByG_I_Last(groupId, inn, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer[] findByG_I_PrevAndNext(
        long farmerId, long groupId, java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_I_PrevAndNext(farmerId, groupId, inn,
            orderByComparator);
    }

    /**
    * Removes all the farmers where groupId = &#63; and inn = &#63; from the database.
    *
    * @param groupId the group ID
    * @param inn the inn
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_I(long groupId, java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_I(groupId, inn);
    }

    /**
    * Returns the number of farmers where groupId = &#63; and inn = &#63;.
    *
    * @param groupId the group ID
    * @param inn the inn
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_I(long groupId, java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_I(groupId, inn);
    }

    /**
    * Returns all the farmers where groupId = &#63; and districtId = &#63;.
    *
    * @param groupId the group ID
    * @param districtId the district ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_D(
        long groupId, long districtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_D(groupId, districtId);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_D(
        long groupId, long districtId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_D(groupId, districtId, start, end);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_D(
        long groupId, long districtId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_D(groupId, districtId, start, end, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer findByG_D_First(
        long groupId, long districtId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_D_First(groupId, districtId, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and districtId = &#63;.
    *
    * @param groupId the group ID
    * @param districtId the district ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer fetchByG_D_First(
        long groupId, long districtId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_D_First(groupId, districtId, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer findByG_D_Last(
        long groupId, long districtId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_D_Last(groupId, districtId, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and districtId = &#63;.
    *
    * @param groupId the group ID
    * @param districtId the district ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer fetchByG_D_Last(
        long groupId, long districtId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_D_Last(groupId, districtId, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer[] findByG_D_PrevAndNext(
        long farmerId, long groupId, long districtId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_D_PrevAndNext(farmerId, groupId, districtId,
            orderByComparator);
    }

    /**
    * Removes all the farmers where groupId = &#63; and districtId = &#63; from the database.
    *
    * @param groupId the group ID
    * @param districtId the district ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_D(long groupId, long districtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_D(groupId, districtId);
    }

    /**
    * Returns the number of farmers where groupId = &#63; and districtId = &#63;.
    *
    * @param groupId the group ID
    * @param districtId the district ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_D(long groupId, long districtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_D(groupId, districtId);
    }

    /**
    * Returns all the farmers where groupId = &#63; and regDate = &#63;.
    *
    * @param groupId the group ID
    * @param regDate the reg date
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_R(
        long groupId, java.util.Date regDate)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_R(groupId, regDate);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_R(
        long groupId, java.util.Date regDate, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_R(groupId, regDate, start, end);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_R(
        long groupId, java.util.Date regDate, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_R(groupId, regDate, start, end, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer findByG_R_First(
        long groupId, java.util.Date regDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_R_First(groupId, regDate, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and regDate = &#63;.
    *
    * @param groupId the group ID
    * @param regDate the reg date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer fetchByG_R_First(
        long groupId, java.util.Date regDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_R_First(groupId, regDate, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer findByG_R_Last(
        long groupId, java.util.Date regDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_R_Last(groupId, regDate, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and regDate = &#63;.
    *
    * @param groupId the group ID
    * @param regDate the reg date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer fetchByG_R_Last(
        long groupId, java.util.Date regDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_R_Last(groupId, regDate, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer[] findByG_R_PrevAndNext(
        long farmerId, long groupId, java.util.Date regDate,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_R_PrevAndNext(farmerId, groupId, regDate,
            orderByComparator);
    }

    /**
    * Removes all the farmers where groupId = &#63; and regDate = &#63; from the database.
    *
    * @param groupId the group ID
    * @param regDate the reg date
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_R(long groupId, java.util.Date regDate)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_R(groupId, regDate);
    }

    /**
    * Returns the number of farmers where groupId = &#63; and regDate = &#63;.
    *
    * @param groupId the group ID
    * @param regDate the reg date
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_R(long groupId, java.util.Date regDate)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_R(groupId, regDate);
    }

    /**
    * Returns all the farmers where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_A(
        long groupId, boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_A(groupId, isArchived);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_A(
        long groupId, boolean isArchived, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_A(groupId, isArchived, start, end);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findByG_A(
        long groupId, boolean isArchived, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_A(groupId, isArchived, start, end, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer findByG_A_First(
        long groupId, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_A_First(groupId, isArchived, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer fetchByG_A_First(
        long groupId, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_A_First(groupId, isArchived, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer findByG_A_Last(
        long groupId, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_A_Last(groupId, isArchived, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer fetchByG_A_Last(
        long groupId, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_A_Last(groupId, isArchived, orderByComparator);
    }

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
    public static com.liferay.docs.infos.model.Farmer[] findByG_A_PrevAndNext(
        long farmerId, long groupId, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_A_PrevAndNext(farmerId, groupId, isArchived,
            orderByComparator);
    }

    /**
    * Removes all the farmers where groupId = &#63; and isArchived = &#63; from the database.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_A(long groupId, boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_A(groupId, isArchived);
    }

    /**
    * Returns the number of farmers where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_A(long groupId, boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_A(groupId, isArchived);
    }

    /**
    * Caches the farmer in the entity cache if it is enabled.
    *
    * @param farmer the farmer
    */
    public static void cacheResult(com.liferay.docs.infos.model.Farmer farmer) {
        getPersistence().cacheResult(farmer);
    }

    /**
    * Caches the farmers in the entity cache if it is enabled.
    *
    * @param farmers the farmers
    */
    public static void cacheResult(
        java.util.List<com.liferay.docs.infos.model.Farmer> farmers) {
        getPersistence().cacheResult(farmers);
    }

    /**
    * Creates a new farmer with the primary key. Does not add the farmer to the database.
    *
    * @param farmerId the primary key for the new farmer
    * @return the new farmer
    */
    public static com.liferay.docs.infos.model.Farmer create(long farmerId) {
        return getPersistence().create(farmerId);
    }

    /**
    * Removes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer that was removed
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer remove(long farmerId)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(farmerId);
    }

    public static com.liferay.docs.infos.model.Farmer updateImpl(
        com.liferay.docs.infos.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(farmer);
    }

    /**
    * Returns the farmer with the primary key or throws a {@link com.liferay.docs.infos.NoSuchFarmerException} if it could not be found.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer
    * @throws com.liferay.docs.infos.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer findByPrimaryKey(
        long farmerId)
        throws com.liferay.docs.infos.NoSuchFarmerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(farmerId);
    }

    /**
    * Returns the farmer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer, or <code>null</code> if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer fetchByPrimaryKey(
        long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(farmerId);
    }

    /**
    * Returns all the farmers.
    *
    * @return the farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the farmers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of farmers.
    *
    * @return the number of farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    /**
    * Returns all the districts associated with the farmer.
    *
    * @param pk the primary key of the farmer
    * @return the districts associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.District> getDistricts(
        long pk) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getDistricts(pk);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.District> getDistricts(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getDistricts(pk, start, end);
    }

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
    public static java.util.List<com.liferay.docs.infos.model.District> getDistricts(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getDistricts(pk, start, end, orderByComparator);
    }

    /**
    * Returns the number of districts associated with the farmer.
    *
    * @param pk the primary key of the farmer
    * @return the number of districts associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static int getDistrictsSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getDistrictsSize(pk);
    }

    /**
    * Returns <code>true</code> if the district is associated with the farmer.
    *
    * @param pk the primary key of the farmer
    * @param districtPK the primary key of the district
    * @return <code>true</code> if the district is associated with the farmer; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsDistrict(long pk, long districtPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsDistrict(pk, districtPK);
    }

    /**
    * Returns <code>true</code> if the farmer has any districts associated with it.
    *
    * @param pk the primary key of the farmer to check for associations with districts
    * @return <code>true</code> if the farmer has any districts associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsDistricts(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsDistricts(pk);
    }

    /**
    * Adds an association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPK the primary key of the district
    * @throws SystemException if a system exception occurred
    */
    public static void addDistrict(long pk, long districtPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addDistrict(pk, districtPK);
    }

    /**
    * Adds an association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param district the district
    * @throws SystemException if a system exception occurred
    */
    public static void addDistrict(long pk,
        com.liferay.docs.infos.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addDistrict(pk, district);
    }

    /**
    * Adds an association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPKs the primary keys of the districts
    * @throws SystemException if a system exception occurred
    */
    public static void addDistricts(long pk, long[] districtPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addDistricts(pk, districtPKs);
    }

    /**
    * Adds an association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districts the districts
    * @throws SystemException if a system exception occurred
    */
    public static void addDistricts(long pk,
        java.util.List<com.liferay.docs.infos.model.District> districts)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addDistricts(pk, districts);
    }

    /**
    * Clears all associations between the farmer and its districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer to clear the associated districts from
    * @throws SystemException if a system exception occurred
    */
    public static void clearDistricts(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().clearDistricts(pk);
    }

    /**
    * Removes the association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPK the primary key of the district
    * @throws SystemException if a system exception occurred
    */
    public static void removeDistrict(long pk, long districtPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeDistrict(pk, districtPK);
    }

    /**
    * Removes the association between the farmer and the district. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param district the district
    * @throws SystemException if a system exception occurred
    */
    public static void removeDistrict(long pk,
        com.liferay.docs.infos.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeDistrict(pk, district);
    }

    /**
    * Removes the association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPKs the primary keys of the districts
    * @throws SystemException if a system exception occurred
    */
    public static void removeDistricts(long pk, long[] districtPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeDistricts(pk, districtPKs);
    }

    /**
    * Removes the association between the farmer and the districts. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districts the districts
    * @throws SystemException if a system exception occurred
    */
    public static void removeDistricts(long pk,
        java.util.List<com.liferay.docs.infos.model.District> districts)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeDistricts(pk, districts);
    }

    /**
    * Sets the districts associated with the farmer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districtPKs the primary keys of the districts to be associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static void setDistricts(long pk, long[] districtPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setDistricts(pk, districtPKs);
    }

    /**
    * Sets the districts associated with the farmer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param districts the districts to be associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static void setDistricts(long pk,
        java.util.List<com.liferay.docs.infos.model.District> districts)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setDistricts(pk, districts);
    }

    public static FarmerPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (FarmerPersistence) PortletBeanLocatorUtil.locate(com.liferay.docs.infos.service.ClpSerializer.getServletContextName(),
                    FarmerPersistence.class.getName());

            ReferenceRegistry.registerReference(FarmerUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(FarmerPersistence persistence) {
    }
}
