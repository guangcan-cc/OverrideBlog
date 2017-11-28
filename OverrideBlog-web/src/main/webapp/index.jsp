<%@page pageEncoding="utf-8" language="java" %>
<%@ include file="common/taglib.jspf"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <title>分享博客生活</title>
    <meta name="description" content="博客开发ing">
    <link rel="stylesheet" type="text/css" href="static/css/style.css" />
    <link rel="stylesheet" type="text/css" href="static/css/H-ui.css" />
</head>
<body>
<div class="topnav">
    <div class="wp cl">
        <div class="l">您好，欢迎来到Override Blog！</div>
        <div class="r">
            <span class="r_nav">[ <a rel="nofollow" href="javascript:login();">登录</a> ]</span>
            <span class="pipe">|</span>
            <span class="r_nav">[ <a href="javascript:register();" rel="nofollow">注册</a> ]</span>
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
</body>
</html>