<%@ include file="/html/init.jsp" %>

<p>This is the <b>District Registry Portlet</b> in View mode.</p>

<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<aui:button-row>
	<portlet:renderURL var="addDistrictURL">
		<portlet:param name="mvcPath" value="/html/districtregistry/edit_district.jsp" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:renderURL>

	<aui:button onClick="<%= addDistrictURL.toString() %>" value="add-district" />
</aui:button-row>

<%
String displayStyle = GetterUtil.getString(portletPreferences.getValue("displayStyle", StringPool.BLANK));
long displayStyleGroupId = GetterUtil.getLong(portletPreferences.getValue("displayStyleGroupId", null), scopeGroupId);

long portletDisplayDDMTemplateId = PortletDisplayTemplateUtil.getPortletDisplayTemplateDDMTemplateId(displayStyleGroupId, displayStyle);
%>

<c:choose>
	<c:when test="<%= portletDisplayDDMTemplateId > 0 %>">
		<% List<District> districts = DistrictLocalServiceUtil.getDistrictsByGroupId(scopeGroupId); %>

		<%= PortletDisplayTemplateUtil.renderDDMTemplate(pageContext, portletDisplayDDMTemplateId, districts) %>
	</c:when>
	<c:otherwise>
		<liferay-ui:search-container emptyResultsMessage="district-empty-results-message">
			<liferay-ui:search-container-results
				results="<%= DistrictLocalServiceUtil.getDistrictsByGroupId(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd()) %>"
				total="<%= DistrictLocalServiceUtil.getDistrictsCountByGroupId(scopeGroupId) %>"
			/>

			<liferay-ui:search-container-row
				className="com.liferay.docs.infos.model.District"
				keyProperty="districtId"
				modelVar="district" escapedModel="<%= true %>"
			>

				<liferay-ui:search-container-column-text
					name="name"
					property="name"
				/>

				<liferay-ui:search-container-column-text
                	name="code"
                    property="code"
                 />

				<liferay-ui:search-container-column-jsp
					align="right"
					path="/html/districtregistry/district_actions.jsp"
				/>
			</liferay-ui:search-container-row>

			<liferay-ui:search-iterator />

		</liferay-ui:search-container>
	</c:otherwise>
</c:choose>