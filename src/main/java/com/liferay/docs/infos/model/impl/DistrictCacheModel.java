package com.liferay.docs.infos.model.impl;

import com.liferay.docs.infos.model.District;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing District in entity cache.
 *
 * @author Joe Bloggs
 * @see District
 * @generated
 */
public class DistrictCacheModel implements CacheModel<District>, Externalizable {
    public long districtId;
    public long companyId;
    public long groupId;
    public long userId;
    public long createDate;
    public long modifiedDate;
    public String name;
    public int code;
    public boolean isArchived;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{districtId=");
        sb.append(districtId);
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
        sb.append(", name=");
        sb.append(name);
        sb.append(", code=");
        sb.append(code);
        sb.append(", isArchived=");
        sb.append(isArchived);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public District toEntityModel() {
        DistrictImpl districtImpl = new DistrictImpl();

        districtImpl.setDistrictId(districtId);
        districtImpl.setCompanyId(companyId);
        districtImpl.setGroupId(groupId);
        districtImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            districtImpl.setCreateDate(null);
        } else {
            districtImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            districtImpl.setModifiedDate(null);
        } else {
            districtImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            districtImpl.setName(StringPool.BLANK);
        } else {
            districtImpl.setName(name);
        }

        districtImpl.setCode(code);
        districtImpl.setIsArchived(isArchived);

        districtImpl.resetOriginalValues();

        return districtImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        districtId = objectInput.readLong();
        companyId = objectInput.readLong();
        groupId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
        code = objectInput.readInt();
        isArchived = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(districtId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeInt(code);
        objectOutput.writeBoolean(isArchived);
    }
}
