CREATE TABLE `t_order`
(
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `order_number` varchar(250) NOT NULL,
    `sku_code` varchar(250),
    `price` decimal(20,2),
    `quantity` int(11),
    PRIMARY KEY (`id`)
);