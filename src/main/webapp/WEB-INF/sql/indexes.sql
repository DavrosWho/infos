create index IX_85FB897C on infos_District (groupId);
create index IX_464A61C on infos_District (groupId, isArchived);

create index IX_B1E81807 on infos_Farmer (groupId);
create index IX_EA89E6FA on infos_Farmer (groupId, date_);
create index IX_53C5B04 on infos_Farmer (groupId, districtId);
create index IX_B5F3F432 on infos_Farmer (groupId, inn);
create index IX_DD10BC27 on infos_Farmer (groupId, isArchived);
create index IX_DDDC12D8 on infos_Farmer (groupId, orgName);
create index IX_432CD0EB on infos_Farmer (groupId, regDate);

create index IX_6C532D5F on infos_Farmers_Districts (districtId);
create index IX_77EFAFB4 on infos_Farmers_Districts (farmerId);