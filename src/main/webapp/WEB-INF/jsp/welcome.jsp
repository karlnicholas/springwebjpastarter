<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<body>
  <p>
  <form method="post">
    <div>Create New User</div>
    <div>
      User Name: <input type="text" name="name">
    </div>
    <div>
      <button type="submit">Create</button>
    </div>
  </form>
  </p>
  <p>
  <div>List of current users.</div>
  <ul>
    <c:forEach var="u" items="${users}">
      <li><a href="${request.contextRoot}/api/user?id=${u.id}">${u.name}</a></li>
    </c:forEach>
  </ul>
  <p>
</body>
</html>