<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="pageTitle" value="Advanced Java" />
<c:import url="/jsp/doctype.jsp" />

<html xmlns="http://www.w3.org/1999/xhtml">
<c:set var="pageTitle" value="Advanced Java" />

<c:import url="/jsp/head-tag.jsp" />

<body>
    <div id="container">

      <c:import url="/jsp/header.jsp" />
      
      <div id="main_content_top"></div>
      <div id="main_content">
        
        Here is my content unique to this page.
        <c:import url="/jsp/right-menu.jsp" />
      
      <div id="clear"></div>
      </div>
      <div id="main_content_bottom"></div>
      
        <c:import url="/jsp/footer.jsp" />
      
      </div>
  </body>
</html>

