-- 많이 사용하는 함수 

SELECT 'JAVA', 123, 'HELLO';
SELECT 'JAVA', BOARD_NUM FROM board;

-- 문자열 나열 함수 CONCAT( , , ...)
SELECT 'JAVA', 'HELLO', CONCAT('JAVA', 'HELLO', 'PYTHON');
SELECT BOARD_NUM, TITLE, CONCAT(BOARD_NUM, '_', TITLE) AS BOARD_INFO
FROM board;
-- 문자열 길이 함수 LENGTH()
SELECT 'JAVA', LENGTH('JAVA'), 'HELLO', LENGTH('HELLO')
-- 일부 문자열 추출 
-- 첫번째:원본 , 두번째 : 추출 시작 인덱스, 세번째: 추출 개수
-- SUBSTRING(원본 글, 추출 시작을 할 위치, 마지막에서 부터 출력을 끝낼 위치)
SELECT 'ABCDEFG'
	, SUBSTRING('ABCDEFG', 3)
	, SUBSTRING('ABCDEFG', 3, 2);
	
-- 원본을 대문자로, 소문자로 
SELECT 'Mysql', UPPER('Mysql'), LOWER('Mysql');

-- 문자나 숫자의 자릿수 맞추는 함수 
-- 첫번째:원본, 두번째: 문자의 길이, 세번째: 남는 자리에 들어갈 것
-- 빈 값을 오른쪽, 왼쪽
SELECT LPAD('JAVA', 5, '#'), RPAD('JAVA', 5, '#'), LPAD('001', 10, '0');

-- *띄어쓰기 또한 데이터읾...
-- 문자열의 좌, 우 공백 제거 
-- 공백제거 함수 왼쪽 공백 제거, 오른쪽 공백 제거, 양쪽 공백 제거
SELECT '  AA BB  ', LTRIM('  AA BB  '), RTRIM('  AA BB  '), TRIM('  AA BB  ');

-- 문자 치환 함수
-- 첫번째: 원본, 두번째:치환할 문자열, 세번째: 치환된 문자열을 대신할 문자열
SELECT '010 1111 2222', REPLACE('010 1111 2222', ' ', '-');

-- 반올림 함수 첫번째 원본, 두번째 반올림 시작할 위치
SELECT 123.456, ROUND(123.456, 2)

-- 연산 및 나머지 함수 MOD()사용
SELECT 10+10, 2*3, 15/4, MOD(10, 3);
-- IFNULL(, ): NULL인 데이터를 두번째 매개변수로 치환
SELECT COMM, IFNULL(COMM, 10) FROM emp;

-- 밑에서 부터 다름----------------------------------------------------------------------------------------------------------------------------------------------------------------
-- 단일행 함수 : 데이터의 갯수와 상관없이 조회 결과 하나의 행 결과만 갖는 함수
-- EX) SUM(), MAX(), MIN(), AVG(), COUNT()
SELECT * FROM emp;

-- 모든 사원의 급여 총합 및 커미션 총합 조회
-- SUM(10, 10) <- 이런 쿼리는 불가
SELECT SUM(SAL), SUM(COMM) FROM emp;

-- SUM() 함수의 위의 함수와의 다른점
-- SUM() 함수는 데이터의 수와 상관없이 무조건 하나의 조회 결과를 가짐
SELECT LENGTH(ENAME), LENGTH(JOB) FROM emp; 

-- 쿼리 조회 시 조회하는 모든 컬럼의 조회 행 갯수는 모두 일치해야 함
-- 모든 사원의 이름과 그병의 합을 조회 <- SUM()함수의 특성으로 다른 조회 결과도 하나만 나옴 
SELECT ENAME, SUM(SAL) FROM emp;

-- 합, 최대값, 최소값, 평균, 갯수 
SELECT SUM(SAL), MAX(SAL), MIN(SAL), AVG(SAL), COUNT(SAL) 
FROM emp;

-- 테이블에 있는 데이터의 수 <-추천하지 않음 
SELECT COUNT(*) FROM emp;

-- 추천하는 방법: COUNT(PK)
SELECT COUNT(EMPNO) FROM emp;

-- NULL 데이터가 있을 경우 카운트에서 제외 
SELECT COUNT(COMM) FROM emp;

-- NULL이 아닌 데이터로만  평균 계산
SELECT AVG(COMM) FROM emp;

-- COMM 컬럼의 평균 값을 계산하는 다른 방법
SELECT ROUND(AVG(IFNULL(COMM, 0)), 2) FROM emp;