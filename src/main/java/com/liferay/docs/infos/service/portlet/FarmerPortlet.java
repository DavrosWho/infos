package com.liferay.docs.infos.service.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FarmerPortlet extends MVCPortlet {

    public void addFarmer(ActionRequest request, ActionResponse response)
            throws Exception {

        _updateFarmer(request);

        sendRedirect(request, response);
    }

    public void deleteFarmer(ActionRequest request, ActionResponse response)
            throws Exception {

        long farmerId = ParamUtil.getLong(request, "farmerId");

        FarmerLocalServiceUtil.deleteFarmer(farmerId);

        sendRedirect(request, response);
    }

    public void updateFarmer(ActionRequest request, ActionResponse response)
            throws Exception {

        _updateFarmer(request);

        sendRedirect(request, response);
    }

    private Farmer _updateFarmer(ActionRequest request)
            throws PortalException, SystemException, ParseException {

        long farmerId = (ParamUtil.getLong(request, "farmerId"));
        String orgName = (ParamUtil.getString(request, "orgName"));
        String legalForm = (ParamUtil.getString(request, "legalForm"));
        String inn = (ParamUtil.getString(request, "inn"));
        String kpp = (ParamUtil.getString(request, "kpp"));
        String ogrn = (ParamUtil.getString(request, "ogrn"));
        long districtId = (ParamUtil.getLong(request, "districtId"));
        String regDate = (ParamUtil.getString(request, "regDate"));
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        Date regDate2 = sdf.parse(regDate);

        boolean isArchived = (ParamUtil.getBoolean(request, "isArchived"));

        ServiceContext serviceContext = ServiceContextFactory.getInstance(
                Farmer.class.getName(), request);

        Farmer farmer = null;

        if (farmerId <= 0) {

            farmer = FarmerLocalServiceUtil.addFarmer(
                    serviceContext.getUserId(), serviceContext.getScopeGroupId(), orgName, legalForm, inn, kpp, ogrn,
                    regDate2, districtId, isArchived, serviceContext);
        }
        else {
            farmer = FarmerLocalServiceUtil.getFarmer(farmerId);

            farmer = FarmerLocalServiceUtil.updateFarmer(
                    serviceContext.getUserId(), farmerId, orgName, legalForm, inn, kpp, ogrn,
                    regDate2, districtId, isArchived, serviceContext);
        }

        return farmer;
    }

    public void addFarmerDistrict(ActionRequest request, ActionResponse response)
            throws Exception {
        long farmerId = ParamUtil.getLong(request, "farmerId");
        long districtId = ParamUtil.getLong(request, "districtId");

        DistrictLocalServiceUtil.addFarmerDistrict(farmerId, districtId);

        sendRedirect(request, response);
    }

    public void deleteFarmerDistrict(ActionRequest request, ActionResponse response)
            throws Exception {
        long farmerId = ParamUtil.getLong(request, "farmerId");
        long districtId = ParamUtil.getLong(request, "districtId");

        DistrictLocalServiceUtil.deleteFarmerDistrict(farmerId, districtId);

        sendRedirect(request, response);
    }

    public void toArchive(ActionRequest request, ActionResponse response)
            throws Exception {
        long farmerId = ParamUtil.getLong(request, "farmerId");
        Farmer farmer = FarmerLocalServiceUtil.getFarmer(farmerId);
        farmer.setIsArchived(true);

        FarmerLocalServiceUtil.updateFarmer(farmer);

        sendRedirect(request, response);
    }

    public void fromArchive(ActionRequest request, ActionResponse response)
            throws Exception {
        long farmerId = ParamUtil.getLong(request, "farmerId");
        Farmer farmer = FarmerLocalServiceUtil.getFarmer(farmerId);
        farmer.setIsArchived(false);

        FarmerLocalServiceUtil.updateFarmer(farmer);

        sendRedirect(request, response);
    }

    private static Log _log = LogFactoryUtil.getLog(FarmerPortlet.class);
}
