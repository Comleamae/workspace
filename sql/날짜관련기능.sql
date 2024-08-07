
-- 날짜 관련 함수 및 기능

-- 현재 날짜  및 시간 조회
SELECT NOW();
-- 현재 날짜만 조회
SELECT CURRENT_DATE();
-- 현재 시간만 조회 
SELECT CURRENT_TIME();

-- 날짜 조회 시 포맷(형태) 지정하기
-- DATE_FORMAT(조회할 날짜, 포맷);
-- Y:년도를 4자리로 표현 /y:년도를 마지막 두자리로 표현
-- M:월을 영어로 표현 /m:월을 숫자로 표현
-- D:일을 서수식으로 표현 /d:일을 숫자로 표현
-- H:시간을 24시간 기준으로 표현 /h:시간을 12시간 기준으로 표현
-- I: /i:분을 두자리 숫자로 표현
-- S: /s:초를 두자리 숫자로 표현
SELECT NOW()
	, DATE_FORMAT(NOW(), '%Y-%m-%d')
	, DATE_FORMAT(NOW(), '%y-%M-%D')
	, DATE_FORMAT(NOW(), '%Y%m%d')
	, DATE_FORMAT(NOW(), '%Y-%m-%d %h:%i:%s');

-- 날짜 및 시간에서 특정 정보만 추출하기
SELECT NOW()
	, YEAR(NOW())
	, MONTH(NOW())
	, DAY(NOW())
	, HOUR(NOW())
	, MINUTE(NOW())
	, SECOND(NOW());

SELECT * FROM emp;
-- 2월에 입사한 사원의 사번, 이름, 입사일 조회
SELECT EMPNO, ENAME, DATE_FORMAT(HIREDATE, '%Y-%m-%d') AS HIREDDATE 
FROM emp 
WHERE SUBSTRING(HIREDATE, 6, 2) = '02';
-- WHERE MONTH(HIREDATE)=2;

-- 날짜 및 시간 연산 
SELECT NOW()
	, ADDDATE(NOW(), INTERVAL 10 DAY)
	, ADDDATE(NOW(), INTERVAL -10 MONTH)
	, ADDDATE(NOW(), INTERVAL 10 YEAR);
	
-- 날짜 및 시간 차이
-- 월 차이, 매개변수의 형태는 반드시 YYYYMM
SELECT PERIOD_DIFF(202407,202401);

-- 일 차이
SELECT DATEDIFF(CURRENT_DATE(), '2020-05-05')

-- 시간 차이
SELECT TIMESTAMPDIFF(unit,datetime_expr1,datetime_expr2)