DROP TABLE IF EXISTS TASKS;
  
CREATE TABLE TASKS (
  taskId INT AUTO_INCREMENT  PRIMARY KEY,
  taskName VARCHAR(250) NOT NULL,
  taskDescription VARCHAR(250) NOT NULL,
  startDate VARCHAR(250) NOT NULL,
  finishDate VARCHAR(250) NOT NULL
);