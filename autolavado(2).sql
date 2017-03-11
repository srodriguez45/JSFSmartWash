-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 11, 2017 at 06:33 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `autolavado`
--

-- --------------------------------------------------------

--
-- Table structure for table `citas`
--

CREATE TABLE `citas` (
  `id` int(11) NOT NULL,
  `vehiculo_id` int(11) NOT NULL,
  `operarios_id` int(11) NOT NULL,
  `fecha_inicio` datetime NOT NULL COMMENT 'Fecha de inicio de la cita',
  `fecha_finalizacion` datetime NOT NULL COMMENT 'fecha de finalización de la cita',
  `estado` varchar(10) NOT NULL,
  `calificacion` int(1) DEFAULT NULL COMMENT 'valor de 1 a 5, valores enteros\n',
  `comentario` varchar(45) DEFAULT NULL COMMENT 'comentario del servicio\n',
  `fecha_creacion` date NOT NULL,
  `fecha_modificacion` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ciudades`
--

CREATE TABLE `ciudades` (
  `id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `country_code` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ciudades`
--

INSERT INTO `ciudades` (`id`, `name`, `country_code`, `district`) VALUES
(2257, 'Bogotá', 'COL', 'Santafé de Bogotá'),
(2258, 'Cali', 'COL', 'Valle'),
(2259, 'Medellín', 'COL', 'Antioquia'),
(2260, 'Barranquilla', 'COL', 'Atlántico'),
(2261, 'Cartagena', 'COL', 'Bolívar'),
(2262, 'Cúcuta', 'COL', 'Norte de Santander'),
(2263, 'Bucaramanga', 'COL', 'Santander'),
(2264, 'Ibagué', 'COL', 'Tolima'),
(2265, 'Pereira', 'COL', 'Risaralda'),
(2266, 'Santa Marta', 'COL', 'Magdalena'),
(2267, 'Manizales', 'COL', 'Caldas'),
(2268, 'Bello', 'COL', 'Antioquia'),
(2269, 'Pasto', 'COL', 'Nariño'),
(2270, 'Neiva', 'COL', 'Huila'),
(2271, 'Soledad', 'COL', 'Atlántico'),
(2272, 'Armenia', 'COL', 'Quindío'),
(2273, 'Villavicencio', 'COL', 'Meta'),
(2274, 'Soacha', 'COL', 'Cundinamarca'),
(2275, 'Valledupar', 'COL', 'Cesar'),
(2276, 'Montería', 'COL', 'Córdoba'),
(2277, 'Itagüí', 'COL', 'Antioquia'),
(2278, 'Palmira', 'COL', 'Valle'),
(2279, 'Buenaventura', 'COL', 'Valle'),
(2280, 'Floridablanca', 'COL', 'Santander'),
(2281, 'Sincelejo', 'COL', 'Sucre'),
(2282, 'Popayán', 'COL', 'Cauca'),
(2283, 'Barrancabermeja', 'COL', 'Santander'),
(2284, 'Dos Quebradas', 'COL', 'Risaralda'),
(2285, 'Tuluá', 'COL', 'Valle'),
(2286, 'Envigado', 'COL', 'Antioquia'),
(2287, 'Cartago', 'COL', 'Valle'),
(2288, 'Girardot', 'COL', 'Cundinamarca'),
(2289, 'Buga', 'COL', 'Valle'),
(2290, 'Tunja', 'COL', 'Boyacá'),
(2291, 'Florencia', 'COL', 'Caquetá'),
(2292, 'Maicao', 'COL', 'La Guajira'),
(2293, 'Sogamoso', 'COL', 'Boyacá'),
(2294, 'Giron', 'COL', 'Santander');

-- --------------------------------------------------------

--
-- Table structure for table `comisiones`
--

CREATE TABLE `comisiones` (
  `id` int(11) NOT NULL,
  `pago_id` int(11) NOT NULL,
  `valor` varchar(45) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `insumos`
--

CREATE TABLE `insumos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL COMMENT 'nombre del insumo',
  `valor` int(11) NOT NULL COMMENT 'Precio del insumo',
  `tipo_asignacion` enum('Pago','Sin pago') NOT NULL COMMENT 'Tipo de asignación si el insumo es de pago o sin pago',
  `estado` tinyint(1) DEFAULT NULL,
  `fecha_creacion` date DEFAULT NULL,
  `fecha_modificacion` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `insumos_operarios`
--

CREATE TABLE `insumos_operarios` (
  `id` int(11) NOT NULL,
  `insumo_id` int(11) NOT NULL COMMENT '\n',
  `operarios_id` int(11) NOT NULL,
  `fecha_adjunto` date DEFAULT NULL COMMENT 'fecha que se adjuntó el insumo',
  `estado` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marcas`
--

CREATE TABLE `marcas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marcas`
--

INSERT INTO `marcas` (`id`, `nombre`) VALUES
(1, 'Abarth'),
(2, 'Alfa Romeo'),
(3, 'Aro'),
(4, 'Asia'),
(5, 'Asia Motors'),
(6, 'Aston Martin'),
(7, 'Audi'),
(8, 'Austin'),
(9, 'Auverland'),
(10, 'Bentley'),
(11, 'Bertone'),
(12, 'Bmw'),
(13, 'Cadillac'),
(14, 'Chevrolet'),
(15, 'Chrysler'),
(16, 'Citroen'),
(17, 'Corvette'),
(18, 'Dacia'),
(19, 'Daewoo'),
(20, 'Daf'),
(21, 'Daihatsu'),
(22, 'Daimler'),
(23, 'Dodge'),
(24, 'Ferrari'),
(25, 'Fiat'),
(26, 'Ford'),
(27, 'Galloper'),
(28, 'Gmc'),
(29, 'Honda'),
(30, 'Hummer'),
(31, 'Hyundai'),
(32, 'Infiniti'),
(33, 'Innocenti'),
(34, 'Isuzu'),
(35, 'Iveco'),
(36, 'Iveco-pegaso'),
(37, 'Jaguar'),
(38, 'Jeep'),
(39, 'Kia'),
(40, 'Lada'),
(41, 'Lamborghini'),
(42, 'Lancia'),
(43, 'Land-rover'),
(44, 'Ldv'),
(45, 'Lexus'),
(46, 'Lotus'),
(47, 'Mahindra'),
(48, 'Maserati'),
(49, 'Maybach'),
(50, 'Mazda'),
(51, 'Mercedes-benz'),
(52, 'Mg'),
(53, 'Mini'),
(54, 'Mitsubishi'),
(55, 'Morgan'),
(56, 'Nissan'),
(57, 'Opel'),
(58, 'Peugeot'),
(59, 'Pontiac'),
(60, 'Porsche'),
(61, 'Renault'),
(62, 'Rolls-royce'),
(63, 'Rover'),
(64, 'Saab'),
(65, 'Santana'),
(66, 'Seat'),
(67, 'Skoda'),
(68, 'Smart'),
(69, 'Ssangyong'),
(70, 'Subaru'),
(71, 'Suzuki'),
(72, 'Talbot'),
(73, 'Tata'),
(74, 'Toyota'),
(75, 'Umm'),
(76, 'Vaz'),
(77, 'Volkswagen'),
(78, 'Volvo'),
(79, 'Wartburg');

-- --------------------------------------------------------

--
-- Table structure for table `operarios`
--

CREATE TABLE `operarios` (
  `id` int(11) NOT NULL,
  `usuarios_id` int(11) NOT NULL,
  `sueldo` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pagos`
--

CREATE TABLE `pagos` (
  `id` int(11) NOT NULL,
  `cita_id` int(11) NOT NULL,
  `concepto` varchar(45) NOT NULL COMMENT 'Concepto de pago',
  `valor` float NOT NULL COMMENT 'valor de la comisión',
  `iva` int(11) NOT NULL COMMENT 'porcentaje de iva',
  `valor_total` float NOT NULL COMMENT 'Precio con iva incluido',
  `estado` int(11) DEFAULT NULL,
  `fecha_creacion` date DEFAULT NULL,
  `fecha_modificacion` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `permisos`
--

CREATE TABLE `permisos` (
  `id` int(11) NOT NULL,
  `url` varchar(120) NOT NULL COMMENT 'Controlador al que se le asigna el permiso',
  `descripcion` varchar(45) DEFAULT NULL COMMENT 'Comentarios sobre este permiso'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `roles_permisos`
--

CREATE TABLE `roles_permisos` (
  `roles_id` int(11) NOT NULL,
  `controlador_id` int(11) NOT NULL,
  `accion_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `roles_usuarios`
--

CREATE TABLE `roles_usuarios` (
  `roles_id` int(11) NOT NULL,
  `usuarios_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `servicios`
--

CREATE TABLE `servicios` (
  `id` int(11) NOT NULL,
  `id_tipo_vehiculo` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `valor` float UNSIGNED NOT NULL,
  `porcentaje_comision` float UNSIGNED NOT NULL,
  `estado` int(11) NOT NULL,
  `fecha_creacion` date DEFAULT NULL,
  `fecha_modificacion` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `servicios_citas`
--

CREATE TABLE `servicios_citas` (
  `servicios_id` int(11) NOT NULL,
  `citas_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tipos_vehiculos`
--

CREATE TABLE `tipos_vehiculos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tipos_vehiculos`
--

INSERT INTO `tipos_vehiculos` (`id`, `nombre`) VALUES
(1, 'Automovil'),
(8, 'Bus'),
(9, 'Buseta'),
(6, 'Camion'),
(5, 'Camioneta'),
(7, 'Colectivo'),
(10, 'Intermunicipal'),
(4, 'Moto'),
(3, 'Servicio Especial'),
(2, 'taxi');

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `ciudad_id` int(11) NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `tipo_identificacion` enum('CC','CE','TI','RC','NIT') NOT NULL,
  `identificacion` int(11) NOT NULL,
  `email` varchar(45) NOT NULL,
  `contrasena` varchar(60) NOT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` int(10) NOT NULL,
  `barrio` varchar(45) DEFAULT NULL,
  `sexo` enum('Hombre','Mujer','Otro') NOT NULL,
  `token` varchar(60) DEFAULT NULL COMMENT 'Valor de caracteres para el cambio de contraseña de forma segura',
  `terminos_condiciones` tinyint(1) NOT NULL COMMENT 'Valor para aceptar terminos y condiciones',
  `estado` tinyint(1) NOT NULL,
  `fecha_creacion` date NOT NULL,
  `fecha_modificacion` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`id`, `ciudad_id`, `nombres`, `apellidos`, `tipo_identificacion`, `identificacion`, `email`, `contrasena`, `direccion`, `telefono`, `barrio`, `sexo`, `token`, `terminos_condiciones`, `estado`, `fecha_creacion`, `fecha_modificacion`) VALUES
(1, 2257, 'Programador', 'Smartwash', 'CC', 10000, 'info@smartwash.com', '123456', 'Calle falsa 123', 7000000, 'Chapinero', 'Hombre', NULL, 1, 1, '2017-02-24', '2017-02-24'),
(3, 2257, 'Steven', 'Rodriguez', 'CC', 101542487, 'srodriguez45@misena.edu.co', '123456', 'Calle falsa 123', 3587542, 'Engativa', 'Hombre', NULL, 1, 1, '2017-02-24', '2017-02-24'),
(4, 2257, 'Miguel', 'Bermudez', 'CC', 1542478420, 'miguel.aki@misena.edu.co', '123456', 'Calle falsa 123', 7845417, 'Teusaquillo', 'Hombre', NULL, 1, 1, '2017-02-24', '2017-02-24'),
(5, 2257, 'Laura', 'Rodriguez', 'CC', 1000514477, 'lrodriguez@hotmail.edu.co', '123456', 'Calle falsa 123', 3587542, 'Mata tigres', 'Mujer', NULL, 1, 1, '2017-02-24', '2017-02-24'),
(6, 2257, 'Sarah', 'Wilches', 'CC', 1004751241, 'sara-whilces@hotmail.com', '123456', 'Calle falsa 123', 7854214, 'Fontibón', 'Mujer', NULL, 1, 1, '2017-02-24', '2017-02-24');

-- --------------------------------------------------------

--
-- Table structure for table `usuarios_conductores`
--

CREATE TABLE `usuarios_conductores` (
  `usuarios_id` int(11) NOT NULL,
  `vehiculos_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `vehiculos`
--

CREATE TABLE `vehiculos` (
  `id` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  `marca_id` int(11) NOT NULL,
  `tipo_vehiculo_id` int(11) NOT NULL,
  `placa` char(6) DEFAULT NULL,
  `modelo` year(4) DEFAULT NULL COMMENT 'Año en que salió el vehículo',
  `color` varchar(12) DEFAULT NULL,
  `estado` varchar(45) NOT NULL,
  `observaciones` text COMMENT 'descripción de como ingresa el vehículo al establecimiento',
  `fecha_creacion` date DEFAULT NULL,
  `fecha_modificacion` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_citas_vehiculos1_idx` (`vehiculo_id`),
  ADD KEY `fk_citas_operarios1_idx` (`operarios_id`);

--
-- Indexes for table `ciudades`
--
ALTER TABLE `ciudades`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `comisiones`
--
ALTER TABLE `comisiones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_comisiones_pagos1_idx` (`pago_id`);

--
-- Indexes for table `insumos`
--
ALTER TABLE `insumos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `insumos_operarios`
--
ALTER TABLE `insumos_operarios`
  ADD PRIMARY KEY (`id`,`insumo_id`,`operarios_id`),
  ADD KEY `fk_insumos_has_usuarios_insumos1_idx` (`insumo_id`),
  ADD KEY `fk_insumos_usuarios_operarios1_idx` (`operarios_id`);

--
-- Indexes for table `marcas`
--
ALTER TABLE `marcas`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nombre_UNIQUE` (`nombre`);

--
-- Indexes for table `operarios`
--
ALTER TABLE `operarios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_operarios_usuarios1_idx` (`usuarios_id`);

--
-- Indexes for table `pagos`
--
ALTER TABLE `pagos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_pagos_citas1_idx` (`cita_id`);

--
-- Indexes for table `permisos`
--
ALTER TABLE `permisos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nombre_UNIQUE` (`nombre`);

--
-- Indexes for table `roles_permisos`
--
ALTER TABLE `roles_permisos`
  ADD KEY `fk_roles_has_permisos_permisos1_idx` (`controlador_id`),
  ADD KEY `fk_roles_has_permisos_roles1_idx` (`roles_id`);

--
-- Indexes for table `roles_usuarios`
--
ALTER TABLE `roles_usuarios`
  ADD PRIMARY KEY (`roles_id`,`usuarios_id`),
  ADD KEY `fk_roles_has_usuarios_usuarios1_idx` (`usuarios_id`),
  ADD KEY `fk_roles_has_usuarios_roles1_idx` (`roles_id`);

--
-- Indexes for table `servicios`
--
ALTER TABLE `servicios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_servicios_tipos_vehiculos1_idx` (`id_tipo_vehiculo`);

--
-- Indexes for table `servicios_citas`
--
ALTER TABLE `servicios_citas`
  ADD PRIMARY KEY (`servicios_id`,`citas_id`),
  ADD KEY `fk_servicios_has_citas_citas1_idx` (`citas_id`),
  ADD KEY `fk_servicios_has_citas_servicios1_idx` (`servicios_id`);

--
-- Indexes for table `tipos_vehiculos`
--
ALTER TABLE `tipos_vehiculos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nombre_UNIQUE` (`nombre`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email_UNIQUE` (`email`),
  ADD KEY `fk_usuarios_ciudades1_idx` (`ciudad_id`);

--
-- Indexes for table `usuarios_conductores`
--
ALTER TABLE `usuarios_conductores`
  ADD PRIMARY KEY (`usuarios_id`,`vehiculos_id`),
  ADD KEY `fk_usuarios_has_vehiculos_vehiculos1_idx` (`vehiculos_id`),
  ADD KEY `fk_usuarios_has_vehiculos_usuarios1_idx` (`usuarios_id`);

--
-- Indexes for table `vehiculos`
--
ALTER TABLE `vehiculos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_vehiculos_usuarios` (`usuario_id`),
  ADD KEY `fk_vehiculos_marcas` (`marca_id`),
  ADD KEY `fk_vehiculos_tipos_vehiculos1_idx` (`tipo_vehiculo_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `citas`
--
ALTER TABLE `citas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `ciudades`
--
ALTER TABLE `ciudades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2295;
--
-- AUTO_INCREMENT for table `comisiones`
--
ALTER TABLE `comisiones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `insumos`
--
ALTER TABLE `insumos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `insumos_operarios`
--
ALTER TABLE `insumos_operarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `marcas`
--
ALTER TABLE `marcas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=80;
--
-- AUTO_INCREMENT for table `operarios`
--
ALTER TABLE `operarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `pagos`
--
ALTER TABLE `pagos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `permisos`
--
ALTER TABLE `permisos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `servicios`
--
ALTER TABLE `servicios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tipos_vehiculos`
--
ALTER TABLE `tipos_vehiculos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `vehiculos`
--
ALTER TABLE `vehiculos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `fk_citas_operarios1` FOREIGN KEY (`operarios_id`) REFERENCES `operarios` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_citas_vehiculos` FOREIGN KEY (`vehiculo_id`) REFERENCES `vehiculos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `comisiones`
--
ALTER TABLE `comisiones`
  ADD CONSTRAINT `fk_comisiones_pagos` FOREIGN KEY (`pago_id`) REFERENCES `pagos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `insumos_operarios`
--
ALTER TABLE `insumos_operarios`
  ADD CONSTRAINT `fk_insumos_usuarios` FOREIGN KEY (`insumo_id`) REFERENCES `insumos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_insumos_usuarios_operarios1` FOREIGN KEY (`operarios_id`) REFERENCES `operarios` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `operarios`
--
ALTER TABLE `operarios`
  ADD CONSTRAINT `fk_operarios_usuarios1` FOREIGN KEY (`usuarios_id`) REFERENCES `usuarios` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `pagos`
--
ALTER TABLE `pagos`
  ADD CONSTRAINT `fk_pagos_citas` FOREIGN KEY (`cita_id`) REFERENCES `citas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `roles_permisos`
--
ALTER TABLE `roles_permisos`
  ADD CONSTRAINT `fk_roles_has_permisos_permisos1` FOREIGN KEY (`controlador_id`) REFERENCES `permisos` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_roles_permisos` FOREIGN KEY (`roles_id`) REFERENCES `roles` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `roles_usuarios`
--
ALTER TABLE `roles_usuarios`
  ADD CONSTRAINT `fk_roles_has_usuarios_roles1` FOREIGN KEY (`roles_id`) REFERENCES `roles` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_roles_has_usuarios_usuarios1` FOREIGN KEY (`usuarios_id`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `servicios`
--
ALTER TABLE `servicios`
  ADD CONSTRAINT `fk_servicios_tipos_vehiculos1` FOREIGN KEY (`id_tipo_vehiculo`) REFERENCES `tipos_vehiculos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `servicios_citas`
--
ALTER TABLE `servicios_citas`
  ADD CONSTRAINT `fk_servicios_has_citas_citas1` FOREIGN KEY (`citas_id`) REFERENCES `citas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_servicios_has_citas_servicios1` FOREIGN KEY (`servicios_id`) REFERENCES `servicios` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `fk_usuarios_ciudades1` FOREIGN KEY (`ciudad_id`) REFERENCES `ciudades` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `usuarios_conductores`
--
ALTER TABLE `usuarios_conductores`
  ADD CONSTRAINT `fk_usuarios_has_vehiculos_usuarios1` FOREIGN KEY (`usuarios_id`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_usuarios_has_vehiculos_vehiculos1` FOREIGN KEY (`vehiculos_id`) REFERENCES `vehiculos` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `vehiculos`
--
ALTER TABLE `vehiculos`
  ADD CONSTRAINT `fk_vehiculos_marcas` FOREIGN KEY (`marca_id`) REFERENCES `marcas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vehiculos_tipos_vehiculos1` FOREIGN KEY (`tipo_vehiculo_id`) REFERENCES `tipos_vehiculos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vehiculos_usuarios` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
