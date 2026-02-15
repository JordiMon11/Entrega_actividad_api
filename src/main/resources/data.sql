INSERT INTO COUNTRY(id,name,code) VALUES (1,'Ukraine','UKR');
INSERT INTO COUNTRY(id,name,code) VALUES (2,'Russia','RUS');

INSERT INTO CONFLICT(id,name,start_date,status,description) 
VALUES (1,'Ukraine War','2022-02-24','ACTIVE','War in Ukraine');

INSERT INTO CONFLICT_COUNTRIES(conflict_id,countries_id) VALUES (1,1);
INSERT INTO CONFLICT_COUNTRIES(conflict_id,countries_id) VALUES (1,2);
