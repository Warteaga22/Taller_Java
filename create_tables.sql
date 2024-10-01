CREATE TABLE Persona (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    tipo VARCHAR(50)
);

CREATE TABLE Usuario (
    id INT,
    prestamos INT,
    FOREIGN KEY (id) REFERENCES Persona(id)
);

CREATE TABLE Bibliotecario (
    id INT,
    FOREIGN KEY (id) REFERENCES Persona(id)
);

CREATE TABLE Libro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    autor VARCHAR(255),
    isbn VARCHAR(50),
    disponible BOOLEAN
);

CREATE TABLE Prestamo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    libro_id INT,
    usuario_id INT,
    fecha_prestamo DATE,
    fecha_devolucion DATE,
    FOREIGN KEY (libro_id) REFERENCES Libro(id),
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
);
