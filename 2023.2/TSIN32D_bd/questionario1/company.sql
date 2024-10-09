-- variáveis
\set dbuser 'aluno'
\set dbname 'company'
\set passwd '\''aluno'\''

-- remover banco de dados
DROP DATABASE IF EXISTS :dbname;

-- criar usuário e banco de dados
CREATE USER :dbuser NOSUPERUSER CREATEDB CREATEROLE LOGIN CONNECTION LIMIT -1 PASSWORD :passwd;
CREATE DATABASE :dbname WITH OWNER :dbuser;

-- atribuir de privilegios
GRANT pg_read_server_files TO :dbuser;      -- leitura de arquivos externos
GRANT pg_execute_server_program TO :dbuser; -- exectuar arquivos externos
GRANT pg_write_server_files TO :dbuser;     -- escrita de arquivos

-- conectar a banco de dados
\connect :dbname

SET SESSION AUTHORIZATION :dbuser;
ALTER ROLE :dbuser SET search_path TO public;
SET search_path TO public;

CREATE TABLE employee ( 
    Fname       VARCHAR(10) NOT NULL,
    Minit       CHAR,
    Lname       VARCHAR(20) NOT NULL,
    Ssn         CHAR(9)     NOT NULL,
    Bdate       DATE,
    Address     VARCHAR(30),
    Sex         CHAR(1),
    Salary      DECIMAL(5),
    Super_ssn   CHAR(9),
    Dno         INT         NOT NULL,
    CONSTRAINT employee_pk 
        PRIMARY KEY (Ssn)
);

CREATE TABLE department ( 
    Dname           VARCHAR(15) NOT NULL,
    Dnumber         INT         NOT NULL,
    Mgr_ssn         CHAR(9)     NOT NULL,
    Mgr_start_date  DATE,
    CONSTRAINT department_pk 
        PRIMARY KEY (Dnumber),
    CONSTRAINT dname_uk 
        UNIQUE (Dname),
    CONSTRAINT mgr_ssn_fk 
        FOREIGN KEY (Mgr_ssn) 
        REFERENCES employee (Ssn)
);

CREATE TABLE dept_locations ( 
    Dnumber     INT         NOT NULL,
    Dlocation   VARCHAR(15) NOT NULL,
    CONSTRAINT dept_locations_pk
        PRIMARY KEY (Dnumber, Dlocation),
    CONSTRAINT dnumber_fk 
        FOREIGN KEY (Dnumber) 
        REFERENCES department (Dnumber) 
);

CREATE TABLE project ( 
    Pname       VARCHAR(15) NOT NULL,
    Pnumber     INT         NOT NULL,
    Plocation   VARCHAR(15),
    Dnum        INT         NOT NULL,
    CONSTRAINT project_pk 
        PRIMARY KEY (Pnumber),
    CONSTRAINT pname_uk
        UNIQUE (Pname),
    CONSTRAINT dnum_fk
        FOREIGN KEY (Dnum)
        REFERENCES department (Dnumber)
);

CREATE TABLE works_on ( 
    Essn    CHAR(9)         NOT NULL,
    Pno     INT             NOT NULL,
    Hours   DECIMAL(3,1)    NOT NULL,
    CONSTRAINT works_on_pk 
        PRIMARY KEY (Essn, Pno),
    CONSTRAINT essn_fk 
        FOREIGN KEY (Essn) 
        REFERENCES EMPLOYEE(Ssn),
    CONSTRAINT pno_fk 
        FOREIGN KEY (Pno) 
        REFERENCES project (Pnumber)
);

CREATE TABLE dependent ( 
    Essn            CHAR(9)     NOT NULL,
    Dependent_name  VARCHAR(15) NOT NULL,
    Sex             CHAR,
    Bdate           DATE,
    Relationship    VARCHAR(8),
    CONSTRAINT depedent_pk 
        PRIMARY KEY (Essn, Dependent_name),
    CONSTRAINT essn_fk 
        FOREIGN KEY (Essn) 
        REFERENCES employee (Ssn)
);

INSERT INTO employee
VALUES      ('John','B','Smith',123456789,'1965-01-09','731 Fondren, Houston TX','M',30000,333445555,5),
            ('Franklin','T','Wong',333445555,'1965-12-08','638 Voss, Houston TX','M',40000,888665555,5),
            ('Alicia','J','Zelaya',999887777,'1968-01-19','3321 Castle, Spring TX','F',25000,987654321,4),
            ('Jennifer','S','Wallace',987654321,'1941-06-20','291 Berry, Bellaire TX','F',43000,888665555,4),
            ('Ramesh','K','Narayan',666884444,'1962-09-15','975 Fire Oak, Humble TX','M',38000,333445555,5),
            ('Joyce','A','English',453453453,'1972-07-31','5631 Rice, Houston TX','F',25000,333445555,5),
            ('Ahmad','V','Jabbar',987987987,'1969-03-29','980 Dallas, Houston TX','M',25000,987654321,4),
            ('James','E','Borg',888665555,'1937-11-10','450 Stone, Houston TX','M',55000,null,1);

INSERT INTO department
VALUES      ('Research',5,333445555,'1988-05-22'),
            ('Administration',4,987654321,'1995-01-01'),
            ('Headquarters',1,888665555,'1981-06-19');

INSERT INTO project
VALUES      ('ProductX',1,'Bellaire',5),
            ('ProductY',2,'Sugarland',5),
            ('ProductZ',3,'Houston',5),
            ('Computerization',10,'Stafford',4),
            ('Reorganization',20,'Houston',1),
            ('Newbenefits',30,'Stafford',4);

INSERT INTO works_on
VALUES     (123456789,1,32.5),
           (123456789,2,7.5),
           (666884444,3,40.0),
           (453453453,1,20.0),
           (453453453,2,20.0),
           (333445555,2,10.0),
           (333445555,3,10.0),
           (333445555,10,10.0),
           (333445555,20,10.0),
           (999887777,30,30.0),
           (999887777,10,10.0),
           (987987987,10,35.0),
           (987987987,30,5.0),
           (987654321,30,20.0),
           (987654321,20,15.0),
           (888665555,20,16.0);

INSERT INTO dependent
VALUES      (333445555,'Alice','F','1986-04-04','Daughter'),
            (333445555,'Theodore','M','1983-10-25','Son'),
            (333445555,'Joy','F','1958-05-03','Spouse'),
            (987654321,'Abner','M','1942-02-28','Spouse'),
            (123456789,'Michael','M','1988-01-04','Son'),
            (123456789,'Alice','F','1988-12-30','Daughter'),
            (123456789,'Elizabeth','F','1967-05-05','Spouse');

INSERT INTO dept_locations
VALUES      (1,'Houston'),
            (4,'Stafford'),
            (5,'Bellaire'),
            (5,'Sugarland'),
            (5,'Houston');

ALTER TABLE employee 
    ADD CONSTRAINT super_ssn_fk
        FOREIGN KEY (Super_ssn) REFERENCES employee (Ssn),
    ADD CONSTRAINT dno_fk 
        FOREIGN KEY(Dno) REFERENCES department (Dnumber);
