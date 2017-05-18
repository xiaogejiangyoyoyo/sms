<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.2.0/css/font-awesome.min.css" />
    <link rel="stylesheet" type="text/css" href="css/demo.css" />
    <link rel="stylesheet" type="text/css" href="css/component.css" />
    <!--[if IE]>
    <script src="http://libs.useso.com/js/html5shiv/3.7/html5shiv.min.js"></script>
    <![endif]-->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
<style type="text/css">
.red{color:red}
.blue{color:blue}

</style>



<script type="text/javascript" src = "${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src = "${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>

</head>
<body>
<div class="container">
    <section class="content bgcolor-1">

<form action="register" method="POST">
<table>
<caption><h3>学生注册</h3></caption>
    <span class="input input--juro">
	<input class="input__field input__field--juro" type="text" id="input-28" name="account"/>
	<label class="input__label input__label--juro" for="input-28">
	<span class="input__label-content input__label-content--juro">账号</span>
	</label>
</span>
    <span class="input input--juro">
	<input class="input__field input__field--juro" type="text" id="input-28" name="name"/>
	<label class="input__label input__label--juro" for="input-28">
	<span class="input__label-content input__label-content--juro">姓名</span>
	</label>
</span>
    <span class="input input--juro">
	<input class="input__field input__field--juro" type="text" id="input-28" name="password"/>
	<label class="input__label input__label--juro" for="input-28">
	<span class="input__label-content input__label-content--juro">密码</span>
	</label>
</span>

    <span class="input input--juro">
	<input class="input__field input__field--juro" type="text" id="input-28" name="repassword"/>
	<label class="input__label input__label--juro" for="input-28">
	<span class="input__label-content input__label-content--juro">确认密码</span>
	</label>
</span>

    <span class="input input--juro">
	<input class="input__field input__field--juro" type="text" id="input-28" name="studyNumber"/>
	<label class="input__label input__label--juro" for="input-28">
	<span class="input__label-content input__label-content--juro">学号</span>
	</label>
</span>

    <span class="input input--juro">
	<input class="input__field input__field--juro" type="text" id="input-28" name="phone"/>
	<label class="input__label input__label--juro" for="input-28">
	<span class="input__label-content input__label-content--juro">电话</span>
	</label>
</span>
    <span class="input input--juro">
	<input class="input__field input__field--juro" type="text" id="input-28" name="email"/>
	<label class="input__label input__label--juro" for="input-28">
	<span class="input__label-content input__label-content--juro">邮箱</span>
	</label>
</span>

    <tr>
        <td align="right">性别：</td>
        <td><input type="radio" name="gender" value="true" checked="checked">男
            <input type="radio" name="gender" value="false">女
        </td>
    </tr>


    <tr>
        <td align="right">生日：</td>
        <td><input type="text" class="Wdate" name="birthday" onClick="WdatePicker()" readonly="readonly"></td>
    </tr>

<td align="right">兴趣：</td>
<td><input type="checkbox" name="interest" value="sing">唱歌
    <input type="checkbox" name="interest" value="dance">跳舞
    <input type="checkbox" name="interest" value="food">美食
    <input type="checkbox" name="interest" value="study">学习
<br>
    <input type="checkbox" name="interest" value="film">电影
    <input type="checkbox" name="interest" value="sport">运动
    <input type="checkbox" name="interest" value="game">游戏
    <input type="checkbox" name="interest" value="reading">阅读
</td>
</tr>
<tr>
<td align="right">籍贯：</td>
<td><select name="birthPlace">
<option value="0">=请选择=</option>
<option value="1">南京</option>
<option value="2">镇江</option>
<option value="3">常州</option>
<option value="4">无锡</option>
<option value="5">苏州</option>
<option value="6">扬州</option>
<option value="7">泰州</option>
<option value="8">南通</option>
<option value="9">淮安</option>
<option value="10">宿迁</option>
<option value="11">盐城</option>
<option value="12">徐州</option>
<option value="13">连云港</option>

</select></td>
</tr>
<tr>
<td align="right">自我评价：</td>
<td><textarea name="introduction" rows="5" cols="30">随便留下点什么吧。。。。</textarea>
</td>
</tr>
<tr>
<td align="center" colspan="2">
<input type="submit" value="注册">
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" value="返回"
onclick="javascript:window.history.back()">
</td>
</tr>
</table>
</form>
    </section>
</div>
<script src="js/classie.js"></script>
<script>
    (function() {
        // trim polyfill : https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/Trim
        if (!String.prototype.trim) {
            (function() {
                // Make sure we trim BOM and NBSP
                var rtrim = /^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g;
                String.prototype.trim = function() {
                    return this.replace(rtrim, '');
                };
            })();
        }

        [].slice.call( document.querySelectorAll( 'input.input__field' ) ).forEach( function( inputEl ) {
            // in case the input is already filled..
            if( inputEl.value.trim() !== '' ) {
                classie.add( inputEl.parentNode, 'input--filled' );
            }

            // events:
            inputEl.addEventListener( 'focus', onInputFocus );
            inputEl.addEventListener( 'blur', onInputBlur );
        } );

        function onInputFocus( ev ) {
            classie.add( ev.target.parentNode, 'input--filled' );
        }

        function onInputBlur( ev ) {
            if( ev.target.value.trim() === '' ) {
                classie.remove( ev.target.parentNode, 'input--filled' );
            }
        }
    })();
</script>
</body>
</html>