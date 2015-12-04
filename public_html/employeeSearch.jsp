<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="pageTitle" value="Employee Search" scope="request" />

<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->

<%-- here is the first slice - head --%>
<c:import url="/jsp/head.jsp" />
<%-- here is the end of the first slice - head --%>

<body class="wrap">



	<!-- Primary Page Layout
	================================================== -->

<c:import url="/jsp/header.jsp" />


<%-- content specific to my page follows --%>
Here is my employee search content: it is going to have a form here...


 <c:import url="/jsp/footer.jsp" />
</body>
</html>
