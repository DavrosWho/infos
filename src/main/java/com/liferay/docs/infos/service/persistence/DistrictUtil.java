package com.liferay.docs.infos.service.persistence;

import com.liferay.docs.infos.model.District;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the district service. This utility wraps {@link DistrictPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Joe Bloggs
 * @see DistrictPersistence
 * @see DistrictPersistenceImpl
 * @generated
 */
public class DistrictUtil {
    private static DistrictPersistence _persistence;

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
    public static void clearCache(District district) {
        getPersistence().clearCache(district);
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
    public static List<District> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<District> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<District> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static District update(District district) throws SystemException {
        return getPersistence().update(district);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static District update(District district,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(district, serviceContext);
    }

    /**
    * Returns all the districts where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching districts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.District> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

    /**
    * Returns a range of all the districts where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of districts
    * @param end the upper bound of the range of districts (not inclusive)
    * @return the range of matching districts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.District> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the districts where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of districts
    * @param end the upper bound of the range of districts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching districts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.District> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first district in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching district
    * @throws com.liferay.docs.infos.NoSuchDistrictException if a matching district could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.District findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchDistrictException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first district in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching district, or <code>null</code> if a matching district could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.District fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last district in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching district
    * @throws com.liferay.docs.infos.NoSuchDistrictException if a matching district could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.District findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchDistrictException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last district in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching district, or <code>null</code> if a matching district could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.District fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the districts before and after the current district in the ordered set where groupId = &#63;.
    *
    * @param districtId the primary key of the current district
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next district
    * @throws com.liferay.docs.infos.NoSuchDistrictException if a district with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.District[] findByGroupId_PrevAndNext(
        long districtId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchDistrictException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(districtId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the districts where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Returns the number of districts where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching districts
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns all the districts where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @return the matching districts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.District> findByG_A(
        long groupId, boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_A(groupId, isArchived);
    }

    /**
    * Returns a range of all the districts where groupId = &#63; and isArchived = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param start the lower bound of the range of districts
    * @param end the upper bound of the range of districts (not inclusive)
    * @return the range of matching districts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.District> findByG_A(
        long groupId, boolean isArchived, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_A(groupId, isArchived, start, end);
    }

    /**
    * Returns an ordered range of all the districts where groupId = &#63; and isArchived = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param start the lower bound of the range of districts
    * @param end the upper bound of the range of districts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching districts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.District> findByG_A(
        long groupId, boolean isArchived, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_A(groupId, isArchived, start, end, orderByComparator);
    }

    /**
    * Returns the first district in the ordered set where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching district
    * @throws com.liferay.docs.infos.NoSuchDistrictException if a matching district could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.District findByG_A_First(
        long groupId, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchDistrictException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_A_First(groupId, isArchived, orderByComparator);
    }

    /**
    * Returns the first district in the ordered set where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching district, or <code>null</code> if a matching district could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.District fetchByG_A_First(
        long groupId, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_A_First(groupId, isArchived, orderByComparator);
    }

    /**
    * Returns the last district in the ordered set where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching district
    * @throws com.liferay.docs.infos.NoSuchDistrictException if a matching district could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.District findByG_A_Last(
        long groupId, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchDistrictException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_A_Last(groupId, isArchived, orderByComparator);
    }

    /**
    * Returns the last district in the ordered set where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching district, or <code>null</code> if a matching district could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.District fetchByG_A_Last(
        long groupId, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_A_Last(groupId, isArchived, orderByComparator);
    }

    /**
    * Returns the districts before and after the current district in the ordered set where groupId = &#63; and isArchived = &#63;.
    *
    * @param districtId the primary key of the current district
    * @param groupId the group ID
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next district
    * @throws com.liferay.docs.infos.NoSuchDistrictException if a district with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.District[] findByG_A_PrevAndNext(
        long districtId, long groupId, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.docs.infos.NoSuchDistrictException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_A_PrevAndNext(districtId, groupId, isArchived,
            orderByComparator);
    }

    /**
    * Removes all the districts where groupId = &#63; and isArchived = &#63; from the database.
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
    * Returns the number of districts where groupId = &#63; and isArchived = &#63;.
    *
    * @param groupId the group ID
    * @param isArchived the is archived
    * @return the number of matching districts
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_A(long groupId, boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_A(groupId, isArchived);
    }

    /**
    * Caches the district in the entity cache if it is enabled.
    *
    * @param district the district
    */
    public static void cacheResult(
        com.liferay.docs.infos.model.District district) {
        getPersistence().cacheResult(district);
    }

    /**
    * Caches the districts in the entity cache if it is enabled.
    *
    * @param districts the districts
    */
    public static void cacheResult(
        java.util.List<com.liferay.docs.infos.model.District> districts) {
        getPersistence().cacheResult(districts);
    }

    /**
    * Creates a new district with the primary key. Does not add the district to the database.
    *
    * @param districtId the primary key for the new district
    * @return the new district
    */
    public static com.liferay.docs.infos.model.District create(long districtId) {
        return getPersistence().create(districtId);
    }

    /**
    * Removes the district with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param districtId the primary key of the district
    * @return the district that was removed
    * @throws com.liferay.docs.infos.NoSuchDistrictException if a district with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.District remove(long districtId)
        throws com.liferay.docs.infos.NoSuchDistrictException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(districtId);
    }

    public static com.liferay.docs.infos.model.District updateImpl(
        com.liferay.docs.infos.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(district);
    }

    /**
    * Returns the district with the primary key or throws a {@link com.liferay.docs.infos.NoSuchDistrictException} if it could not be found.
    *
    * @param districtId the primary key of the district
    * @return the district
    * @throws com.liferay.docs.infos.NoSuchDistrictException if a district with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.District findByPrimaryKey(
        long districtId)
        throws com.liferay.docs.infos.NoSuchDistrictException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(districtId);
    }

    /**
    * Returns the district with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param districtId the primary key of the district
    * @return the district, or <code>null</code> if a district with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.District fetchByPrimaryKey(
        long districtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(districtId);
    }

    /**
    * Returns all the districts.
    *
    * @return the districts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.District> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the districts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of districts
    * @param end the upper bound of the range of districts (not inclusive)
    * @return the range of districts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.District> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the districts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of districts
    * @param end the upper bound of the range of districts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of districts
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.District> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the districts from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of districts.
    *
    * @return the number of districts
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    /**
    * Returns all the farmers associated with the district.
    *
    * @param pk the primary key of the district
    * @return the farmers associated with the district
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmers(
        long pk) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getFarmers(pk);
    }

    /**
    * Returns a range of all the farmers associated with the district.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the district
    * @param start the lower bound of the range of districts
    * @param end the upper bound of the range of districts (not inclusive)
    * @return the range of farmers associated with the district
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmers(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getFarmers(pk, start, end);
    }

    /**
    * Returns an ordered range of all the farmers associated with the district.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the district
    * @param start the lower bound of the range of districts
    * @param end the upper bound of the range of districts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of farmers associated with the district
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmers(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getFarmers(pk, start, end, orderByComparator);
    }

    /**
    * Returns the number of farmers associated with the district.
    *
    * @param pk the primary key of the district
    * @return the number of farmers associated with the district
    * @throws SystemException if a system exception occurred
    */
    public static int getFarmersSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getFarmersSize(pk);
    }

    /**
    * Returns <code>true</code> if the farmer is associated with the district.
    *
    * @param pk the primary key of the district
    * @param farmerPK the primary key of the farmer
    * @return <code>true</code> if the farmer is associated with the district; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsFarmer(long pk, long farmerPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsFarmer(pk, farmerPK);
    }

    /**
    * Returns <code>true</code> if the district has any farmers associated with it.
    *
    * @param pk the primary key of the district to check for associations with farmers
    * @return <code>true</code> if the district has any farmers associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsFarmers(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsFarmers(pk);
    }

    /**
    * Adds an association between the district and the farmer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the district
    * @param farmerPK the primary key of the farmer
    * @throws SystemException if a system exception occurred
    */
    public static void addFarmer(long pk, long farmerPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addFarmer(pk, farmerPK);
    }

    /**
    * Adds an association between the district and the farmer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the district
    * @param farmer the farmer
    * @throws SystemException if a system exception occurred
    */
    public static void addFarmer(long pk,
        com.liferay.docs.infos.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addFarmer(pk, farmer);
    }

    /**
    * Adds an association between the district and the farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the district
    * @param farmerPKs the primary keys of the farmers
    * @throws SystemException if a system exception occurred
    */
    public static void addFarmers(long pk, long[] farmerPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addFarmers(pk, farmerPKs);
    }

    /**
    * Adds an association between the district and the farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the district
    * @param farmers the farmers
    * @throws SystemException if a system exception occurred
    */
    public static void addFarmers(long pk,
        java.util.List<com.liferay.docs.infos.model.Farmer> farmers)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addFarmers(pk, farmers);
    }

    /**
    * Clears all associations between the district and its farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the district to clear the associated farmers from
    * @throws SystemException if a system exception occurred
    */
    public static void clearFarmers(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().clearFarmers(pk);
    }

    /**
    * Removes the association between the district and the farmer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the district
    * @param farmerPK the primary key of the farmer
    * @throws SystemException if a system exception occurred
    */
    public static void removeFarmer(long pk, long farmerPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeFarmer(pk, farmerPK);
    }

    /**
    * Removes the association between the district and the farmer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the district
    * @param farmer the farmer
    * @throws SystemException if a system exception occurred
    */
    public static void removeFarmer(long pk,
        com.liferay.docs.infos.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeFarmer(pk, farmer);
    }

    /**
    * Removes the association between the district and the farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the district
    * @param farmerPKs the primary keys of the farmers
    * @throws SystemException if a system exception occurred
    */
    public static void removeFarmers(long pk, long[] farmerPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeFarmers(pk, farmerPKs);
    }

    /**
    * Removes the association between the district and the farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the district
    * @param farmers the farmers
    * @throws SystemException if a system exception occurred
    */
    public static void removeFarmers(long pk,
        java.util.List<com.liferay.docs.infos.model.Farmer> farmers)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeFarmers(pk, farmers);
    }

    /**
    * Sets the farmers associated with the district, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the district
    * @param farmerPKs the primary keys of the farmers to be associated with the district
    * @throws SystemException if a system exception occurred
    */
    public static void setFarmers(long pk, long[] farmerPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setFarmers(pk, farmerPKs);
    }

    /**
    * Sets the farmers associated with the district, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the district
    * @param farmers the farmers to be associated with the district
    * @throws SystemException if a system exception occurred
    */
    public static void setFarmers(long pk,
        java.util.List<com.liferay.docs.infos.model.Farmer> farmers)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setFarmers(pk, farmers);
    }

    public static DistrictPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (DistrictPersistence) PortletBeanLocatorUtil.locate(com.liferay.docs.infos.service.ClpSerializer.getServletContextName(),
                    DistrictPersistence.class.getName());

            ReferenceRegistry.registerReference(DistrictUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(DistrictPersistence persistence) {
    }
}
