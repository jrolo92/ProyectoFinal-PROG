CREATE DATABASE proyecto;
USE proyecto;
CREATE TABLE usuarios (
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Nombre VARCHAR(20),
	Contrasenha VARCHAR(45)
);

CREATE TABLE tareas (
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Descripcion VARCHAR(100),
	NombreCorto VARCHAR(20),
    Estado ENUM('Por hacer', 'En proceso', 'Terminado'),
    Usuario_id INT UNSIGNED,
    FOREIGN KEY (Usuario_id)REFERENCES Usuarios (id)
ON DELETE RESTRICT ON UPDATE CASCADE
);