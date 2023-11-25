package com.liferay.docs.infos.service.messaging;

import com.liferay.docs.infos.service.ClpSerializer;
import com.liferay.docs.infos.service.DistrictLocalServiceUtil;
import com.liferay.docs.infos.service.DistrictServiceUtil;
import com.liferay.docs.infos.service.FarmerLocalServiceUtil;
import com.liferay.docs.infos.service.FarmerServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            DistrictLocalServiceUtil.clearService();

            DistrictServiceUtil.clearService();
            FarmerLocalServiceUtil.clearService();

            FarmerServiceUtil.clearService();
        }
    }
}
