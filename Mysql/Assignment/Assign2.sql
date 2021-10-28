#1
SELECT DISTINCT
    department_id
FROM
    employees;
    
#2
SELECT 
    *
FROM
    employees
ORDER BY first_name DESC;

#3
SELECT 
    first_name, last_name, salary, ((15 / 100) * salary) PF
FROM
    employees;
    
#4    
SELECT 
    MAX(salary), MIN(salary)
FROM
    employees;
    
    
#5
SELECT 
    COUNT(DISTINCT job_id)
FROM
    employees;
    
#6
SELECT 
    UPPER(first_name)
FROM
    employees;

#7
SELECT 
    first_name, last_name, FORMAT(salary / 12, 2)
FROM
    employees;