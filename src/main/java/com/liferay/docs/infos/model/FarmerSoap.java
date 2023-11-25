package com.liferay.docs.infos.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.docs.infos.service.http.FarmerServiceSoap}.
 *
 * @author Joe Bloggs
 * @see com.liferay.docs.infos.service.http.FarmerServiceSoap
 * @generated
 */
public class FarmerSoap implements Serializable {
    private long _farmerId;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;
    private String _orgName;
    private String _legalForm;
    private String _inn;
    private String _kpp;
    private String _ogrn;
    private Date _regDate;
    private boolean _isArchived;
    private long _districtId;

    public FarmerSoap() {
    }

    public static FarmerSoap toSoapModel(Farmer model) {
        FarmerSoap soapModel = new FarmerSoap();

        soapModel.setFarmerId(model.getFarmerId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setOrgName(model.getOrgName());
        soapModel.setLegalForm(model.getLegalForm());
        soapModel.setInn(model.getInn());
        soapModel.setKpp(model.getKpp());
        soapModel.setOgrn(model.getOgrn());
        soapModel.setRegDate(model.getRegDate());
        soapModel.setIsArchived(model.getIsArchived());
        soapModel.setDistrictId(model.getDistrictId());

        return soapModel;
    }

    public static FarmerSoap[] toSoapModels(Farmer[] models) {
        FarmerSoap[] soapModels = new FarmerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static FarmerSoap[][] toSoapModels(Farmer[][] models) {
        FarmerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new FarmerSoap[models.length][models[0].length];
        } else {
            soapModels = new FarmerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static FarmerSoap[] toSoapModels(List<Farmer> models) {
        List<FarmerSoap> soapModels = new ArrayList<FarmerSoap>(models.size());

        for (Farmer model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new FarmerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _farmerId;
    }

    public void setPrimaryKey(long pk) {
        setFarmerId(pk);
    }

    public long getFarmerId() {
        return _farmerId;
    }

    public void setFarmerId(long farmerId) {
        _farmerId = farmerId;
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

    public String getOrgName() {
        return _orgName;
    }

    public void setOrgName(String orgName) {
        _orgName = orgName;
    }

    public String getLegalForm() {
        return _legalForm;
    }

    public void setLegalForm(String legalForm) {
        _legalForm = legalForm;
    }

    public String getInn() {
        return _inn;
    }

    public void setInn(String inn) {
        _inn = inn;
    }

    public String getKpp() {
        return _kpp;
    }

    public void setKpp(String kpp) {
        _kpp = kpp;
    }

    public String getOgrn() {
        return _ogrn;
    }

    public void setOgrn(String ogrn) {
        _ogrn = ogrn;
    }

    public Date getRegDate() {
        return _regDate;
    }

    public void setRegDate(Date regDate) {
        _regDate = regDate;
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

    public long getDistrictId() {
        return _districtId;
    }

    public void setDistrictId(long districtId) {
        _districtId = districtId;
    }
}
