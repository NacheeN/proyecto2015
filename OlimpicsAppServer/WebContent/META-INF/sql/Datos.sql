INSERT INTO `roles` (`id`,`rol`) VALUES (1,'Admin');
INSERT INTO `roles` (`id`,`rol`) VALUES (2,'Usuario');
INSERT INTO `roles` (`id`,`rol`) VALUES (3,'Delegacion');
INSERT INTO `roles` (`id`,`rol`) VALUES (4,'Organizador');


INSERT INTO `deportista` (`Id`,`Altura`, `Twitter`, `Edad`, `idDeporte`, `Nombre`, `Peso`, `delegacion_Nick`, `Pais`) VALUES (1, '170', '@Messi', '18', 0, 'Lionel Messi', '67', 0, 0);

INSERT INTO `pais` (`Nombre`,`delegacion_Nick`, `Evento`) VALUES ('Argentina', 'Delegacion Argentina',  0);



INSERT INTO `usuario` (`Nick`, `Password`, `Roles`) VALUES ('Admin', '123', 1);
INSERT INTO `usuario` (`Nick`, `Password`, `Roles`) VALUES ('Renzo', '123', 2);
INSERT INTO `usuario` (`Nick`, `Password`, `Roles`) VALUES ('Delegacion Uruguaya', '123', 3);
INSERT INTO `usuario` (`Nick`, `Password`, `Roles`) VALUES ('Organizador 1', '123', 4);

INSERT INTO `deporte` (`id`,`nombre`) VALUES (1,'Adestramiento Ecuestre');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (2,'Basquetball');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (3,'Canotaje eslalon');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (4,'Ciclismo de ruta');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (5,'F�tbol');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (6,'Golf');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (7,'Lucha Grecorromana');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (8,'Pentatl�n Moderno');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (9,'Salto Ecuestre');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (10,'Tiro');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (11,'Volleyball');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (12,'Aguas abiertas');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (13,'Handball');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (14,'Ciclismo (BMX)');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (15,'Clavados');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (16,'Gimnasia (Trampol�n)');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (17,'Hockey sobre cesped');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (18,'Lucha Libre');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (19,'Polo acu�tico');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (20,'Taekwondo');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (21,'Tiro con Arco');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (22,'Volleyball playa');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (23,'Atletismo');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (24,'Boxeo');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (25,'Ciclismo de monta�a');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (26,'Concurso Completo Ecuestre');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (27,'Gimnasia Art�stica');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (28,'Judo');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (29,'Nado Sincronizado');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (30,'Remo');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (31,'Tennis');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (32,'Triatl�n');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (33,'B�dminton');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (34,'Canotaje de Velocidad');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (35,'Ciclismo de pista');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (36,'Esgrima');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (37,'Gimnasia R�tmica');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (38,'Levantamiento de pesas');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (39,'Nataci�n');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (40,'Rugby');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (41,'Tennis de mesa');
INSERT INTO `deporte` (`id`,`nombre`) VALUES (42,'Vela');