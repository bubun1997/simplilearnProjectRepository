<!DOCTYPEhtml>
<htmlxmlns="http://www.w3.org/1999/xhtml"xmlns:th="https://www.thymeleaf.org"
xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
<title>Welcome!</title>
</head>
<body>
<h1th:inline="text">Hello [[${#httpServletRequest.remoteUser}]]!</h1>
<formth:action="@{/logout}"method="post">
<inputtype="submit"value="Sign Out"/>
</form>
</body>
</html>