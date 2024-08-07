-- 데이터베이스의 키 종류
-- KEY: 데이터베이스에서 각 행을 구분하는 식별자를 의미
-- 슈퍼키(SUPER KEY): 하나의 행을 식별할 수 있는 하나 이상의 컬럼
-- 후보키(CANDIDATE KEY): 기본키가 될 수 있는 후보
-- 기본키(PRIMARY KEY, PK): 후보키 중에 각 행을 구분짓기 위해 결정한 키
-- 대체키(ALTERNATE KEY): 후보키 중에서 기본키를 제외한 키
-- 외래키(FOREIGN KEY, FK): 다른 테이블의 기본키로 사용되는 키

-- 로그인, 게시글, 댓글 관련 기능 포함 게시판 프로젝트

-- 회원정보 테이블: USER는 일반회원/ ADMIN 관리자
CREATE TABLE BOARD_MEMBER(
	MEM_ID VARCHAR(50) PRIMARY KEY
	, MEM_PW VARCHAR(50) NOT NULL
	, MEM_NAME VARCHAR(50) NOT NULL
	, GENDER VARCHAR(10) -- 'male', 'female'
	, MEM_ROLE VARCHAR(20) DEFAULT 'USER'-- 회원권한 
)
-- 임시 회원 데이터
INSERT INTO board_member (MEM_ID, MEM_PW, MEM_NAME, GENDER, MEM_ROLE) 
VALUES ('java', '1111', '김자바', 'male', 'USER')
INSERT INTO board_member (MEM_ID, MEM_PW, MEM_NAME, GENDER, MEM_ROLE) 
VALUES ('admin', '1111', '관리자', 'female', 'ADMIN')
SELECT * FROM board_member

-- 게시글 번호 테이블: 회원만 게시글 작성 가능
CREATE TABLE BOARD(
	BOARD_NUM INT AUTO_INCREMENT PRIMARY KEY
	, TITLE VARCHAR(50) NOT NULL
	, CONTENT VARCHAR(100)
	, MEM_ID VARCHAR(50) REFERENCES board_member (MEM_ID)-- 작성자 / 외래키
	, CREATE_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
)
-- 임시 게시글 데이터
INSERT INTO board (TITLE, CONTENT, MEM_ID)
VALUES ('1번글', '1번 내용', 'java')
INSERT INTO board (TITLE, CONTENT, MEM_ID)
VALUES ('2번글', '2번 내용', 'java')
INSERT INTO board (TITLE, CONTENT, MEM_ID)
VALUES ('3번글', '3번 내용', 'admin')
SELECT * FROM board 
-- 댓글 정보 테이블: 회원만 가능, 게시판과의 연결 필요
CREATE TABLE BOARD_REPLY(
	REPLY_NUM INT AUTO_INCREMENT PRIMARY KEY
	, REPLY_CONTENT VARCHAR(50) NOT NULL
	, REPLY_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
	, MEM_ID VARCHAR(50) REFERENCES board_member (MEM_ID)
	, BOARD_NUM INT REFERENCES board(BOARD_NUM)
)

--임시 댓글 데이터
INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글1', 'java', 1)
INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글2', 'java', 2)
INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글3', 'java', 1)
INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글4', 'java', 1)
INSERT INTO board_reply(REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글5', 'java', 2)


-- 데이터 조회 연습
-- 회원의 이름이 김자바인 회원이 작성한 게시글의
-- 글번호, 제목, 작성자 아이디, 작성자 이름  조회, 작성일 기준 최신글부터 조회 내림차순

SELECT BOARD_NUM, TITLE, B.MEM_ID, M.MEM_NAME
FROM board B, board_member M
WHERE B.MEM_ID = M.MEM_ID 
AND M.MEM_NAME = '김자바'
ORDER BY CREATE_DATE DESC

-- 모든 게시글의 글번호, 글 제목, 작성자 및 해당 글에 작성된
-- 댓글의 댓글 내용, 댓글 작성자, 댓글 작성일을 조회
-- 게시글 번호 기준 최신순으로 정렬 후 
-- 같은 게시글에 대한 댓글은 가장 최근에 달린 댓글 순으로 조회
SELECT B.BOARD_NUM, REPLY_CONTENT, B.MEM_ID, REPLY_CONTENT, R.MEM_ID, REPLY_DATE
FROM board B, board_reply R
WHERE B.BOARD_NUM = R.BOARD_NUM
ORDER BY BOARD_NUM DESC, REPLY_NUM DESC

-- 아이디 중복 여부를 확인하는 쿼리
SELECT MEM_ID
FROM board_member
WHERE MEM_ID = 'java'

SELECT * FROM board
SELECT * FROM board_member 
SELECT * FROM board_reply 

-- 아이디가 'java'인 회원이 작성한 게시글의 
-- 글제목, 내용, 작성자id, 작성자명, 작성자 권한조회
SELECT TITLE, CONTENT, B.MEM_ID, M.MEM_ID, M.MEM_NAME, M.MEM_ROLE
FROM board B, board_member M
WHERE B.MEM_ID = M.MEM_ID
AND B.MEM_ID = 'java'

-- 글 번호가 5번 이하인 게시글의 
-- 글 번호, 제목, 글 작성자를 조회하되
-- 글번호 기준 오름차순 정렬
SELECT BOARD_NUM, TITLE, M.MEM_NAME
FROM board B, board_member M
WHERE B.MEM_ID = M.MEM_ID
AND BOARD_NUM <= 31
ORDER BY BOARD_NUM 

-- 1번 게시글의 게시글 제목, 작성자 ID 및
-- 1번 게시글에 작성된 댓글 내용, 댓글 작성자 ID 조회
SELECT TITLE, B.MEM_ID, R.REPLY_CONTENT, R.MEM_ID
FROM board B, board_reply R 
WHERE B.BOARD_NUM = R.BOARD_NUM
AND B.BOARD_NUM =1

-- 1번 게시글의 게시글 제목, 작성자 ID 및
-- 1번 게시글에 작성된 댓글 내용, 댓글 작성자 ID, 댓글 작성자 이름  조회
SELECT TITLE, B.MEM_ID, R.REPLY_CONTENT, R.MEM_ID, M.MEM_NAME
FROM board B, board_reply R, board_member M 
WHERE B.BOARD_NUM = R.BOARD_NUM 
AND R.MEM_ID = M.MEM_ID
AND B.BOARD_NUM =1

-- 게시글 :1,2,3,4 댓글: 1,2

SELECT SALES_NAME, SALES_TEL, SALES_DATE
	, COLOR, MODEL_NAME, PRICE
FROM CAR_INFO C, SALES_INFO Bcar_info
WHERE C.MODEL_NUM = B.MODEL_NUM
sales_infosales_info