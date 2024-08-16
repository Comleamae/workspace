-- 1)
CREATE TABLE MY_MEMBER(
	MEMBER_CODE INT NOT NULL AUTO_INCREMENT PRIMARY KEY
	, MEMBER_ID VARCHAR(50) NOT NULL
	, MEMBER_PW VARCHAR(50) NOT NULL
	, MEMBER_NAME VARCHAR(50) NOT NULL
	, AGE INT
	, EMAIL VARCHAR(100))
-- 2-1)
INSERT INTO MY_MEMBER(
	MEMBER_ID
	, MEMBER_PW
	, MEMBER_NAME
	, AGE
	, EMAIL)
VALUES
('limit'
	, 'a111'
	, '이매'
	, 20
	, 'limit@gmail.com')
-- 2-2)
DELETE *
FROM my_member
-- 3)
UPDATE my_member
SET MEMBER_ID = 'KIMJAVA'
	, MEMBER_NAME = '김자바'
WHERE MEMBER_CODE = 1

SELECT * FROM emp 
-- 4)급여가 500에서 3000 사이이고 커미션이 NULL이 아닌 사원의 사원번호, 사원명, 급여, 커미션을 조회
SELECT EMPNO, ENAME, SAL, COMM
FROM emp 
WHERE SAL>=500 && SAL<=3000
AND COMM IS NOT NULL

-- 5)사원들 중 이름이 ‘기’로 끝나기나, ‘김’이 들어가는 사원들의 사번, 이름, 입사일을 조회하되, 사번기준 내림차순 정렬하여 조회하는 쿼리문을 작성하세요.
SELECT EMPNO, ENAME, HIREDATE
FROM emp 
WHERE ENAME LIKE '%김%' || ENAME LIKE '%기'
ORDER BY EMPNO DESC

-- 6)사원의 사번, 이름, 부서번호, 부서명을 조회해보자. 부서명은 부서번호가 10일 때는 ‘인사부’, 20일 때는 ‘영업부’, 30일 때는 ‘개발부’, 그 외의 값은 ‘생산부’로 조회되어야 한다. 조인 사용하는 문제 아님. CASE 사용. 
SELECT EMPNO, ENAME, DEPTNO,
			CASE 
				WHEN DEPTNO = 10 THEN '인사부'
				WHEN DEPTNO = 20 THEN '영업부'
				WHEN DEPTNO = 30 THEN '개발부'
				ELSE '생산부'
			END AS DNAME
FROM emp 

-- 7)1월에 입사한 모든 사원의 사번, 이름, 입사일, 커미션을 입사일 기준 오름차순으로 조회하는 쿼리문을 작성하세요. 단, 커미션이 NULL일 경우 커미션은 0으로 조회되어야 한다.
SELECT EMPNO, ENAME, HIREDATE, IFNULL(COMM, 0) AS COMM
FROM emp 
WHERE MONTH(HIREDATE) = 01
ORDER BY HIREDATE;

-- 8)부서별로 그룹지어서 부서별 급여의 합과 급여의 평균, 커미션의 평균을 조회하는 쿼리문을 작성하여라. 단 조회는 부서별 급여의 총합이 큰 순서대로 조회되어야 한다
SELECT dept.DNAME, AVG(SAL), AVG(COMM)
FROM emp, dept
WHERE emp.DEPTNO = dept.DEPTNO
GROUP BY DNAME


-- 9)서브쿼리를 사용하여 부서명이 ‘인사부’인 사원의 사번, 이름, 입사일, 급여, 부서번호, 부서명을 조회하는 쿼리문을 작성해보자. 
SELECT EMPNO, ENAME, HIREDATE, SAL, DEPTNO, (SELECT DNAME
															FROM dept 
															WHERE emp.DEPTNO = dept.DEPTNO)
FROM emp
WHERE emp.DEPTNO = (SELECT DEPTNO
							FROM dept 
							WHERE DNAME = '인사부')

-- 10)조인을 사용하여 부서명이 ‘인사부’가 아니고 급여가 500이상인 사원의 사번, 이름, 입사일, 급여, 부서번호, 부서명을 조회하는 쿼리문을 작성해보자. 단, 정렬은 사번 기준 내림차순으로 정렬 후 사원 이름 기준 오름차순으로 정렬한다
SELECT EMPNO, ENAME, HIREDATE, SAL, emp.DEPTNO, DEPT.DEPTNAME
FROM emp, dept
WHERE emp.DEPTNO = dept.DEPTNO
AND SAL >= 500 && dept.DNAME !='인사부'
ORDER BY EMPNO DESC, ENAME ASC

