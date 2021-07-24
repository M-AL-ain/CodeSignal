---------------------------
---------------------------
CREATE PROCEDURE countriesInfo()
BEGIN
	select count(name) number, avg(population) average,sum(population) total from countries;
END
---------------------------
---------------------------
---------------------------
CREATE PROCEDURE itemCounts()
BEGIN
	select item_name,item_type, count(item_name) item_count from availableItems
    group by item_name,item_type
    order by item_type,item_name;
END
---------------------------
---------------------------
---------------------------
CREATE PROCEDURE usersByContinent()
BEGIN
	select continent, sum(users) users from countries
    group by continent
    order by sum(users) desc;
END
---------------------------
---------------------------
---------------------------
CREATE PROCEDURE movieDirectors()
BEGIN
	select director from moviesInfo
    where year > 2000
    group by director
    having sum(oscars) > 2
    order by director;
END
---------------------------
---------------------------
---------------------------
CREATE PROCEDURE travelDiary()
BEGIN
	SELECT GROUP_CONCAT(distinct country SEPARATOR ';') countries
    FROM diary
    order by country;
END
---------------------------
---------------------------
---------------------------
CREATE PROCEDURE soccerPlayers()
BEGIN	
    select group_concat(Concat(first_name,' ',surname,' #',player_number) order by player_number separator '; ') players
    from soccer_team;
END
---------------------------
---------------------------
---------------------------
CREATE PROCEDURE marketReport()
BEGIN
	select coalesce(country,'Total:') country, count(competitor) competitors from foreignCompetitors
    group by country with rollup;
END
---------------------------
