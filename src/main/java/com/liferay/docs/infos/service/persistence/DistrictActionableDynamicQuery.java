package com.liferay.docs.infos.service.persistence;

import com.liferay.docs.infos.model.District;
import com.liferay.docs.infos.service.DistrictLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Joe Bloggs
 * @generated
 */
public abstract class DistrictActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DistrictActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DistrictLocalServiceUtil.getService());
        setClass(District.class);

        setClassLoader(com.liferay.docs.infos.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("districtId");
    }
}
