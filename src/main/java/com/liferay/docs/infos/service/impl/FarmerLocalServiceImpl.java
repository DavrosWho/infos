package com.liferay.docs.infos.service.impl;

import com.liferay.docs.infos.model.Farmer;
import com.liferay.docs.infos.service.FarmerLocalServiceUtil;
import com.liferay.docs.infos.service.base.FarmerLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the farmer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.infos.service.FarmerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Joe Bloggs
 * @see com.liferay.docs.infos.service.base.FarmerLocalServiceBaseImpl
 * @see com.liferay.docs.infos.service.FarmerLocalServiceUtil
 */
public class FarmerLocalServiceImpl extends FarmerLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.liferay.docs.infos.service.FarmerLocalServiceUtil} to access the farmer local service.
     */
    public Farmer addFarmer(
            long userId, long groupId, String orgName, String legalForm, String inn, String kpp, String ogrn,
            Date regDate, long districtId, boolean isArchived, ServiceContext serviceContext)
            throws PortalException, SystemException {

        User user = userPersistence.findByPrimaryKey(userId);

        Date now = new Date();

        long farmerId =
                counterLocalService.increment(Farmer.class.getName());

        Farmer farmer = farmerPersistence.create(farmerId);

        farmer.setOrgName(orgName);
        farmer.setLegalForm(legalForm);
        farmer.setInn(inn);
        farmer.setKpp(kpp);
        farmer.setOgrn(ogrn);
        farmer.setRegDate(regDate);

        farmer.setDistrictId(districtId);
        farmer.setIsArchived(isArchived);

        farmer.setGroupId(groupId);
        farmer.setCompanyId(user.getCompanyId());
        farmer.setUserId(user.getUserId());
        farmer.setCreateDate(serviceContext.getCreateDate(now));
        farmer.setModifiedDate(serviceContext.getModifiedDate(now));

        super.addFarmer(farmer);

        return farmer;
    }

    public Farmer deleteFarmer(Farmer farmer)
            throws SystemException {

        return farmerPersistence.remove(farmer);
    }

    public Farmer deleteFarmer(long farmerId)
            throws PortalException, SystemException {

        Farmer farmer = farmerPersistence.fetchByPrimaryKey(farmerId);

        return deleteFarmer(farmer);
    }

    public List<Farmer> getFarmersByGroupId(long groupId)
            throws SystemException {

        return farmerPersistence.findByGroupId(groupId);
    }

    public List<Farmer> getFarmersByGroupId(
            long groupId, int start, int end)
            throws SystemException {

        return farmerPersistence.findByGroupId(groupId, start, end);
    }

    public int getFarmersCountByGroupId(long groupId) throws SystemException {

        return farmerPersistence.countByGroupId(groupId);
    }

    public List<Farmer> getFarmersByGroupIdOrgName(
            long groupId, String orgName)
            throws SystemException {

        return farmerPersistence.findByG_O(groupId, orgName);
    }

    public List<Farmer> getFarmersByGroupIdOrgName(
            long groupId, String orgName, int start, int end)
            throws SystemException {

        return farmerPersistence.findByG_O(groupId, orgName, start, end);
    }

    public int getFarmersCountByGroupIdOrgName(long groupId, String orgName) throws SystemException {

        return farmerPersistence.countByG_O(groupId, orgName);
    }

    public List<Farmer> getFarmersByGroupIdInn(
            long groupId, String inn)
            throws SystemException {

        return farmerPersistence.findByG_I(groupId, inn);
    }

    public List<Farmer> getFarmersByGroupIdInn(
            long groupId, String inn, int start, int end)
            throws SystemException {

        return farmerPersistence.findByG_I(groupId, inn, start, end);
    }

    public int getFarmersCountByGroupIdInn(long groupId, String inn) throws SystemException {

        return farmerPersistence.countByG_I(groupId, inn);
    }

    public List<Farmer> getFarmersByGroupIdDistrictId(
            long groupId, long districtId)
            throws SystemException {

        return farmerPersistence.findByG_D(groupId, districtId);
    }

    public List<Farmer> getFarmersByGroupIdDistrictId(
            long groupId, long districtId, int start, int end)
            throws SystemException {

        return farmerPersistence.findByG_D(groupId, districtId, start, end);
    }

    public int getFarmersCountByGroupIdDistrictId(long groupId, long districtId) throws SystemException {

        return farmerPersistence.countByG_D(groupId, districtId);
    }

    public List<Farmer> getFarmersByGroupIdIsArchived(
            long groupId, boolean isArchived)
            throws SystemException {

        return farmerPersistence.findByG_A(groupId, isArchived);
    }

    public List<Farmer> getFarmersByGroupIdIsArchived(
            long groupId, boolean isArchived, int start, int end)
            throws SystemException {

        return farmerPersistence.findByG_A(groupId, isArchived, start, end);
    }

    public int getFarmersCountByGroupIdIsArchived(long groupId, boolean isArchived) throws SystemException {

        return farmerPersistence.countByG_A(groupId, isArchived);
    }

    public List<Farmer> getFarmersByDateRange(
            long groupId, Date startDate, Date endDate, int start, int end)
            throws SystemException {
        DynamicQuery query = DynamicQueryFactoryUtil.forClass(Farmer.class)
                .add(PropertyFactoryUtil.forName("regDate").between(startDate, endDate));

        List<Farmer> farmers = null;
        try {
            farmers =  FarmerLocalServiceUtil.dynamicQuery(query, start, end);
        } catch (SystemException e) {
        }

        return farmers;
    }

    public Farmer updateFarmer(
            long userId, long farmerId, String orgName, String legalForm,
            String inn, String kpp, String ogrn, Date regDate, long districtId, boolean isArchived, ServiceContext serviceContext)
            throws PortalException, SystemException {

        User user = userPersistence.findByPrimaryKey(userId);

        Date now = new Date();

        Farmer farmer = farmerPersistence.findByPrimaryKey(farmerId);

        farmer.setOrgName(orgName);
        farmer.setLegalForm(legalForm);
        farmer.setInn(inn);
        farmer.setKpp(kpp);
        farmer.setOgrn(ogrn);
        farmer.setRegDate(regDate);

        farmer.setDistrictId(districtId);
        farmer.setIsArchived(isArchived);
        farmer.setModifiedDate(serviceContext.getModifiedDate(now));

        super.updateFarmer(farmer);

        return farmer;
    }
}
