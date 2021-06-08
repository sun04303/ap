CREATE DATABASE shopDB;
USE shopDB;
CREATE TABLE memberTBL (
	NO INT PRIMARY KEY AUTO_INCREMENT,
	memberID char(8) NOT NULL,
    memberNAME CHAR(5) NOT NULL,
    memberAddress CHAR(20)
);

INSERT INTO memberTBL (memberID, memberNAME, memberAddress) VALUES
("Dang", "당탕이", "경기 부천시 중동"),
("Jee", "지운이", "서울 은평구 증산동"),
("Han", "한주연", "인천 남구 주안동"),
("Sang", "상길이", "경기 성남시 분당구");

SELECT * FROM memberTBL;

CREATE TABLE productTBL (
	NO INT PRIMARY KEY AUTO_INCREMENT,
    productNAME CHAR(4) NOT NULL,
    cost int NOT NULL,
    makeDate DATE,
    company CHAR(5),
    Amount INT NOT NULL
);

INSERT INTO productTBL (productNAME, cost, makeDate, company, Amount) VALUES
("컴퓨터", 10, "2021-01-01", "삼성", 17),
("세탁기", 20, "2021-09-01", "LG", 3),
("냉장고", 5, "2023-02-01", "대우", 22);

SELECT * FROM productTBL;