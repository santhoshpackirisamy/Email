<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
<style> 
/* ===========================
====== Search Box ====== 
=========================== */

.search
{
border: 2px solid #CF5C3F;
overflow: auto;
border-radius: 5px;
-moz-border-radius: 5px;
-webkit-border-radius: 5px;
}

.search input[type="text"]
{
border: 0px;
width: 67%;
padding: 10px 10px;
}

.search input[type="text"]:focus
{
outline: 0;
}

.search input[type="submit"]
{
border: 0px;
background: none;
background-color: #CF5C3F;
color: #fff;
float: right;
padding: 10px;
border-radius-top-right: 5px;
-moz-border-radius-top-right: 5px;
-webkit-border-radius-top-right: 5px;
border-radius-bottom-right: 5px;
-moz-border-radius-bottom-right: 5px;
-webkit-border-radius-bottom-right: 5px;
cursor:pointer;
}

/* ===========================
====== Medua Query for Search Box ====== 
=========================== */

@media only screen and (min-width : 150px) and (max-width : 780px)
{
{}
.search
{
width: 95%;
margin: 0 auto;
}

}

</style>
</head>
<body>

<div class="container">
	<div class="search">
		<form action="searchesmessage" class="search-form">
			<input name="searchbar" type="text" placeholder="Search for username..">
			<input type="submit" value="Submit">
		</form>
	</div>
</div>


</body>
</html>
