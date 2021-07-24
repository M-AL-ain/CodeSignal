--------------------------------------------
CREATE PROCEDURE projectList()
BEGIN
	select project_name, team_lead, income
from Projects;
END
--------------------------------------------
--------------------------------------------
CREATE PROCEDURE countriesSelection()
BEGIN
	select
    name, continent, population
    from
    countries
    where continent = 'Africa';
END
--------------------------------------------
--------------------------------------------
CREATE PROCEDURE monthlyScholarships()
BEGIN
	select
    id as id, scholarship/12.0 as scholarship
    from
    scholarships;
END
--------------------------------------------
--------------------------------------------
CREATE PROCEDURE projectsTeam()
BEGIN
	select distinct name
    from projectLog
    order by name asc;
END
--------------------------------------------
--------------------------------------------
CREATE PROCEDURE automaticNotifications()
    SELECT email
    FROM users
    WHERE role not in ("admin", "premium")

    ORDER BY email;
--------------------------------------------
