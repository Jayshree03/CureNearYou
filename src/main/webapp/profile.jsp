<%@page import="java.util.List"%>
<%@page import="cnu.dao.MainDAO"%>


<!-- %@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %-->

<html>
<head>
    <title>User Profile</title>
    
    	<%@include file="header.jsp" %>
    	<%MainDAO dao = new MainDAO(); %>
		<% String uid = (String) session.getAttribute("uid");%>
		<% System.out.println(uid); %>
		<%List l = dao.getUserByUid(uid); %>

	            <form action="Profile" method="post">
              <div class="contact_form-container">
                <div>
                  <div>
                    <input type="text" name="id" value="<%= uid %>"/>
                  </div>
                  <div>
                    <input type="text" name="uname" value="<%= l.get(1) %>"/>
                  </div>
                  <div>
                    <input type="text" name="add" value="<%= l.get(3)%>"/>
                  </div>
                  <div>
                    <input type="text" name="mob" value="<%= l.get(2) %>"/>
                  </div>
                  <div class="btn-box ">
                    <button type="submit">
                      Submit
                    </button>
                  </div>
                </div>
              </div>
            </form>
    <!-- h1>User Profile</h1>
    <c:if test="${not empty user}">
        <p><strong>User ID:</strong> ${user.uid}</p>
        <p><strong>Name:</strong> ${user.uname}</p>
        <p><strong>Mobile:</strong> ${user.umob}</p>
        <p><strong>Address:</strong> ${user.uadd}</p>
        <p><strong>User Type:</strong> ${user.utype}</p>
    </c:if>
    <c:if test="${empty user}">
        <p>User data not found.</p>
    </c:if-->
</body>
</html>
