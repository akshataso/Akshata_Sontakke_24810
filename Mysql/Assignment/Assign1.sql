create database schoolMgnt;
use schoolmgnt;

CREATE TABLE student (
    sno INT AUTO_INCREMENT,
    sname VARCHAR(30),
    sclass VARCHAR(10),
    saddr VARCHAR(50),
    tid INT,
    subjectid INT,
    PRIMARY KEY (sno),
    FOREIGN KEY (subjectid)
        REFERENCES subject (sid),
    FOREIGN KEY (tid)
        REFERENCES teacher (tno)
);

drop table  student;

CREATE TABLE teacher (
    tno INT AUTO_INCREMENT,
    tname VARCHAR(20),
    tqual VARCHAR(15),
    texp INT,
    subjectid INT,
    PRIMARY KEY (tno),
    FOREIGN KEY (subjectid)
        REFERENCES subject (sid)
);
drop table teacher;

CREATE TABLE subject (
    sid INT AUTO_INCREMENT,
    subject VARCHAR(15),
    PRIMARY KEY (sid)
);



 insert into subject(subject) values("java");
 
 insert into teacher(tname,tqual,texp,subjectid) values ("Alien Dc","BE",4,1); 
  insert into teacher(tname,tqual,texp,subjectid) values ("Bravo chang","Ph.D",5,2); 
   insert into teacher(tname,tqual,texp,subjectid) values ("Charm De","ME",6,3); 
    insert into teacher(tname,tqual,texp,subjectid) values ("Emi Delta","Msc",7,4); 

    insert into student(sname,sclass,saddr,tid,subjectid) values("ban doc","IT","Mumbai",1,4);
      insert into student(sname,sclass,saddr,tid,subjectid) values("Bravo delie","CS","Pune",2,3);
        insert into student(sname,sclass,saddr,tid,subjectid) values("Charm Delta","Elec","Banglore",3,2);
          insert into student(sname,sclass,saddr,tid,subjectid) values("Foxtrot Golf","AI","Delhi",4,1);
		insert into student(sname,sclass,saddr,tid,subjectid) values("Hotel Index","Ext","Ujjain",4,1);

#
SELECT 
    *
FROM
    teacher
WHERE
    texp
ORDER BY texp
LIMIT 1;

#2
 SELECT 
    *
FROM
    teacher
WHERE
    tqual = 'Ph.D';
 
 
 #3
SELECT 
    s.sname, sub.subject
FROM
    student s
        INNER JOIN
    teacher t ON s.tid = t.tno
        INNER JOIN
    subject sub ON t.subjectid = sub.sid
WHERE
    t.tname LIKE '%Patil%';
    

#4
SELECT 
    t.tname, sub.subject
FROM
    teacher t
        INNER JOIN
    subject sub ON t.subjectid = sub.sid;
    
#5
SELECT 
    s.sname, t.tname
FROM
    student s
        INNER JOIN
    teacher t ON s.tid = t.tno
WHERE
    s.sname LIKE '%Suresh%';
    
#6
SELECT 
    t.tname, COUNT(s.sname)
FROM
    student s
        INNER JOIN
    teacher t ON s.tid = t.tno
GROUP BY s.tid;


