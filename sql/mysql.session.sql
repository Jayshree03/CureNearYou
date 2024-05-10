CREATE TABLE patient (
    pid INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    uid INT,
    age INT,
    gender VARCHAR(20),
    FOREIGN KEY (uid) REFERENCES your_referenced_table_name(uid)
);
