-- GROUP BY : 데이터를 특정 기준에 맞춰 그룹지은 결과를 도출할 때 사용
-- 단일행 함수와 함께 사용하는 경우 많음 
-- 단일행 함수: SUM(), MAX(), MIN(), COUNT(), AVG() -> 결과가 하나의 행만 나오는 함수들 
-- 그외의 함수들 : IFNULL(A,B)=A의 값이 NULL이라면 B로 대체 , CONCAT(A,B,C)='ABC', SUBSTRING(A,B,C)=A라는 값에서 B부터 C까지 잘라낸다...
SELECT * FROM emp;

-- 사원중 가중 많은 급여 조회
SELECT MAX(SAL) FROM emp;

-- 각 부서별로 가장 많은 급여 조회
-- 단일행 함수와 조회 결과 행의 갯수가 다른 컬럼은 사용 못하지만
-- GROUP BY에서는 유일하게 그루핑한 컬럼은 조회가 가능 
SELECT EMP.DEPTNO,  dept.DNAME, MAX(SAL), SUM(SAL), COUNT(SAL)
FROM emp, dept 
WHERE emp.DEPTNO = dept.DEPTNO
GROUP BY DEPTNO;

-- 직급이 사원이 아닌 사원들 중에서 직급별 급여의 평균을 조회
-- 조회 결과를 직급 기준 오름차순으로 정렬 ORDER BY JOB ASC;
-- 조회 결과 평균 급여 기준 내림차순
SELECT JOB, AVG(SAL)
FROM emp 
WHERE JOB !='사원'
GROUP BY JOB
ORDER BY AVG(SAL) DESC

-- 조회 쿼리문의 해석 순서 *별칭 사용 시 순서에 유의
-- * 1)FROM -> 2)JOIN-> 3)WHERE-> 4)GROUP BY-> *)HAING-> 5)SELECT-> 6)ORDER BY
SELECT EMPNO AS 사번
		, ENAME
FROM emp
WHERE EMPNO > 1003
ORDER BY EMPNO ASC;

-- 직급 별로 그룹하여 직급, 각 직급별 평균 급여 조회 
-- 평균 급여가 300이상인 직급에 대해서만 조회 
-- HAVING :그룹화한 후 결정해야하는 조건은 HAVING 절에 사용
SELECT JOB, AVG(SAL)
FROM emp 
GROUP BY JOB
HAVING AVG(SAL)>=300
ORDER BY AVG(SAL) DESC;

-- 20번 부서를 제외한 정보 중에서
-- 부서별로 그룹하여 부서번호, 부서별 급여의 합
-- 각 그룹별 급여의 합이 700 이상인 데이터만 조회
-- 조회 결과 데이터는 부서별 급여의 합 기준 오름차순으로 정렬 
SELECT DEPTNO, SUM(SAL)
FROM emp
WHERE DEPTNO != 20
GROUP BY DEPTNO
HAVING SUM(SAL)>=700
ORDER BY SUM(SAL) ASC




