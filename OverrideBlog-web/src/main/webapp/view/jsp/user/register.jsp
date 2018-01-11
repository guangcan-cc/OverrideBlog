<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/taglib.jspf"%>
<html>
<head>
    <title>用户注册</title>
    <meta name="description" content="用户注册">
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/style.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/css/H-ui.css" />
</head>
<body>
<div class="container" style="width: 500px;">
    <form id="form" class="form form-horizontal">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">用户名：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" name="username" placeholder="用户名"/>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">密码：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="password" class="input-text" name="password" placeholder="密码"/>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">密码验证：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="password" class="input-text" name="passwordPre"/>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">姓名：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" name="name"/>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">邮箱：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" name="email"/>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">电话号码：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" name="phoneNumber"/>
            </div>
        </div>
        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                <button class="btn btn-primary radius" onclick="register();">注册</button>
            </div>
        </div>
    </form>

</div>

<script src="${ctx}/js/common.js" type="application/javascript"></script>
<script src="${ctx}/js/jquery-1.11.3.min.js" type="application/javascript"></script>
<script>
    function register() {
        if(isBlank($('[name="username"]').val())) {
            alert("请输入用户名");
            return;
        }
        if(isBlank($('[name="password"]').val())) {
            alert("请输入密码");
            return;
        } else if($('[name="password"]').val() !== $('[name="passwordPre"]').val()) {
            alert("确认密码不一致");
            return;
        }

        $.ajax({
            url : '${ctx}/register',
            type : 'post',
            data : $('#form').serialize(),
            dataType : 'json',
            success : function (result) {
                if(result.code == 0){
                    alert("注册成功");
                } else {
                    alert(result.msg);
                }
            },
            error : function () {
                alert("网络错误");
            }
        });



    }
</script>
</body>
</html>
