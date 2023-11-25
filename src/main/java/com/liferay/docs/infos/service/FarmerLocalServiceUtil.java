package com.liferay.docs.infos.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Farmer. This utility wraps
 * {@link com.liferay.docs.infos.service.impl.FarmerLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Joe Bloggs
 * @see FarmerLocalService
 * @see com.liferay.docs.infos.service.base.FarmerLocalServiceBaseImpl
 * @see com.liferay.docs.infos.service.impl.FarmerLocalServiceImpl
 * @generated
 */
public class FarmerLocalServiceUtil {
    private static FarmerLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.infos.service.impl.FarmerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the farmer to the database. Also notifies the appropriate model listeners.
    *
    * @param farmer the farmer
    * @return the farmer that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer addFarmer(
        com.liferay.docs.infos.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addFarmer(farmer);
    }

    /**
    * Creates a new farmer with the primary key. Does not add the farmer to the database.
    *
    * @param farmerId the primary key for the new farmer
    * @return the new farmer
    */
    public static com.liferay.docs.infos.model.Farmer createFarmer(
        long farmerId) {
        return getService().createFarmer(farmerId);
    }

    /**
    * Deletes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer that was removed
    * @throws PortalException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer deleteFarmer(
        long farmerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteFarmer(farmerId);
    }

    /**
    * Deletes the farmer from the database. Also notifies the appropriate model listeners.
    *
    * @param farmer the farmer
    * @return the farmer that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer deleteFarmer(
        com.liferay.docs.infos.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteFarmer(farmer);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.infos.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.liferay.docs.infos.model.Farmer fetchFarmer(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchFarmer(farmerId);
    }

    /**
    * Returns the farmer with the primary key.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer
    * @throws PortalException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer getFarmer(long farmerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmer(farmerId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmers(start, end);
    }

    /**
    * Returns the number of farmers.
    *
    * @return the number of farmers
    * @throws SystemException if a system exception occurred
    */
    public static int getFarmersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmersCount();
    }

    /**
    * Updates the farmer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param farmer the farmer
    * @return the farmer that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.docs.infos.model.Farmer updateFarmer(
        com.liferay.docs.infos.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateFarmer(farmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addDistrictFarmer(long districtId, long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addDistrictFarmer(districtId, farmerId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addDistrictFarmer(long districtId,
        com.liferay.docs.infos.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addDistrictFarmer(districtId, farmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addDistrictFarmers(long districtId, long[] farmerIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addDistrictFarmers(districtId, farmerIds);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addDistrictFarmers(long districtId,
        java.util.List<com.liferay.docs.infos.model.Farmer> Farmers)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addDistrictFarmers(districtId, Farmers);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void clearDistrictFarmers(long districtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().clearDistrictFarmers(districtId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteDistrictFarmer(long districtId, long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteDistrictFarmer(districtId, farmerId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteDistrictFarmer(long districtId,
        com.liferay.docs.infos.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteDistrictFarmer(districtId, farmer);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteDistrictFarmers(long districtId, long[] farmerIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteDistrictFarmers(districtId, farmerIds);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteDistrictFarmers(long districtId,
        java.util.List<com.liferay.docs.infos.model.Farmer> Farmers)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteDistrictFarmers(districtId, Farmers);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.Farmer> getDistrictFarmers(
        long districtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDistrictFarmers(districtId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.Farmer> getDistrictFarmers(
        long districtId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDistrictFarmers(districtId, start, end);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.docs.infos.model.Farmer> getDistrictFarmers(
        long districtId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getDistrictFarmers(districtId, start, end, orderByComparator);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static int getDistrictFarmersCount(long districtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDistrictFarmersCount(districtId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static boolean hasDistrictFarmer(long districtId, long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().hasDistrictFarmer(districtId, farmerId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static boolean hasDistrictFarmers(long districtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().hasDistrictFarmers(districtId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void setDistrictFarmers(long districtId, long[] farmerIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().setDistrictFarmers(districtId, farmerIds);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.liferay.docs.infos.model.Farmer addFarmer(long userId,
        long groupId, java.lang.String orgName, java.lang.String legalForm,
        java.lang.String inn, java.lang.String kpp, java.lang.String ogrn,
        java.util.Date regDate, long districtId, boolean isArchived,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addFarmer(userId, groupId, orgName, legalForm, inn, kpp,
            ogrn, regDate, districtId, isArchived, serviceContext);
    }

    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmersByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmersByGroupId(groupId);
    }

    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmersByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmersByGroupId(groupId, start, end);
    }

    public static int getFarmersCountByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmersCountByGroupId(groupId);
    }

    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmersByGroupIdOrgName(
        long groupId, java.lang.String orgName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmersByGroupIdOrgName(groupId, orgName);
    }

    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmersByGroupIdOrgName(
        long groupId, java.lang.String orgName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getFarmersByGroupIdOrgName(groupId, orgName, start, end);
    }

    public static int getFarmersCountByGroupIdOrgName(long groupId,
        java.lang.String orgName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmersCountByGroupIdOrgName(groupId, orgName);
    }

    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmersByGroupIdInn(
        long groupId, java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmersByGroupIdInn(groupId, inn);
    }

    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmersByGroupIdInn(
        long groupId, java.lang.String inn, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmersByGroupIdInn(groupId, inn, start, end);
    }

    public static int getFarmersCountByGroupIdInn(long groupId,
        java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmersCountByGroupIdInn(groupId, inn);
    }

    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmersByGroupIdDistrictId(
        long groupId, long districtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmersByGroupIdDistrictId(groupId, districtId);
    }

    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmersByGroupIdDistrictId(
        long groupId, long districtId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getFarmersByGroupIdDistrictId(groupId, districtId, start,
            end);
    }

    public static int getFarmersCountByGroupIdDistrictId(long groupId,
        long districtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getFarmersCountByGroupIdDistrictId(groupId, districtId);
    }

    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmersByGroupIdIsArchived(
        long groupId, boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFarmersByGroupIdIsArchived(groupId, isArchived);
    }

    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmersByGroupIdIsArchived(
        long groupId, boolean isArchived, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getFarmersByGroupIdIsArchived(groupId, isArchived, start,
            end);
    }

    public static int getFarmersCountByGroupIdIsArchived(long groupId,
        boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getFarmersCountByGroupIdIsArchived(groupId, isArchived);
    }

    public static java.util.List<com.liferay.docs.infos.model.Farmer> getFarmersByDateRange(
        long groupId, java.util.Date startDate, java.util.Date endDate,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getFarmersByDateRange(groupId, startDate, endDate, start,
            end);
    }

    public static com.liferay.docs.infos.model.Farmer updateFarmer(
        long userId, long farmerId, java.lang.String orgName,
        java.lang.String legalForm, java.lang.String inn, java.lang.String kpp,
        java.lang.String ogrn, java.util.Date regDate, long districtId,
        boolean isArchived,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateFarmer(userId, farmerId, orgName, legalForm, inn,
            kpp, ogrn, regDate, districtId, isArchived, serviceContext);
    }

    public static void clearService() {
        _service = null;
    }

    public static FarmerLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    FarmerLocalService.class.getName());

            if (invokableLocalService instanceof FarmerLocalService) {
                _service = (FarmerLocalService) invokableLocalService;
            } else {
                _service = new FarmerLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(FarmerLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(FarmerLocalService service) {
    }
}
