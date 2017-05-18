<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生列表页面</title>

</head>

<body >

<div>
<%--
${name}:从pageContext、request、session、application中以此寻找名为name的属性，找到就显示其值，找不到就拉倒

 --%>
欢迎你，${name}!
</div>
<center>
<div id ="listdiv">
<table width="960" border="1">
<caption><h2>学生列表</h2></caption>
<tr>
<td width="10%">序号</td>
<td width="15%">姓名</td>
<td width="15%">账号</td>
<td width="10%">性别</td>
<td width="15%">电话</td>
<td width="15%">生日</td>
<td width="20%">操作</td>
</tr>
<c:forEach items="${studentList }" var="student" varStatus="status">
<tr>
<td align="center">${status.count}</td>
<td align="center">${student.name}</td>
<td align="center">${student.account}</td>
<td align="center">${student.gender?'男':'女'}</td>
<td align="center">${student.phone}</td>
<td align="center">
<fmt:formatDate value='${student.birthday}' type='date' pattern='yyyy-MM-dd'/>
</td>
<td align="center">
<a href="student_detail?id=${student.id}">明细</a>&nbsp;&nbsp;
<a href="student_toedit?id=${student.id}">编辑</a>&nbsp;&nbsp;
<a href="student_delete?id=${student.id}" onclick="return confirm('你确定删除吗?')">删除</a>
</td>
</tr>
</c:forEach>
</table>
</div>
</center>
</body>
</html>