<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑页面</title>
<script type="text/javascript" src = "${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js">
</script>
</head>
<body>
<form action="student_edit" method="POST">
<table>
<caption><h3>学生编辑</h3></caption>
<tr>
<td align="right">账号：</td>
<td><input type="text" name="account" value="${student.account}">
<input type="hidden" name="id" value="${student.id}">

</td>
</tr>
<tr>
<td align="right">姓名：</td>
<td><input type="text" name="name" value="${student.name}"></td>
</tr>
<tr>
<td align="right">密码：</td>
<td><input type="password" name="password" value="${student.password}"></td>
</tr>
<tr>
<td align="right">确认密码：</td>
<td><input type="password" name="repassword" value="${student.password}"></td>
</tr>
<tr>
<td align="right">学号：</td>
<td><input type="text" name="studyNumber" value="${student.studyNumber}"></td>
</tr>
<tr>
<td align="right">性别：</td>
<td><input type="radio" name="gender" value="true" ${student.gender?"checked='checked'":""}>男
<input type="radio" name="gender" value="false"  ${student.gender?"":"checked='checked'"}>女
</td>
</tr>
<tr>
<td align="right">电话：</td>
<td><input type="text" name="phone" value="${student.phone}"></td>
</tr>
<tr>
<td align="right">Email：</td>
<td><input type="text" name="email" value="${student.email}"></td>
</tr>
<tr>
<td align="right">生日：</td>
<td><input type="text" class="Wdate" name="birthday" 
value="<fmt:formatDate value='${student.birthday}' type='date' pattern='yyyy-MM-dd'/>"
onClick="WdatePicker()" readonly="readonly"></td>
</tr>
<tr>
<td align="right">兴趣：</td>
<td><input type="checkbox" name="interest" value="sing"${student.interest.contains('sing')?"checked='checked'":""}>唱歌
    <input type="checkbox" name="interest" value="dance"${student.interest.contains('dance')?"checked='checked'":""}>跳舞
    <input type="checkbox" name="interest" value="food"${student.interest.contains('food')?"checked='checked'":""}>美食
    <input type="checkbox" name="interest" value="study"${student.interest.contains('study')?"checked='checked'":""}>学习
<br>
    <input type="checkbox" name="interest" value="film"${student.interest.contains('film')?"checked='checked'":""}>电影
    <input type="checkbox" name="interest" value="sport"${student.interest.contains('sport')?"checked='checked'":""}>运动
    <input type="checkbox" name="interest" value="game"${student.interest.contains('game')?"checked='checked'":""}>游戏
    <input type="checkbox" name="interest" value="reading"${student.interest.contains('reading')?"checked='checked'":""}>阅读
</td>
</tr>
<tr>
<td align="right">籍贯：</td>
<td><select name="birthPlace">
<option value="0"${student.birthPlace=='0'?"selected='selected'":"" }>=请选择=</option>
<option value="1"${student.birthPlace=='1'?"selected='selected'":"" }>南京</option>
<option value="2"${student.birthPlace=='2'?"selected='selected'":"" }>镇江</option>
<option value="3"${student.birthPlace=='3'?"selected='selected'":"" }>常州</option>
<option value="4"${student.birthPlace=='4'?"selected='selected'":"" }>无锡</option>
<option value="5"${student.birthPlace=='5'?"selected='selected'":"" }>苏州</option>
<option value="6"${student.birthPlace=='6'?"selected='selected'":"" }>扬州</option>
<option value="7"${student.birthPlace=='7'?"selected='selected'":"" }>泰州</option>
<option value="8"${student.birthPlace=='8'?"selected='selected'":"" }>南通</option>
<option value="9"${student.birthPlace=='9'?"selected='selected'":"" }>淮安</option>
<option value="10"${student.birthPlace=='10'?"selected='selected'":"" }>宿迁</option>
<option value="11"${student.birthPlace=='11'?"selected='selected'":"" }>盐城</option>
<option value="12"${student.birthPlace=='12'?"selected='selected'":"" }>徐州</option>
<option value="13"${student.birthPlace=='13'?"selected='selected'":"" }>连云港</option>

</select></td>
</tr>
<tr>
<td align="right">自我评价：</td>
<td><textarea name="introduction" rows="5" cols="30">${student.introduction}</textarea>
</td>
</tr>
<tr>
<td align="center" colspan="2">
<input type="submit" value="修改">
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" value="返回"
onclick="javascript:window.history.back()">
</td>
</tr>
</table>
</form>
</body>
</html>