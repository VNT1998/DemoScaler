ALTER TABLE product
    ADD qty INT NULL;

ALTER TABLE product
    MODIFY qty INT NOT NULL;

ALTER TABLE jt_instructor
DROP
COLUMN specilaistion;

ALTER TABLE mps_instructor
DROP
COLUMN specilaistion;

ALTER TABLE st_user
DROP
COLUMN specilaistion;

ALTER TABLE st_user
    MODIFY avg_rating INT NOT NULL;

ALTER TABLE st_user
    MODIFY dtype VARCHAR (31) NULL;