<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
 <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>
<table border="2">
<tr>
<td>Ticket No:${ticket.ticketNumber}</td>
<td>Train Name:${ticket.trainName}</td>
<td>Journey Date :${ticket.jdate}</td>
</tr>
<tr>
<td>From:${ticket.fromLocation}</td>
<td>To:${ticket.toLocation}</td>
<td>Class:${ticket.trainClass}</td>
</tr>
</table>  
<br/>


</h2>
<h3>
<table border="2">
<tr>
<th>Passenger Name</th>
<th>Age</th>
<th>Fare</th>
</tr>
<c:forEach  items="${allPassengers}" var="passenger">
<tr>
         <td>${passenger.passengerName}</td>
         <td>${passenger.age}</td>
         <td>${passenger.fare}</td>
        </tr>
         </c:forEach>
 <tr>
 <td></td>
 <td>Total</td>
 <td>${totalFare}</td>
 </tr>
 <tr>
 <td></td>
 <td>G.S.T</td>
 <td>${gst}</td>
 </tr>
 <tr>
 <td></td>
 <td>Amount Payable</td>
 <td>${ticket.totalAmount}</td>
 </tr>
  </table>
  </h3>
  </div>
</body>
</html>