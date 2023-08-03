CREATE TABLE Book (
                      ID INT(11) PRIMARY KEY AUTO_INCREMENT,
                      CATEGORY_NAME VARCHAR(100),
                      ISBN VARCHAR(10),
                      TITLE VARCHAR(200),
                      PUBLISHER VARCHAR(100),
                      PRICE DECIMAL(4,2)
);
