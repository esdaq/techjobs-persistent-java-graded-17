--Part 1
# The columns in the table are id (int), employer (varchar(255), skills (varchar(255).
--Part 2
SELECT name FROM employer WHERE location = "St. Louis City";
--Part 3
DROP TABLE job;
--Part 4
SELECT * FROM skill INNER JOIN job_skills
ON skill.id = job_skills.skills_id
ORDER BY name ASC;