<%@ include file="/html/init.jsp" %>

<p>This is the <b>Farmer Registry Portlet</b> in View mode.</p>
<p>-------------------------------------------------------</p>

<%
    List<District> allDistricts = DistrictLocalServiceUtil.getDistrictsByGroupId(scopeGroupId);
	String redirect = PortalUtil.getCurrentURL(renderRequest);
	int findType = ParamUtil.getInteger(request, "findType");

	String param1 = ParamUtil.getString(request, "param1"); //renderRequest.getParameter("orgName");
    long districtParam = ParamUtil.getLong(request, "districtParam");

    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
    String startDateParam = ParamUtil.getString(request, "startDate");
    String endDateParam = ParamUtil.getString(request, "endDate");
    Date startDate = new Date();
    Date endDate = new Date();
%>

<script>
AUI().ready('aui-base', function(A){
    window.onload = function() {
      A.one('#_farmerregistry_WAR_infos10SNAPSHOT_param1').hide();
      A.one('#_farmerregistry_WAR_infos10SNAPSHOT_districtParam').hide();
      A.one('#startDateInput').hide();
      A.one('#endDateInput').hide();
    };
});
</script>

<aui:select name="findBy" id="findBy">
    <aui:option value="0">Find All</aui:option>
    <aui:option value="1">Find By OrgName</aui:option>
    <aui:option value="2">Find By INN</aui:option>
    <aui:option value="3">Find By RegDistrict</aui:option>
    <aui:option value="4">Find all Archived</aui:option>
    <aui:option value="5">Find all unArchived</aui:option>
    <aui:option value="6">Find By Date</aui:option>
</aui:select>

<script>
    AUI().use('aui-base', function(A){
    A.one("#<portlet:namespace />findBy").on('change',function(){
    var selectedValue = A.one('#<portlet:namespace />findBy').get('value');
    document.getElementById("_farmerregistry_WAR_infos10SNAPSHOT_findType").setAttribute("value", selectedValue);
    A.one('#_farmerregistry_WAR_infos10SNAPSHOT_param1').hide();
    A.one('#_farmerregistry_WAR_infos10SNAPSHOT_districtParam').hide();
    A.one('#startDateInput').hide();
    A.one('#endDateInput').hide();
    switch (selectedValue) {
        case "1":
        case "2":
            AUI().ready(
                function(A) {
                    A.one('#_farmerregistry_WAR_infos10SNAPSHOT_param1').show();
                }
            );
            break;
        case "3":
            AUI().ready(
                function(A) {
                    A.one('#_farmerregistry_WAR_infos10SNAPSHOT_districtParam').show();
                }
            );
            break;
        case "6":
            AUI().ready(
                function(A) {
                    A.one('#startDateInput').show();
                    A.one('#endDateInput').show();
                }
            );
            break;
    }
    })
    });
</script>

<portlet:renderURL var="findByParamsURL">
    <portlet:param name="mvcPath" value="/html/farmerregistry/view.jsp" />
</portlet:renderURL>
<aui:form name="findByParams" action="<%=findByParamsURL.toString() %>" method="post" >
    <aui:input name="param1" id="param1" onChange="myFunction()" label=""/>
    <aui:input name="findType" type="hidden" id="findType" value="0" />
    <aui:input name="startDate" type="hidden" id="startDate" value="<%=sdf.format(startDate)%>" />
    <aui:input name="endDate" type="hidden" id="endDate" value="<%=sdf.format(endDate)%>" />
    <input name="startDateInput" id="startDateInput"  class="form-control date" type="text"
                placeholder="mm-dd-yyyy" value="<%=sdf.format(startDate)%>" label="" />
    <input name="endDateInput" id="endDateInput" class="form-control date" type="text"
                placeholder="mm-dd-yyyy" value="<%=sdf.format(endDate)%>" label="" />
    <aui:select name="districtParam" id="districtParam" label="" >
        <%
            for (District district : allDistricts) {
        %>
        <aui:option value="<%= district.getDistrictId() %>"><%=district.getName() %></aui:option>
        <%
            }
        %>

    </aui:select>

    <script>
    YUI().use(
      'aui-datepicker',
      function(Y) {
        new Y.DatePicker(
          {
            trigger: '.date',
            mask: '%m-%d-%Y',
            popover: {
              zIndex: 1
            },
            on: {
              selectionChange: function(event) {
                myFunction();
              }
            }
          }
        );
      }
    );
    </script>

    <aui:button name="findByParams" type="submit" value="findByParams" />
</aui:form>

<script type="text/javascript" language="javascript">
    function myFunction(){
        param1 = document.getElementById("_farmerregistry_WAR_infos10SNAPSHOT_param1").value;
        document.getElementById("_farmerregistry_WAR_infos10SNAPSHOT_param1").setAttribute("value", param1);

        startDateParam = document.getElementById("startDateInput").value;
        document.getElementById("_farmerregistry_WAR_infos10SNAPSHOT_startDate").setAttribute("value", startDateParam);

        endDateParam = document.getElementById("endDateInput").value;
        document.getElementById("_farmerregistry_WAR_infos10SNAPSHOT_endDate").setAttribute("value", endDateParam);
    }
</script>

<p>-------------------------------------------------------</p>

<aui:button-row>
	<portlet:renderURL var="addFarmerURL">
		<portlet:param name="mvcPath" value="/html/farmerregistry/edit_farmer.jsp" />
		<portlet:param name="redirect" value="<%= redirect %>" />
	</portlet:renderURL>

	<aui:button onClick="<%= addFarmerURL.toString() %>" value="add-farmer" />
</aui:button-row>

<liferay-ui:search-container emptyResultsMessage="farmer-empty-results-message">
    <%
        List<Farmer> farmersResult = null;
        int farmersTotal = 0;

        if (findType == 1) {
            farmersResult = FarmerLocalServiceUtil.getFarmersByGroupIdOrgName(scopeGroupId, param1, searchContainer.getStart(), searchContainer.getEnd());
            farmersTotal = FarmerLocalServiceUtil.getFarmersCountByGroupIdOrgName(scopeGroupId, param1);
        } else if (findType == 2) {
            farmersResult = FarmerLocalServiceUtil.getFarmersByGroupIdInn(scopeGroupId, param1, searchContainer.getStart(), searchContainer.getEnd());
            farmersTotal = FarmerLocalServiceUtil.getFarmersCountByGroupIdInn(scopeGroupId, param1);
        } else if (findType == 3) {
            farmersResult = FarmerLocalServiceUtil.getFarmersByGroupIdDistrictId(scopeGroupId, districtParam, searchContainer.getStart(), searchContainer.getEnd());
            farmersTotal = FarmerLocalServiceUtil.getFarmersCountByGroupIdDistrictId(scopeGroupId, districtParam);
        } else if (findType == 4) {
            farmersResult = FarmerLocalServiceUtil.getFarmersByGroupIdIsArchived(scopeGroupId, true, searchContainer.getStart(), searchContainer.getEnd());
            farmersTotal = FarmerLocalServiceUtil.getFarmersCountByGroupIdIsArchived(scopeGroupId, true);
        } else if (findType == 5) {
            farmersResult = FarmerLocalServiceUtil.getFarmersByGroupIdIsArchived(scopeGroupId, false, searchContainer.getStart(), searchContainer.getEnd());
            farmersTotal = FarmerLocalServiceUtil.getFarmersCountByGroupIdIsArchived(scopeGroupId, false);
        } else if (findType == 6) {
            farmersResult = FarmerLocalServiceUtil.getFarmersByDateRange(scopeGroupId, sdf.parse(startDateParam), sdf.parse(endDateParam), searchContainer.getStart(), searchContainer.getEnd());
            farmersTotal = farmersResult.size();
        } else {
            farmersResult = FarmerLocalServiceUtil.getFarmersByGroupId(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd());
            farmersTotal = FarmerLocalServiceUtil.getFarmersCountByGroupId(scopeGroupId);
        }
    %>
	<liferay-ui:search-container-results
    results="<%= farmersResult %>"
    total="<%= farmersTotal %>"
	/>

	<liferay-ui:search-container-row
		className="com.liferay.docs.infos.model.Farmer"
		keyProperty="farmerId"
		modelVar="farmer" escapedModel="<%= true %>"
	>

		<liferay-ui:search-container-column-text
			name="Organisation Name"
			property="orgName"
		/>

		<liferay-ui:search-container-column-text
			name="Legal Form"
			property="legalForm"
		/>

		<liferay-ui:search-container-column-text
			name="INN"
			property="inn"
		/>

		<liferay-ui:search-container-column-text
			name="KPP"
			property="kpp"
		/>

		<liferay-ui:search-container-column-text
			name="OGRN"
			property="ogrn"
		/>

		 <%
			String districtName = "";

			try {
				districtName = DistrictLocalServiceUtil.getDistrict
						(farmer.getDistrictId()).getName();
			} catch (Exception e) {
			}
		%>

		<liferay-ui:search-container-column-text
			name="Registration District"
			value="<%= districtName %>"
		/>

        <%
        long farmerId = farmer.getFarmerId();
        String strDistricts = "";
        List<District> districts = DistrictLocalServiceUtil.getFarmerDistricts(farmerId);
        for (District district : districts) {
            strDistricts += district.getName();
            strDistricts += "\n";
        }
        %>

        <liferay-ui:search-container-column-text
			name="Districts With Fields "
			value="<%= strDistricts %>"
		/>

		<liferay-ui:search-container-column-text
            name="Is Archived"
            property="isArchived"
         />

		<liferay-ui:search-container-column-text
			name="Registration Date (MM-dd-yyyy)"
			value="<%= sdf.format(farmer.getRegDate()) %>"
		/>

		<liferay-ui:search-container-column-jsp
			align="right"
			path="/html/farmerregistry/farmer_actions.jsp"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>