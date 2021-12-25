-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 12, 2017 at 12:04 AM
-- Server version: 5.7.9
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `blood`
--

DROP TABLE IF EXISTS `blood`;
CREATE TABLE IF NOT EXISTS `blood` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `DonorId` int(11) NOT NULL,
  `BG` varchar(10) NOT NULL,
  `Quantity` int(5) NOT NULL,
  `CDate` varchar(20) NOT NULL,
  `EDate` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blood`
--

INSERT INTO `blood` (`id`, `DonorId`, `BG`, `Quantity`, `CDate`, `EDate`) VALUES
(3, 1, 'O+', 1, '10-08-2017', '10-09-2017');

-- --------------------------------------------------------

--
-- Table structure for table `camp`
--

DROP TABLE IF EXISTS `camp`;
CREATE TABLE IF NOT EXISTS `camp` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `Venue` varchar(20) NOT NULL,
  `Date` varchar(20) NOT NULL,
  `Time` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `camp`
--

INSERT INTO `camp` (`id`, `Venue`, `Date`, `Time`) VALUES
(2, 'Savar', '10-08-2017', '12:00 PM');

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `id` int(5) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Contact` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Age` int(10) NOT NULL,
  `Sex` varchar(10) NOT NULL,
  `BG` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`id`, `Name`, `Email`, `Contact`, `Address`, `Age`, `Sex`, `BG`) VALUES
(1, 'Ahad', 'a@a.com', '123', 'savar', 20, 'Male', 'O+');

-- --------------------------------------------------------

--
-- Table structure for table `donor`
--

DROP TABLE IF EXISTS `donor`;
CREATE TABLE IF NOT EXISTS `donor` (
  `id` int(5) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Contact` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Age` int(3) NOT NULL,
  `Sex` varchar(10) NOT NULL,
  `BG` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donor`
--

INSERT INTO `donor` (`id`, `Name`, `Email`, `Contact`, `Address`, `Age`, `Sex`, `BG`) VALUES
(1, 'Atik', 'a@a.com', '123', 'gazipur', 20, 'Male', 'O+');

-- --------------------------------------------------------

--
-- Table structure for table `issued`
--

DROP TABLE IF EXISTS `issued`;
CREATE TABLE IF NOT EXISTS `issued` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Date` varchar(50) NOT NULL,
  `PID` int(11) NOT NULL,
  `BG` varchar(10) NOT NULL,
  `Quantity` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `issued`
--

INSERT INTO `issued` (`id`, `Date`, `PID`, `BG`, `Quantity`) VALUES
(3, '12-08-2017', 1, 'O+', 1);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(10) NOT NULL,
  `pass` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `pass`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `requests`
--

DROP TABLE IF EXISTS `requests`;
CREATE TABLE IF NOT EXISTS `requests` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `PID` int(11) NOT NULL,
  `NBG` varchar(10) NOT NULL,
  `Quantity` int(10) NOT NULL,
  `Date` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `requests`
--

INSERT INTO `requests` (`id`, `PID`, `NBG`, `Quantity`, `Date`) VALUES
(2, 1, 'O+', 1, '11-08-2017');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
