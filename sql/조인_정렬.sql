-- 여러 테이블의 내용을 동시에 조회하기(JOIN)
SELECT * FROM emp;
SELECT * FROM dept;
-- 사원번호, 사원명, 부서명을 조회
-- emp테이블에서 DEPTNO 확인 ->20
-- dept테이블에서 DEPTNO가 20인 데이터 확인
-- JOIN 조건 : 두 테이블이 공통으로 지니는 컬럼의 값이 같은 데이터만 조회
SELECT emp.EMPNO, emp.ENAME, dept.DNAME, emp.DEPTNO, dept.DEPTNO
FROM emp, dept
WHERE emp.DEPTNO = dept.DEPTNO;
-- JOIN + 별칭
SELECT EMPNO AS 사원번호 
	, ENAME 사원명
	, 사원.SAL 월급
FROM emp 사원;
-- 직급이 대리인 사원들의  사원번호, 사원명, 직급, 부서번호, 부서명, 부서의 지역 조회
SELECT EMPNO
	, ENAME
	, JOB
	, DNAME
	, LOC
	, E.DEPTNO
	, D.DEPTNO
FROM emp E, dept D -- 약칭 E, D
WHERE JOB = '사원' 
AND E.DEPTNO = D.DEPTNO; -- 추가 조건을 위해서는 AND를 사용할 것
-- 조회 시 데이터를 정렬해 조회하기
-- 오름차순 : ASC 생략가능
-- 내름차순 : DESC
SELECT *
FROM emp;
ORDER BY SAL DESC -- 내림차순 정렬 
-- 사번, 사원명, 급여 조회, 급여 기준 정렬
SELECT EMPNO
	, ENAME
	, SAL
FROM emp 
ORDER BY SAL ASC -- 오름차순 정렬
--부서번호가 30번이 아닌 사원들의
--사원명, 부서번호 조회 사원명 기준 내림 차순
SELECT ENAME, DEPTNO
FROM emp
WHERE DEPTNO != 30
ORDER BY ENAME DESC;
-- 부서명이 인사부가 아니면서 급여가 300이상인 사원들의
-- 사번, 사원명, 부서번호, 부서명, 급여 조회
-- 부서번호 기준 오름차순 정렬
SELECT EMPNO, ENAME, emp.DEPTNO, DNAME, SAL
FROM emp, dept
WHERE emp.DEPTNO = dept.DEPTNO
AND dept.DNAME !='인사부' && SAL >= 300
ORDER BY emp.DEPTNO ASC

SELECT EMPNO, ENAME, JOB, SAL
FROM emp
ORDER BY JOB ASC, SAL ASC -- 1번 기준으로 오름차순 정렬 후 2번 기준으로 오름차순 정렬 시작