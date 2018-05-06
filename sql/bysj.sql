/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MariaDB
 Source Server Version : 50556
 Source Host           : localhost:3306
 Source Schema         : bysj

 Target Server Type    : MariaDB
 Target Server Version : 50556
 File Encoding         : 65001

 Date: 06/05/2018 17:22:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dic_classroom
-- ----------------------------
DROP TABLE IF EXISTS `dic_classroom`;
CREATE TABLE `dic_classroom`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地点',
  `floorPie` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '楼号',
  `seatCount` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '座位总数',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dic_classroom
-- ----------------------------
INSERT INTO `dic_classroom` VALUES ('1', 'B4－309(国教院）', '蕴韬B座', '68', NULL);
INSERT INTO `dic_classroom` VALUES ('10', 'B合十六', '蕴韬B座', '71', NULL);
INSERT INTO `dic_classroom` VALUES ('100', 'E-604', '文科综合楼', '81', NULL);
INSERT INTO `dic_classroom` VALUES ('101', 'E-502', '文科综合楼', '57', NULL);
INSERT INTO `dic_classroom` VALUES ('102', 'E-506', '文科综合楼', '80', NULL);
INSERT INTO `dic_classroom` VALUES ('103', 'E-412', '文科综合楼', '65', NULL);
INSERT INTO `dic_classroom` VALUES ('104', 'E-402', '文科综合楼', '56', NULL);
INSERT INTO `dic_classroom` VALUES ('105', 'E-610', '文科综合楼', '61', NULL);
INSERT INTO `dic_classroom` VALUES ('106', '文科综合楼803', '文科综合楼', '70', NULL);
INSERT INTO `dic_classroom` VALUES ('107', 'E-209', '文科综合楼', '53', NULL);
INSERT INTO `dic_classroom` VALUES ('108', 'E-309', '文科综合楼', '74', NULL);
INSERT INTO `dic_classroom` VALUES ('109', '文科综合楼827', '文科综合楼', '78', NULL);
INSERT INTO `dic_classroom` VALUES ('11', 'B2-304', '蕴韬B座', '52', NULL);
INSERT INTO `dic_classroom` VALUES ('110', 'E-508', '文科综合楼', '69', NULL);
INSERT INTO `dic_classroom` VALUES ('111', '文科综合楼804', '文科综合楼', '73', NULL);
INSERT INTO `dic_classroom` VALUES ('112', '文科综合楼806', '文科综合楼', '53', NULL);
INSERT INTO `dic_classroom` VALUES ('113', 'E-823', '文科综合楼', '85', NULL);
INSERT INTO `dic_classroom` VALUES ('114', '文科综合楼823', '文科综合楼', '62', NULL);
INSERT INTO `dic_classroom` VALUES ('115', 'ＥＲＰ沙盘模拟实验室（E-1015）', '文科综合楼', '65', NULL);
INSERT INTO `dic_classroom` VALUES ('116', '文科综合楼807', '文科综合楼', '69', NULL);
INSERT INTO `dic_classroom` VALUES ('117', '旅游信息化实验室925', '文科综合楼', '75', NULL);
INSERT INTO `dic_classroom` VALUES ('118', 'D-309机房', '启智D座', '66', NULL);
INSERT INTO `dic_classroom` VALUES ('119', '计算机应用实验室(1)D-201', '启智D座', '66', NULL);
INSERT INTO `dic_classroom` VALUES ('12', 'A合四', '蕴韬B座', '74', NULL);
INSERT INTO `dic_classroom` VALUES ('120', '数学建模实验室D-301', '启智D座', '71', NULL);
INSERT INTO `dic_classroom` VALUES ('121', '数字媒体实验室(1)D-110', '启智D座', '51', NULL);
INSERT INTO `dic_classroom` VALUES ('122', '微格实验室3(D-414)', '启智D座', '77', NULL);
INSERT INTO `dic_classroom` VALUES ('123', '计算机基础实验室(4)D-108', '启智D座', '60', NULL);
INSERT INTO `dic_classroom` VALUES ('124', '数字媒体实验室(2)D-312', '启智D座', '77', NULL);
INSERT INTO `dic_classroom` VALUES ('125', 'D-107机房', '启智D座', '67', NULL);
INSERT INTO `dic_classroom` VALUES ('126', 'D111机房', '启智D座', '59', NULL);
INSERT INTO `dic_classroom` VALUES ('127', '语音实验室2（D-506）', '启智D座', '83', NULL);
INSERT INTO `dic_classroom` VALUES ('128', 'C-403', '启智C座', '69', NULL);
INSERT INTO `dic_classroom` VALUES ('129', 'C-203', '启智C座', '62', NULL);
INSERT INTO `dic_classroom` VALUES ('13', 'B合十七', '蕴韬B座', '68', NULL);
INSERT INTO `dic_classroom` VALUES ('130', 'C-401', '启智C座', '62', NULL);
INSERT INTO `dic_classroom` VALUES ('131', 'C-303', '启智C座', '61', NULL);
INSERT INTO `dic_classroom` VALUES ('132', 'C-309', '启智C座', '51', NULL);
INSERT INTO `dic_classroom` VALUES ('133', 'C-301', '启智C座', '54', NULL);
INSERT INTO `dic_classroom` VALUES ('134', 'C-207', '启智C座', '73', NULL);
INSERT INTO `dic_classroom` VALUES ('135', 'C-503', '启智C座', '69', NULL);
INSERT INTO `dic_classroom` VALUES ('136', 'C-402', '启智C座', '56', NULL);
INSERT INTO `dic_classroom` VALUES ('137', 'C-101', '启智C座', '53', NULL);
INSERT INTO `dic_classroom` VALUES ('138', 'C-405', '启智C座', '78', NULL);
INSERT INTO `dic_classroom` VALUES ('139', 'C-208', '启智C座', '55', NULL);
INSERT INTO `dic_classroom` VALUES ('14', 'B3－201', '蕴韬B座', '70', NULL);
INSERT INTO `dic_classroom` VALUES ('140', 'C-306', '启智C座', '77', NULL);
INSERT INTO `dic_classroom` VALUES ('141', 'C-505', '启智C座', '71', NULL);
INSERT INTO `dic_classroom` VALUES ('142', 'C-202', '启智C座', '74', NULL);
INSERT INTO `dic_classroom` VALUES ('143', 'C-104', '启智C座', '74', NULL);
INSERT INTO `dic_classroom` VALUES ('144', 'C-305', '启智C座', '71', NULL);
INSERT INTO `dic_classroom` VALUES ('145', 'C-506', '启智C座', '60', NULL);
INSERT INTO `dic_classroom` VALUES ('146', 'C-201', '启智C座', '58', NULL);
INSERT INTO `dic_classroom` VALUES ('147', 'C-105', '启智C座', '84', NULL);
INSERT INTO `dic_classroom` VALUES ('148', 'C-102', '启智C座', '65', NULL);
INSERT INTO `dic_classroom` VALUES ('149', 'C-501', '启智C座', '62', NULL);
INSERT INTO `dic_classroom` VALUES ('15', 'B3－205', '蕴韬B座', '67', NULL);
INSERT INTO `dic_classroom` VALUES ('150', 'C-204', '启智C座', '65', NULL);
INSERT INTO `dic_classroom` VALUES ('151', 'C-406', '启智C座', '59', NULL);
INSERT INTO `dic_classroom` VALUES ('152', 'C-307', '启智C座', '70', NULL);
INSERT INTO `dic_classroom` VALUES ('153', 'C-308', '启智C座', '68', NULL);
INSERT INTO `dic_classroom` VALUES ('154', 'C-103', '启智C座', '85', NULL);
INSERT INTO `dic_classroom` VALUES ('155', 'C-302', '启智C座', '83', NULL);
INSERT INTO `dic_classroom` VALUES ('156', 'C-107', '启智C座', '53', NULL);
INSERT INTO `dic_classroom` VALUES ('157', 'C-304', '启智C座', '56', NULL);
INSERT INTO `dic_classroom` VALUES ('158', 'C-205', '启智C座', '79', NULL);
INSERT INTO `dic_classroom` VALUES ('159', 'C-106', '启智C座', '62', NULL);
INSERT INTO `dic_classroom` VALUES ('16', 'B合十八', '蕴韬B座', '77', NULL);
INSERT INTO `dic_classroom` VALUES ('160', 'C-206', '启智C座', '58', NULL);
INSERT INTO `dic_classroom` VALUES ('161', 'C-504', '启智C座', '51', NULL);
INSERT INTO `dic_classroom` VALUES ('162', 'C-407', '启智C座', '85', NULL);
INSERT INTO `dic_classroom` VALUES ('163', 'C-502', '启智C座', '71', NULL);
INSERT INTO `dic_classroom` VALUES ('164', 'C-404', '启智C座', '73', NULL);
INSERT INTO `dic_classroom` VALUES ('165', 'C-209', '启智C座', '66', NULL);
INSERT INTO `dic_classroom` VALUES ('166', '电力系统实验室323', '理综电信', '65', NULL);
INSERT INTO `dic_classroom` VALUES ('167', '继电保护实验室315', '理综电信', '61', NULL);
INSERT INTO `dic_classroom` VALUES ('168', '电工电路实验室826', '理综电信', '65', NULL);
INSERT INTO `dic_classroom` VALUES ('169', 'PLC实验室620', '理综电信', '77', NULL);
INSERT INTO `dic_classroom` VALUES ('17', 'B2-303', '蕴韬B座', '52', NULL);
INSERT INTO `dic_classroom` VALUES ('170', '机械原理实验室722', '理综电信', '58', NULL);
INSERT INTO `dic_classroom` VALUES ('171', '通信与信息系统实验室516', '理综电信', '62', NULL);
INSERT INTO `dic_classroom` VALUES ('172', '数电实验室421', '理综电信', '75', NULL);
INSERT INTO `dic_classroom` VALUES ('173', '电力电子与电机拖动实验室415', '理综电信', '65', NULL);
INSERT INTO `dic_classroom` VALUES ('174', '理综规划室330', '理综电信', '50', NULL);
INSERT INTO `dic_classroom` VALUES ('175', 'DSP实验室611', '理综电信', '51', NULL);
INSERT INTO `dic_classroom` VALUES ('176', '智能信息工程实验室522', '理综电信', '78', NULL);
INSERT INTO `dic_classroom` VALUES ('177', '传感器实验室614', '理综电信', '78', NULL);
INSERT INTO `dic_classroom` VALUES ('178', '单片机实验室622', '理综电信', '73', NULL);
INSERT INTO `dic_classroom` VALUES ('179', '过程控制实验室629', '理综电信', '84', NULL);
INSERT INTO `dic_classroom` VALUES ('18', 'A合十四', '蕴韬B座', '68', NULL);
INSERT INTO `dic_classroom` VALUES ('180', '模电实验室408', '理综电信', '75', NULL);
INSERT INTO `dic_classroom` VALUES ('181', '电力电子与电机拖动实验室326', '理综电信', '70', NULL);
INSERT INTO `dic_classroom` VALUES ('182', '无人机展示室（理综-106）', '理综城环', '75', NULL);
INSERT INTO `dic_classroom` VALUES ('183', '理综规划室529', '理综城环', '83', NULL);
INSERT INTO `dic_classroom` VALUES ('184', '理综画室329', '理综城环', '70', NULL);
INSERT INTO `dic_classroom` VALUES ('185', '理综制图室403', '理综城环', '52', NULL);
INSERT INTO `dic_classroom` VALUES ('186', '理综生物实验室531', '理综城环', '74', NULL);
INSERT INTO `dic_classroom` VALUES ('187', '信工611', '计科楼', '62', NULL);
INSERT INTO `dic_classroom` VALUES ('188', '信工606', '计科楼', '60', NULL);
INSERT INTO `dic_classroom` VALUES ('189', '信工104', '计科楼', '57', NULL);
INSERT INTO `dic_classroom` VALUES ('19', 'B合四', '蕴韬B座', '79', NULL);
INSERT INTO `dic_classroom` VALUES ('190', '计科物联网实验室507', '计科楼', '67', NULL);
INSERT INTO `dic_classroom` VALUES ('2', 'B4－308（国教院）', '蕴韬B座', '65', NULL);
INSERT INTO `dic_classroom` VALUES ('20', 'B3－107', '蕴韬B座', '85', NULL);
INSERT INTO `dic_classroom` VALUES ('21', 'B合十五', '蕴韬B座', '78', NULL);
INSERT INTO `dic_classroom` VALUES ('22', 'B合五', '蕴韬B座', '69', NULL);
INSERT INTO `dic_classroom` VALUES ('23', 'B4－307（国教院）', '蕴韬B座', '68', NULL);
INSERT INTO `dic_classroom` VALUES ('24', 'B3－203', '蕴韬B座', '51', NULL);
INSERT INTO `dic_classroom` VALUES ('25', 'B2-302', '蕴韬B座', '67', NULL);
INSERT INTO `dic_classroom` VALUES ('26', '电子政务人力资源实验室B3-403', '蕴韬B座', '61', NULL);
INSERT INTO `dic_classroom` VALUES ('27', '电子商务模拟实验室B3-405', '蕴韬B座', '53', NULL);
INSERT INTO `dic_classroom` VALUES ('28', 'B3－204', '蕴韬B座', '82', NULL);
INSERT INTO `dic_classroom` VALUES ('29', 'B合十九', '蕴韬B座', '81', NULL);
INSERT INTO `dic_classroom` VALUES ('3', 'B4－505', '蕴韬B座', '62', NULL);
INSERT INTO `dic_classroom` VALUES ('30', 'B3－202', '蕴韬B座', '61', NULL);
INSERT INTO `dic_classroom` VALUES ('31', 'B3－208', '蕴韬B座', '76', NULL);
INSERT INTO `dic_classroom` VALUES ('32', 'B4－506', '蕴韬B座', '73', NULL);
INSERT INTO `dic_classroom` VALUES ('33', 'B合六', '蕴韬B座', '85', NULL);
INSERT INTO `dic_classroom` VALUES ('34', 'B合十三', '蕴韬B座', '56', NULL);
INSERT INTO `dic_classroom` VALUES ('35', 'B3－105', '蕴韬B座', '82', NULL);
INSERT INTO `dic_classroom` VALUES ('36', 'B合十四', '蕴韬B座', '51', NULL);
INSERT INTO `dic_classroom` VALUES ('37', 'B3－104', '蕴韬B座', '59', NULL);
INSERT INTO `dic_classroom` VALUES ('38', 'B4－207', '蕴韬B座', '67', NULL);
INSERT INTO `dic_classroom` VALUES ('39', 'B4-209', '蕴韬B座', '84', NULL);
INSERT INTO `dic_classroom` VALUES ('4', 'B3－207', '蕴韬B座', '58', NULL);
INSERT INTO `dic_classroom` VALUES ('40', 'B2-305', '蕴韬B座', '56', NULL);
INSERT INTO `dic_classroom` VALUES ('41', 'B合二十', '蕴韬B座', '50', NULL);
INSERT INTO `dic_classroom` VALUES ('42', 'B3－206', '蕴韬B座', '54', NULL);
INSERT INTO `dic_classroom` VALUES ('43', '语音实验室6(B3-406)', '蕴韬B座', '54', NULL);
INSERT INTO `dic_classroom` VALUES ('44', 'B4－402', '蕴韬B座', '77', NULL);
INSERT INTO `dic_classroom` VALUES ('45', '计算机应用实验室(7)B4-208', '蕴韬B座', '53', NULL);
INSERT INTO `dic_classroom` VALUES ('46', '口译实验室B3-402', '蕴韬B座', '71', NULL);
INSERT INTO `dic_classroom` VALUES ('47', 'B4－303（国教院）', '蕴韬B座', '67', NULL);
INSERT INTO `dic_classroom` VALUES ('48', '计算机应用实验室(4)B4-203', '蕴韬B座', '78', NULL);
INSERT INTO `dic_classroom` VALUES ('49', 'A合九', '蕴韬A座', '51', NULL);
INSERT INTO `dic_classroom` VALUES ('5', 'B3－103', '蕴韬B座', '82', NULL);
INSERT INTO `dic_classroom` VALUES ('50', 'A合五', '蕴韬A座', '84', NULL);
INSERT INTO `dic_classroom` VALUES ('51', 'A合十九', '蕴韬A座', '65', NULL);
INSERT INTO `dic_classroom` VALUES ('52', 'A合十八', '蕴韬A座', '62', NULL);
INSERT INTO `dic_classroom` VALUES ('53', 'A2-405', '蕴韬A座', '57', NULL);
INSERT INTO `dic_classroom` VALUES ('54', 'A合十七', '蕴韬A座', '51', NULL);
INSERT INTO `dic_classroom` VALUES ('55', 'A合十三', '蕴韬A座', '55', NULL);
INSERT INTO `dic_classroom` VALUES ('56', 'A合八', '蕴韬A座', '66', NULL);
INSERT INTO `dic_classroom` VALUES ('57', 'A3-406心理咨询实验室', '蕴韬A座', '55', NULL);
INSERT INTO `dic_classroom` VALUES ('58', '411画室', '艺术美术', '77', NULL);
INSERT INTO `dic_classroom` VALUES ('59', '311画室', '艺术美术', '84', NULL);
INSERT INTO `dic_classroom` VALUES ('6', '计算机应用实验室(2)B4-201', '蕴韬B座', '71', NULL);
INSERT INTO `dic_classroom` VALUES ('60', '402画室', '艺术美术', '62', NULL);
INSERT INTO `dic_classroom` VALUES ('61', '416画室', '艺术美术', '62', NULL);
INSERT INTO `dic_classroom` VALUES ('62', '412画室', '艺术美术', '85', NULL);
INSERT INTO `dic_classroom` VALUES ('63', '艺术楼-108', '艺术美术', '65', NULL);
INSERT INTO `dic_classroom` VALUES ('64', '艺术楼-112', '艺术美术', '80', NULL);
INSERT INTO `dic_classroom` VALUES ('65', '艺术楼-104', '艺术美术', '62', NULL);
INSERT INTO `dic_classroom` VALUES ('66', '移动电子商务实验室E1012', '文科综合楼', '68', NULL);
INSERT INTO `dic_classroom` VALUES ('67', 'E-112', '文科综合楼', '83', NULL);
INSERT INTO `dic_classroom` VALUES ('68', 'E-316', '文科综合楼', '65', NULL);
INSERT INTO `dic_classroom` VALUES ('69', 'E-206', '文科综合楼', '67', NULL);
INSERT INTO `dic_classroom` VALUES ('7', 'B4－304（国教院）', '蕴韬B座', '55', NULL);
INSERT INTO `dic_classroom` VALUES ('70', 'E-408', '文科综合楼', '77', NULL);
INSERT INTO `dic_classroom` VALUES ('71', 'E-418', '文科综合楼', '83', NULL);
INSERT INTO `dic_classroom` VALUES ('72', 'E-308', '文科综合楼', '74', NULL);
INSERT INTO `dic_classroom` VALUES ('73', 'E-204', '文科综合楼', '64', NULL);
INSERT INTO `dic_classroom` VALUES ('74', '文科综合楼805', '文科综合楼', '65', NULL);
INSERT INTO `dic_classroom` VALUES ('75', 'E-318', '文科综合楼', '70', NULL);
INSERT INTO `dic_classroom` VALUES ('76', 'E-406', '文科综合楼', '74', NULL);
INSERT INTO `dic_classroom` VALUES ('77', 'E-614', '文科综合楼', '81', NULL);
INSERT INTO `dic_classroom` VALUES ('78', 'E-208', '文科综合楼', '75', NULL);
INSERT INTO `dic_classroom` VALUES ('79', 'E-409', '文科综合楼', '66', NULL);
INSERT INTO `dic_classroom` VALUES ('8', 'B4－306（国教院）', '蕴韬B座', '81', NULL);
INSERT INTO `dic_classroom` VALUES ('80', 'E-312', '文科综合楼', '85', NULL);
INSERT INTO `dic_classroom` VALUES ('81', 'E-404', '文科综合楼', '52', NULL);
INSERT INTO `dic_classroom` VALUES ('82', 'E-304', '文科综合楼', '79', NULL);
INSERT INTO `dic_classroom` VALUES ('83', 'E-416', '文科综合楼', '70', NULL);
INSERT INTO `dic_classroom` VALUES ('84', 'E-116', '文科综合楼', '54', NULL);
INSERT INTO `dic_classroom` VALUES ('85', 'E-212', '文科综合楼', '64', NULL);
INSERT INTO `dic_classroom` VALUES ('86', 'E-202', '文科综合楼', '65', NULL);
INSERT INTO `dic_classroom` VALUES ('87', 'E-602', '文科综合楼', '70', NULL);
INSERT INTO `dic_classroom` VALUES ('88', 'E-102', '文科综合楼', '62', NULL);
INSERT INTO `dic_classroom` VALUES ('89', 'E-108', '文科综合楼', '71', NULL);
INSERT INTO `dic_classroom` VALUES ('9', 'B4－305（国教院）', '蕴韬B座', '64', NULL);
INSERT INTO `dic_classroom` VALUES ('90', 'E-104', '文科综合楼', '55', NULL);
INSERT INTO `dic_classroom` VALUES ('91', 'E-606', '文科综合楼', '55', NULL);
INSERT INTO `dic_classroom` VALUES ('92', 'E-109', '文科综合楼', '85', NULL);
INSERT INTO `dic_classroom` VALUES ('93', 'E-504', '文科综合楼', '53', NULL);
INSERT INTO `dic_classroom` VALUES ('94', 'E-216', '文科综合楼', '56', NULL);
INSERT INTO `dic_classroom` VALUES ('95', 'E-306', '文科综合楼', '60', NULL);
INSERT INTO `dic_classroom` VALUES ('96', 'E-118', '文科综合楼', '72', NULL);
INSERT INTO `dic_classroom` VALUES ('97', 'E-510', '文科综合楼', '53', NULL);
INSERT INTO `dic_classroom` VALUES ('98', 'E-608', '文科综合楼', '58', NULL);
INSERT INTO `dic_classroom` VALUES ('99', 'E-514', '文科综合楼', '68', NULL);

-- ----------------------------
-- Table structure for dic_coursetype
-- ----------------------------
DROP TABLE IF EXISTS `dic_coursetype`;
CREATE TABLE `dic_coursetype`  (
  `id` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `courseType` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程类型',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dic_coursetype
-- ----------------------------
INSERT INTO `dic_coursetype` VALUES ('1', '艺术实践课', NULL);
INSERT INTO `dic_coursetype` VALUES ('2', '理论课', NULL);
INSERT INTO `dic_coursetype` VALUES ('3', '理论+实践课', NULL);

-- ----------------------------
-- Table structure for dic_scope
-- ----------------------------
DROP TABLE IF EXISTS `dic_scope`;
CREATE TABLE `dic_scope`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生班级id',
  `yuanxi` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '院系',
  `zhuanye` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专业',
  `nianji` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级',
  `banji` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '班级',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dic_scope
-- ----------------------------
INSERT INTO `dic_scope` VALUES ('1', '信息工程学院', '计算机科学与技术', '2014', '1');
INSERT INTO `dic_scope` VALUES ('2', '信息工程学院', '网络工程', '2014', '1');
INSERT INTO `dic_scope` VALUES ('3', '信息工程学院', '数字媒体', '2014', '1');
INSERT INTO `dic_scope` VALUES ('4', '信息工程学院', '数字媒体', '2014', '2');

-- ----------------------------
-- Table structure for gx_stucourse
-- ----------------------------
DROP TABLE IF EXISTS `gx_stucourse`;
CREATE TABLE `gx_stucourse`  (
  `stuID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `courseID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程ID',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`stuID`, `courseID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生，课程关系' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of gx_stucourse
-- ----------------------------
INSERT INTO `gx_stucourse` VALUES ('5001140010', 'yamux1cynv', NULL);
INSERT INTO `gx_stucourse` VALUES ('5001140010', 'yamux1cyzt', NULL);
INSERT INTO `gx_stucourse` VALUES ('5001140010', 'zt2yeamz4z', NULL);
INSERT INTO `gx_stucourse` VALUES ('5001140012', '5hvno4z5dr', NULL);

-- ----------------------------
-- Table structure for gx_teacourse
-- ----------------------------
DROP TABLE IF EXISTS `gx_teacourse`;
CREATE TABLE `gx_teacourse`  (
  `teaID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师ID',
  `courseID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程id',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`courseID`, `teaID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教师课程关系' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of gx_teacourse
-- ----------------------------
INSERT INTO `gx_teacourse` VALUES ('9947607359', 'vo4zlt2vjs', NULL);
INSERT INTO `gx_teacourse` VALUES ('9947607359', 'xc37igqxta', NULL);
INSERT INTO `gx_teacourse` VALUES ('9947607359', 'yamux1cynv', NULL);
INSERT INTO `gx_teacourse` VALUES ('9947607359', 'yamux1cyzt', NULL);
INSERT INTO `gx_teacourse` VALUES ('9947607359', 'zt2yeamz4z', NULL);

-- ----------------------------
-- Table structure for tb_course
-- ----------------------------
DROP TABLE IF EXISTS `tb_course`;
CREATE TABLE `tb_course`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程时间安排   前4位为开设周，1位单双周，之后每5位表示一个时间安排',
  `courseName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名',
  `courseHours` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课时',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上课地址',
  `courseScore` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学分',
  `year` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年度',
  `term` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上下学期  上，下',
  `courseType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程类型，1艺术实践类，2理论课，3理论+实践',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `timeplan` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程时间安排   前4位为开设周，1位单双周，之后每5位表示一个时间安排',
  `commonType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公共选修，公共必修，专业必修，专业选修',
  `countStu` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上课人数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_course
-- ----------------------------
INSERT INTO `tb_course` VALUES ('06rbjks07q', '农学', '24', 'B3－207', '理论', '2015', '上', '理论+实践课', 'M>cG', '53381686', '公共必修', '45');
INSERT INTO `tb_course` VALUES ('06rbjks0d1', '教育学', '8', 'B合六', '理论', '2014', '下', '理论课', '0Q56W8&(XF', '458152194', '专业必修', '79');
INSERT INTO `tb_course` VALUES ('06rbjks0w3', '管理学', '32', 'E-606', '理论', '2015', '上', '理论+实践课', 'u68Lb|5W', '27513', '公共必修', '84');
INSERT INTO `tb_course` VALUES ('137igqw12u', '军事学', '14', 'C-501', '艺术', '2015', '上', '理论+实践课', 'ktj!0', '89113572', '专业必修', '14');
INSERT INTO `tb_course` VALUES ('137igqw1my', '经济学', '24', 'E-416', '艺术', '2015', '上', '理论+实践课', 'K2WKL', '6', '专业必修', '85');
INSERT INTO `tb_course` VALUES ('137igqwf01', '管理学', '8', 'E-108', '艺术', '2015', '下', '理论+实践课', '{|/!j]S[', '5752828', '公共必修', '13');
INSERT INTO `tb_course` VALUES ('2eamux124z', '理学', '24', 'C-306', '理论', '2014', '下', '理论课', 'd_j', '584612', '专业必修', '37');
INSERT INTO `tb_course` VALUES ('2eamux12vp', '理学', '24', 'E-316', '艺术', '2015', '下', '艺术实践课', 'Vaf}!', '287', '公共选修', '64');
INSERT INTO `tb_course` VALUES ('2eamux1c2v', '历史学', '14', '微格实验室3(D-414)', '理论', '2015', '下', '理论+实践课', '>CsI*Fmo~', '47', '专业必修', '46');
INSERT INTO `tb_course` VALUES ('3igqwf03e3', '工学', '14', 'C-304', '理论', '2015', '上', '理论课', '4+@s-LE]^', '8176343247', '专业必修', '48');
INSERT INTO `tb_course` VALUES ('3igqwf03xu', '农学', '14', 'E-306', '理论', '2015', '上', '理论课', 'x', '6452531', '专业必修', '25');
INSERT INTO `tb_course` VALUES ('4lt2yea48v', '法学', '12', '计算机基础实验室(4)D-108', '理论', '2015', '上', '艺术实践课', 'lv&[=S', '4592923', '公共必修', '55');
INSERT INTO `tb_course` VALUES ('4lt2yea4hd', '理学', '24', 'C-303', '艺术', '2014', '下', '理论+实践课', '}', '4', '专业必修', '66');
INSERT INTO `tb_course` VALUES ('4lt2yea4uo', '工学', '32', 'E-108', '艺术', '2014', '下', '理论+实践课', '/H1A#ZE', '9551651493', '公共必修', '57');
INSERT INTO `tb_course` VALUES ('5hvno4z569', '教育学', '14', 'D-107机房', '理论', '2014', '下', '理论课', ':%', '51973', '公共选修', '11');
INSERT INTO `tb_course` VALUES ('5hvno4z5dr', '历史学', '24', '文科综合楼827', '艺术', '2015', '下', '艺术实践课', 'tJt-', '62983545', '公共选修', '34');
INSERT INTO `tb_course` VALUES ('5hvno4z5js', '法学', '12', '数电实验室421', '艺术', '2014', '上', '艺术实践课', 'gaK!', '168', '专业必修', '73');
INSERT INTO `tb_course` VALUES ('6bjks8d60q', '教育学', '32', 'B3－206', '理论', '2014', '上', '理论+实践课', '^<8', '337', '公共选修', '46');
INSERT INTO `tb_course` VALUES ('6bjks8d63i', '文学', '12', 'C-207', '理论', '2015', '下', '理论+实践课', '[]n=', '5413242', '公共选修', '94');
INSERT INTO `tb_course` VALUES ('6bjks8d6g9', '医学', '14', '传感器实验室614', '理论', '2015', '下', '理论+实践课', '>b%', '865166', '公共必修', '23');
INSERT INTO `tb_course` VALUES ('7gqwf097my', '医学', '14', '416画室', '艺术', '2014', '下', '理论+实践课', '(eX?%MYp[', '21195', '公共必修', '88');
INSERT INTO `tb_course` VALUES ('7gqwf097r1', '工学', '8', 'E-409', '理论', '2014', '下', '艺术实践课', 'n%', '168', '专业必修', '34');
INSERT INTO `tb_course` VALUES ('85phvno8fs', '理学', '32', 'E-608', '艺术', '2014', '上', '理论课', 'C#:t', '92568744', '公共必修', '38');
INSERT INTO `tb_course` VALUES ('85phvno8sf', '农学', '14', 'E-416', '艺术', '2014', '上', '理论课', 'J>WU', '78144399', '公共选修', '25');
INSERT INTO `tb_course` VALUES ('85phvno8zr', '经济学', '14', 'D-309机房', '艺术', '2015', '上', '理论课', 'N', '973924533', '专业必修', '45');
INSERT INTO `tb_course` VALUES ('9rbjks89c3', '管理学', '8', 'E-508', '理论', '2014', '上', '理论课', 'WbD+mI', '3', '公共必修', '48');
INSERT INTO `tb_course` VALUES ('9rbjks89fi', '哲学', '32', '机械原理实验室722', '理论', '2014', '下', '理论课', 'fZGl!', '37971', '专业选修', '83');
INSERT INTO `tb_course` VALUES ('9rbjks89if', '农学', '32', 'C-403', '艺术', '2014', '下', '艺术实践课', 'M-?7T(Su', '621443767', '公共选修', '21');
INSERT INTO `tb_course` VALUES ('aux1c37a4z', '哲学', '12', 'B3－107', '艺术', '2014', '上', '理论课', 'u', '61238', '专业必修', '91');
INSERT INTO `tb_course` VALUES ('aux1c37ata', '文学', '14', 'E-412', '理论', '2014', '上', '理论课', 'EwI*', '2', '公共选修', '91');
INSERT INTO `tb_course` VALUES ('aux1c37iat', '历史学', '24', 'E-510', '理论', '2015', '上', '理论课', 'J+Sw]NQHOK', '1619451', '专业必修', '42');
INSERT INTO `tb_course` VALUES ('bks8d5pb69', '历史学', '12', 'B3－105', '艺术', '2015', '上', '理论课', '}', '5545328', '公共选修', '35');
INSERT INTO `tb_course` VALUES ('bks8d5pbfi', '管理学', '24', 'E-408', '理论', '2015', '下', '艺术实践课', 'cY', '4724', '专业选修', '76');
INSERT INTO `tb_course` VALUES ('bks8d5pbif', '法学', '24', 'C-205', '理论', '2015', '下', '艺术实践课', ']$)f=FAVP', '385544', '专业选修', '54');
INSERT INTO `tb_course` VALUES ('c7igqwfcua', '医学', '24', '数电实验室421', '理论', '2015', '下', '艺术实践课', '(D2#C7EG', '2263435321', '专业选修', '63');
INSERT INTO `tb_course` VALUES ('c7igqwfcy1', '工学', '12', 'E-112', '艺术', '2015', '上', '理论+实践课', 'Qi]%', '1', '公共必修', '23');
INSERT INTO `tb_course` VALUES ('dphvno4d0d', '工学', '24', '416画室', '理论', '2014', '上', '理论课', 'C', '695387347', '专业选修', '63');
INSERT INTO `tb_course` VALUES ('dphvno4d89', '理学', '12', 'C-309', '理论', '2014', '下', '理论+实践课', ':rPOu:', '5733373', '专业必修', '75');
INSERT INTO `tb_course` VALUES ('dphvno4dbj', '哲学', '14', 'E-404', '艺术', '2014', '下', '艺术实践课', 'jg%^a', '234633542', '专业选修', '97');
INSERT INTO `tb_course` VALUES ('emux1c37ez', '理学', '8', 'E-209', '理论', '2014', '下', '理论课', '&a', '617382', '专业选修', '24');
INSERT INTO `tb_course` VALUES ('emux1c3eio', '历史学', '8', 'A3-406心理咨询实验室', '理论', '2014', '下', '理论+实践课', 'Zk', '3144996', '公共必修', '67');
INSERT INTO `tb_course` VALUES ('emux1c3ely', '教育学', '8', 'B合四', '理论', '2014', '下', '理论课', 'Eyf*>{', '5', '公共必修', '76');
INSERT INTO `tb_course` VALUES ('f96rbjkf3i', '文学', '32', 'C-406', '理论', '2014', '下', '理论+实践课', 'd_', '9642438355', '专业选修', '75');
INSERT INTO `tb_course` VALUES ('f96rbjkfq1', '理学', '24', 'E-102', '艺术', '2015', '上', '艺术实践课', '7Rj', '993574', '公共选修', '84');
INSERT INTO `tb_course` VALUES ('gwf096rg3i', '法学', '32', 'C-201', '理论', '2015', '上', '理论课', ']', '2742', '专业必修', '29');
INSERT INTO `tb_course` VALUES ('gwf096rgxu', '军事学', '8', 'B4－505', '理论', '2015', '上', '艺术实践课', 'F2Tl+ec#6', '752939723', '公共选修', '56');
INSERT INTO `tb_course` VALUES ('hno4zlthbj', '理学', '24', 'E-312', '理论', '2014', '上', '理论课', 'NqhsU:', '597118', '公共必修', '63');
INSERT INTO `tb_course` VALUES ('hno4zlthps', '军事学', '24', 'B2-304', '艺术', '2014', '上', '艺术实践课', '-]QcwPPP%2', '44954231', '专业选修', '22');
INSERT INTO `tb_course` VALUES ('hno4zlthsp', '文学', '12', 'E-416', '理论', '2015', '下', '理论+实践课', 'y]%1', '31', '公共必修', '74');
INSERT INTO `tb_course` VALUES ('iqwf096ic3', '理学', '12', 'A3-406心理咨询实验室', '艺术', '2015', '下', '理论课', '+$Z', '21', '专业选修', '44');
INSERT INTO `tb_course` VALUES ('iqwf096iua', '农学', '32', 'B4－304（国教院）', '艺术', '2014', '下', '艺术实践课', '9', '85885', '专业选修', '92');
INSERT INTO `tb_course` VALUES ('js8d5phj0q', '哲学', '24', 'C-202', '理论', '2015', '上', '理论课', '=&VAh<]', '6645754644', '公共选修', '55');
INSERT INTO `tb_course` VALUES ('js8d5phjg9', '文学', '8', '计算机应用实验室(1)D-201', '理论', '2014', '下', '理论课', 'f#h>q>:x6', '346', '专业选修', '87');
INSERT INTO `tb_course` VALUES ('js8d5phjnr', '文学', '8', 'B4-209', '理论', '2015', '下', '艺术实践课', 'Nk%*uT:_', '8413198768', '公共选修', '21');
INSERT INTO `tb_course` VALUES ('k8d5phvk9f', '理学', '32', 'C-202', '艺术', '2015', '下', '理论课', 'CwY', '263223', '公共选修', '77');
INSERT INTO `tb_course` VALUES ('k8d5phvkbj', '医学', '32', 'C-104', '理论', '2015', '下', '理论+实践课', 'cOjL%G', '322981', '公共选修', '13');
INSERT INTO `tb_course` VALUES ('k8d5phvkqr', '哲学', '24', 'ＥＲＰ沙盘模拟实验室（E-1015）', '艺术', '2015', '上', '艺术实践课', '4fjudB{a', '76725651', '专业必修', '76');
INSERT INTO `tb_course` VALUES ('l2yeamul5z', '农学', '8', 'E-510', '艺术', '2014', '上', '艺术实践课', '2WCV', '2722', '专业必修', '37');
INSERT INTO `tb_course` VALUES ('l2yeamulnv', '工学', '8', '411画室', '理论', '2014', '上', '艺术实践课', 'I', '5237244', '专业必修', '62');
INSERT INTO `tb_course` VALUES ('l2yeamuxld', '法学', '32', 'E-508', '艺术', '2014', '下', '艺术实践课', '2kx+jZ8/c', '5', '公共选修', '32');
INSERT INTO `tb_course` VALUES ('mx1c37igmy', '文学', '8', '理综制图室403', '理论', '2015', '上', '理论课', '&5t)(>~yB', '53748291', '公共选修', '14');
INSERT INTO `tb_course` VALUES ('mx1c37imyo', '管理学', '14', '文科综合楼803', '理论', '2015', '上', '理论+实践课', 'b', '1164454', '专业选修', '61');
INSERT INTO `tb_course` VALUES ('mx1c37imzt', '经济学', '12', 'E-209', '理论', '2015', '上', '艺术实践课', 'GU?', '3824918458', '公共选修', '41');
INSERT INTO `tb_course` VALUES ('n4zlt2yn5j', '文学', '24', 'B4－402', '艺术', '2015', '下', '理论+实践课', '{i', '55669', '专业选修', '92');
INSERT INTO `tb_course` VALUES ('n4zlt2ynkd', '管理学', '14', 'C-406', '理论', '2015', '下', '理论+实践课', 'h(i@', '21323', '专业必修', '43');
INSERT INTO `tb_course` VALUES ('n4zlt2ynvp', '哲学', '24', '文科综合楼827', '理论', '2015', '上', '理论课', '|)m', '779', '公共必修', '93');
INSERT INTO `tb_course` VALUES ('ozlt2yeonv', '工学', '8', '过程控制实验室629', '理论', '2014', '下', '理论课', 'dWWlt7eis', '6', '专业选修', '46');
INSERT INTO `tb_course` VALUES ('ozlt2yeops', '工学', '14', 'B3－201', '理论', '2015', '上', '理论+实践课', 'RtD', '8238322717', '专业选修', '27');
INSERT INTO `tb_course` VALUES ('ozlt2yeosp', '农学', '14', 'E-212', '理论', '2015', '上', '艺术实践课', '04Fwt~XGb', '27886', '公共选修', '38');
INSERT INTO `tb_course` VALUES ('pvno4zlp2r', '农学', '14', '计算机应用实验室(1)D-201', '理论', '2015', '下', '艺术实践课', '(!BI4*lk!L', '273811126', '公共必修', '39');
INSERT INTO `tb_course` VALUES ('pvno4zlp5j', '医学', '14', 'C-309', '理论', '2014', '上', '理论课', 'IJ1&$I+3z~', '295883558', '专业选修', '21');
INSERT INTO `tb_course` VALUES ('pvno4zlpkd', '理学', '32', 'E-306', '理论', '2015', '上', '理论+实践课', '9a_]|dJ:0v', '8195949865', '专业选修', '84');
INSERT INTO `tb_course` VALUES ('qf096rbq7q', '教育学', '24', 'E-604', '理论', '2014', '下', '理论课', 'x1*RZ', '5269546', '专业选修', '78');
INSERT INTO `tb_course` VALUES ('qf096rbqk1', '教育学', '12', 'E-316', '理论', '2015', '上', '艺术实践课', 'H+', '74345', '专业必修', '17');
INSERT INTO `tb_course` VALUES ('rjks8d5r7q', '哲学', '24', '文科综合楼803', '理论', '2015', '下', '艺术实践课', 'tY6iN', '4748682', '公共必修', '85');
INSERT INTO `tb_course` VALUES ('rjks8d5r9f', '管理学', '32', '文科综合楼806', '理论', '2015', '上', '理论+实践课', 'wZLj', '83794324', '公共必修', '83');
INSERT INTO `tb_course` VALUES ('rjks8d5rqr', '法学', '24', '口译实验室B3-402', '理论', '2015', '上', '理论+实践课', '~crc', '95', '专业必修', '28');
INSERT INTO `tb_course` VALUES ('sd5phvns69', '历史学', '24', 'E-614', '理论', '2015', '上', '理论课', '#lJYN2EQ', '5659', '公共选修', '43');
INSERT INTO `tb_course` VALUES ('sd5phvnsjs', '历史学', '24', 'ＥＲＰ沙盘模拟实验室（E-1015）', '理论', '2015', '下', '理论课', '%yPguKV-I7', '752542812', '专业必修', '19');
INSERT INTO `tb_course` VALUES ('sd5phvnswj', '农学', '14', '理综画室329', '艺术', '2014', '上', '艺术实践课', 'E<jbL4dNu', '2557183', '公共必修', '66');
INSERT INTO `tb_course` VALUES ('tyeamux1tp', '法学', '14', 'E-412', '理论', '2014', '下', '理论+实践课', 'gDJ>|#j', '15234', '专业必修', '84');
INSERT INTO `tb_course` VALUES ('tyeamuxtco', '历史学', '32', 'C-303', '艺术', '2014', '下', '艺术实践课', 'xx<o&P', '8981456663', '公共选修', '38');
INSERT INTO `tb_course` VALUES ('tyeamuxtpt', '历史学', '12', 'B合五', '理论', '2015', '下', '理论+实践课', 'kpi0~-[bF#', '9226469584', '公共必修', '33');
INSERT INTO `tb_course` VALUES ('u1c37igqua', '文学', '24', '计算机应用实验室(1)D-201', '理论', '2015', '上', '艺术实践课', 'ZaWy$', '27', '专业必修', '73');
INSERT INTO `tb_course` VALUES ('u1c37iguez', '管理学', '8', 'B合十九', '理论', '2014', '下', '理论+实践课', 'S02$v', '65677599', '公共必修', '85');
INSERT INTO `tb_course` VALUES ('u1c37iguly', '理学', '32', 'B2-303', '艺术', '2015', '下', '理论+实践课', 'H[Y(', '4587441846', '公共选修', '73');
INSERT INTO `tb_course` VALUES ('vo4zlt2v8v', '经济学', '32', 'C-501', '理论', '2015', '上', '理论+实践课', 'b%zD^w%t', '458566', '专业必修', '43');
INSERT INTO `tb_course` VALUES ('vo4zlt2vhd', '理学', '32', '数学建模实验室D-301', '艺术', '2014', '下', '艺术实践课', '%U4:ewN', '3541777', '公共必修', '43');
INSERT INTO `tb_course` VALUES ('vo4zlt2vjs', '理学', '8', 'E-614', '艺术', '2015', '下', '艺术实践课', 'Y_m[', '26867', '专业必修', '27');
INSERT INTO `tb_course` VALUES ('w096rbjwc3', '军事学', '24', 'B2-303', '艺术', '2014', '上', '理论+实践课', 'X68pc$07J', '83266219', '专业必修', '18');
INSERT INTO `tb_course` VALUES ('w096rbjwgu', '教育学', '12', 'E-402', '艺术', '2014', '下', '理论课', ')z#)b$', '6394843135', '专业必修', '66');
INSERT INTO `tb_course` VALUES ('xc37igqwxu', '教育学', '32', 'A合十三', '理论', '2015', '下', '艺术实践课', '>b]gu]67y', '14659', '专业选修', '68');
INSERT INTO `tb_course` VALUES ('xc37igqxat', '管理学', '14', 'E-510', '艺术', '2015', '上', '艺术实践课', '&_P?g[', '43683', '专业选修', '66');
INSERT INTO `tb_course` VALUES ('xc37igqxta', '医学', '12', 'A合十七', '理论', '2015', '上', '理论+实践课', '~[<q', '48639178', '公共必修', '94');
INSERT INTO `tb_course` VALUES ('yamux1c3yo', '教育学', '12', 'E-416', '艺术', '2014', '下', '理论+实践课', 'JSEi6D@', '12767', '公共必修', '46');
INSERT INTO `tb_course` VALUES ('yamux1cynv', '历史学', '24', 'B2-305', '理论', '2014', '下', '艺术实践课', '4_vd+wku//', '861547', '公共选修', '79');
INSERT INTO `tb_course` VALUES ('yamux1cyzt', '经济学', '8', 'C-302', '理论', '2015', '上', '艺术实践课', 'nqs@W8+Zi', '88268', '公共必修', '72');
INSERT INTO `tb_course` VALUES ('zt2yeamz4z', '哲学', '12', 'C-209', '艺术', '2014', '下', '理论+实践课', 'q:', '2796', '专业选修', '66');

-- ----------------------------
-- Table structure for tb_pjcontext
-- ----------------------------
DROP TABLE IF EXISTS `tb_pjcontext`;
CREATE TABLE `tb_pjcontext`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `courseType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pjType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `maxscore` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最高分',
  `block` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0',
  `sort` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '排序',
  `contentStr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_pjcontext
-- ----------------------------
INSERT INTO `tb_pjcontext` VALUES ('1', '艺术实践课', '教学态度', '8', '0', '1', '认真负责，精神饱满，上课身着专业（体育/舞蹈等）服装，举止得体', NULL);
INSERT INTO `tb_pjcontext` VALUES ('10', '艺术实践课', '教学方法', '8', '0', '10', '教堂进度安排得当，课堂时间能利用充分', NULL);
INSERT INTO `tb_pjcontext` VALUES ('11', '艺术实践课', '教学效果', '8', '0', '11', '通过本门课程的学习，调动了自己对专业学习的兴趣', NULL);
INSERT INTO `tb_pjcontext` VALUES ('12', '艺术实践课', '教学效果', '5', '0', '12', '通过本门课程的学习，收获了相当多的专业实践技能知识', NULL);
INSERT INTO `tb_pjcontext` VALUES ('13', '艺术实践课', '教学管理', '5', '0', '13', '严格要求，敢于管理，注重课堂纪律，坚持常规考勤', NULL);
INSERT INTO `tb_pjcontext` VALUES ('14', '艺术实践课', '教学管理', '5', '0', '14', '合理布置课外锻炼', NULL);
INSERT INTO `tb_pjcontext` VALUES ('2', '艺术实践课', '教学态度', '8', '0', '2', '遵守教学纪律，不迟到，不早退，课上不做与讲课无关的事情', NULL);
INSERT INTO `tb_pjcontext` VALUES ('3', '艺术实践课', '教学内容', '8', '0', '3', '语言表达清楚、准确、生动', NULL);
INSERT INTO `tb_pjcontext` VALUES ('4', '艺术实践课', '教学内容', '8', '0', '4', '教学过程中各环节完整，教学方法正确，示范动作准确', NULL);
INSERT INTO `tb_pjcontext` VALUES ('5', '艺术实践课', '教学内容', '8', '0', '5', '教学步骤合理，重点、难点突出', NULL);
INSERT INTO `tb_pjcontext` VALUES ('6', '艺术实践课', '教学内容', '8', '0', '6', '不断充实教学内容，专业动作新颖而不陈旧', NULL);
INSERT INTO `tb_pjcontext` VALUES ('7', '艺术实践课', '教学方法', '8', '0', '7', '因材施教，教法灵活，注重教学过程，讲解清楚', NULL);
INSERT INTO `tb_pjcontext` VALUES ('8', '艺术实践课', '教学方法', '8', '0', '8', '组织能力强，能有效驾驭课堂', NULL);
INSERT INTO `tb_pjcontext` VALUES ('9', '艺术实践课', '教学方法', '8', '0', '9', '对学生的实践操作能进行积极耐心有效的指导', NULL);

-- ----------------------------
-- Table structure for tb_pjrecord
-- ----------------------------
DROP TABLE IF EXISTS `tb_pjrecord`;
CREATE TABLE `tb_pjrecord`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stuNum` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
  `courseId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程ID',
  `contextId` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '系统评教ID',
  `marking` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '打分',
  `reamrk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_pjrecord
-- ----------------------------
INSERT INTO `tb_pjrecord` VALUES ('1', '5001140010', 'yamux1cynv', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for tb_student
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生 学号作为学生id',
  `classid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '班级编号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sex` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `telnum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话号',
  `mail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT ' 家庭住址',
  `idcardNum` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号码',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_student
-- ----------------------------
INSERT INTO `tb_student` VALUES ('5001140010', '1', '郭延明', '男', '13021095131', '13021095131@qq.com', '50', '410329199506119655', NULL);

-- ----------------------------
-- Table structure for tb_teacher
-- ----------------------------
DROP TABLE IF EXISTS `tb_teacher`;
CREATE TABLE `tb_teacher`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师工号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师姓名',
  `teaLevel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师职称',
  `yuanxi` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '院系',
  `telNum` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师电话',
  `sex` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `mail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_teacher
-- ----------------------------
INSERT INTO `tb_teacher` VALUES ('0004394601', '席菊', '讲师', '经济学', '16472525007', '男', '汉东省林城市守涩科路5810号廖舷褥小区12单元2411室', 'gv7p7k433w9@dmstest.com.cn', ')W');
INSERT INTO `tb_teacher` VALUES ('0393801544', '崔鹏泽', '教授', '农学', '19186193993', '女', '晋邦省辽河市幻巴樊路4150号菠抢小区2单元2442室', 'dspuctu9xqtxvrbi@dmstest.com.cn', 'L)01');
INSERT INTO `tb_teacher` VALUES ('0464002632', '谢婉珍', '讲师', '历史学', '16419147379', '女', '晋邦省辽河市拉胰滚路3441号越厦欧小区3单元1884室', 'zhi68i9yiaprot3hk@dmstest.com.cn', 'Q8H7PmZto4');
INSERT INTO `tb_teacher` VALUES ('0652084718', '郑晶亚', '教授', '法学', '16632746606', '女', '汉东省吕州市纷亚啮路945号及祭小区7单元1025室', 'n4zshizvfnpwajtzii@dmstest.com.cn', '?|!3SfFKg');
INSERT INTO `tb_teacher` VALUES ('0804042211', '唐鸣福', '教授', '管理学', '16871239467', '女', '宁熙省昌兴市慢警路2192号炸送小区19单元1356室', 'cfajmd_453@dmstest.com.cn', 'R&');
INSERT INTO `tb_teacher` VALUES ('0921661436', '安克', '教授', '管理学', '16587321152', '女', '宁熙省河内市牙伍毅路7807号既蹈小区11单元1321室', 'n0savb74cp0v8rzr@dmstest.com.cn', '=CQE%');
INSERT INTO `tb_teacher` VALUES ('0966051884', '万薇', '讲师', '历史学', '19324772048', '女', '凉西省开元市栈挑翔路1054号革郴仕小区10单元1982室', 'nivddn@dms.com', 'KPDus*');
INSERT INTO `tb_teacher` VALUES ('1196673587', '喻山', '教授', '哲学', '19866787882', '男', '晋邦省辽河市继五路4483号咯镇军小区9单元145室', 'pc04ihgf@dms.com', '#A8+');
INSERT INTO `tb_teacher` VALUES ('12', '123', '讲师', '信息工程学院', '123', '男', '北京市市辖区(132)', '123', NULL);
INSERT INTO `tb_teacher` VALUES ('1213', '132', '高级讲师', '信息工程学院', '123', '男', '天津市市辖区河西区(1323)', '1213', NULL);
INSERT INTO `tb_teacher` VALUES ('123', '123', '讲师', '信息工程学院', '123', '男', '辽宁省丹东市振安区(123)', '123', NULL);
INSERT INTO `tb_teacher` VALUES ('12312', '4564', '讲师', '信息工程学院', '12313', '男', '天津市市辖区和平区(21313)', '12132', NULL);
INSERT INTO `tb_teacher` VALUES ('12313', '1231', '讲师', '信息工程学院', '12', '男', '北京市市辖县密云县(121)', '2131', NULL);
INSERT INTO `tb_teacher` VALUES ('132', '4564', '讲师', '信息工程学院', '45646', '男', '北京市市辖区东城区(132)', '2313', NULL);
INSERT INTO `tb_teacher` VALUES ('13232', '456', '讲师', '信息工程学院', '21231', '男', '河北省保定市涞水县(13213)', '12131', NULL);
INSERT INTO `tb_teacher` VALUES ('1411826891', '朱翠', '讲师', '管理学', '16536303861', '女', '晋邦省金州市默泅路6530号狐翅唱小区11单元1165室', 'f0ai_uvqh1yiwujf@dmstest.com.cn', '0-');
INSERT INTO `tb_teacher` VALUES ('1553341180', '周伊婉', '讲师', '教育学', '19747967250', '男', '汉东省吕州市辈帖路4428号衅瓮瞧小区3单元690室', 'md6jelm_erd@dms.com', '*JE_');
INSERT INTO `tb_teacher` VALUES ('1857293417', '云玲', '讲师', '教育学', '19597738333', '男', '汉东省岩台市驹愤路2914号肮膊即小区17单元221室', 'ijynkbbuyyll_t7t@dms.com', 'ug(YS');
INSERT INTO `tb_teacher` VALUES ('2017595424', '卫清', '教授', '工学', '19717538097', '女', '晋邦省东安市场喘路1393号甩吗瑚小区7单元1262室', 'td83z_fw88nc@dmstest.com.cn', 'oA');
INSERT INTO `tb_teacher` VALUES ('2124587693', '路羽琰', '教授', '理学', '19709864926', '女', '宁熙省河内市刘关点路3808号变单艘小区6单元1597室', 'ktzuxnr84u4uik6@dms.com', '9a<!');
INSERT INTO `tb_teacher` VALUES ('213124', '改革', '讲师', '信息工程学院', '34543', '男', '天津市市辖县静海县(34535)', '546', NULL);
INSERT INTO `tb_teacher` VALUES ('2132', '121', '讲师', '信息工程学院', '123', '男', '内蒙古自治区鄂尔多斯市杭锦旗(123)', '2132', NULL);
INSERT INTO `tb_teacher` VALUES ('2153125239', '麻伦进', '教授', '理学', '16936942641', '男', '汉东省吕州市褥焦路2947号逐你小区3单元1954室', 'wry59i6_i59@dmstest.com.cn', '?&M{cQ');
INSERT INTO `tb_teacher` VALUES ('2205664563', '陆军', '讲师', '经济学', '19599105250', '女', '晋邦省辽河市献车路1409号金该小区4单元1990室', 'mog6jhpb7l5c9wrny@dmstest.com.cn', 'k4gmT0I');
INSERT INTO `tb_teacher` VALUES ('2216981776', '方芬', '教授', '军事学', '19672414489', '女', '晋邦省辽河市教付帚路6188号未集番小区5单元1387室', 'grgj07@dmstest.com.cn', 'dsnimNw');
INSERT INTO `tb_teacher` VALUES ('2221126840', '沈露澜', '讲师', '法学', '19082769709', '女', '汉东省林城市绢渴路2316号皂韵小区11单元2000室', 'h3k1wkwtf6pifa7z@dmstest.com.cn', 'LVm');
INSERT INTO `tb_teacher` VALUES ('2277698943', '李冠', '教授', '农学', '16531615409', '女', '汉东省京州市犯鞠蔡路3146号松厉小区11单元2382室', 'wv4t3lbtl@dms.com', 'SL%W@%4eO');
INSERT INTO `tb_teacher` VALUES ('23213', '13213', '讲师', '信息工程学院', '123', '男', '北京市(123123123)', '123', NULL);
INSERT INTO `tb_teacher` VALUES ('2328284111', '尹军平', '讲师', '哲学', '16676072429', '男', '汉东省岩台市拨分路5756号七女小区9单元2421室', 'js6_85rl@dmstest.com.cn', 'C@0r}][-');
INSERT INTO `tb_teacher` VALUES ('2384044802', '房之琛', '讲师', '农学', '19147914545', '女', '凉西省开元市绸垣路4935号购避哗小区3单元996室', 'r55aqb0ap68e370_f@dms.com', '$Fw>Ho');
INSERT INTO `tb_teacher` VALUES ('2414385101', '骆朋利', '讲师', '工学', '19905583176', '女', '凉西省宏茗市批绘路3735号想苑其小区7单元473室', 'e5v_10xu@dms.com', '@CxU8J7b');
INSERT INTO `tb_teacher` VALUES ('2446293835', '柯震', '教授', '经济学', '16720365412', '男', '宁熙省东顾市侥习颗路730号后馋小区14单元276室', 'e0lu3ko_@dmstest.com.cn', 'Od');
INSERT INTO `tb_teacher` VALUES ('2468239378', '江美竹', '讲师', '医学', '19039105542', '女', '汉东省岩台市匆末脚路5995号穿浩择小区14单元2240室', 'q49djpfp4hp2xy@dmstest.com.cn', 'hX5gBEjB');
INSERT INTO `tb_teacher` VALUES ('2471481371', '石琼娅', '讲师', '医学', '16919391551', '女', '汉东省林城市纸遇豆路464号存汇吝小区14单元294室', 'lw6zq2j22284wd91ea@dmstest.com.cn', 'h#G7');
INSERT INTO `tb_teacher` VALUES ('2511068734', '鲍腾', '教授', '经济学', '16708317081', '女', '晋邦省金州市略柔路3026号毁迎杂小区2单元826室', 'ewywgrqppg04lwvtet@dms.com', '<|kfnXjT');
INSERT INTO `tb_teacher` VALUES ('2657184796', '滕月洁', '教授', '历史学', '19063122680', '女', '宁熙省河内市胆谰路5909号蠢背格小区11单元2121室', 'm7fh618y0@dms.com', 'N_s!');
INSERT INTO `tb_teacher` VALUES ('2707737368', '虞彬俊', '讲师', '工学', '19355065033', '女', '宁熙省东顾市奄佛佑路266号恰潍小区11单元1392室', 'yre33p0f9ue@dms.com', '6#R!Tvs');
INSERT INTO `tb_teacher` VALUES ('2715291294', '柯璧', '教授', '管理学', '19870935938', '女', '凉西省宏茗市潦垛路2183号额蠢小区6单元1863室', 'kg_kskmhc@dmstest.com.cn', '!M/');
INSERT INTO `tb_teacher` VALUES ('2970873146', '萧心生', '讲师', '医学', '16870879840', '女', '宁熙省昌兴市杨置癌路5859号颈票厉小区7单元424室', 'iy3le7f_av0l9n__@dms.com', 'wLGRv>on>');
INSERT INTO `tb_teacher` VALUES ('312', '123', '讲师', '信息工程学院', '123', '男', '北京市市辖区东城区(123)', '123', NULL);
INSERT INTO `tb_teacher` VALUES ('3369869595', '梁钧', '讲师', '理学', '19897143746', '男', '宁熙省昌兴市剐湛倚路5135号敖沤饱小区2单元2081室', 'cqjk2rgq2l0blnarlz@dmstest.com.cn', '&H#OHU[');
INSERT INTO `tb_teacher` VALUES ('3457967081', '姜生超', '教授', '哲学', '16087075366', '男', '凉西省宏茗市鲍处路2294号跪愧小区3单元641室', 'xi63iich2kmvguhnt@dms.com', '_!PzPS38U');
INSERT INTO `tb_teacher` VALUES ('3659894849', '纪昌安', '教授', '农学', '16616278419', '男', '宁熙省东顾市响雄奠路7727号饶夷小区2单元1273室', 'iwdlrpd1vjf808_n@dmstest.com.cn', ')Hz@fIRxJK');
INSERT INTO `tb_teacher` VALUES ('3711003892', '唐海旭', '讲师', '管理学', '19423202711', '男', '凉西省宏茗市佰棘饭路4544号扬梨权小区10单元723室', 'xs0f290q8o2e@dms.com', 'J@<6');
INSERT INTO `tb_teacher` VALUES ('4207690216', '罗岩', '讲师', '医学', '19161571290', '女', '晋邦省东安市箭煌路4725号城挣居小区7单元2284室', 'bk28bs08l_@dmstest.com.cn', '$GvPG)HqpE');
INSERT INTO `tb_teacher` VALUES ('4421305705', '毛娟思', '讲师', '经济学', '19516036852', '男', '汉东省京州市犁哩双路7571号琉媒小区17单元998室', 'y1od0v@dmstest.com.cn', '~KVfSTMI');
INSERT INTO `tb_teacher` VALUES ('4456972696', '麻梁', '讲师', '工学', '16005338339', '女', '汉东省京州市凡仪筐路798号异拎吝小区4单元1439室', 'et2xncc5se1ljgcor@dms.com', '3&sg3/');
INSERT INTO `tb_teacher` VALUES ('45', '4564', '教授', '信息工程学院', '123', '男', '北京市市辖区东城区(123)', '213', NULL);
INSERT INTO `tb_teacher` VALUES ('4510719054', '翁丽', '教授', '经济学', '16698094985', '男', '凉西省开元市确衅夹路6183号饺哇谱小区1单元791室', 'revab_alx8uc@dms.com', 'CD1lrfny');
INSERT INTO `tb_teacher` VALUES ('4545', '45465', '高级讲师', '信息工程学院', '123', '男', '北京市市辖区东城区(123)', '123', NULL);
INSERT INTO `tb_teacher` VALUES ('4553043044', '穆融', '讲师', '理学', '19184965775', '男', '凉西省通达市撑喜饿路6945号手溯小区7单元1381室', 'eactry9q@dmstest.com.cn', 'e{m]t');
INSERT INTO `tb_teacher` VALUES ('4564', '45644', '讲师', '信息工程学院', '45', '男', '北京市市辖区东城区(45)', '456', NULL);
INSERT INTO `tb_teacher` VALUES ('4625835938', '裴秋', '讲师', '哲学', '19846119237', '男', '凉西省开元市比眷悲路3898号缄廓小区11单元128室', 'z2qkf8cwuhq7p@dms.com', '$DAm$cGAU');
INSERT INTO `tb_teacher` VALUES ('4707212710', '邓晓', '讲师', '法学', '19598085089', '女', '晋邦省金州市屏侨路2316号捎吼小区17单元1220室', 'gucgjm2jzos42@dmstest.com.cn', 'i');
INSERT INTO `tb_teacher` VALUES ('4782867941', '郭姣婕', '讲师', '哲学', '16258122939', '女', '晋邦省金州市脯泵路585号侦饱小区15单元2120室', 'vbnindn@dmstest.com.cn', 'zAypx');
INSERT INTO `tb_teacher` VALUES ('4813460297', '尤飘', '讲师', '农学', '16761905032', '女', '凉西省通达市疮霹路4649号称鲤耻小区1单元1644室', 'p4xdsg_8midrbb6@dmstest.com.cn', 'nJalpL');
INSERT INTO `tb_teacher` VALUES ('4866107600', '项琰', '讲师', '医学', '16100321124', '男', '凉西省开元市皿毫颅路31号陇诬小区13单元2006室', 'fsjcho6@dms.com', '=N_LO1&|');
INSERT INTO `tb_teacher` VALUES ('5086530661', '韩仪岚', '讲师', '历史学', '19934377208', '女', '宁熙省昌兴市缨蝇帖路3545号材煽利小区9单元1479室', 'tyw6y8z2@dmstest.com.cn', 'gmSS)ev0jT');
INSERT INTO `tb_teacher` VALUES ('5183079042', '汤婉冰', '讲师', '管理学', '19136141536', '女', '宁熙省昌兴市突籍路7233号坚署小区16单元1393室', 'e3u9z2z4wlwyod4zpf@dms.com', 'U5q');
INSERT INTO `tb_teacher` VALUES ('5260342141', '危毓青', '讲师', '农学', '19127403553', '女', '汉东省京州市焰傲路3314号镶笺小区5单元2076室', 'delyv20wdscdt@dmstest.com.cn', 'g)/*');
INSERT INTO `tb_teacher` VALUES ('5296580170', '危爱姬', '教授', '文学', '19498090848', '女', '汉东省林城市竟愈吏路472号泵泻小区5单元2061室', 'rgt2_3t2@dms.com', '>6mL{');
INSERT INTO `tb_teacher` VALUES ('5299105862', '苗巧丹', '教授', '管理学', '19345042849', '女', '汉东省岩台市兜康路5882号秦眨小区1单元1996室', 'gwe4qcox1629u1@dmstest.com.cn', '4arQ)nK');
INSERT INTO `tb_teacher` VALUES ('5308418052', '秦朋', '教授', '医学', '19965649605', '女', '晋邦省辽河市彦抒险路6312号踏赔小区16单元1728室', 'yxt_atqn8xmvbwp@dmstest.com.cn', '0!]]qqDX');
INSERT INTO `tb_teacher` VALUES ('5412393876', '陈祥', '教授', '管理学', '19595762974', '男', '宁熙省昌兴市翔序誊路3285号黍辛小区19单元787室', 'z6ryh0@dms.com', 'jyT3aOfs');
INSERT INTO `tb_teacher` VALUES ('5549660734', '俞露倩', '讲师', '工学', '16980716734', '男', '汉东省吕州市揉栖乾路7768号林崭小区10单元1827室', 'kbt89qj_5zbtg8k7@dmstest.com.cn', 'mpb~');
INSERT INTO `tb_teacher` VALUES ('5854289485', '吕纨', '讲师', '理学', '16304074949', '男', '晋邦省东安市辟沮沃路87号笋入小区18单元1552室', 'ah2p71nk08y_a@dms.com', '2~S-bkN');
INSERT INTO `tb_teacher` VALUES ('6013439443', '董绍祥', '讲师', '哲学', '19187081807', '男', '汉东省林城市孕么路2707号亏害翘小区18单元376室', 'wqk4bbzto6i5@dmstest.com.cn', 'y|y');
INSERT INTO `tb_teacher` VALUES ('6090674533', '阮姣纯', '讲师', '教育学', '16944777896', '女', '晋邦省东安市皂矮娜路1137号柜宿小区4单元1737室', 'hdg96y0au7i160pnnp@dmstest.com.cn', 'PI)6');
INSERT INTO `tb_teacher` VALUES ('6091624346', '沈秋', '教授', '法学', '19330022641', '男', '宁熙省东顾市挡抿路3635号浦园谊小区12单元2167室', 'jgt072plmq@dmstest.com.cn', '0/s');
INSERT INTO `tb_teacher` VALUES ('6111904006', '丘腾固', '教授', '理学', '19067608898', '女', '宁熙省河内市矾软路2585号歇冗缉小区15单元2201室', 'ovkvu79v4@dmstest.com.cn', '>f7N');
INSERT INTO `tb_teacher` VALUES ('6170491277', '冯丹茜', '讲师', '文学', '19250847306', '男', '汉东省岩台市鸭配路4576号渺俄小区10单元2195室', 'u472n7r1u1f47xr2p@dmstest.com.cn', ')s0[#==nPN');
INSERT INTO `tb_teacher` VALUES ('6192214344', '钱嘉', '讲师', '历史学', '16394231849', '男', '晋邦省东安市茂钧箱路3909号芬孝媳小区4单元2334室', 's7st2lg6poqvyhho8@dmstest.com.cn', '~q4?%^LHxV');
INSERT INTO `tb_teacher` VALUES ('6308247451', '柯朗', '讲师', '农学', '19895510455', '女', '凉西省开元市形奇屈路5476号欣钧小区3单元761室', 'j093qpego@dmstest.com.cn', '_u');
INSERT INTO `tb_teacher` VALUES ('6426051274', '范冰', '讲师', '经济学', '16948224722', '女', '汉东省林城市多闯路6397号囱夯苍小区17单元2270室', 'om_c_y6p_@dms.com', '?68kXM/[w%');
INSERT INTO `tb_teacher` VALUES ('6620740287', '应蓓', '教授', '文学', '19874392883', '男', '晋邦省东安市裤菌路4607号高壤痔小区5单元534室', 'sj4gzic1ko5gzms@dmstest.com.cn', '=RwmYv3');
INSERT INTO `tb_teacher` VALUES ('6844383189', '霍轮宁', '讲师', '工学', '19644427098', '女', '宁熙省东顾市阮莲路4726号鲤拱小区16单元991室', 'frndj6f@dmstest.com.cn', '-');
INSERT INTO `tb_teacher` VALUES ('6867660448', '应亨', '讲师', '农学', '16534373260', '女', '宁熙省昌兴市烘洋路7164号缉弦小区6单元811室', 've250qg9gwq@dmstest.com.cn', 'Irq)BmBmP?');
INSERT INTO `tb_teacher` VALUES ('6877964649', '张健炎', '讲师', '文学', '19433165998', '男', '宁熙省昌兴市脊陛路42号啤帐础小区19单元1419室', 'ps_h17r1k9_86d@dmstest.com.cn', 'Vq]<_');
INSERT INTO `tb_teacher` VALUES ('6926383821', '钮致', '讲师', '历史学', '16804435599', '女', '宁熙省昌兴市君埋漓路2243号兜懒春小区18单元1941室', 'fwstpcvxsc8dey@dms.com', 'W~');
INSERT INTO `tb_teacher` VALUES ('7124462996', '郑世', '教授', '历史学', '19803597543', '男', '晋邦省辽河市砧娄路1023号抨插涨小区3单元118室', 'b0t7sx6@dmstest.com.cn', '/U-6vh:');
INSERT INTO `tb_teacher` VALUES ('7150805503', '蒋莺琦', '教授', '军事学', '19095376332', '女', '宁熙省河内市渭涛囱路7775号尹非兢小区12单元398室', 'k5n4qzciblf8awutmv@dmstest.com.cn', 't}');
INSERT INTO `tb_teacher` VALUES ('7177406342', '葛勤', '讲师', '历史学', '16048761674', '男', '凉西省通达市沿萝升路7519号妹掇小区11单元1405室', 'vcmi38hue@dms.com', '&');
INSERT INTO `tb_teacher` VALUES ('7201642416', '袁融怡', '教授', '医学', '16569986102', '女', '宁熙省东顾市欺泛路434号浑爽瞬小区6单元2073室', 'tj4g1rmpa7ori@dmstest.com.cn', '07YsoI');
INSERT INTO `tb_teacher` VALUES ('7217723085', '尤泽超', '教授', '教育学', '19113149440', '女', '晋邦省金州市全睬路6846号障诽小区15单元2387室', 'np1pdxar4kussn2@dmstest.com.cn', '6PDVWF');
INSERT INTO `tb_teacher` VALUES ('7237254693', '魏君丽', '教授', '农学', '19663228327', '女', '宁熙省昌兴市凶呻路6203号闸俱小区8单元1149室', 'd_72hqvocjgl0d@dmstest.com.cn', '>ZQXjo');
INSERT INTO `tb_teacher` VALUES ('7378654717', '强飘芬', '教授', '文学', '16553688603', '女', '凉西省宏茗市泉押路6674号沂窑小区14单元1323室', 'xyawy6jq8bj3pj9yh@dms.com', '1~^');
INSERT INTO `tb_teacher` VALUES ('7559136963', '华山强', '讲师', '经济学', '16332406735', '女', '凉西省宏茗市独硬路4287号泅笼别小区7单元666室', 't42txaijle839my002@dms.com', 'o*DRH');
INSERT INTO `tb_teacher` VALUES ('7594222685', '丘风安', '讲师', '法学', '19874578866', '男', '晋邦省金州市狭掷路4239号屯影崩小区11单元1529室', 'eq73ay8b_uf7hf@dms.com', '+)iq*');
INSERT INTO `tb_teacher` VALUES ('7708899139', '章璧', '教授', '军事学', '16650201994', '男', '汉东省林城市胶够员路992号墓粳小区7单元484室', 'no8t9w21@dms.com', 'lt');
INSERT INTO `tb_teacher` VALUES ('7716269212', '唐琳', '讲师', '经济学', '16012123204', '男', '宁熙省昌兴市葵止皇路2648号涟邱逐小区6单元820室', 'gn7yl1fds6@dmstest.com.cn', '7x^j');
INSERT INTO `tb_teacher` VALUES ('7727739703', '华叶凡', '讲师', '工学', '16963949671', '男', '汉东省京州市坪阅琵路5157号锅临指小区18单元1747室', 'ni988v7@dmstest.com.cn', 'AO');
INSERT INTO `tb_teacher` VALUES ('8064690832', '柳竹', '教授', '农学', '19911880628', '女', '汉东省岩台市儒籍路4251号诬睬牙小区14单元517室', 'fcbwz15ap_z44_g@dms.com', 'uNPar_s{&=');
INSERT INTO `tb_teacher` VALUES ('8231839001', '奚媛', '讲师', '医学', '19191420034', '男', '宁熙省东顾市逼石袱路6351号吧哆停小区3单元887室', 'l4o3xj1q@dms.com', 'Hi!(Qj?');
INSERT INTO `tb_teacher` VALUES ('8267731964', '张武', '讲师', '医学', '19531285160', '女', '宁熙省昌兴市身救喳路5602号热烁小区6单元1947室', 'g_3histi8k53w5@dms.com', '0U?');
INSERT INTO `tb_teacher` VALUES ('8323525387', '王良天', '教授', '经济学', '16257989438', '男', '宁熙省东顾市猪蚀路6911号粥样手小区11单元1011室', 'mk2vlc5rgkxe@dmstest.com.cn', 'u');
INSERT INTO `tb_teacher` VALUES ('8356943851', '丘娥', '讲师', '历史学', '19260937088', '女', '晋邦省东安市瘁秩路7059号垣匀小区17单元1558室', 'lw2eji75tn81b9v8s@dmstest.com.cn', 'SQ?AY>0ST');
INSERT INTO `tb_teacher` VALUES ('8545302851', '夏波翔', '教授', '工学', '16221325874', '女', '汉东省林城市掺花毕路565号椒理恳小区1单元364室', 'reuu4z5@dmstest.com.cn', 'kQ5');
INSERT INTO `tb_teacher` VALUES ('8751530745', '金媛馥', '教授', '军事学', '19362034789', '男', '凉西省开元市楔漳面路3055号虎殃蜀小区14单元1871室', 'iw9g6m2ae7c_mq@dms.com', '#x_1DS');
INSERT INTO `tb_teacher` VALUES ('8862264187', '秦信松', '讲师', '文学', '19339746713', '男', '汉东省吕州市盯怠挽路4672号芒近小区4单元1887室', 'mrlj1t75f8qk37zxe@dmstest.com.cn', 'y~q>QPnQ_R');
INSERT INTO `tb_teacher` VALUES ('8865341698', '路勤', '教授', '农学', '16205437622', '男', '汉东省林城市肝嫁路2765号抑憋洗小区17单元788室', 'cb3dhgq1@dmstest.com.cn', '-ZI~RF');
INSERT INTO `tb_teacher` VALUES ('9255508943', '李贵', '教授', '教育学', '19653042246', '男', '晋邦省金州市顽连路3966号几少小区15单元958室', 'gcfh_s@dmstest.com.cn', '&X?0n3Y2o');
INSERT INTO `tb_teacher` VALUES ('9279161455', '骆炎', '讲师', '经济学', '19213815875', '男', '汉东省吕州市樱波募路6560号江贱小区19单元2455室', 'fbmcx_hrl3tgw@dms.com', 'TFTkIBsW');
INSERT INTO `tb_teacher` VALUES ('9289124220', '卫宁时', '讲师', '管理学', '19397990852', '男', '汉东省京州市持私路7677号软坛小区17单元756室', 'nqin7ogac1ouri0t@dmstest.com.cn', 'p_&^3uf');
INSERT INTO `tb_teacher` VALUES ('9315116910', '杜云娥', '教授', '工学', '16043268186', '男', '凉西省宏茗市驱室墓路6749号济移小区5单元159室', 'tlaz22z7ou_b9d@dmstest.com.cn', '(7');
INSERT INTO `tb_teacher` VALUES ('9482962095', '纪思', '教授', '哲学', '16907223249', '女', '晋邦省金州市谱迢幕路6914号骗繁小区14单元2243室', 'we7iy3vto@dmstest.com.cn', 'U');
INSERT INTO `tb_teacher` VALUES ('9491687779', '何策', '讲师', '经济学', '19450494584', '男', '晋邦省东安市酉蔗路5242号糜迸小区10单元813室', 'wzbyewe@dms.com', 'A//r:IH|');
INSERT INTO `tb_teacher` VALUES ('9581598621', '葛慧', '讲师', '教育学', '19397226802', '男', '宁熙省昌兴市粹浑佑路2086号絮胎小区11单元2473室', 'innodb_i6158u@dms.com', 'xywsn6vc&');
INSERT INTO `tb_teacher` VALUES ('9591534905', '祁敬', '教授', '法学', '16124974992', '女', '宁熙省东顾市扇秤蛇路2878号膏垂棋小区7单元1198室', 'kqyuhipx1s3xx@dms.com', '_:rW&');
INSERT INTO `tb_teacher` VALUES ('9597414685', '许哲江', '讲师', '管理学', '19871328554', '女', '凉西省开元市榔毖眩路5289号昆彝贱小区15单元554室', 'zr19jci8l89mkw6u_h@dms.com', '#0(6%Q5S[u');
INSERT INTO `tb_teacher` VALUES ('9608006050', '胡融莲', '讲师', '管理学', '16409998139', '男', '凉西省通达市妮友路402号郧独未小区7单元1777室', 'u002x6yvxw@dmstest.com.cn', 'O');
INSERT INTO `tb_teacher` VALUES ('9876520674', '康露雅', '讲师', '军事学', '16051837273', '女', '晋邦省辽河市冰衅路556号截屠小区15单元814室', 'ze410yoz1xgxhj@dmstest.com.cn', '[7C6|xRoN');
INSERT INTO `tb_teacher` VALUES ('9947607359', '尹凡', '讲师', '医学', '19315480051', '女', '凉西省宏茗市豺檀耐路2831号悟彪小区9单元2127室', 'hospedrqhx9o7tz8n@dmstest.com.cn', 'E)#');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID',
  `uid` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'student,teacher的ID',
  `role` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '1，管理员；2，教师；3，学生',
  `userName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户账号；',
  `userPwd` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `block` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '用户锁定 1，锁定 0解锁',
  `isadmin` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '是否有管理员权限',
  `isstudent` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '是否是学生用户 ',
  `isteacher` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '是否有教师权限',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uid`(`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('06rb0103cq', '8862264187', 'teacher', '路勤', '06rb0103cq', '0', '0', '0', '1', 'VtxU5X)o{+');
INSERT INTO `tb_user` VALUES ('06rb0108d1', '9315116910', 'teacher', '项琰', '06rb0108d1', '0', '0', '0', '1', '}0$f1/=jo');
INSERT INTO `tb_user` VALUES ('06rb010f3f', '8064690832', 'teacher', '奚媛', '06rb010f3f', '0', '0', '0', '1', '?-s#bS@');
INSERT INTO `tb_user` VALUES ('06rb010g1i', '8865341698', 'teacher', '杜云娥', '06rb010g1i', '0', '0', '0', '1', 'H-5U{8VGWB');
INSERT INTO `tb_user` VALUES ('06rb010iqf', '7716269212', 'teacher', '房之琛', '06rb010iqf', '0', '0', '0', '1', 'E!TP%gQ');
INSERT INTO `tb_user` VALUES ('06rb010qfi', '8267731964', 'teacher', '俞露倩', '06rb010qfi', '0', '0', '0', '1', 'mlFn');
INSERT INTO `tb_user` VALUES ('06rb0130g3', '8323525387', 'teacher', '唐琳', '06rb0130g3', '0', '0', '0', '1', '<D87$');
INSERT INTO `tb_user` VALUES ('06rb0137wq', '9581598621', 'teacher', '江美竹', '06rb0137wq', '0', '0', '0', '1', 'F~');
INSERT INTO `tb_user` VALUES ('06rb0138gq', '9491687779', 'teacher', '强飘芬', '06rb0138gq', '0', '0', '0', '1', 'he1zq>~0Kj');
INSERT INTO `tb_user` VALUES ('06rb0138w3', '8751530745', 'teacher', '尤飘', '06rb0138w3', '0', '0', '0', '1', 'ja2{P_U');
INSERT INTO `tb_user` VALUES ('06rb013g03', '9947607359', 'teacher', '冯丹茜', '941e541bfb7e85f2de2026d3a8ada1b4', '0', '0', '0', '1', '|%%');
INSERT INTO `tb_user` VALUES ('06rb013g31', '7594222685', 'teacher', '路羽琰', '06rb013g31', '0', '0', '0', '1', '6l~}@');
INSERT INTO `tb_user` VALUES ('06rb017c73', '9255508943', 'teacher', '康露雅', '06rb017c73', '0', '0', '0', '1', '9dVVgnY');
INSERT INTO `tb_user` VALUES ('06rb017cqf', '7559136963', 'teacher', '秦信松', '06rb017cqf', '0', '0', '0', '1', 'T(<jk');
INSERT INTO `tb_user` VALUES ('06rb017gqi', '7237254693', 'teacher', '张武', '06rb017gqi', '0', '0', '0', '1', 'pF^k');
INSERT INTO `tb_user` VALUES ('06rb01c0di', '9279161455', 'teacher', '丘风安', '06rb01c0di', '0', '0', '0', '1', 'U#O!/dnq~f');
INSERT INTO `tb_user` VALUES ('06rb01c30q', '9289124220', 'teacher', '纪昌安', '06rb01c30q', '0', '0', '0', '1', 'KXao5@MiM');
INSERT INTO `tb_user` VALUES ('06rb01c7qf', '9482962095', 'teacher', '柳竹', '06rb01c7qf', '0', '0', '0', '1', 'd*MB?G)Q');
INSERT INTO `tb_user` VALUES ('06rb01cf7q', '9591534905', 'teacher', '鲍腾', '06rb01cf7q', '0', '0', '0', '1', 'XenQ2XS');
INSERT INTO `tb_user` VALUES ('06rb01cgc3', '7708899139', 'teacher', '喻山', '06rb01cgc3', '0', '0', '0', '1', 'V[fTUhTt');
INSERT INTO `tb_user` VALUES ('06rb01cgfi', '8231839001', 'teacher', '沈露澜', '06rb01cgfi', '0', '0', '0', '1', '#H&?RbmAxW');
INSERT INTO `tb_user` VALUES ('06rb01i0qf', '8545302851', 'teacher', '云玲', '06rb01i0qf', '0', '0', '0', '1', '6zhP3!N62');
INSERT INTO `tb_user` VALUES ('06rb01i731', '7727739703', 'teacher', '霍轮宁', '06rb01i731', '0', '0', '0', '1', '=Hq');
INSERT INTO `tb_user` VALUES ('06rb01ig7q', '7378654717', 'teacher', '章璧', '06rb01ig7q', '0', '0', '0', '1', '(Erfnh4uX');
INSERT INTO `tb_user` VALUES ('06rb01iwcq', '9597414685', 'teacher', '霍轮宁', '06rb01iwcq', '0', '0', '0', '1', '29:vE');
INSERT INTO `tb_user` VALUES ('06rb01qgdf', '8356943851', 'teacher', '奚媛', '06rb01qgdf', '0', '0', '0', '1', 'D#)r');
INSERT INTO `tb_user` VALUES ('06rb01swi1', '7217723085', 'teacher', '葛慧', '06rb01swi1', '0', '0', '0', '1', 'FS/30');
INSERT INTO `tb_user` VALUES ('06rb01w0gq', '9608006050', 'teacher', '崔鹏泽', 'a926c05149b5bdac9d3e771f9e834b2b', '0', '0', '0', '1', 's#9=r*BAs');
INSERT INTO `tb_user` VALUES ('10f9662d-96a6-4adb-aa04-d9323ac5743c', '78979845', 'student', '45646', '48dcdc1bd320fcde96ad56799b341a53', '0', '0', '1', NULL, NULL);
INSERT INTO `tb_user` VALUES ('13315220-3a6d-4e6f-b567-1b79642ac7c3', '312', 'teacher', '123', '950a4152c2b4aa3ad78bdd6b366cc179', '0', '0', NULL, '1', NULL);
INSERT INTO `tb_user` VALUES ('28c1383a-5760-4573-a6c2-8a2cc8f362d8', '4564', 'teacher', '465', '75429d136f65d2d6168b9b6c5f6ec951', '0', '0', NULL, '1', NULL);
INSERT INTO `tb_user` VALUES ('337608a0-9e19-44ba-965e-f25c43551fda', '5001140010', 'student', '郭延明', 'a9456800d9435ddffbd08b6f156a7c11', '0', '0', '1', NULL, NULL);
INSERT INTO `tb_user` VALUES ('34b348c7-a6ab-4a41-8c7e-ae274a499ced', '54545', 'student', '4545', '6de381ba5775fba44c7cc303a8c65279', '0', '0', '1', NULL, NULL);
INSERT INTO `tb_user` VALUES ('441bcbab-8547-4884-bd2f-7f0e07e60f06', '12', 'teacher', '123', 'c20ad4d76fe97759aa27a0c99bff6710', '0', '0', NULL, '1', NULL);
INSERT INTO `tb_user` VALUES ('45fa1bec-9be9-47e2-95fb-935f1e66a219', '123', 'student', '123123', '202cb962ac59075b964b07152d234b70', '0', '0', '1', '1', NULL);
INSERT INTO `tb_user` VALUES ('480cb23e-c980-4f12-847a-dad5f5099b52', '45', 'teacher', '4564', '6c8349cc7260ae62e3b1396831a8398f', '0', '0', NULL, '1', NULL);
INSERT INTO `tb_user` VALUES ('4f254466-6bf7-455d-9faa-95034e907566', '13232', 'teacher', '456', '695553c0c5ba292284a3e1e64da6ed47', '0', '0', NULL, '1', NULL);
INSERT INTO `tb_user` VALUES ('5a5d3282-264e-495e-9aec-c60c0e67cc03', '213124', 'teacher', '改革', 'ce63e444b0d049e9c899c9a0336b3c59', '0', '0', NULL, '1', NULL);
INSERT INTO `tb_user` VALUES ('67567286-975e-4b46-acc3-84d6076e831a', '23213', 'teacher', '13213', '549ce24fb62238d013a6e222cb4d41d8', '0', '0', NULL, '1', NULL);
INSERT INTO `tb_user` VALUES ('69bd73db-bf02-4772-990b-14d0d5684f77', '1213', 'teacher', '132', '33ceb07bf4eeb3da587e268d663aba1a', '0', '0', NULL, '1', NULL);
INSERT INTO `tb_user` VALUES ('98f6b65d-2316-4759-bbf7-e181419be4dd', '12312', 'teacher', '546546', 'b3ddbc502e307665f346cbd6e52cc10d', '0', '0', NULL, '1', NULL);
INSERT INTO `tb_user` VALUES ('a5bc8a69-f338-43db-a237-1cc17ed69c79', '132', 'teacher', '4564', '65ded5353c5ee48d0b7d48c591b8f430', '0', '0', NULL, '1', NULL);
INSERT INTO `tb_user` VALUES ('a83a866d-b539-4b50-952f-de51ba956d28', '4545', 'teacher', '45465', '1f6419b1cbe79c71410cb320fc094775', '0', '0', NULL, '1', NULL);
INSERT INTO `tb_user` VALUES ('admin', 'admin', 'admin', 'admin', 'e10adc3949ba59abbe56e057f20f883e', '0', '1', '0', '0', 'admin');
INSERT INTO `tb_user` VALUES ('ed84d2b4-b329-4a3c-a313-41cd3077b11a', '2132', 'teacher', '121', 'f6e794a75c5d51de081dbefa224304f9', '0', '0', NULL, '1', NULL);
INSERT INTO `tb_user` VALUES ('fabd5308-790d-4a38-ab77-9b31cbe2eeea', '12313', 'teacher', '1231', 'f7e0ef389ac6133c88aedbd66b44a4e1', '0', '0', NULL, '1', NULL);

SET FOREIGN_KEY_CHECKS = 1;
