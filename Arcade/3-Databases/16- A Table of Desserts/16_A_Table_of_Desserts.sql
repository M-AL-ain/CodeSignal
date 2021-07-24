-----------------------------------------------------------------
-----------------------------------------------------------------
-----------------------------------------------------------------
CREATE PROCEDURE driversInfo()
BEGIN
        select summary from
    (
            select '' as id, concat( ' Total miles driven by all drivers combined: ', sum(miles_logged)) as summary
            from inspections
            group by inspection_id is not null
            union
            select driver_name as id,
                concat(' Name: ',driver_name,
                   '; number of inspections: ',count(driver_name),
                   '; miles driven: ',sum(miles_logged)) as summary
            from inspections
            group by driver_name
            union
            select driver_name as id,
                    concat ('  date: ',date,'; miles covered: ',miles_logged) as summary
            from inspections
    ) as log_summary
        order by id,if(summary like '%Name%',0,1),summary asc;
END
-----------------------------------------------------------------
-----------------------------------------------------------------
-----------------------------------------------------------------
CREATE PROCEDURE sortBookChapters()
BEGIN
        select chapter_name
        from book_chapters
        order by 
        (length(chapter_number)-length(replace(chapter_number,'I','')))*1 +
        (length(chapter_number)-length(replace(chapter_number,'V','')))*5 +
        (length(chapter_number)-length(replace(chapter_number,'X','')))*10 +
        (length(chapter_number)-length(replace(chapter_number,'L','')))*50 +
        (length(chapter_number)-length(replace(chapter_number,'C','')))*100 +
        (length(chapter_number)-length(replace(chapter_number,'D','')))*500 +
        (length(chapter_number)-length(replace(chapter_number,'M','')))*1000 -
        if(chapter_number like '%IX%' or chapter_number like'%IV%',2,0) -
        if(chapter_number like '%XC%' or chapter_number like '%XL%',20,0) -
        if(chapter_number like '%CD%' or chapter_number like'%CM%',200,0) ;
END
-----------------------------------------------------------------
-----------------------------------------------------------------
-----------------------------------------------------------------
CREATE PROCEDURE typeInheritance()
BEGIN
    SET @first := true;
    WHILE row_count() OR @first DO
        SET @first := false;
        UPDATE inheritance a
        JOIN inheritance b ON a.base = b.derived AND a.base != "Number"
        SET a.base = b.base;
    END WHILE;

    SELECT var_name, type AS var_type
    FROM variables JOIN inheritance ON type = derived
    WHERE base = "Number"
    ORDER BY var_name;
END
-----------------------------------------------------------------
-----------------------------------------------------------------
-----------------------------------------------------------------
/*Please add ; after each select statement*/
CREATE PROCEDURE battleshipGameResults()
BEGIN
    select size, sum(undamaged) undamaged, sum(partly_damaged) partly_damaged, sum(sunk) sunk from (
    select id, damage, size,
    case when damage = 0 then 1 else 0 end undamaged,
    case when damage > 0 and damage < size then 1 else 0 end partly_damaged,
    case when damage = size then 1 else 0 end sunk
    from (
    select id,
    (
        select count(*) from opponents_shots o
        where o.target_x >= s.upper_left_x and o.target_x <= s.bottom_right_x
        and o.target_y >= s.upper_left_y and o.target_y <= s.bottom_right_y
    ) damage,
    (s.bottom_right_x - s.upper_left_x + s.bottom_right_y - s.upper_left_y + 1) size
    from locations_of_ships s
    ) r
    ) tmp
    group by size
    order by size;
END
-----------------------------------------------------------------
-----------------------------------------------------------------
-----------------------------------------------------------------
/*Please add ; after each select statement*/
CREATE PROCEDURE tictactoeTournament()
BEGIN
     select n name,
            a + b - c points,
            a played,
            b won,
            a - b - c draw,
            c lost
         from (select if(x, name_naughts, name_crosses) n,
                      sum(1) a,
                      sum(if(x, w, l)) b,
                      sum(if(x, l, w)) c
                  from (select *,
                               board rlike "O...O...O|O..O..O|^..O.O.O|^(...)*OOO" w,
                               board rlike "X...X...X|X..X..X|^..X.X.X|^(...)*XXX" l
                            from results,
                                 (select 0 x union select 1) z
                       ) y
                  group by 1
              ) x
         order by 2 desc, 3, won desc, 1;

END
-----------------------------------------------------------------
