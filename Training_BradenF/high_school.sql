use high_school_assignment;

create table Highschooler_tbl(ID int primary key, name varchar(50), grade int);
create table Friend_tbl(ID1 int, ID2 int, primary key(ID1, ID2), foreign key (ID1) references Highschooler_tbl(ID), foreign key (ID2) references Highschooler_tbl(ID) on delete cascade);
create table Likes_tbl(ID1 int, ID2 int, primary key(ID1, ID2), foreign key (ID1) references Highschooler_tbl(ID), foreign key (ID2) references Highschooler_tbl(ID) on delete cascade);


insert into Highschooler_tbl values(1, 'Jordan', 9);
insert into Highschooler_tbl values(2, 'Gabriel', 9);
insert into Highschooler_tbl values(3, 'Tiffany', 9);
insert into Highschooler_tbl values(4, 'Cassandra', 9);

insert into Highschooler_tbl values(5, 'Kris', 10);
insert into Highschooler_tbl values(6, 'Haley', 10);
insert into Highschooler_tbl values(7, 'Andrew', 10);
insert into Highschooler_tbl values(8, 'Brittany', 10);

insert into Highschooler_tbl values(9, 'Alexis', 11);
insert into Highschooler_tbl values(10, 'Austin', 11);
insert into Highschooler_tbl values(11, 'Gabriel', 11);
insert into Highschooler_tbl values(12, 'Jessica', 11);

insert into Highschooler_tbl values(13, 'Jordan', 12);
insert into Highschooler_tbl values(14, 'John', 12);
insert into Highschooler_tbl values(15, 'Kyle', 12);
insert into Highschooler_tbl values(16, 'Logan', 12);

INSERT INTO Friend_tbl VALUES(1, 2);
INSERT INTO Friend_tbl VALUES(2, 1);

INSERT INTO Friend_tbl VALUES(1, 3);
INSERT INTO Friend_tbl VALUES(3, 1);

INSERT INTO Friend_tbl VALUES(4, 2);
INSERT INTO Friend_tbl VALUES(2, 4);

INSERT INTO Friend_tbl VALUES(7, 2);
INSERT INTO Friend_tbl VALUES(2, 7);

INSERT INTO Friend_tbl VALUES(5, 7);
INSERT INTO Friend_tbl VALUES(7, 5);

INSERT INTO Friend_tbl VALUES(5, 6);
INSERT INTO Friend_tbl VALUES(6, 5);

INSERT INTO Friend_tbl VALUES(5, 8);
INSERT INTO Friend_tbl VALUES(8, 5);

INSERT INTO Friend_tbl VALUES(6, 8);
INSERT INTO Friend_tbl VALUES(8, 6);

INSERT INTO Friend_tbl VALUES(3, 9);
INSERT INTO Friend_tbl VALUES(9, 3);

INSERT INTO Friend_tbl VALUES(4, 9);
INSERT INTO Friend_tbl VALUES(9, 4);

INSERT INTO Friend_tbl VALUES(9, 11);
INSERT INTO Friend_tbl VALUES(11, 9);

INSERT INTO Friend_tbl VALUES(9, 12);
INSERT INTO Friend_tbl VALUES(12, 9);

INSERT INTO Friend_tbl VALUES(11, 12);
INSERT INTO Friend_tbl VALUES(12, 11);

INSERT INTO Friend_tbl VALUES(7, 10);
INSERT INTO Friend_tbl VALUES(10, 7);

INSERT INTO Friend_tbl VALUES(10, 15);
INSERT INTO Friend_tbl VALUES(15, 10);

INSERT INTO Friend_tbl VALUES(13, 15);
INSERT INTO Friend_tbl VALUES(15, 13);

INSERT INTO Friend_tbl VALUES(13, 16);
INSERT INTO Friend_tbl VALUES(16, 13);

INSERT INTO Friend_tbl VALUES(14, 16);
INSERT INTO Friend_tbl VALUES(16, 14);


INSERT INTO Friend_tbl VALUES(12, 15);
INSERT INTO Friend_tbl VALUES(15, 12);


INSERT INTO Friend_tbl VALUES(7, 13);
INSERT INTO Friend_tbl VALUES(13, 7);

INSERT INTO Likes_tbl VALUES(4, 2);
INSERT INTO Likes_tbl VALUES(2, 4);
INSERT INTO Likes_tbl VALUES(9, 5);
INSERT INTO Likes_tbl VALUES(11, 9);
INSERT INTO Likes_tbl VALUES(7, 4);
INSERT INTO Likes_tbl VALUES(8, 5);
INSERT INTO Likes_tbl VALUES(14, 6);
INSERT INTO Likes_tbl VALUES(10, 13);
INSERT INTO Likes_tbl VALUES(12, 15);
INSERT INTO Likes_tbl VALUES(15, 12);



/*mysql> CREATE TRIGGER ins_transaction BEFORE INSERT ON account
       FOR EACH ROW PRECEDES ins_sum
       SET
       @deposits = @deposits + IF(NEW.amount>0,NEW.amount,0),
       @withdrawals = @withdrawals + IF(NEW.amount<0,-NEW.amount,0);
Query OK, 0 rows affected (0.01 sec)


CREATE TRIGGER likes_friendly AFTER INSERT ON highschooler_tbl as highschooler

       FOR EACH ROW
       BEGIN
           IF New.name = 'Friendly'
               SET NEW.amount = 0;
           ELSEIF NEW.amount > 100 THEN
               SET NEW.amount = 100;
           END IF;
       END

(select * from highscooler_tbl as selHighSchooler
when selHighSchooler.grade = highschooler.grade) */

select name, grade from Highschooler_tbl as student
where ID Not in (select id1 from likes_tbl) && ID NOT IN (Select id2 from likes_tbl)
group by name
order by grade, name;

/*exercise 2*/


select distinct hs1.name, hs2.name from highschooler_tbl hs1, highschooler_tbl hs2, friend_tbl friend, likes_tbl likes
where hs1.name != hs2.name && 
hs1.ID = likes.ID1 && 
(hs1.ID != friend.ID1 && hs1.ID != friend.ID2) && (hs2.ID != friend.ID1 && hs2.ID != friend.ID2);



where hs1.ID != friend.ID1 || hs1.ID != friend.ID2 && (hs2.ID != friend.ID1 || hs2.ID != friend.ID2)
&& hs1.ID = likes.ID1 || hs1.ID = likes.ID2 && (hs2.ID = likes.ID1 || hs2.ID = likes.ID2)
&& hs1.name != hs2.name;


/*exercise 3*/

select (count(*) - count(distinct name)) from highschooler_tbl;

/*exercise 4 avg friends per student*/



select (select count(*) from friend_tbl) / (select count(hs.ID) from highschooler_tbl hs) as averageperstudent;


/*exercise 5 find friends of cassandra or friends of friends of cassandra*/
 /*select(Select ID1 from friend_tbl where ID2 =  
((select ID from highschooler_tbl as hs
where hs.name = 'Cassandra'))) as cassandraFriends;*/
/*check for id2 if they are friends with id1*/

SELECT count(*) FROM friend_tbl
WHERE ID1 IN (SELECT ID2 FROM friend_tbl WHERE ID2 IN 
			(SELECT ID2 FROM friend_tbl WHERE ID1 = (select ID from highschooler_tbl where name = 'Cassandra')))

/*exercise 6 find the name and grade of students with the greatest number of friends*/


/*select name, grade from highschooler_tbl 
where (select count(*) from friend_tbl where ID = ID1) = (select max((select count(*) from friend_tbl where ID = ID1)) from highschooler_tbl);

*/





/*======================================================*/
/*exercise 1*/
DELIMITER //
CREATE TRIGGER F 
AFTER INSERT ON Highschooler_tbl 
for each row
BEGIN 
    if new.name ='Friendly'
    then
    INSERT INTO Likes SELECT new.id, h.id FROM highschooler_tbl as h
    WHERE new.grade = h.grade AND NOT (new.id=h.id);
    end if;
END ; //
DELIMITER ;

/*exercise 2*/
DELIMITER //
CREATE TRIGGER CHECKGRADE
BEFORE INSERT ON Highschooler_tbl 
for each row
BEGIN 
    if new.grade > 12
	then
	set new.grade = null;
	ELSEIF new.grade < 9
    then
	set new.grade = null;
	ELSEIF new.grade = null
	then
	set new.grade = 9;
    end if;
END ; //
DELIMITER ;

/*exercise 3*/
DELIMITER //
CREATE TRIGGER CHECKGRADUATION
AFTER UPDATE ON Highschooler_tbl 
for each row
BEGIN 
    if new.grade > 12
	then
	DELETE from highschooler_tbl
	WHERE new.ID = ID;
    end if;
END ; //
DELIMITER ;

drop trigger CHECKGRADUATION

UPDATE highschooler_tbl SET grade = 13
WHERE id = 16
select * from highschooler_tbl
/*exercise 4*/

DELIMITER //
CREATE TRIGGER FRIENDSHIPLOGIC
AFTER DELETE ON friend_tbl 
for each row
BEGIN 
	DELETE from friend_tbl
	WHERE new.ID1 = ID2 && new.ID2 = ID1;
END ; //
DELIMITER ;

DELIMITER //
CREATE TRIGGER FRIENDSHIPLOGIC
AFTER UPDATE ON friend_tbl 
for each row
BEGIN 
	Insert into friend_tbl (new.ID2, new.ID1)
END ; //
DELIMITER ;

/*exercise 5*/

DELIMITER //
CREATE TRIGGER CHECKGRADUATIONANDPROMOTEFRIENDS
AFTER UPDATE ON Highschooler_tbl 
for each row
BEGIN 
    if new.grade > 12
	then
	if new.ID = friend.ID1
	Update highschooler_tbl set grade = grade+1
	where ID = friend.ID2
	DELETE from highschooler_tbl
	WHERE new.ID = ID;
    end if;
END ; //
DELIMITER ;

/*exercise 6*/


DELIMITER //
CREATE TRIGGER CHECKGRADUATIONANDPROMOTEFRIENDS
AFTER UPDATE ON likes_tbl 
for each row
BEGIN 
    if new.ID1 = (select Id1 from friend_tbl where ID1 = new.ID1)
	then
	if new.ID = friend.ID1
	Update highschooler_tbl set grade = grade+1
	where ID = friend.ID2
	DELETE from highschooler_tbl
	WHERE new.ID = ID;
    end if;
END ; //
DELIMITER ;
