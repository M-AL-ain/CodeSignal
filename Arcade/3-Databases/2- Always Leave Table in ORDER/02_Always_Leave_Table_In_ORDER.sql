----------------------------------
----------------------------------
CREATE PROCEDURE volleyballResults()
BEGIN
	select * from results
    order by wins asc;
END
----------------------------------
----------------------------------
----------------------------------
CREATE PROCEDURE mostExpensive()
BEGIN
    select name from Products
    order by price*quantity desc, name asc
    limit 1;
END
----------------------------------
----------------------------------
----------------------------------
CREATE PROCEDURE contestLeaderboard()
BEGIN
	select name  from leaderboard
    order by score desc
    limit 5 offset 3;
END
----------------------------------
----------------------------------
----------------------------------
CREATE PROCEDURE gradeDistribution()
BEGIN
	select Name,ID from Grades
    where (Final > 0.5*(Midterm2+Midterm1)) and (Final > 0.25*(Midterm2+Midterm1+2*Final))
    order by (cast(Name as char(3))), ID;
END
----------------------------------
----------------------------------
----------------------------------
CREATE PROCEDURE mischievousNephews()
BEGIN
	select weekday(mischief_date) as weekday, mischief_date, author, title from mischief
    order by
            weekday asc,
            field(author,'Huey','Dewey','Louie'),
            mischief_date asc,
            title asc;
END
----------------------------------
