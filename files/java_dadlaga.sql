-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2019 at 07:30 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_dadlaga`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `uname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `upass` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `uname`, `upass`, `email`) VALUES
(1, 'admin', '123', 'admin@gmail.com'),
(2, 'ariuka', '123', 'ariuka@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `aguulah`
--

CREATE TABLE `aguulah` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `too` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  `irsen_date` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `duusah_date` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `aguulah`
--

INSERT INTO `aguulah` (`id`, `name`, `too`, `price`, `cid`, `irsen_date`, `duusah_date`) VALUES
(1, 'хрустик бичээн', 80, 1000, 2, '2017-06-29', '2017-06-30'),
(2, 'Kontik', 900, 10000, 2, '2017-06-29', '2017-06-30'),
(3, 'Holding the Dream', 50, 5500, 5, '2017-07-01', '2017-07-31'),
(4, 'Love by Degree', 15, 15000, 5, '2017-07-01', '2017-07-01');

-- --------------------------------------------------------

--
-- Table structure for table `baraa`
--

CREATE TABLE `baraa` (
  `id` int(11) NOT NULL,
  `sid` int(11) NOT NULL,
  `aid` int(11) NOT NULL,
  `btoo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `baraa`
--

INSERT INTO `baraa` (`id`, `sid`, `aid`, `btoo`) VALUES
(1, 2, 1, 20),
(2, 4, 2, 100);

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`id`, `name`) VALUES
(2, 'Бичээн'),
(3, 'Jacobs'),
(4, 'Alpen Gold'),
(5, 'Books');

-- --------------------------------------------------------

--
-- Table structure for table `shops`
--

CREATE TABLE `shops` (
  `id` int(11) NOT NULL,
  `sname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `address` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `shops`
--

INSERT INTO `shops` (`id`, `sname`, `address`) VALUES
(2, 'Улсын их дэлгүүр', 'Чингэлтэй дүүрэг, 3-р хороо, Энхтайваны өргөн чөлөө-25'),
(4, 'Оргил төв салбар', 'Баянгол дүүрэг, 13-р хороо, Ард Аюушийн өргөн чөлөө, 3-р хорооллын эцэс, Оргил худалдааны төв'),
(5, 'Номин их дэлгүүр', 'Баянгол дүүрэг, 14-р хороо, Энэбишийн өргөн чөлөө'),
(6, 'Номин Юнайтед Их Дэлгүүр', 'Хан-Уул дүүрэг Чингисийн өргөн чөлөө'),
(7, 'Номин Хайпермаркет Скайтаун', 'Баянзүрх, Энхтайвны өргөн чөлөө-89 1-2 давхарт'),
(8, 'Номин Хайпермаркет Юнайтед', 'Хан-Уул дүүрэг, Чингисийн өргөн чөлөө, Номин Юнайтед'),
(9, 'Номин Хайпермаркет Өнөр хороолол', 'СХД, 20-р хороо, Москвагийн гудамж, Өнөр хороолол'),
(10, 'Номин Хайпермаркет Андууд', 'БГД, 2-р хороо, Энхтайваны өргөн чөлөө, ТБД андууд дэлгүүр');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `aguulah`
--
ALTER TABLE `aguulah`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cid` (`cid`);

--
-- Indexes for table `baraa`
--
ALTER TABLE `baraa`
  ADD PRIMARY KEY (`id`),
  ADD KEY `sid` (`sid`,`aid`),
  ADD KEY `aid` (`aid`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `shops`
--
ALTER TABLE `shops`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `aguulah`
--
ALTER TABLE `aguulah`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `baraa`
--
ALTER TABLE `baraa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `shops`
--
ALTER TABLE `shops`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `aguulah`
--
ALTER TABLE `aguulah`
  ADD CONSTRAINT `aguulah_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `categories` (`id`);

--
-- Constraints for table `baraa`
--
ALTER TABLE `baraa`
  ADD CONSTRAINT `baraa_ibfk_1` FOREIGN KEY (`aid`) REFERENCES `aguulah` (`id`),
  ADD CONSTRAINT `baraa_ibfk_2` FOREIGN KEY (`sid`) REFERENCES `shops` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
