<%@ include file="/html/init.jsp" %>

<%
	District district = null;

	long districtId = ParamUtil.getLong(request, "districtId");

	if (districtId > 0) {
		district = DistrictLocalServiceUtil.getDistrict(districtId);
	}

	String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= district %>" model="<%= District.class %>" />
<portlet:renderURL var="viewDistrictURL" />
<portlet:actionURL name='<%= district == null ? "addDistrict" : "updateDistrict" %>' var="editDistrictURL" windowState="normal" />

<liferay-ui:header
	backURL="<%= viewDistrictURL %>"
	title='<%= (district != null) ? district.getName() : "new-district" %>'
/>

<aui:form action="<%= editDistrictURL %>" method="POST" name="fm">
	<aui:fieldset>
		<aui:input name="redirect" type="hidden" value="<%= redirect %>" />

		<aui:input name="districtId" type="hidden" value='<%= district == null ? "" : district.getDistrictId() %>'/>

		<aui:input name="name">
            <aui:validator name="required" />
            <aui:validator name="alpha"/>
        </aui:input>

		<aui:input name="code">
            <aui:validator name="digits"/>
        </aui:input>

		<aui:input name="isArchived" type="hidden" />

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />

		<aui:button onClick="<%= viewDistrictURL %>"  type="cancel" />
	</aui:button-row>
</aui:form>