-- 테이블 삭제(데이터 삭제와 구분해야함)
-- ROLLBACK, COMMIT 불가능 (데이터 변화 시 되돌리기, 확정하기)
DROP TABLE basic_board;
-- 데이터 삭제
-- ROLLBACK, COMMIT 가능 (데이터 변화 시 되돌리기, 확정하기)
DELETE FROM basic_board;


-- 게시판 프로그램 테이블 생성
CREATE TABLE BASIC_BOARD(
	-- 컬럼명 데이터타입 [제약조건] 문자의 경우()안에 최대 글자 수를 입력
					-- 자동 증가
	BOARD_NUM INT AUTO_INCREMENT PRIMARY KEY
	, TITLE VARCHAR(50) NOT NULL
	, WRITER VARCHAR(50) NOT NULL 
	, CONTENT VARCHAR(100)
	-- 액션 실행 시 삽입 시간이 나옴
	, CREATE_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
	-- 데이터 미선언시 DEFUALT 값으로 변경 
	, READ_CNT INT DEFAULT 0
);

SELECT *
FROM basic_board

-- 기본적으로 데이터 삽입시 호출하지 않았다면 관계없이 NULL
INSERT INTO basic_board 
	(BOARD_NUM
	, TITLE
	, WRITER
	, CONTENT
	, CREATE_DATE
	, READ_CNT
	)
VALUES (1
	, '제목'
	, '작성자1'
	, '내1용'
	, '2024-07-01'
	, 5
	);
	
INSERT INTO basic_board(
TITLE
, WRITER
, CONTENT
)
VALUES(
'1'
, '1'
, '1');	
	
INSERT INTO basic_board(
 BOARD_NUM
 , TITLE
 , WRITER)
VALUES (
 2
 , '제목'
 , '작성자2');

INSERT INTO basic_board 
	(BOARD_NUM
	, TITLE
	, WRITER
	, CONTENT
	, CREATE_DATE
	, READ_CNT)
VALUES (1
	, '제목'
	, '작성자'
	, '내용'
	, '2024-07-01'
	, 3);

INSERT INTO basic_board 
	(BOARD_NUM
	, TITLE
	, WRITER
	, CONTENT
	, CREATE_DATE
	)
VALUES (5
	, '제목'
	, '작성자2'
	, '내2용'
	, '2024-07-01'
	);