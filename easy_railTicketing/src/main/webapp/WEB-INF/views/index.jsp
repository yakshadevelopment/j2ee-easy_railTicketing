<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function selectClass()
{
document.getElementById("trainClass").value=document.getElementById("classList").value;
}

</script>
<style>
  .required:after {
    content:" *";
    color:magenta;
  }
</style>
</head>
<body>
<div align="center">
<h4><u>All <span style="color:magenta">*</span> fields are compulsory for entry</u></h4>
<form action="TicketServlet" method="post">
<h3>
<table>
<tr>
<td><label class="required">Ticket Number:</label><input type="text" name="ticketNumber" required/></td>
<td><label class="required">Train Name:</label><input type="text" name="trainName" required/></td>
<td><label class="required">Journey Date:</label><input type="date" name="jdate" pattern="\d{1,2}-\d{1,2}-\d{4}" placeholder="25-10-2000" required/></td>
</tr>
<tr>
<td><label class="required">From:</label><input type="text" name="fromLocation" required/></td>
<td><label class="required">To:</label><input type="text" name="toLocation" required/></td>
<td><label class="required">Fare:</label><input type="text" name="fare" required/></td>
</tr>
</table>
<br/>
<label class="required">Select Class</label><select id="classList" onclick="selectClass()">
<option value="AC1">AC1</option>
<option value="AC2">AC2</option>
<option value="AC3">AC3</option>
<option value="ACChair">ACChair</option>
<option value="I">I</option>
<option value="II">II</option>
<option value="Chair">Chair</option>
</select><input type="text" name="trainClass" id="trainClass" readonly="readonly" required/>
<br/><br/>
Enter Passenger Details:-
<table>
<tr>
<td>Name:<input type="text" name="name1" value="--"/></td>
<td>Age:<input type="number" name="age1"  min="1" max="100" value="1"/></td>
</tr>
<tr>
<td>Name:<input type="text" name="name2" value="--"/></td>
<td>Age:<input type="number" name="age2"  min="1" max="100" value="1"/></td>
</tr>
<tr>
<td>Name:<input type="text" name="name3" value="--"/></td>
<td>Age:<input type="number" name="age3" min="1" max="100" value="1"/></td>
</tr>
<tr>
<td>Name:<input type="text" name="name4" value="--"/></td>
<td>Age:<input type="number" name="age4" min="1" max="100" value="1"/></td>
</tr>
<tr>
<td>Name:<input type="text" name="name5" value="--"/></td>
<td>Age:<input type="number" name="age5" min="1" max="100" value="1"/></td>
</tr>
<tr>
<td>Name:<input type="text" name="name6" value="--"/></td>
<td>Age:<input type="number" name="age6" min="1" max="100" value="1"/></td>
</tr>

</table>
</h3>
<button type="submit">Submit</button>

</form>
</div>
</body>
</html>