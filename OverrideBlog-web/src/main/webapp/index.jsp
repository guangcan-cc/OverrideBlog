<%@page pageEncoding="utf-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <title>分享博客生活</title>
    <meta name="description" content="博客开发ing">
    <meta name=”viewport” content=”width=device-width, initial-scale=1, maximum-scale=1″>
    <link rel="stylesheet" type="text/css" href="static/css/style.css" />
    <link rel="stylesheet" type="text/css" href="static/css/H-ui.css" />
</head>
<body>
<div class="topnav" style="padding-left:88px; padding-right: 88px;">
    <div class="wp cl">
        <div class="l">您好，欢迎来到Override Blog！</div>
        <div class="r">
            <span class="r_nav">[ <a rel="nofollow" href="javascript:void(0);" onclick="goLogin();">登录</a> ]</span>
            <span class="pipe">|</span>
            <span class="r_nav">[ <a href="javascript:goRegister();">注册</a> ]</span>
            <span class="pipe">|</span><span class="r_nav"><a title="收藏本站" href="javascript:;" onClick="addFavoritepage('H-ui前端框架','http://www.h-ui.net/');">收藏本站</a></span>
            <span class="pipe">|</span><span class="r_nav"><a href="javascript:void(0)" onclick="setHome(this);" title="设为首页">设为首页</a></span>
        </div>
    </div>
</div>
<div class="container">
    <header class="navbar-wrapper">
        <div class="navbar navbar-black">
            <div class="container cl">
                <a class="logo navbar-logo f-l mr-10 hidden-xs" href="/aboutHui.shtml">Override BLOG</a>
                <span class="logo navbar-slogan f-l mr-10 hidden-xs">欢迎 &middot; 你 &middot; 别走啊</span>
                <a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
                <nav class="nav navbar-nav nav-collapse" role="navigation" id="Hui-navbar">
                    <ul class="cl">
                        <li class="current"><a href="/">首页</a></li>
                        <li><a href="#">全部文章</a></li>
                        <li><a href="#">个人信息</a></li>
                        <li><a href="#">联系我们</a></li>
                    </ul>
                </nav>
                <nav class="navbar-userbar hidden-xs">
                </nav>
            </div>
        </div>
    </header>


    <div>
        <span class="text-c" style="background-color: yellow;width: 100px;">
            文章一
        </span>
        <span class="text-c" style="background-color: red;width: 100px;">
            文章一
        </span>
    </div>

    <div class="text-c" style="background-color: yellow;width: 100px;display: block;">
        文章一
    </div>
    <div class="text-c" style="background: red;width: 100px;display: inline-block;">
        文章一
    </div>

    <div class="text-c">

        <label for="name">
            dsadsa
            dsada
            <input type="text" name="name" id="name"/>
        </label>
        文章一
    </div>
    <div class="text-c">
        文章一
    </div>
    <div class="text-c">
        文章一
    </div>
    <div class="text-c">
        文章一
    </div>
    <div class="text-c">
        文章一
    </div>
    <div class="text-c">
        1 2 3 4 5 6 7 8 9 10
    </div>
</div>

<div class="login_div" style="display: none;">
    <span style="float: right;">X</span>
    <div style="margin: 40px;">
        <form>
            <div>
                <label>
                    <span style="width: 20%">用户名</span>
                    <input type="text" name="username"/>
                </label>
            </div>
            <div>
                <label>
                    <span style="width: 20%">密码</span>
                    <input type="text" name="password"/>
                </label>
            </div>
            <div>
                <label>
                    <input type="button" value="登录"/>
                </label>
            </div>
        </form>
    </div>
</div>

<script type="text/javascript" src="static/js/jquery/jquery-1.11.3.min.js"></script>
<script>
    var ctx = "${ctx}";
    function goRegister(){
        window.location.href = "view/jsp/user/register.jsp";
    }

    function goLogin() {
        $('.login_div').show();
        $('body').addClass('hyaline');
    }
</script>
</body>
</html>