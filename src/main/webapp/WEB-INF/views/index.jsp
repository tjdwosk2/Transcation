<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function result_go(f) {
		f.countnum.value = f.amount.value;
		f.action="result.do";
		f.submit();
	}
</script>
</head>
<body>
	<%--
	    create table card(
	        customerId   varchar2(4000),
	        amount   varchar2(4000)
	    );
	    create table ticket(
	        customerId   varchar2(4000),
	        countnum   varchar2(4000) check(countnum <5) 
	    );
	    티켓 구매수를 5개 미만으로 구매해야 된다.
	  5개 이상이 구매하면 트랜잭션 처리를 해야 된다.  
	  
	--%>
	<h2> 결재 하기 </h2>
	<form method="post">
		<p> 고객 ID : <input type="text" name="customerId"></p>
		<p> 티켓 구매수 : <input type="number" name="amount"></p>
		<input type="hidden" name="countnum" value="">
		<input type="button" value="구매하기" onclick="result_go(this.form)">
		<input type="reset" value="취소하기">
	</form>
</body>
</html>