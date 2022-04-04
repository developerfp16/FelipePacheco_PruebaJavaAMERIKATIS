-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-04-2022 a las 23:47:50
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 7.4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cursosjavaprueba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursos`
--

CREATE TABLE `cursos` (
  `id_curso` int(11) NOT NULL,
  `costo` double DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `dirigido` varchar(255) DEFAULT NULL,
  `horas` float NOT NULL,
  `modalidad` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `id_modalidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cursos`
--

INSERT INTO `cursos` (`id_curso`, `costo`, `descripcion`, `dirigido`, `horas`, `modalidad`, `nombre`, `id_modalidad`) VALUES
(1, 400000, 'Programacion', 'Novatos', 40, 'Privada', 'Programacion', 1),
(2, 500000, 'Programacion Intermedia', 'Intermedios', 50, 'Online', 'Intermedio', 2),
(3, 1000000, 'Programacion avanzada', 'Senior', 70, 'OnDemand', 'Inteligencia Artificial', 3),
(4, 200000, 'Curso Sobre Marketing', 'Publicistas', 20, 'OnDemand', 'Marketing', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `descuentos`
--

CREATE TABLE `descuentos` (
  `id_descuentos` int(11) NOT NULL,
  `cursod` varchar(255) DEFAULT NULL,
  `descuento` float DEFAULT NULL,
  `fecha_final` date DEFAULT NULL,
  `modalidadd` varchar(255) DEFAULT NULL,
  `nombredescuento` varchar(255) DEFAULT NULL,
  `pais` varchar(255) DEFAULT NULL,
  `cursoid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `descuentos`
--

INSERT INTO `descuentos` (`id_descuentos`, `cursod`, `descuento`, `fecha_final`, `modalidadd`, `nombredescuento`, `pais`, `cursoid`) VALUES
(1, 'Programacion', 10, '2022-04-29', 'Privado', 'Descuento del 10%', 'Colombia', 1),
(2, 'Programacion Intermedia', 20, '2022-04-29', 'Online', 'Descuento del 20%', 'Colombia', 2),
(3, 'Programacion Avanzada', 30, '2022-04-30', 'On-Demand', 'Descuento del 30%', 'Colombia', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modalidades`
--

CREATE TABLE `modalidades` (
  `id_modalidad` int(11) NOT NULL,
  `descripcion_moda` varchar(255) DEFAULT NULL,
  `nombre_modalidad` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `modalidades`
--

INSERT INTO `modalidades` (`id_modalidad`, `descripcion_moda`, `nombre_modalidad`) VALUES
(1, 'Privada', 'Modalidad Privada'),
(2, 'Modalidad Virtual ', 'On-Line'),
(3, 'Modalidad On-Demand', 'On-Demand');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`id_curso`);

--
-- Indices de la tabla `descuentos`
--
ALTER TABLE `descuentos`
  ADD PRIMARY KEY (`id_descuentos`);

--
-- Indices de la tabla `modalidades`
--
ALTER TABLE `modalidades`
  ADD PRIMARY KEY (`id_modalidad`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cursos`
--
ALTER TABLE `cursos`
  MODIFY `id_curso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `descuentos`
--
ALTER TABLE `descuentos`
  MODIFY `id_descuentos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `modalidades`
--
ALTER TABLE `modalidades`
  MODIFY `id_modalidad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
