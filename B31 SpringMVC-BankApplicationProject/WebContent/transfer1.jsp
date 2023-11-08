


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>

<body>

	<div id="top_links">


		<div id="header">
			<h1>
				Online Banking System<span class="style1"></span>
			</h1>
			<h1>
				For RIO Bank Co.Ltd<span class="style1"></span>
			</h1>
			<h2>ExtraOrdinary Service</h2>
			<A href="index.html"><IMG SRC="images/home1.gif"></IMG></A>
		</div>

		<div id="navigation">
			<ul>
				<li><a href="create.jsp">NEW ACCOUNT</a></li>
				<li><a href="balance1.jsp">BALANCE</a></li>
				<li><a href="deposit1.jsp">DEPOSIT</a></li>
				<li><a href="withdraw1.jsp">WITHDRAW</a></li>
				<li><a href="transfer1.jsp">TRANSFER</a></li>
				<li><a href="closeac1.jsp">CLOSE A/C</a></li>
				<li><a href="logout.jsp">LOGOUT</a></li>
			</ul>
		</div>



		<table style="width: 800px; background: #FFFFFF; margin: 0 auto;">
			<tr>
				<td width="450" valign="top">
					<div id="welcome" style="border-right: #666666 1px dotted;">
						<h1>TRANSFER FORM</h1>
						<br>
						<table align="center" bgcolor="white">
							<tr>

							</tr>
							<tr>
								<td><div>
										<%
											if (request.getAttribute("bal") != null) {
												out.print(request.getAttribute("bal"));
											}
										%>
									</div>
									<form name=F1 onSubmit="return dil(this)" action="transfer.jsp">
										<table cellspacing="5" cellpadding="3">
											<tr>
												<td>ACCOUNT NO:</td>
												<td><input type="text" name="accNo" /></td>
											</tr>
											<tr>
												<td>USER NAME:</td>
												<td><input type="text" name="username" /></td>
											</tr>
											<tr>
												<td>PASSWORD:</td>
												<td><input type="password" name="password" /></td>
											</tr>
											<tr>
												<td>TARGET ACCOUNT NO:</td>
												<td><input type="text" name="taccNo" /></td>
											</tr>
											<tr>
												<td>TRANSFERED AMOUNT:</td>
												<td><input type="text" name="transferMoney" /></td>
											</tr>
											<tr>
												<td></td>
												<td><input type="submit" value="Submit" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
													<INPUT TYPE=RESET VALUE="CLEAR"></td>
											</tr>
										</table>
									</form></td>
							</tr>
						</table>
					</div>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>