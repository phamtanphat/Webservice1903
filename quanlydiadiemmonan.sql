-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2018 at 04:14 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlydiadiemmonan`
--

-- --------------------------------------------------------

--
-- Table structure for table `diadiemmonan`
--

CREATE TABLE `diadiemmonan` (
  `Id` int(11) NOT NULL,
  `Tenmonan` varchar(255) NOT NULL,
  `Giamonan` int(11) NOT NULL,
  `Diadiem` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `diadiemmonan`
--

INSERT INTO `diadiemmonan` (`Id`, `Tenmonan`, `Giamonan`, `Diadiem`) VALUES
(1, 'Cơm sườn', 25000, 'Ngô Quyền , Quận 10'),
(2, 'Bánh xèo', 15000, 'Tô Hiến Thành , Quận 10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `diadiemmonan`
--
ALTER TABLE `diadiemmonan`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `diadiemmonan`
--
ALTER TABLE `diadiemmonan`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
