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
<div class="container">
    <form id="form">
        <div class="row cl">
            <label>用户名：</label>
            <div>
                <input type="text" class="input-text" name="username"/>
            </div>
        </div>
        <div class="row cl">
            <label>密码：</label>
            <div>
                <input type="password" class="input-text" name="password"/>
            </div>
        </div>
        <div class="row cl">
            <label>密码验证：</label>
            <div>
                <input type="password" class="input-text" name="passwordPre"/>
            </div>
        </div>
        <div class="row cl">
            <label>姓名：</label>
            <div>
                <input type="text" class="input-text" name="name"/>
            </div>
        </div>
        <div class="row cl">
            <label>邮箱：</label>
            <div>
                <input type="text" class="input-text" name="email"/>
            </div>
        </div>
        <div class="row cl">
            <label>电话号码：</label>
            <div>
                <input type="text" class="input-text" name="phoneNumber"/>
            </div>
        </div>
        <div class="row cl">
            <button class="btn btn-primary">注册</button>
        </div>
    </form>

</div>
</body>
</html>
