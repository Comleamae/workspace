
SELECT*FROM emp;

-- 사원명에 '이'라는 글가자 포함된 사원의 모든 정보 조회
-- 글자가 포함되는지 조회할 때는 LIKE 연산자와 와일드 카드를 사용
-- 와일드 카드 :  %, _
-- '%': 글자 수 제한이 없는 랜덤한 문자
-- '_': 한 글자의 랜덤한 문자

SELECT *
FROM emp
WHERE ENAME LIKE '%이%'; -- '이'라는 글자가 이름에 포함된 이름 조회

SELECT *
FROM emp
WHERE ENAME LIKE '_이_'; -- 이름은 세 글자이며 가운데 글자가 '이'인 이름 조회

SELECT *
FROM emp
WHERE ENAME LIKE '%이'; -- 마지막 글자가 '이'로 끝나는 모든 이름 조회

SELECT *
FROM emp
WHERE ENAME LIKE '_이%'; -- 두번째 글자가 '이'인 모든 이름 조회

-- 문자열 연결 함수
SELECT 'JAVA', 1 + 1, CONCAT('집에', '가고', '싶다');


SELECT BOARD_NUM
	, TITLE
	, WRITER
	, CREATE_DATE
	, READ_CNT
FROM basic_board
WHERE #{searchKeyword} LIKE '%안녕%';
WHERE WRITER LIKE '%JAVA%';