<%@ include file="/html/init.jsp" %>

<%
	Farmer farmer = null;

	long farmerId = ParamUtil.getLong(request, "farmerId");

	if (farmerId > 0) {
		farmer = FarmerLocalServiceUtil.getFarmer(farmerId);
	}

	List<District> allDistricts = DistrictLocalServiceUtil.getDistrictsByGroupId(scopeGroupId);
	List<District> farmerDistricts = DistrictLocalServiceUtil.getFarmerDistricts(farmerId);

	String redirect = ParamUtil.getString(request, "redirect");
	SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
	Date regDate = new Date();
%>

<aui:model-context bean="<%= farmer %>" model="<%= Farmer.class %>" />
<portlet:renderURL var="viewFarmerURL" />
<portlet:actionURL name='<%= farmer == null ? "addFarmer" : "updateFarmer" %>' var="editFarmerURL" windowState="normal" />

<liferay-ui:header
	backURL="<%= viewFarmerURL %>"
	title='<%= (farmer != null) ? farmer.getInn() : "new-farmer" %>'
/>

<aui:form action="<%= editFarmerURL %>" method="POST" name="fm">
	<aui:fieldset>
		<aui:input name="redirect" type="hidden" value="<%= redirect %>"/>

		<aui:input name="farmerId" type="hidden" value='<%= farmer == null ? "" : farmer.getFarmerId() %>'/>

		<aui:input name="orgName" label="Organisation Name">
            <aui:validator name="required" />
        </aui:input>

		<aui:select name="legalForm" label="Legal Form">
            <aui:option value="Natural Person">Natural Person</aui:option>
            <aui:option value="Legal Person">Legal Person</aui:option>
            <aui:option value="Individual Entrepreneur">Individual Entrepreneur</aui:option>
        </aui:select>

		<aui:input name="inn" label="INN">
            <aui:validator name="required" />
            <aui:validator name="digits"/>
            <aui:validator name="rangeLength">[10,12]</aui:validator>
        </aui:input>

		<aui:input name="kpp" label="KPP">
            <aui:validator name="digits"/>
            <aui:validator name="rangeLength">[9,9]</aui:validator>
        </aui:input>

		<aui:input name="ogrn" label="OGRN">
            <aui:validator name="digits"/>
            <aui:validator name="rangeLength">[13,15]</aui:validator>
        </aui:input>

        <aui:input name="isArchived" type="hidden" />

		<aui:select name="districtId" label="Registration District" showEmptyOption="<%= true %>">

	 		<%
				for (District district : allDistricts) {
			%>

			<aui:option selected="<%= farmer != null && district.getDistrictId() == farmer.getDistrictId() %>" value="<%= district.getDistrictId() %>"><%=district.getName() %></aui:option>

			<%
				}
			%>

		</aui:select>

		<aui:input name="regDate" type="hidden" value="<%=sdf.format(regDate)%>" />
        <p>For some reason, in order for the date to be saved correctly, you need to click on the input field a second time. So please do it. Same problem with searching by dates.</p>
        <input name="regDateInput" id="regDateInput" class="form-control date" type="text"
                        placeholder="mm-dd-yyyy" value="<%=sdf.format(regDate)%>" label="Registration Date"
                         title="for some reason, in order for the date to be saved correctly, you need to click on the input field a second time. so please do it. same problem with searching by dates." />

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

	</aui:fieldset>

	<script type="text/javascript" language="javascript">
    function myFunction(){
        var param1 = document.getElementById("regDateInput").value;
        document.getElementById("_farmerregistry_WAR_infos10SNAPSHOT_regDate").setAttribute("value", param1);
    }
    </script>

	<aui:button-row>
		<aui:button type="submit" />

		<aui:button onClick="<%= viewFarmerURL %>"  type="cancel" />
	</aui:button-row>
</aui:form>

<%
    if (farmer != null) {
%>

<portlet:actionURL name="addFarmerDistrict" var="addFarmerDistrictURL" />
<aui:form name="addFarmerDistrict" action="<%=addFarmerDistrictURL.toString() %>" method="post" >
    <aui:input name="farmerId" type="hidden" value='<%= farmer == null ? "" : farmer.getFarmerId() %>'/>
    <aui:select label="Add new registration district" name="districtId" showEmptyOption="<%= true %>">
        <%
            for (District district : allDistricts) {
        %>

        <aui:option selected="<%= farmer != null %>" value="<%= district.getDistrictId() %>"><%=district.getName() %></aui:option>

        <%
            }
        %>
    </aui:select>
    <aui:button type="submit" value="addFarmerDistrict" />
</aui:form>

<portlet:actionURL name="deleteFarmerDistrict" var="deleteFarmerDistrictURL" />
<aui:form name="deleteFarmerDistrict" action="<%=deleteFarmerDistrictURL.toString() %>" method="post" >
    <aui:input name="farmerId" type="hidden" value='<%= farmer == null ? "" : farmer.getFarmerId() %>'/>
    <aui:select label="Delete registration district" name="districtId" showEmptyOption="<%= true %>">
        <%
            for (District district : farmerDistricts) {
        %>

        <aui:option selected="<%= farmer != null %>" value="<%= district.getDistrictId() %>"><%=district.getName() %></aui:option>

        <%
            }
        %>
    </aui:select>
    <aui:button type="submit" value="deleteFarmerDistrict" />
</aui:form>

<%
    }
%>
