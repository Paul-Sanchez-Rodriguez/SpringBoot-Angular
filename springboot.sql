
--Permitir ejecucion de script
ALTER SESSION SET "_ORACLE_SCRIPT"=TRUE;


CREATE TABLESPACE SPRINGBOOT
DATAFILE 'SPRINGBOOT.dbf'
SIZE 200M;


-- Crear usuario en TABLESPACE TBSDEMO
CREATE USER DEMO IDENTIFIED BY abc123
DEFAULT TABLESPACE SPRINGBOOT
TEMPORARY TABLESPACE TEMP
QUOTA UNLIMITED ON SPRINGBOOT;

/*privilegios de usuario*/
GRANT CREATE SESSION TO DEMO;
GRANT CREATE TABLE TO DEMO;
GRANT CREATE VIEW TO DEMO;
GRANT CREATE PROCEDURE TO DEMO;
GRANT CREATE TRIGGER TO DEMO;
GRANT CREATE SEQUENCE TO DEMO;
GRANT CREATE JOB TO DEMO;
GRANT UNLIMITED TABLESPACE TO DEMO;
