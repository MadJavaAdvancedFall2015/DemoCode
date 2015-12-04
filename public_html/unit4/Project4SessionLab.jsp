<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="pageTitle" scope="page" value="Project 4 - Session Lab" />
<c:import url="/jsp/doctype.jsp" />

<html xmlns="http://www.w3.org/1999/xhtml">

<c:import url="/jsp/head-tag.jsp" />

<body>
    <div id="container">

      <c:import url="/jsp/header.jsp" />
      
      <div id="main_content_top"></div>
      <div id="main_content">
        
        <c:import url="/jsp/content-project4-session-lab.jsp" />
        <c:import url="/jsp/right-menu.jsp" />
      
      <div id="clear"></div>
      </div>
      <div id="main_content_bottom"></div>
      
        <c:import url="/jsp/footer.jsp" />
      
      </div>
  </body>
</html>

