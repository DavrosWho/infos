package com.liferay.docs.infos.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Farmer service. Represents a row in the &quot;infos_Farmer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.docs.infos.model.impl.FarmerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.docs.infos.model.impl.FarmerImpl}.
 * </p>
 *
 * @author Joe Bloggs
 * @see Farmer
 * @see com.liferay.docs.infos.model.impl.FarmerImpl
 * @see com.liferay.docs.infos.model.impl.FarmerModelImpl
 * @generated
 */
public interface FarmerModel extends BaseModel<Farmer> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a farmer model instance should use the {@link Farmer} interface instead.
     */

    /**
     * Returns the primary key of this farmer.
     *
     * @return the primary key of this farmer
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this farmer.
     *
     * @param primaryKey the primary key of this farmer
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the farmer ID of this farmer.
     *
     * @return the farmer ID of this farmer
     */
    public long getFarmerId();

    /**
     * Sets the farmer ID of this farmer.
     *
     * @param farmerId the farmer ID of this farmer
     */
    public void setFarmerId(long farmerId);

    /**
     * Returns the company ID of this farmer.
     *
     * @return the company ID of this farmer
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this farmer.
     *
     * @param companyId the company ID of this farmer
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the group ID of this farmer.
     *
     * @return the group ID of this farmer
     */
    public long getGroupId();

    /**
     * Sets the group ID of this farmer.
     *
     * @param groupId the group ID of this farmer
     */
    public void setGroupId(long groupId);

    /**
     * Returns the user ID of this farmer.
     *
     * @return the user ID of this farmer
     */
    public long getUserId();

    /**
     * Sets the user ID of this farmer.
     *
     * @param userId the user ID of this farmer
     */
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this farmer.
     *
     * @return the user uuid of this farmer
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this farmer.
     *
     * @param userUuid the user uuid of this farmer
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the create date of this farmer.
     *
     * @return the create date of this farmer
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this farmer.
     *
     * @param createDate the create date of this farmer
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this farmer.
     *
     * @return the modified date of this farmer
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this farmer.
     *
     * @param modifiedDate the modified date of this farmer
     */
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the org name of this farmer.
     *
     * @return the org name of this farmer
     */
    @AutoEscape
    public String getOrgName();

    /**
     * Sets the org name of this farmer.
     *
     * @param orgName the org name of this farmer
     */
    public void setOrgName(String orgName);

    /**
     * Returns the legal form of this farmer.
     *
     * @return the legal form of this farmer
     */
    @AutoEscape
    public String getLegalForm();

    /**
     * Sets the legal form of this farmer.
     *
     * @param legalForm the legal form of this farmer
     */
    public void setLegalForm(String legalForm);

    /**
     * Returns the inn of this farmer.
     *
     * @return the inn of this farmer
     */
    @AutoEscape
    public String getInn();

    /**
     * Sets the inn of this farmer.
     *
     * @param inn the inn of this farmer
     */
    public void setInn(String inn);

    /**
     * Returns the kpp of this farmer.
     *
     * @return the kpp of this farmer
     */
    @AutoEscape
    public String getKpp();

    /**
     * Sets the kpp of this farmer.
     *
     * @param kpp the kpp of this farmer
     */
    public void setKpp(String kpp);

    /**
     * Returns the ogrn of this farmer.
     *
     * @return the ogrn of this farmer
     */
    @AutoEscape
    public String getOgrn();

    /**
     * Sets the ogrn of this farmer.
     *
     * @param ogrn the ogrn of this farmer
     */
    public void setOgrn(String ogrn);

    /**
     * Returns the reg date of this farmer.
     *
     * @return the reg date of this farmer
     */
    public Date getRegDate();

    /**
     * Sets the reg date of this farmer.
     *
     * @param regDate the reg date of this farmer
     */
    public void setRegDate(Date regDate);

    /**
     * Returns the is archived of this farmer.
     *
     * @return the is archived of this farmer
     */
    public boolean getIsArchived();

    /**
     * Returns <code>true</code> if this farmer is is archived.
     *
     * @return <code>true</code> if this farmer is is archived; <code>false</code> otherwise
     */
    public boolean isIsArchived();

    /**
     * Sets whether this farmer is is archived.
     *
     * @param isArchived the is archived of this farmer
     */
    public void setIsArchived(boolean isArchived);

    /**
     * Returns the district ID of this farmer.
     *
     * @return the district ID of this farmer
     */
    public long getDistrictId();

    /**
     * Sets the district ID of this farmer.
     *
     * @param districtId the district ID of this farmer
     */
    public void setDistrictId(long districtId);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.liferay.docs.infos.model.Farmer farmer);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.docs.infos.model.Farmer> toCacheModel();

    @Override
    public com.liferay.docs.infos.model.Farmer toEscapedModel();

    @Override
    public com.liferay.docs.infos.model.Farmer toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
