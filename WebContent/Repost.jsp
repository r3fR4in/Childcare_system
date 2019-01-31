<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">

<title>Single page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<link href="cpts_998_bmx/css/bootstrap.css" rel='stylesheet'
	type='text/css' />
<link href="cpts_998_bmx/css/style.css" rel='stylesheet' type='text/css' />
<link href="cpts_998_bmx/css/owl.carousel.css" rel="stylesheet">
<script src="cpts_998_bmx/css/jquery.min.js"></script>
</head>
<body>
	<!--navigation-starts-->
	<div class="navigation">
		<span class="menu"></span>
		<ul class="navig cl-effect-16">
			<li><a href="index.html">Home</a></li>
			<li><a href="parents.html">Parents</a></li>
			<li><a href="babysitters.html">Baby Sitters</a></li>
			<li><a href="typo.html">Short Codes</a></li>
			<li><a href="gallery.html">Gallery</a></li>
			<li><a href="contact.html">Contact</a></li>
		</ul>
	</div>
	<!--navigation-end-->
	<!--script-for-menu-->
	<script>
		$("span.menu").click(function() {
			$(" ul.navig").slideToggle("slow", function() {
			});
		});
	</script>
	<!--script-for-menu-->
	<!--banner-starts-->
	<div class="banner-1"></div>
	<!--banner-end-->
	<!--single-page-->
	<div class="single">
		<div class="container">
			<h2>Single Page</h2>
			<div class="single-page-artical">
				<div class="artical-content">
					<h4>Lorem Ipsum is simply dummy text</h4>
					<img class="img-responsive" src="images/22.jpg" alt=" "
						style="visibility: visible; animation-delay: 0.5s; animation-name: zoomIn;">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in
						reprehenderit in voluptate velit esse cillum dolore eu fugiat
						nulla pariatur. Excepteur sint occaecat cupidatat non proident,
						sunt in culpa qui officia deserunt mollit anim id est laborum.
						Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
						eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
						enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in
						reprehenderit in voluptate velit esse cillum dolore eu fugiat
						nulla pariatur. Excepteur sint occaecat cupidatat non proident,
						sunt in culpa qui officia deserunt mollit anim id est laborum.
						Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
						eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
						enim ad minim veniam, quis nostrud exercitation ullamco laboris
						nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in
						reprehenderit in voluptate velit esse cillum dolore eu fugiat
						nulla pariatur. Excepteur sint occaecat cupidatat non proident,
						sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
				</div>
				<div class="artical-links">
					<ul>
						<li><i class="glyphicon glyphicon-calendar"
							aria-hidden="true"></i><span>March 10, 2016</span></li>
						<li><a href="#"><i class="glyphicon glyphicon-user"
								aria-hidden="true"></i><span>admin</span></a></li>
					</ul>
				</div>
				<div class="comment-grid-top">
					<h3>Responses</h3>
					<div class="comments-top-top">
						<div class="top-comment-left">
							<a href="#"><img class="img-responsive" src="images/co.png"
								alt=""></a>
						</div>
						<div class="top-comment-right">
							<ul>
								<li><span class="left-at"><a href="#">Admin</a></span></li>
								<li><span class="right-at">March 10, 2016 at 10.30am</span></li>
								<li><a class="reply" href="#">Reply</a></li>
							</ul>
							<p>It is a long established fact that a reader will be
								distracted by the readable content of a page when looking at its
								layout.The point of using Lorem Ipsum is that it has a
								more-or-less</p>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="comments-top-top top-grid-comment">
						<div class="top-comment-left">
							<a href="#"><img class="img-responsive" src="images/co.png"
								alt=""></a>
						</div>
						<div class="top-comment-right">
							<ul>
								<li><span class="left-at"><a href="#">Admin</a></span></li>
								<li><span class="right-at">March 18, 2016 at 10.30am</span></li>
								<li><a class="reply" href="#">Reply</a></li>
							</ul>
							<p>It is a long established fact that a reader will be
								distracted by the readable content of a page when looking at its
								layout.The point of using Lorem Ipsum is that it has a
								more-or-less</p>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
				<div class="artical-commentbox">
					<h3>leave a comment</h3>
					<div class="table-form">
						<form class="form-horizontal" role="form"
							action="${pageContext.request.contextPath }/repost/addRepost.action"
							method="post" id="form" enctype="multipart/form-data">
							<textarea placeholder="Message" name="message"></textarea>
							<input type="submit" value="Send">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--single-page-->
</body>
</html>
