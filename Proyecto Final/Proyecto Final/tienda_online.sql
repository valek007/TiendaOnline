-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-06-2021 a las 19:17:05
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tienda_online`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `nombres` varchar(30) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `pais` varchar(30) NOT NULL,
  `ciudad` varchar(30) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `codigo_postal` int(10) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `saldo` double NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id_cliente`, `nombres`, `apellidos`, `pais`, `ciudad`, `direccion`, `codigo_postal`, `telefono`, `saldo`) VALUES
(1, 'Maestro', 'Tienda', 'España', 'Palma', 'C/.....', 7000, '612123123', 74),
(2, 'Pedro', 'Gonzalez López', 'España', 'Madrid', 'Plaza España 66', 7213, '6123123123', 100);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `id_usuario` varchar(11) NOT NULL,
  `id_factura` int(11) NOT NULL,
  `total_productos` int(30) NOT NULL,
  `total_precio` double NOT NULL,
  `fecha_factura` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_producto` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `cantidad` int(30) NOT NULL DEFAULT 0,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_producto`, `nombre`, `cantidad`, `precio`) VALUES
(1, 'Destornillador', 100, 9),
(2, 'Martillo', 100, 9.5),
(3, 'Boligrafo Rojo', 50, 1.5),
(4, 'Lápiz Azul', 50, 1),
(5, 'Boligrafo Azul', 50, 1.5),
(6, 'Lápiz Rojo', 50, 1),
(7, 'Regla larga', 50, 2),
(8, 'Cutex Rojo', 40, 1.5),
(9, 'Regla', 50, 2),
(10, 'Cutex Azul', 40, 1.5),
(11, 'Estuche Verde', 40, 5),
(12, 'Mochila Roja', 100, 20),
(13, 'Estuche Rojo', 40, 5),
(14, 'Mochila Azul', 100, 20),
(15, 'Casco Rojo', 10, 15),
(16, 'Casco Azul', 10, 15),
(17, 'Cubo de Basura 50L', 20, 7),
(18, 'Cubo de Basura 30L', 20, 7),
(19, 'Riñonera Roja', 80, 10),
(20, 'Riñonera Azul', 80, 10),
(21, 'Billetera Cuero', 30, 6.5),
(22, 'Billetera Roja', 30, 6.5),
(23, 'Plastelina kit 1', 40, 4),
(24, 'Plastelina kit 2', 40, 4),
(25, 'Bicicleta Deportiva', 5, 100),
(26, 'Muñeca', 60, 25),
(27, 'Bicicleta', 5, 100),
(28, 'Muñeca', 60, 25);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `nick` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nick`, `password`, `email`) VALUES
(1, 'admin', 'admin', 'admin@gmail.com'),
(2, 'pedrito66', '1234', 'pedrito66@gmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`id_factura`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
