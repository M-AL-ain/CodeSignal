------------------------------
----------------------------------
CREATE PROCEDURE studentsInClubs()
    SELECT * FROM students
    WHERE EXISTS (
        SELECT * from clubs where clubs.id = students.club_id
    )
    ORDER BY students.id;
----------------------------------
------------------------------
----------------------------------
CREATE PROCEDURE emptyDepartments()
BEGIN
	select dep_name from departments
    where id not in (select department from employees);
END
----------------------------------
------------------------------
----------------------------------
CREATE PROCEDURE sunnyHolidays()
BEGIN
	select holiday_date as ski_date from holidays as h
    inner join weather as w on h.holiday_date = w.sunny_date;    
END
----------------------------------
------------------------------
----------------------------------
CREATE PROCEDURE closestCells()
BEGIN
	
    select p1.id as id1,
    (select p2.id from positions as p2
    where p1.id <> p2.id
    order by pow((p1.x-p2.x),2)+pow((p1.y-p2.y),2)
    limit 1) as id2 
    from positions as p1;
END
----------------------------------
------------------------------
----------------------------------
CREATE PROCEDURE top5AverageGrade()
BEGIN
	select round(avg(grade),2) as average_grade from (select grade from students
    order by grade desc
    limit 5) as bla;
END
----------------------------------
------------------------------
----------------------------------
CREATE PROCEDURE salaryDifference()
BEGIN
    
    select coalesce(sum(if(salary = (select max(salary) as salary from employees),salary,0)) -
      sum(if(salary = (select min(salary) as salary from employees),salary,0)),0) as difference
    from employees
    order by salary desc;
END
----------------------------------
------------------------------
----------------------------------
CREATE PROCEDURE recentHires()
BEGIN
	select name as names
    from
    (select name, dep from (select name, '1' as dep from pr_department order by date_joined desc limit 5) as pr
    union all
    select name, dep from (select name, '2' as dep from it_department order by date_joined desc limit 5) as it
    union all
    select name, dep from (select name, '3' as dep from sales_department order by date_joined desc limit 5) as sales)
    as all_recent
    order by dep,name;
END
----------------------------------
------------------------------
----------------------------------
CREATE PROCEDURE checkExpenditure()
BEGIN
	select id, if(sum<=value, 0, sum - value) as loss from (select sum(expenditure_sum) as sum,
	id, value from expenditure_plan join allowable_expenditure on week(monday_date,30) >= 
	left_bound and week(monday_date, 30) <= right_bound group by id) as t;
END
----------------------------------
------------------------------
----------------------------------
CREATE PROCEDURE dancingCompetition()
BEGIN
	set @min1 = (select min(first_criterion) from scores);
    set @max1 = (select max(first_criterion) from scores);
    set @min2 = (select min(second_criterion) from scores);
    set @max2 = (select max(second_criterion) from scores);
    set @min3 = (select min(third_criterion) from scores);
    set @max3 = (select max(third_criterion) from scores);
    
    select arbiter_id, first_criterion, second_criterion, third_criterion from scores
    where if(first_criterion in (@min1,@max1),1,0) +
          if(second_criterion in (@min2,@max2),1,0) +
          if(third_criterion in (@min3,@max3),1,0) < 2;
END
----------------------------------
------------------------------
----------------------------------
CREATE PROCEDURE trackingSystem()
BEGIN
	select l_n.anonym_id,l_n.last_null,f_n.first_notnull from
    (select ln.anonym_id as anonym_id,tr.event_name as last_null from tracks tr
    join
      (select anonymous_id as anonym_id,max(received_at)  as rec_at from tracks
      where user_id is null group by anonym_id) ln
    on tr.anonymous_id = ln.anonym_id and ln.rec_at = tr.received_at) as l_n
    left join
      (select ln.anonym_id as anonym_id,tr.event_name as first_notnull from tracks tr
      join
        (select anonymous_id as anonym_id,min(received_at)  as rec_at from tracks
        where user_id is not null group by anonym_id) ln
      on tr.anonymous_id = ln.anonym_id and ln.rec_at = tr.received_at) as f_n
    on l_n.anonym_id = f_n.anonym_id
    order by anonym_id;
END
----------------------------------
------------------------------
----------------------------------
CREATE PROCEDURE storageOptimization()
BEGIN
	select id, 'name' as column_name, name as value from workers_info
    where name is not null
    union
    select id, 'date_of_birth' as column_name, date_of_birth as value from workers_info
    where date_of_birth is not null
    union
    select id, 'salary' as column_name, salary as value from workers_info
    where salary is not null
    order by id, field(column_name,'name','date_of_birth','salary');
END
----------------------------------
------------------------------
----------------------------------
CREATE PROCEDURE consecutiveIds()
BEGIN
	set @newID = 0;

    select id as oldId, @newID := @newID+1 as newId from itemIds;
END
----------------------------------
------------------------------
----------------------------------
CREATE PROCEDURE holidayEvent()
BEGIN
	set @order = 0;

    select distinct winners from (select buyer_name as winners,@order := @order + 1 as ord from purchases) as enum
    where ord / 4 > 0 and ord % 4 = 0
    order by winners;
END
----------------------------------
------------------------------
----------------------------------
CREATE PROCEDURE hostnamesOrdering()
BEGIN
    select id, hostname from hostnames
    group by concat(substring_index(concat('...',hostname),'.',-1),' ',
                    substring_index(concat('...',hostname),'.',-2),' ',hostname);
END
----------------------------------
