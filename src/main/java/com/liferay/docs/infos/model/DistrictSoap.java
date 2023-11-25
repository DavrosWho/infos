package com.liferay.docs.infos.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.docs.infos.service.http.DistrictServiceSoap}.
 *
 * @author Joe Bloggs
 * @see com.liferay.docs.infos.service.http.DistrictServiceSoap
 * @generated
 */
public class DistrictSoap implements Serializable {
    private long _districtId;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private int _code;
    private boolean _isArchived;

    public DistrictSoap() {
    }

    public static DistrictSoap toSoapModel(District model) {
        DistrictSoap soapModel = new DistrictSoap();

        soapModel.setDistrictId(model.getDistrictId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());
        soapModel.setCode(model.getCode());
        soapModel.setIsArchived(model.getIsArchived());

        return soapModel;
    }

    public static DistrictSoap[] toSoapModels(District[] models) {
        DistrictSoap[] soapModels = new DistrictSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DistrictSoap[][] toSoapModels(District[][] models) {
        DistrictSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DistrictSoap[models.length][models[0].length];
        } else {
            soapModels = new DistrictSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DistrictSoap[] toSoapModels(List<District> models) {
        List<DistrictSoap> soapModels = new ArrayList<DistrictSoap>(models.size());

        for (District model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DistrictSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _districtId;
    }

    public void setPrimaryKey(long pk) {
        setDistrictId(pk);
    }

    public long getDistrictId() {
        return _districtId;
    }

    public void setDistrictId(long districtId) {
        _districtId = districtId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public int getCode() {
        return _code;
    }

    public void setCode(int code) {
        _code = code;
    }

    public boolean getIsArchived() {
        return _isArchived;
    }

    public boolean isIsArchived() {
        return _isArchived;
    }

    public void setIsArchived(boolean isArchived) {
        _isArchived = isArchived;
    }
}
