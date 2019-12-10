CREATE TABLE `expenses` (
  `e_id` int(11) NOT NULL AUTO_INCREMENT,
  `create_date_time` datetime DEFAULT NULL,
  `e_amount` varchar(255) DEFAULT NULL,
  `ec_id` int(11) NOT NULL,
  `update_date_time` datetime DEFAULT NULL,
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

CREATE TABLE `expensescategory` (
  `ec_id` int(11) NOT NULL AUTO_INCREMENT,
  `ec_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ec_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;