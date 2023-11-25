package com.liferay.docs.infos.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Farmer}.
 * </p>
 *
 * @author Joe Bloggs
 * @see Farmer
 * @generated
 */
public class FarmerWrapper implements Farmer, ModelWrapper<Farmer> {
    private Farmer _farmer;

    public FarmerWrapper(Farmer farmer) {
        _farmer = farmer;
    }

    @Override
    public Class<?> getModelClass() {
        return Farmer.class;
    }

    @Override
    public String getModelClassName() {
        return Farmer.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("farmerId", getFarmerId());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("orgName", getOrgName());
        attributes.put("legalForm", getLegalForm());
        attributes.put("inn", getInn());
        attributes.put("kpp", getKpp());
        attributes.put("ogrn", getOgrn());
        attributes.put("regDate", getRegDate());
        attributes.put("isArchived", getIsArchived());
        attributes.put("districtId", getDistrictId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long farmerId = (Long) attributes.get("farmerId");

        if (farmerId != null) {
            setFarmerId(farmerId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String orgName = (String) attributes.get("orgName");

        if (orgName != null) {
            setOrgName(orgName);
        }

        String legalForm = (String) attributes.get("legalForm");

        if (legalForm != null) {
            setLegalForm(legalForm);
        }

        String inn = (String) attributes.get("inn");

        if (inn != null) {
            setInn(inn);
        }

        String kpp = (String) attributes.get("kpp");

        if (kpp != null) {
            setKpp(kpp);
        }

        String ogrn = (String) attributes.get("ogrn");

        if (ogrn != null) {
            setOgrn(ogrn);
        }

        Date regDate = (Date) attributes.get("regDate");

        if (regDate != null) {
            setRegDate(regDate);
        }

        Boolean isArchived = (Boolean) attributes.get("isArchived");

        if (isArchived != null) {
            setIsArchived(isArchived);
        }

        Long districtId = (Long) attributes.get("districtId");

        if (districtId != null) {
            setDistrictId(districtId);
        }
    }

    /**
    * Returns the primary key of this farmer.
    *
    * @return the primary key of this farmer
    */
    @Override
    public long getPrimaryKey() {
        return _farmer.getPrimaryKey();
    }

    /**
    * Sets the primary key of this farmer.
    *
    * @param primaryKey the primary key of this farmer
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _farmer.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the farmer ID of this farmer.
    *
    * @return the farmer ID of this farmer
    */
    @Override
    public long getFarmerId() {
        return _farmer.getFarmerId();
    }

    /**
    * Sets the farmer ID of this farmer.
    *
    * @param farmerId the farmer ID of this farmer
    */
    @Override
    public void setFarmerId(long farmerId) {
        _farmer.setFarmerId(farmerId);
    }

    /**
    * Returns the company ID of this farmer.
    *
    * @return the company ID of this farmer
    */
    @Override
    public long getCompanyId() {
        return _farmer.getCompanyId();
    }

    /**
    * Sets the company ID of this farmer.
    *
    * @param companyId the company ID of this farmer
    */
    @Override
    public void setCompanyId(long companyId) {
        _farmer.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this farmer.
    *
    * @return the group ID of this farmer
    */
    @Override
    public long getGroupId() {
        return _farmer.getGroupId();
    }

    /**
    * Sets the group ID of this farmer.
    *
    * @param groupId the group ID of this farmer
    */
    @Override
    public void setGroupId(long groupId) {
        _farmer.setGroupId(groupId);
    }

    /**
    * Returns the user ID of this farmer.
    *
    * @return the user ID of this farmer
    */
    @Override
    public long getUserId() {
        return _farmer.getUserId();
    }

    /**
    * Sets the user ID of this farmer.
    *
    * @param userId the user ID of this farmer
    */
    @Override
    public void setUserId(long userId) {
        _farmer.setUserId(userId);
    }

    /**
    * Returns the user uuid of this farmer.
    *
    * @return the user uuid of this farmer
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmer.getUserUuid();
    }

    /**
    * Sets the user uuid of this farmer.
    *
    * @param userUuid the user uuid of this farmer
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _farmer.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this farmer.
    *
    * @return the create date of this farmer
    */
    @Override
    public java.util.Date getCreateDate() {
        return _farmer.getCreateDate();
    }

    /**
    * Sets the create date of this farmer.
    *
    * @param createDate the create date of this farmer
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _farmer.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this farmer.
    *
    * @return the modified date of this farmer
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _farmer.getModifiedDate();
    }

    /**
    * Sets the modified date of this farmer.
    *
    * @param modifiedDate the modified date of this farmer
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _farmer.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the org name of this farmer.
    *
    * @return the org name of this farmer
    */
    @Override
    public java.lang.String getOrgName() {
        return _farmer.getOrgName();
    }

    /**
    * Sets the org name of this farmer.
    *
    * @param orgName the org name of this farmer
    */
    @Override
    public void setOrgName(java.lang.String orgName) {
        _farmer.setOrgName(orgName);
    }

    /**
    * Returns the legal form of this farmer.
    *
    * @return the legal form of this farmer
    */
    @Override
    public java.lang.String getLegalForm() {
        return _farmer.getLegalForm();
    }

    /**
    * Sets the legal form of this farmer.
    *
    * @param legalForm the legal form of this farmer
    */
    @Override
    public void setLegalForm(java.lang.String legalForm) {
        _farmer.setLegalForm(legalForm);
    }

    /**
    * Returns the inn of this farmer.
    *
    * @return the inn of this farmer
    */
    @Override
    public java.lang.String getInn() {
        return _farmer.getInn();
    }

    /**
    * Sets the inn of this farmer.
    *
    * @param inn the inn of this farmer
    */
    @Override
    public void setInn(java.lang.String inn) {
        _farmer.setInn(inn);
    }

    /**
    * Returns the kpp of this farmer.
    *
    * @return the kpp of this farmer
    */
    @Override
    public java.lang.String getKpp() {
        return _farmer.getKpp();
    }

    /**
    * Sets the kpp of this farmer.
    *
    * @param kpp the kpp of this farmer
    */
    @Override
    public void setKpp(java.lang.String kpp) {
        _farmer.setKpp(kpp);
    }

    /**
    * Returns the ogrn of this farmer.
    *
    * @return the ogrn of this farmer
    */
    @Override
    public java.lang.String getOgrn() {
        return _farmer.getOgrn();
    }

    /**
    * Sets the ogrn of this farmer.
    *
    * @param ogrn the ogrn of this farmer
    */
    @Override
    public void setOgrn(java.lang.String ogrn) {
        _farmer.setOgrn(ogrn);
    }

    /**
    * Returns the reg date of this farmer.
    *
    * @return the reg date of this farmer
    */
    @Override
    public java.util.Date getRegDate() {
        return _farmer.getRegDate();
    }

    /**
    * Sets the reg date of this farmer.
    *
    * @param regDate the reg date of this farmer
    */
    @Override
    public void setRegDate(java.util.Date regDate) {
        _farmer.setRegDate(regDate);
    }

    /**
    * Returns the is archived of this farmer.
    *
    * @return the is archived of this farmer
    */
    @Override
    public boolean getIsArchived() {
        return _farmer.getIsArchived();
    }

    /**
    * Returns <code>true</code> if this farmer is is archived.
    *
    * @return <code>true</code> if this farmer is is archived; <code>false</code> otherwise
    */
    @Override
    public boolean isIsArchived() {
        return _farmer.isIsArchived();
    }

    /**
    * Sets whether this farmer is is archived.
    *
    * @param isArchived the is archived of this farmer
    */
    @Override
    public void setIsArchived(boolean isArchived) {
        _farmer.setIsArchived(isArchived);
    }

    /**
    * Returns the district ID of this farmer.
    *
    * @return the district ID of this farmer
    */
    @Override
    public long getDistrictId() {
        return _farmer.getDistrictId();
    }

    /**
    * Sets the district ID of this farmer.
    *
    * @param districtId the district ID of this farmer
    */
    @Override
    public void setDistrictId(long districtId) {
        _farmer.setDistrictId(districtId);
    }

    @Override
    public boolean isNew() {
        return _farmer.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _farmer.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _farmer.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _farmer.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _farmer.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _farmer.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _farmer.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _farmer.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _farmer.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _farmer.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _farmer.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new FarmerWrapper((Farmer) _farmer.clone());
    }

    @Override
    public int compareTo(com.liferay.docs.infos.model.Farmer farmer) {
        return _farmer.compareTo(farmer);
    }

    @Override
    public int hashCode() {
        return _farmer.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.docs.infos.model.Farmer> toCacheModel() {
        return _farmer.toCacheModel();
    }

    @Override
    public com.liferay.docs.infos.model.Farmer toEscapedModel() {
        return new FarmerWrapper(_farmer.toEscapedModel());
    }

    @Override
    public com.liferay.docs.infos.model.Farmer toUnescapedModel() {
        return new FarmerWrapper(_farmer.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _farmer.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _farmer.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmer.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FarmerWrapper)) {
            return false;
        }

        FarmerWrapper farmerWrapper = (FarmerWrapper) obj;

        if (Validator.equals(_farmer, farmerWrapper._farmer)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Farmer getWrappedFarmer() {
        return _farmer;
    }

    @Override
    public Farmer getWrappedModel() {
        return _farmer;
    }

    @Override
    public void resetOriginalValues() {
        _farmer.resetOriginalValues();
    }
}
