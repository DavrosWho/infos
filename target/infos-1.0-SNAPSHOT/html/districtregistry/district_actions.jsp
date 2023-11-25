<%@ include file="/html/init.jsp" %>

<%
	ResultRow row = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	District district = (District) row.getObject();

	long groupId = district.getGroupId();
	String name = District.class.getName();
	long districtId = district.getDistrictId();

	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="editURL">
		<portlet:param name="mvcPath" value="/html/districtregistry/edit_district.jsp" />
		<portlet:param name="districtId" value="<%= String.valueOf(districtId) %>" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:renderURL>

	<liferay-ui:icon image="edit" url="<%= editURL.toString() %>" />

	<portlet:actionURL name="toArchive" var="toArchiveURL">
        <portlet:param name="districtId" value="<%= String.valueOf(districtId) %>" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:actionURL>

    <liferay-ui:icon image="edit" message="To Archive" url="<%= toArchiveURL.toString() %>" />

	<portlet:actionURL name="deleteDistrict" var="deleteURL">
		<portlet:param name="districtId" value="<%= String.valueOf(districtId) %>" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:actionURL>

	<liferay-ui:icon-delete url="<%= deleteURL.toString() %>" />
</liferay-ui:icon-menu>