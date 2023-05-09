<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
<link rel="stylesheet" type="text/css" href="<%=basePath%>ext/easyui/themes/default/easyui.css">

<link rel="stylesheet" type="text/css" href="<%=basePath%>ext/easyui/themes/icon.css">

<link rel="stylesheet" type="text/css" href="<%=basePath%>ext/easyui/themes/color.css">
 src="<%=basePath%>ext/easyui/jquery.min.js"></script>

<script type="text/javascript" src="<%=basePath%>ext/easyui/jquery.easyui.min.js"></script>

<script type="text/javascript" src="<%=basePath%>ext/easyui/plugins/jquery.edatagrid.js"></script>

<script type="text/javascript" src="<%=basePath%>ext/easyui/locale/easyui-lang-zh_CN.js"></script>

    
    <title>我的农场</title>
    <table id="grid"></table>
    <style>
        body {
        
            margin: 0px;           
        }
    </style>
</head>
<frameset rows="60,*,50" border="0">
	<frame src="menu.jsp" scrolling="no">
	<frame name="workspace" src="welcome.jsp" scrolling="no">
	<frame src="tools.jsp" scrolling="no"> 		
</frameset>
</html>
