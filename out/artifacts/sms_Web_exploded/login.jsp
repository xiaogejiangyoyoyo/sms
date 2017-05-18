<%@ page contentType="text/html; charset=UTF-8"%>
<html>

<head>

   <link rel="stylesheet" type="text/css" href="css/normalize.css" />
   <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.2.0/css/font-awesome.min.css" />
   <link rel="stylesheet" type="text/css" href="css/demo.css" />
   <link rel="stylesheet" type="text/css" href="css/component.css" />
   <!--[if IE]>
   <script src="http://libs.useso.com/js/html5shiv/3.7/html5shiv.min.js"></script>
   <![endif]-->
   <link rel="stylesheet" type="text/css" href="main.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#register").click(function(){
		var form=$("form").get(0);
		form.action="register.jsp";
		form.submit();
		
	})
})

</script>
</head>
<body background="img/bg.gif-" style="background-size:cover;background-position:center">



<form action="login" method="POST">
   <div class="container">
      <section class="content bgcolor-1">
         <span class="input input--haruki">
					<input class="input__field input__field--haruki" type="text" id="input-1" name="account"/>
					<label class="input__label input__label--haruki" for="input-1">
						<span class="input__label-content input__label-content--haruki">用户名</span>
					</label>
				</span>
         <span class="input input--haruki">
					<input class="input__field input__field--haruki" type="text" id="input-2" name="password"/>
					<label class="input__label input__label--haruki" for="input-2">
						<span class="input__label-content input__label-content--haruki">密码</span>
					</label>
				</span>
      </section>
   </div>
   <p style="text-align:center"><input class="dlu" type="submit" value="登录">
<input class="dlu" id="register" type="button" value="注册"></p>
</form>

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