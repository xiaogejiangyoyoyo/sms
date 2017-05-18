<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>明细页面</title>
<script type="text/javascript" src = "${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js">
</script>
</head>
<body>
<table>
<caption><h3>学生明细</h3></caption>
<tr>
<td align="right">账号：</td>
<td><input type="text" name="account" value="${student.account}" readonly="readonly"></td>
</tr>
<tr>
<td align="right">姓名：</td>
<td><input type="text" name="name" value="${student.name}" readonly="readonly"></td>
</tr>
<tr>
<td align="right">学号：</td>
<td><input type="text" name="studyNumber"  value="${student.studyNumber}" readonly="readonly"></td>
</tr>
<tr>
<td align="right">性别：</td>
<td><input type="text" name="gender"  value="${student.gender?'男':'女'}"  readonly="readonly">
</td>
</tr>
<tr>
<td align="right">电话：</td>
<td><input type="text" name="phone" value="${student.phone}" readonly="readonly"></td>
</tr>
<tr>
<td align="right">Email：</td>
<td><input type="text" name="email" value="${student.email}" readonly="readonly"></td>
</tr>
<tr>
<td align="right">生日：</td>
<td><input type="text" name="birthday" value="<fmt:formatDate value='${student.birthday}' type='date' pattern='yyyy-MM-dd'/>" readonly="readonly"></td>
</tr>
<tr>
<td align="right">兴趣：</td>
<td>
<textarea name="interest" cols="30" readonly="readonly">${student.interestView}</textarea>

</td>
</tr>
<tr>
<td align="right">籍贯：</td>
<td>
<input type="text" name="birthPlace" value="${student.birthPlaceView}" readonly="readonly"></td>
</td>
</tr>
<tr>
<td align="right">自我评价：</td>
<td><textarea name="introduction" rows="5" cols="30" readonly="readonly">${student.introduction}</textarea>
</td>
</tr>
<tr>
<td align="center" colspan="2">
<input type="button" value="返回" onclick="javascript:window.history.back()">
</td>
</tr>
</table>
</body>
</html>