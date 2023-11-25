package com.liferay.docs.infos.model.impl;

import com.liferay.docs.infos.model.Farmer;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Farmer in entity cache.
 *
 * @author Joe Bloggs
 * @see Farmer
 * @generated
 */
public class FarmerCacheModel implements CacheModel<Farmer>, Externalizable {
    public long farmerId;
    public long companyId;
    public long groupId;
    public long userId;
    public long createDate;
    public long modifiedDate;
    public String orgName;
    public String legalForm;
    public String inn;
    public String kpp;
    public String ogrn;
    public long regDate;
    public boolean isArchived;
    public long districtId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{farmerId=");
        sb.append(farmerId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", orgName=");
        sb.append(orgName);
        sb.append(", legalForm=");
        sb.append(legalForm);
        sb.append(", inn=");
        sb.append(inn);
        sb.append(", kpp=");
        sb.append(kpp);
        sb.append(", ogrn=");
        sb.append(ogrn);
        sb.append(", regDate=");
        sb.append(regDate);
        sb.append(", isArchived=");
        sb.append(isArchived);
        sb.append(", districtId=");
        sb.append(districtId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Farmer toEntityModel() {
        FarmerImpl farmerImpl = new FarmerImpl();

        farmerImpl.setFarmerId(farmerId);
        farmerImpl.setCompanyId(companyId);
        farmerImpl.setGroupId(groupId);
        farmerImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            farmerImpl.setCreateDate(null);
        } else {
            farmerImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            farmerImpl.setModifiedDate(null);
        } else {
            farmerImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (orgName == null) {
            farmerImpl.setOrgName(StringPool.BLANK);
        } else {
            farmerImpl.setOrgName(orgName);
        }

        if (legalForm == null) {
            farmerImpl.setLegalForm(StringPool.BLANK);
        } else {
            farmerImpl.setLegalForm(legalForm);
        }

        if (inn == null) {
            farmerImpl.setInn(StringPool.BLANK);
        } else {
            farmerImpl.setInn(inn);
        }

        if (kpp == null) {
            farmerImpl.setKpp(StringPool.BLANK);
        } else {
            farmerImpl.setKpp(kpp);
        }

        if (ogrn == null) {
            farmerImpl.setOgrn(StringPool.BLANK);
        } else {
            farmerImpl.setOgrn(ogrn);
        }

        if (regDate == Long.MIN_VALUE) {
            farmerImpl.setRegDate(null);
        } else {
            farmerImpl.setRegDate(new Date(regDate));
        }

        farmerImpl.setIsArchived(isArchived);
        farmerImpl.setDistrictId(districtId);

        farmerImpl.resetOriginalValues();

        return farmerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        farmerId = objectInput.readLong();
        companyId = objectInput.readLong();
        groupId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        orgName = objectInput.readUTF();
        legalForm = objectInput.readUTF();
        inn = objectInput.readUTF();
        kpp = objectInput.readUTF();
        ogrn = objectInput.readUTF();
        regDate = objectInput.readLong();
        isArchived = objectInput.readBoolean();
        districtId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(farmerId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (orgName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(orgName);
        }

        if (legalForm == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(legalForm);
        }

        if (inn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(inn);
        }

        if (kpp == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kpp);
        }

        if (ogrn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ogrn);
        }

        objectOutput.writeLong(regDate);
        objectOutput.writeBoolean(isArchived);
        objectOutput.writeLong(districtId);
    }
}
