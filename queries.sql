-- Part 1: Test it with SQL
id INT
employer VARCHAR
name VARCHAR
skills VARCHAR

-- Part 2: Test it with SQL
SELECT name
FROM employer
where location = "St. Louis";

-- Part 3: Test it with SQL
DROP TABLE job;

-- Part 4: Test it with SQL
SELECT name, description
FROM skill
INNER join job_skills on skill.id = job_skills.skills_id
