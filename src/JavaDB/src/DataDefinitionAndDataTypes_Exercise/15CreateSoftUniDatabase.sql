CREATE DATABASE `soft_uni`;
USE `soft_uni`;

CREATE TABLE `towns` (
	`id` INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(30) NOT NULL
  );
  
  CREATE TABLE addresses
  (  
    `id` INT PRIMARY KEY AUTO_INCREMENT ,
    `address_text` VARCHAR(100) not NULL,
    `town_id` INT NOT NULL,
    CONSTRAINT fk_addresses_towns
    FOREIGN KEY (`town_id`) REFERENCES `towns`(`id`)
  );
  
  CREATE TABLE departments
  (
    `id` INT PRIMARY KEY AUTO_INCREMENT ,
    `name` VARCHAR(30) NOT NULL
  );
  
  CREATE TABLE employees
  (
    `id` INT PRIMARY KEY AUTO_INCREMENT ,
    first_name VARCHAR(30) NOT NULL,
    middle_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    job_title VARCHAR(20),
    `salary` DECIMAL (10,2),
    department_id INT,
    hire_date DATE,
    address_id INT,
    CONSTRAINT fk_employees_department
    FOREIGN KEY (`department_id`) REFERENCES `departments`(`id`),
    CONSTRAINT fk_employees_address
	FOREIGN KEY (`address_id`) REFERENCES `addresses`(`id`)

  );
  
  INSERT INTO `towns`(`name`)
  VALUES 
  ('Sofia'),
  ('Plovdiv'),
  ('Varna'),
  ('Burgas');
  
  INSERT INTO `departments`(`name`)
  VALUES
  ('Engineering'),
  ('Sales'),
  ('Marketing'),
  ('Software Development'),
  ('Quality Assurance');
  
  INSERT INTO employees (id, first_name, middle_name, last_name, job_title, department_id, hire_date, salary)
VALUES (1, 'Ivan', 'Ivanov', 'Ivanov', '.NET Developer', 4, '2013-02-01', 3500.00),
	   (2, 'Petar', 'Petrov', 'Petrov', 'Senior Engineer', 1, '2004-03-02', 4000.00),
	   (3, 'Maria', 'Petrova', 'Ivanova', 'Intern', 5, '2016-08-28', 525.25),
	   (4, 'Georgi', 'Terziev', 'Ivanov', 'CEO', 2, '2007-12-09', 3000.00),
	   (5, 'Peter', 'Pan', 'Pan', 'Intern', 3, '2016-08-28', 599.88);
  
  