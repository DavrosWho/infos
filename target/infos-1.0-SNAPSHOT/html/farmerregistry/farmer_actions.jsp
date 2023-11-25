<%@ include file="/html/init.jsp" %>

<%
	ResultRow row = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Farmer farmer = (Farmer) row.getObject();

	long groupId = farmer.getGroupId();
	String name = Farmer.class.getName();
	long farmerId = farmer.getFarmerId();

	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="editURL">
		<portlet:param name="mvcPath" value="/html/farmerregistry/edit_farmer.jsp" />
		<portlet:param name="farmerId" value="<%= String.valueOf(farmerId) %>" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:renderURL>

	<liferay-ui:icon image="edit" url="<%= editURL.toString() %>" />

	<portlet:actionURL name="toArchive" var="toArchiveURL">
		<portlet:param name="farmerId" value="<%= String.valueOf(farmerId) %>" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:actionURL>

    <liferay-ui:icon image="edit" message="To Archive" url="<%= toArchiveURL.toString() %>" />

    <portlet:actionURL name="fromArchive" var="fromArchiveURL">
        <portlet:param name="farmerId" value="<%= String.valueOf(farmerId) %>" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:actionURL>

    <liferay-ui:icon image="edit" message="From Archive" url="<%= fromArchiveURL.toString() %>" />

<%-- This is a functionality for deleting data
	<portlet:actionURL name="deleteFarmer" var="deleteURL">
		<portlet:param name="farmerId" value="<%= String.valueOf(farmerId) %>" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:actionURL>

	<liferay-ui:icon-delete url="<%= deleteURL.toString() %>" />
--%>
</liferay-ui:icon-menu>