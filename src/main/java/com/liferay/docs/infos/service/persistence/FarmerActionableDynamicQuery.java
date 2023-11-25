package com.liferay.docs.infos.service.persistence;

import com.liferay.docs.infos.model.Farmer;
import com.liferay.docs.infos.service.FarmerLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Joe Bloggs
 * @generated
 */
public abstract class FarmerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public FarmerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(FarmerLocalServiceUtil.getService());
        setClass(Farmer.class);

        setClassLoader(com.liferay.docs.infos.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("farmerId");
    }
}
