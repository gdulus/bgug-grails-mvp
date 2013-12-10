<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>MVC</title>
    <meta name="layout" content="test">
</head>
<body>
    <div class="one">
        <g:include controller="onePresenter" action="renderPresenter" model="" />
    </div>
    <div class="two">
        <g:render template="two" model="[data:model.two]"/>
    </div>
    <div class="three">
        <g:render template="three" model="[data:model.three]"/>
    </div>
    <div class="four">
        <g:render template="four" model="[data:model.four]"/>
    </div>
    <div class="five">
        <g:render template="five" model="[data:model.five]"/>
    </div>
</body>
</html>