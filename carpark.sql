-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: localhost
-- Üretim Zamanı: 17 May 2017, 19:35:04
-- Sunucu sürümü: 10.1.21-MariaDB
-- PHP Sürümü: 7.0.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `carpark`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `cars`
--

CREATE TABLE `cars` (
  `id` int(11) NOT NULL,
  `plaka` varchar(40) NOT NULL,
  `musteri_adi` varchar(100) NOT NULL,
  `marka_model` varchar(100) NOT NULL,
  `giris_saati` varchar(100) NOT NULL,
  `alan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `cars`
--

INSERT INTO `cars` (`id`, `plaka`, `musteri_adi`, `marka_model`, `giris_saati`, `alan`) VALUES
(1, '34 TR 1923', 'Yiğit Kayalar', 'BMW 5.20', '17/05/2017 20:28', 2),
(2, '34 TJL 443', 'Hasan Kılıç', 'Fiat Linea', '17/05/2017 13:10', 3),
(3, '34 NOR 1244', 'Gizem Erdoğdu', 'Opel Corsa', '17/05/2017 16:55', 4),
(4, '34 AT 2222', 'Mecnun Atay', 'Fiat Doblo', '17/05/2017 18:41', 6),
(5, '34 FB 1907', 'Ali Koç', 'Porche Cayenne', '17/05/2017 19:07', 1),
(6, '34 KHAS 34', 'Kadir Has', 'Mercedes-Maybach S', '16/05/2017 09:20', 10);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `settings`
--

CREATE TABLE `settings` (
  `id` int(11) NOT NULL DEFAULT '1',
  `admin_sifre` varchar(100) NOT NULL,
  `personel_sifre` varchar(100) NOT NULL,
  `saatlik_fiyat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `settings`
--

INSERT INTO `settings` (`id`, `admin_sifre`, `personel_sifre`, `saatlik_fiyat`) VALUES
(1, '123456', '123', '10');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `cars`
--
ALTER TABLE `cars`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `settings`
--
ALTER TABLE `settings`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `cars`
--
ALTER TABLE `cars`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
