<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>

<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date" %>
<%@ page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil" %>
<%@ page import="org.jduchess.event.service.model.Event" %>
<%@ page import="org.jduchess.event.service.service.EventLocalServiceUtil" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<liferay-portlet:actionURL name="addEvent" var="editAction">
    <portlet:param name="mvcActionCommand" value="addEvent" />
</liferay-portlet:actionURL>

<%
    Date defaultDate = new Date();
    Event selectedEvent = (Event)request.getAttribute("event");

    if(selectedEvent == null) {
        // create an event, so it's not null
        selectedEvent = EventLocalServiceUtil.createEvent(
            CounterLocalServiceUtil.increment(Event.class.getName()));
    }

    Date startDate, endDate;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    if(selectedEvent.getStartDate() != null) {
        startDate = selectedEvent.getStartDate();
    } else {
        startDate = defaultDate;
    }

    if(selectedEvent.getEndDate() != null) {
        endDate = selectedEvent.getEndDate();
    } else {
        endDate = defaultDate;
    }
%>

<aui:form action="<%=editAction%>" method="post" name="fm">
    <aui:fieldset>
        <label class="control-label" for="<portlet:namespace />startDate">
            Start date
        </label>
        <input name="<portlet:namespace />startDate"
            id="<portlet:namespace />startDate"
            class="form-control date"
            type="text" placeholder="dd-mm-yyyy"
            value="<%=formatter.format(startDate)%>">

        <span id="endDateShown">
            <label class="control-label" for="<portlet:namespace />endDate">
                End date
            </label>
            <input name="<portlet:namespace />endDate"
                id="<portlet:namespace />endDate"
                class="form-control date"
                type="text"
                placeholder="dd-mm-yyyy"
                value="<%=formatter.format(endDate)%>">
        </span>
        <label class="control-label" for="<portlet:namespace/>toggleEndDate">
            <input type="checkbox" id="endDateToggle" onclick="toggleEndDate()"/>
            Single day event
        </label>
        <aui:button type="submit"></aui:button>
    </aui:fieldset>
</aui:form>

<script type="text/javascript">
    // This function allows me to turn the end date on and off
    // based on whether the user clicks the checkbox
    function toggleEndDate() {
        if (document.getElementById('endDateToggle').checked) {
            document.getElementById('endDateShown').style.display = 'none';
            document.getElementById('<portlet:namespace/>endDate').disabled =
                "true";
        } else {
            document.getElementById('endDateShown').style.display = 'block';
            // for some reason you shouldn't set disabled to false,
            // but to an empty string instead...
            document.getElementById('<portlet:namespace/>endDate').disabled = "";
        }
    }
</script>
<aui:script>
    AUI().use(
        'aui-datepicker',
        'datatype-date',
        'datatype-date-math',
        'datatype-date-parse',
        function(A) {
            var toDatePicker;
            var fromDatePicker = new A.DatePicker({
                trigger: '#<portlet:namespace />startDate',
                mask: '%d-%m-%Y',
                popover: {
                    zIndex: 1000
                },
                on: {
                    selectionChange: function(event) {
                        if (event.newSelection[0]) {
                            var oldToValue = A.Date.parse("%d-%m-%Y",
                                document.getElementById(
                                    "<portlet:namespace />endDate").value);
                            toDatePicker.getCalendar().set('minimumDate',
                                event.newSelection[0]);
                            if (A.Date.isGreater(event.newSelection[0],
                                    oldToValue)) {
                                document.getElementById(
                                    "<portlet:namespace />endDate").value =
                                    A.Date.format(event.newSelection[0],
                                        {format: "%d-%m-%Y"});
                            }
                        }
                    }
                },
                calendar: {
                    minimumDate: new Date()
                }
            });

            toDatePicker = new A.DatePicker({
                trigger: '#<portlet:namespace />endDate',
                mask: '%d-%m-%Y',
                popover: {
                    zIndex: 1000
                },
                calendar: {
                    minimumDate: new Date()
                }
            });
        }
    );
  </aui:script>