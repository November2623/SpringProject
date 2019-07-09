-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 09, 2019 at 05:09 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlkh`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `customer_name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `more_info` varchar(45) NOT NULL,
  `contract_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `customer_name`, `address`, `phone`, `email`, `more_info`, `contract_date`) VALUES
(1, 'Nguyễn Thị Vân', '18/56 Phan Văn Hớn, Ấp 7, X. Xuân Thới Thượng', '(028) 3620 2220', 'info@tvpfood.com', 'vip', '2018-12-12'),
(4, 'Tran Ngoc Duy', 'Quang Tri', '0982257974', 'tranngocduytxqt98@gmail.com', 'new', '2019-06-28'),
(6, 'NGUYỄN VĂN HIỀN', '115/33 LÊ LỢI, P.6, TP.VŨNG TÀU, BÀ RỊA - VŨN', '(0254) 3.834.307', 'nhatthienhuonglogistics@gmail.com', 'vip', '2019-07-02'),
(7, 'NGUYỄN ĐỨC TÌNH', 'KTT TỈNH ỦY TP.HÀ TĨNH, HÀ TĨNH', '(0254) 3.834.307', 'haphuc.8410@gmail.com', 'vip', '2019-03-02'),
(8, 'HOÀNG THỊ KIM NHUNG', 'F18 B2 KTT VIỆN NHI THỤY ĐIỂN TP. HÀ NỘI', '(024) 37.751.570', 'lthanhvan.act@gmail.com', 'new', '2019-02-26'),
(9, 'NGUYỄN THANH MINH', 'ẤP TÂN NHUẬN, X.NHUẬN PHÚ TÂN, H.MỎ CÀY, BẾN ', '(0275) 3.846.474', 'vp.daitan@gmail.com', 'vip', '2018-02-26'),
(10, 'NGÔ VĂN HẠNH', 'PHÒNG 402 NHÀ B1 TẦNG 4 KTT CTY ĐẠM P.TRẦN NG', '(0204) 3.550.854', 'sinh.dir@toannhat.vn', 'vip', '2019-05-13'),
(11, 'ĐỖ THỊ KIM HÀ', 'G27 hẻm Hùng Vương, phường Xuân Bình, TX Long', '(0251) 3.876.951', 'tranngocvinh@yahoo.com.vn', 'vip', '2017-05-13'),
(12, 'BÙI XUÂN TRƯỜNG', 'LAI CÁC X.QUỲNH LƯU, H.NHO QUAN, NINH BÌNH', ' (0229) 3.846.288', 'csoadong@gmail.com', 'new', '2019-04-16'),
(13, 'ĐỖ THỊ HỒNG', 'XÓM VẢI X.CAO NGẠN, H.ĐỒNG HỶ, THÁI NGUYÊN', '(0208) 3.822.451', 'vantaivohongphat@gmail.com', 'vip', '2019-05-13'),
(14, 'BÙI XUÂN TRƯỜNG', 'LAI CÁC X.QUỲNH LƯU, H.NHO QUAN, NINH BÌNH', ' (0229) 3.846.288', 'csoadong@gmail.com', 'new', '2019-04-16'),
(15, 'NGUYỄN XUÂN HIỂN', 'M6 DÃY M KTT KHO 708 X.LIÊN NINH, H.THANH TRÌ', '(024) 36.860.973', 'lyphugia10@yahoo.com.vn', 'new', '2019-03-30'),
(16, 'NGUYỄN NGỌC THANH', 'XÓM 6B X.CỔ NHUẾ, H.TỪ LIÊM, TP. HÀ NỘI', '(024) 37.550.678', 'xuanhieu@xuanhieugroup.com.vn', 'vip', '2018-03-30'),
(17, 'HẢO ĐÀO VĂN', 'TIỂU KHU 10 P.ĐỒNG PHÚ, TP.ĐỒNG HỚI, QUẢNG BÌ', '(0232) 3.829.418', 'infocp@chanphat.com.vn', 'vip', '2018-06-30'),
(18, 'PHƯƠNG NGỌC ANH', '71/25B Cô Bắc, P.Cô Giang, Q.1, TP.Hồ Chí Min', '(028) 38.379.483', 'thanhlongfwd@hcm.vnn.vn', 'vip', '2016-06-06'),
(20, 'TẤT ANH ', '761/61 Đường 3 Tháng 2, P.6, Q.11, TP.Hồ Chí ', '(028) 38.549.986', 'info@ctctrans.vn', 'vip', '2016-09-30'),
(21, 'DƯƠNG LỆ ÁNH', '61/147 Lê Đức Thọ, P.17, Q.Gò Vấp, TP.Hồ Chí ', '(028) 38.951.016', 'taynambacsg@gmail.com', 'new', '2016-09-05'),
(22, 'HÀ TUÂN ANH ', '77/4 Huỳnh Tịnh Của, P.8, Q.3, TP.Hồ Chí Minh', '(028) 38.203.207', 'info@vantaitoanviet.com', 'vip', '2017-03-30'),
(23, 'LÂM HUỆ ANH ', '107 Lô B CC Hùng Vương P.11, Q.5, TP.Hồ Chí M', '(028) 38.591.600', 'phuthanhphat@ymail.com', 'vip', '2016-10-30'),
(24, 'TIẾT DỤC ANH ', '6/26 Đường 6 CX Bình Thới, P.8, Q.11, TP.Hồ C', '(028) 38.584.564', 'co.ltd.manhdung@gmail.com', 'vip', '2015-08-22'),
(25, 'LÝ THỊ ÁNH NGUYỆT ', '44/17 Yên Đỗ, P.1, Q.Bình Thạnh, TP.Hồ Chí Mi', '(028) 38.416.706', 'vantaingocdung@gmail.com', 'new', '2016-02-13'),
(114, '', '', '', '', '', '0000-00-00');

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `id` int(11) NOT NULL,
  `status` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `product_QR_code` int(6) NOT NULL,
  `amount` int(11) NOT NULL,
  `price_issue` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `date` datetime NOT NULL,
  `id_customer` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`id`, `status`, `product_QR_code`, `amount`, `price_issue`, `price`, `date`, `id_customer`) VALUES
(9, 'Receipt', 9999, 100, 0, 2000000000, '2019-06-28 15:48:48', 1),
(10, 'Receipt', 112234, 100, 0, 2000000000, '2019-06-28 15:50:43', 1),
(11, 'Receipt', 2213, 1000, 0, -1474836480, '2019-06-28 15:52:05', 1),
(12, 'Receipt', 112234, 1000, 0, -1474836480, '2019-06-28 15:55:12', 1),
(13, 'Receipt', 1122339, 10, 0, 3000000, '2019-06-28 15:57:22', 1),
(14, 'Issue', 1122339, 3, 400000, 1200000, '2019-06-28 16:54:44', 4);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `product_name` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `QR_code` int(6) NOT NULL,
  `amount` int(11) NOT NULL,
  `unit` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `price_receipt` int(11) NOT NULL,
  `id_provider` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `product_name`, `QR_code`, `amount`, `unit`, `price_receipt`, `id_provider`) VALUES
(1, 'OTO', 112233, 100, 'boxs', 1000000, 4),
(2, 'Càng cua Hoàng đế Alaska', 11003, 10, 'kg', 5000000, 9),
(3, 'Phô mai', 11004, 30, 'box', 30000, 8),
(4, 'Trứng', 11005, 20, 'box', 25000, 7),
(5, 'Cần tây', 11006, 10, 'kg', 20000, 16),
(6, 'Nấm', 10003, 100, 'box', 30000, 10),
(7, 'Sữa chua', 10004, 50, 'box', 50000, 16),
(8, 'Thịt bò', 10001, 10, 'kg', 113000, 14),
(9, 'Cá hồi Hoang dã', 11001, 20, 'kg', 100000, 14),
(10, 'Bí đao', 11007, 50, 'kg', 15000, 12),
(11, 'Chuối', 10007, 500, 'box', 20000, 10),
(12, 'Dưa chuột', 10005, 100, 'box', 10000, 10),
(13, 'Táo', 11008, 100, 'kg', 50000, 14),
(14, 'Rau diếp', 10000, 10, 'kg', 10000, 11),
(15, 'Kem chua', 50, 60000, 'box', 55000, 11),
(16, 'Đào', 51, 40, 'kg', 50000, 14),
(17, 'Sữa ', 52, 30, 'box', 24000, 9),
(18, 'cám heo', 55, 100, 'kg', 65000, 8),
(19, 'thịt đùi heo', 53, 50, 'kg', 95000, 17),
(20, 'ghế gỗ', 56, 30, 'cái', 300000, 20),
(21, 'bàn là', 57, 10, 'cái', 250000, 9),
(22, 'IphoneX', 114455, 2000, 'tons', 100000, 4),
(23, 'Coke', 9999, 2100, 'boxs', 20000000, 4),
(24, 'Coke', 112234, 1100, 'tons', 20000000, 4),
(25, 'Drink', 2213, 1000, 'boxs', 20000000, 4),
(26, 'Chololate', 1122339, 7, 'boxs', 300000, 4);

-- --------------------------------------------------------

--
-- Table structure for table `provider`
--

CREATE TABLE `provider` (
  `id` int(11) NOT NULL,
  `provider_name` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `more_info` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `contract_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `provider`
--

INSERT INTO `provider` (`id`, `provider_name`, `address`, `phone`, `email`, `more_info`, `contract_date`) VALUES
(4, 'Apple', 'Silicon Valley, USA', '035992', 'apple@gmail.com', 'new device to change the world', '2019-06-28'),
(5, 'Samsung', 'Korea', '0997722', 'samsung@gmail.com', 'buy phone ', '2019-06-28'),
(6, 'CÔNG TY CỔ PHẦN ĐẠI THUẬN', ' Số 42 Củ Chi, P. Vĩnh Hải, Tp. Nha Trang, Khánh Hòa', '(058) 3838252', 'info@daithuan.vn', 'Thực Phẩm Chế Biến, Đóng Gói', '2018-07-25'),
(7, 'CÔNG TY TNHH VẠN PHÁT LONG', ' 54 Hà Huy Tập, P.Thanh Khê Đông, Q.Thanh Khê, Tp. Đà Nẵng', '(0236) 3661302', 'sales@vantaitruongthanhloc.com', 'Thực Phẩm Chế Biến, Đóng Gói', '2017-07-25'),
(8, '\r\nCÔNG TY TNHH DỊCH VỤ PHƯƠNG NGHI', '219 Lô F CC Ngô Gia Tự P.3, Q.10, TP.Hồ Chí Minh', '(028) 38.320.19', 'info@vietau.vn', 'chuyên sản xuất và kinh doanh máy móc công cụ đa năng', '2016-09-25'),
(9, 'CÔNG TY TNHH SẢN XUẤT THƯƠNG MẠI VIỆT MỸ', ' 171/51 Tôn Đản, P.14, Q.4, TP.Hồ Chí Minh', '(028) 38.260.16', 'huonggiangachau@gmail.com', 'Công ty Yến Sào Khánh Hòa ', '2017-02-22'),
(10, 'CÔNG TY TNHH SX TM DV THỰC PHẨM XANH ĐỒNG NAI', '2 Nguyễn Lâm, P.3, Q.Bình Thạnh, TP.Hồ Chí Minh', '(028) 38.415.75', 'smavn@smavn.com', 'Suất ăn Công Nghiệp Thực Phẩm Xanh Đồng Nai  ', '2015-03-22'),
(11, 'CÔNG TY TNHH THƯƠNG MẠI HOA LỢI', '34H Khu 2 Trần Bình Trọng, P.1, Q.10, TP.Hồ Chí Minh', '(028) 38.320.00', 'vantaiduongviet@gmail.com', 'Rau củ quả sạch', '2017-05-02'),
(12, 'CÔNG TY CỔ PHẦN GIAO NHẬN HOÀNG NAM', '76/1 Ngô Thời Nhiệm, P.17, Q.Phú Nhuận, TP.Hồ Chí Minh', '(028) 38.463.03', 'pttrans@pttrans.com.vn', 'Nhà phân phối sàn gỗ cao cấp', '2018-05-02'),
(13, 'CÔNG TY TNHH DỪA ĐỊNH PHÚ MỸ', '137/34 Phan Đình Phùng, P.17, Q.Phú Nhuận, TP.Hồ Chí Minh', '(028) 38.463.08', 'lina@goldenmark.org', 'Các sản phẩm về dừa', '2016-08-11'),
(14, 'CÔNG TY TNHH HẢI LONG', '15/35 Nguyễn Thị Minh Khai, P.Bến Nghé, Q.1, TP.Hồ Chí Minh', '(028) 38.229.93', 'quephan@longphanvn.com', 'Thực Phẩm Chế Biến, Đóng Gói', '0000-00-00'),
(16, '\r\nCÔNG TY CỔ PHẦN LƯƠNG THỰC NAM TRUNG BỘ', '331/38 Lê Văn Sỹ, P.13, Q.3, TP.Hồ Chí Minh', '(028) 38.465.95', 'sales@crownlogisticsvn.com', 'công ty chuyên kinh doanh về các sản phẩm lượng thực, nông sản', '2019-03-12'),
(17, '\r\nCHI NHÁNH - CÔNG TY CỔ PHẦN XÂY DỰNG VÀ THƯƠNG MẠI TỔNG HỢP', '390/1 Nguyễn Kiệm, P.3, Q.Phú Nhuận, TP.Hồ Chí Minh', '(028) 38.462.07', 'acc@delta.com.vn', 'Đồ nhựa', '2019-02-05'),
(18, 'CÔNG TY TNHH THỨC ĂN CHĂN NUÔI THÁI DƯƠNG', '230 Hàn Hải Nguyên, P.9, Q.11, TP.Hồ Chí Minh', '(028) 38.583.65', 'loki@lokilogistics.vn', 'công ty chuyên kinh doanh về các sản phẩm thức ăn chăn nuôi', '2017-03-21'),
(20, 'CÔNG TY TNHH THƯƠNG MẠI THỰC PHẨM TIẾN PHÁT', '72/97/2 Xô Viết Nghệ Tĩnh, P.21, Q.Bình Thạnh, TP.Hồ Chí Minh', '(028) 38.400.80', 'cacakong@yahoo.com', 'Trứng sữa', '2018-12-15');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_history` (`product_QR_code`),
  ADD KEY `FK_Customer` (`id_customer`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `QR_code` (`QR_code`),
  ADD KEY `id_provider_idx` (`id_provider`);

--
-- Indexes for table `provider`
--
ALTER TABLE `provider`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=115;

--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `provider`
--
ALTER TABLE `provider`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `history`
--
ALTER TABLE `history`
  ADD CONSTRAINT `FK_Customer` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `fk_history` FOREIGN KEY (`product_QR_code`) REFERENCES `product` (`QR_code`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `id_provider` FOREIGN KEY (`id_provider`) REFERENCES `provider` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
