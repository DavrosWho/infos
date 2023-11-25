create table infos_District (
	districtId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	code_ INTEGER,
	isArchived BOOLEAN
);

create table infos_Farmer (
	farmerId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	orgName VARCHAR(75) null,
	legalForm VARCHAR(75) null,
	inn VARCHAR(75) null,
	kpp VARCHAR(75) null,
	ogrn VARCHAR(75) null,
	regDate DATE null,
	isArchived BOOLEAN,
	districtId LONG
);

create table infos_Farmers_Districts (
	districtId LONG not null,
	farmerId LONG not null,
	primary key (districtId, farmerId)
);