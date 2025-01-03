-- Drop existing tables if they exist
DROP TABLE IF EXISTS grade CASCADE;
DROP TABLE IF EXISTS registration CASCADE;
DROP TABLE IF EXISTS student CASCADE;
DROP TABLE IF EXISTS module CASCADE;

-- Create the Student table
CREATE TABLE student (
  id INT PRIMARY KEY,
  firstName VARCHAR(30),
  lastName VARCHAR(30),
  username VARCHAR(30),
  email VARCHAR(50)
);

-- Create the Module table
CREATE TABLE module (
  code VARCHAR(10) PRIMARY KEY,
  name VARCHAR(100),
  mnc BOOLEAN
);

-- Create the Grade table
CREATE TABLE grade (
  id SERIAL PRIMARY KEY,
  score INT,
  student_id INT,
  module_code VARCHAR(10),
  FOREIGN KEY (student_id) REFERENCES student (id),
  FOREIGN KEY (module_code) REFERENCES module (code)
);

-- Create the Registration table
CREATE TABLE registration (
  id SERIAL PRIMARY KEY,
  student_id INT,
  module_code VARCHAR(10),
  FOREIGN KEY (student_id) REFERENCES student (id),
  FOREIGN KEY (module_code) REFERENCES module (code)
);
