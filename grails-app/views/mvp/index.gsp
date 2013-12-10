<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>MVP</title>
    <meta name="layout" content="test">
</head>
<body>
    <div class="one">
        <g:include controller="onePresenter" action="renderPresenter" />
    </div>
    <div class="two">
        <g:include controller="twoPresenter" action="renderPresenter" />
    </div>
    <div class="three">
        <g:include controller="threePresenter" action="renderPresenter"  />
    </div>
    <div class="four">
        <g:include controller="fourPresenter" action="renderPresenter" />
    </div>
    <div class="five">
        <g:include controller="fivePresenter" action="renderPresenter" />
    </div>
</body>
</html>