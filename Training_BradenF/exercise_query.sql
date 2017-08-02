select * from movie;

/*exercise 1 get diff between min and max rating-COMPLETED*/
select m.title, Max(r.stars)-Min(r.stars) from ace_2017_exe.movie m
left join rating r 
on r.mID = m.mID
group by m.mID
order by m.title;


select 
(select avg(r.stars) from rating r
 join movie m 
on m.mID = r.mID
where m.year < 1980) - 

(select avg(r.stars) from rating r
 join movie m 
on m.mID = r.mID
where m.year > 1980);

/*exercise 3 return all directors that directed more than one movie*/
select m.title, m.director from movie m  where m.director in (select director from Movie m 
group by m.director
having count(director) > 1)
order by m.director, m.title;

select title, director from movie
group by director
having count(director) > 1
order by director, title;

/*exercise 4 find movie with highest avg rating*/
select m.title, avg(r.stars) from movie m
left join rating r 
on r.mID = m.mID
group by m.title
order by m.title;



select m.title, avg(r.stars) avgstars from movie m
left join rating r 
on r.mID = m.mID
group by m.title
having avgstars = 
(select min(avg_stars) 
from (select avg(stars) as avg_stars 
from rating as inner_rating 
group by inner_rating.mID) as other_rating);


select m.title, avg(r.stars) avgstars from movie m
left join rating r 
on r.mID = m.mID
group by m.title
having avgstars = 
(select max(avg_stars) 
from (select avg(stars) as avg_stars 
from rating as inner_rating 
group by inner_rating.mID) as other_rating);




select max(avg_stars) 
from (select avg(stars) as avg_stars 
from rating as inner_rating 
group by inner_rating.mID);

select * from movie join rating;


/*exercise 6 director with their highest reviewed movie*/

select distinct m.director, m.title, max(r.stars) from movie m
left join rating r 
on r.mID = m.mID
where director is not null && r.stars is not null
group by m.director;


/*exercise 7 reviewer is the same as director of movie*/
select rev.name, m.title, r.stars from reviewer rev natural join 
movie m natural join rating r
where rev.name = m.director;

/*exercise 8 all reviewer names  and movie together in alphabeticals*/
select concat(rev.name, ' || ', m.title) from reviewer rev natural join 
movie m natural join rating r
order by name, title;

/*exercise 9 pair reviewers return both reviewers, elim duplicates*/
select distinct rev.name, revi.name from reviewer rev, reviewer revi, rating r, rating rate
where r.mID = rate.mID && rev.name != revi.name &&
rev.rID = r.rID && 
revi.rID = rate.rID && 
rev.name < revi.name
order by rev.name;











/*exercise 10 for each lowest rating in the db*/
select rev.name, m.title, r.stars from reviewer rev natural join 
movie m natural join rating r
where r.stars in (select min(stars) from rating)








