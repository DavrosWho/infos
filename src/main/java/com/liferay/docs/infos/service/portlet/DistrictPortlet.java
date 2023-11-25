package com.liferay.docs.infos.service.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.docs.infos.model.District;
import com.liferay.docs.infos.model.Farmer;
import com.liferay.docs.infos.service.DistrictLocalServiceUtil;
import com.liferay.docs.infos.service.FarmerLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class DistrictPortlet extends MVCPortlet {

    public void addDistrict(ActionRequest request, ActionResponse response)
            throws Exception {

        _updateDistrict(request);

        sendRedirect(request, response);
    }

    public void deleteDistrict(ActionRequest request, ActionResponse response)
            throws Exception {

        long districtId = ParamUtil.getLong(request, "districtId");

        DistrictLocalServiceUtil.deleteDistrict(districtId);

        sendRedirect(request, response);
    }

    public void updateDistrict(ActionRequest request, ActionResponse response)
            throws Exception {

        _updateDistrict(request);

        sendRedirect(request, response);
    }

    private District _updateDistrict(ActionRequest request)
            throws PortalException, SystemException {

        long districtId = (ParamUtil.getLong(request, "districtId"));
        String name = (ParamUtil.getString(request, "name"));
        int code = (ParamUtil.getInteger(request, "code"));
        boolean isArchived = (ParamUtil.getBoolean(request, "isArchived"));

        ServiceContext serviceContext = ServiceContextFactory.getInstance(
                District.class.getName(), request);

        District district = null;

        if (districtId <= 0) {

            district = DistrictLocalServiceUtil.addDistrict(
                    serviceContext.getUserId(), serviceContext.getScopeGroupId(), name, code,
                    isArchived, serviceContext);
        }
        else {
            district = DistrictLocalServiceUtil.getDistrict(districtId);

            district = DistrictLocalServiceUtil.updateDistrict(
                    serviceContext.getUserId(), districtId, name,
                    code, isArchived,
                    serviceContext);
        }

        return district;
    }

    public void toArchive(ActionRequest request, ActionResponse response)
            throws Exception {
        long districtId = ParamUtil.getLong(request, "districtId");
        District district = DistrictLocalServiceUtil.getDistrict(districtId);
        district.setIsArchived(true);

        DistrictLocalServiceUtil.updateDistrict(district);

        sendRedirect(request, response);
    }

    private static Log _log = LogFactoryUtil.getLog(DistrictPortlet.class);

}