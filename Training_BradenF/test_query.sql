SELECT * FROM studentdb.student_tbl;


INSERT INTO student_tbl
VALUES (33, "Braden Filler", 3.3, 1000);

INSERT INTO student_tblcoillege_tbl
VALUES (5, "Jen Sebastian", 3.5, 1500);

INSERT INTO student_tbl
VALUES (3, "Cherie Parson", 3.8, 2000);

INSERT INTO student_tbl
VALUES (38, "Will Cortes", 3.3, 1000);

INSERT INTO student_tbl
VALUES (31, "Chris Harlow", 3.7, 800);

ALTER TABLE college_tbl
  RENAME COLUMN CNAme_PK TO CName;

select * from college_tbl;
INSERT INTO college_tbl
VALUES ('Neumont University', "Utah", false);

INSERT INTO college_tbl
VALUES ('Some College', "Arizona", true);

INSERT INTO college_tbl
VALUES ('Some Other College', "Utah", true);

select * from apply_tbl

INSERT INTO apply_tbl
VALUES (7, "Some College", 'Eng Lit', 'no');
INSERT INTO apply_tbl
VALUES (11, "Some Other College", 'Comp Eng', 'yes');
INSERT INTO apply_tbl
VALUES (33, "College", 'Comp Sci', 'yes');

select * from apply_tbl;

ALTER TABLE applye_tbl
  alter column decision binary NOT NULL




select * from student_tbl as student join college_tbl as collegee join apply_tbl as apply
or apply.cname_pk = college.cname_pk and apply.sid_pk = student.sid_pk;

select * from student_tbl as student right outer join apply_tbl as apply right outer join college_tbl as college
on apply.SID_PK = student.SId_PK;

use studentdb
View: need sID, collegeName. Condition: selected for CS.


CREATE VIEW Accept_view AS SELECT sid_pk, cname_pk FROM apply_tbl where major_pk = 'Comp Sci';
select * from accept_view;
drop view accept_view;


CREATE VIEW low_gpa_accept_view AS SELECT student_tbl.sid_pk, cname_pk, SName FROM apply_tbl join student_tbl where gpa < 3.7 && cname_pk = 'College' && major_pk = 'Comp Sci';
select * from low_gpa_accept_view








