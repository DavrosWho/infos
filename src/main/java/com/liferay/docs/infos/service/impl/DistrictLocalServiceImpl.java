package com.liferay.docs.infos.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import com.liferay.docs.infos.model.District;
import com.liferay.docs.infos.service.base.DistrictLocalServiceBaseImpl;

/**
 * The implementation of the district local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.infos.service.DistrictLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Joe Bloggs
 * @see com.liferay.docs.infos.service.base.DistrictLocalServiceBaseImpl
 * @see com.liferay.docs.infos.service.DistrictLocalServiceUtil
 */
public class DistrictLocalServiceImpl extends DistrictLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.liferay.docs.infos.service.DistrictLocalServiceUtil} to access the district local service.
     */
    public District addDistrict(
            long userId, long groupId, String name, int code,
            boolean isArchived, ServiceContext serviceContext)
            throws PortalException, SystemException {

        User user = userPersistence.findByPrimaryKey(userId);

        Date now = new Date();

        long districtId =
                counterLocalService.increment(District.class.getName());

        District district = districtPersistence.create(districtId);

        district.setName(name);
        district.setCode(code);
        district.setIsArchived(isArchived);

        district.setGroupId(groupId);
        district.setCompanyId(user.getCompanyId());
        district.setUserId(user.getUserId());
        district.setCreateDate(serviceContext.getCreateDate(now));
        district.setModifiedDate(serviceContext.getModifiedDate(now));

        super.addDistrict(district);

        return district;
    }

    public District deleteDistrict(District district)
            throws SystemException {

        return districtPersistence.remove(district);
    }

    public District deleteDistrict(long districtId)
            throws PortalException, SystemException {

        District district = districtPersistence.fetchByPrimaryKey(districtId);

        return deleteDistrict(district);
    }

    public List<District> getDistrictsByGroupId(long groupId)
            throws SystemException {

        return districtPersistence.findByG_A(groupId, false);
    }

    public List<District> getDistrictsByGroupId(
            long groupId, int start, int end)
            throws SystemException {

        return districtPersistence.findByG_A(groupId, false, start, end);
    }

    public int getDistrictsCountByGroupId(long groupId) throws SystemException {

        return districtPersistence.countByG_A(groupId, false);
    }

    public District updateDistrict(
            long userId, long districtId, String name, int code,
            boolean isArchived, ServiceContext serviceContext)
            throws PortalException, SystemException {

        User user = userPersistence.findByPrimaryKey(userId);

        Date now = new Date();

        District district = districtPersistence.findByPrimaryKey(districtId);

        district.setName(name);
        district.setCode(code);
        district.setIsArchived(isArchived);
        district.setModifiedDate(serviceContext.getModifiedDate(now));

        super.updateDistrict(district);

        return district;
    }
}
