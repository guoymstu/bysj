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

 Date: 07/05/2018 02:05:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
INSERT INTO `tb_pjcontext` VALUES ('com1', '理论+实践课', '教学态度', '8', '0', '1', '遵守教学纪律，注意维护教学及实验课程课堂纪律，没有停课、误课、早退、迟到和无故调课现象', NULL);
INSERT INTO `tb_pjcontext` VALUES ('com10', '理论+实践课', '教学方法', '8', '0', '10', '重视与学生的沟通，耐心细致解答学生在理论和实践操作过程中遇到的问题', NULL);
INSERT INTO `tb_pjcontext` VALUES ('com11', '理论+实践课', '教学效果', '5', '0', '11', '通过本课程的学习，较好的理解了该课程的基本原理、方法，能用本课程所学到的实践操作解决相关的实际问题', NULL);
INSERT INTO `tb_pjcontext` VALUES ('com12', '理论+实践课', '教学效果', '5', '0', '12', '通过本课程的学习，本人的创新思维、学习能力、动手操作实践能力均得到较大提高', NULL);
INSERT INTO `tb_pjcontext` VALUES ('com13', '理论+实践课', '教学管理', '5', '0', '13', '教师能充分利用云平台，教师在云平台上的个人教学空间各项内容完整，资源丰富', NULL);
INSERT INTO `tb_pjcontext` VALUES ('com14', '理论+实践课', '教学管理', '5', '0', '14', '教师能及时对实验/作业/辅导等做有意义的批阅或分析，并依据实验/作业/辅导等改进教学', NULL);
INSERT INTO `tb_pjcontext` VALUES ('com2', '理论+实践课', '教学态度', '8', '0', '2', '备课充分，理论教学过程中热情饱满，讲课有感染力，课堂气氛活跃，实践操作熟练，步骤规范', NULL);
INSERT INTO `tb_pjcontext` VALUES ('com3', '理论+实践课', '教学内容', '8', '0', '3', '基本概念和原理讲解准确明了，内容充实、信息量大，实践技能操作讲授全面而准确', NULL);
INSERT INTO `tb_pjcontext` VALUES ('com4', '理论+实践课', '教学内容', '8', '0', '4', '实践内容跟教学内容贴切且难度适中，设置的实践操作练习有利于对知识点的掌握和巩固', NULL);
INSERT INTO `tb_pjcontext` VALUES ('com5', '理论+实践课', '教学态度', '8', '0', '5', '采用较新的较专业的实践操作软件，所授实践操作知识点不落伍，紧跟市场人才需求方向', NULL);
INSERT INTO `tb_pjcontext` VALUES ('com6', '理论+实践课', '教学内容', '8', '0', '6', '能结合学生的实际组织教学，既重视结果与结论的讲授，又重视方法和过程的讲解', NULL);
INSERT INTO `tb_pjcontext` VALUES ('com7', '理论+实践课', '教学方法', '8', '0', '7', '普通话讲授，声音适中，语言精炼、表达生动，理论和实践操作均富于启发和激励性', NULL);
INSERT INTO `tb_pjcontext` VALUES ('com8', '理论+实践课', '教学方法', '8', '0', '8', '教师对所讲内容熟练，有见解，不照本宣科，对概念的表达和解说清楚，所授实践知识和技能具有专业化特点，知识点全面，且重、难点突出', NULL);
INSERT INTO `tb_pjcontext` VALUES ('com9', '理论+实践课', '教学方法', '8', '0', '9', '课堂进度和实验等环节的安排合理有序，课堂时间能利用充分', NULL);
INSERT INTO `tb_pjcontext` VALUES ('ly1', '理论课', '教学态度', '8', '0', '1', '遵守教学纪律，注意维护课堂纪律，没有停课、误课、早退、迟到和无故调课现象', NULL);
INSERT INTO `tb_pjcontext` VALUES ('ly10', '理论课', '教学方法', '8', '0', '10', '重视与学生的沟通，耐心细致解答学生问题，注重教学反馈，不断改进教学', NULL);
INSERT INTO `tb_pjcontext` VALUES ('ly11', '理论课', '教学效果', '5', '0', '11', '通过本课程的学习，能用该课程的基本原理、方法分析解决一些实际问题，提高了解决和分析问题的能力', NULL);
INSERT INTO `tb_pjcontext` VALUES ('ly12', '理论课', '教学效果', '5', '0', '12', '通过本课程的学习，本人的创新思维、学习能力得到较大提高', NULL);
INSERT INTO `tb_pjcontext` VALUES ('ly13', '理论课', '教学管理', '5', '0', '13', '教师能充分利用云平台，在云平台上的个人教学空间各项内容完整，资源丰富', NULL);
INSERT INTO `tb_pjcontext` VALUES ('ly14', '理论课', '教学管理', '5', '0', '14', '作业布置数量适当，并批改认真、准确、及时，有针对性的批注，并依此进行教学改进', NULL);
INSERT INTO `tb_pjcontext` VALUES ('ly2', '理论课', '教学态度', '8', '0', '2', '教学热情饱满，讲课有感染力，课堂气氛活跃', NULL);
INSERT INTO `tb_pjcontext` VALUES ('ly3', '理论课', '教学内容', '8', '0', '3', '基本概念和原理讲解准确明了、内容充实、信息量大', NULL);
INSERT INTO `tb_pjcontext` VALUES ('ly4', '理论课', '教学内容', '8', '0', '4', '能结合学生的实际组织教学，既重视结果与结论的讲授，又重视方法和过程的讲解', NULL);
INSERT INTO `tb_pjcontext` VALUES ('ly5', '理论课', '教学内容', '8', '0', '5', '不断更新充实新内容，引进本学科的新成果', NULL);
INSERT INTO `tb_pjcontext` VALUES ('ly6', '理论课', '教学内容', '8', '0', '6', '理论联系实际，实例恰当，教学内容系统性强', NULL);
INSERT INTO `tb_pjcontext` VALUES ('ly7', '理论课', '教学方法', '8', '0', '7', '普通话讲授，声音适中，语言精炼、表达生动，富于启发和激励性，注重课程学习方法的引导，并善于选择和使用恰当的教学方法和手段', NULL);
INSERT INTO `tb_pjcontext` VALUES ('ly8', '理论课', '教学方法', '8', '0', '8', '板书清晰，工整，规范；或课件质量高，效果好', NULL);
INSERT INTO `tb_pjcontext` VALUES ('ly9', '理论课', '教学态度', '8', '0', '9', '备课充分，对所讲内容熟练，有见解，不照本宣科，对概念的表达和解说清楚', NULL);
INSERT INTO `tb_pjcontext` VALUES ('sj1', '艺术实践课', '教学态度', '8', '0', '1', '认真负责，精神饱满，上课身着专业（体育/舞蹈等）服装，举止得体', NULL);
INSERT INTO `tb_pjcontext` VALUES ('sj10', '艺术实践课', '教学方法', '8', '0', '10', '教堂进度安排得当，课堂时间能利用充分', NULL);
INSERT INTO `tb_pjcontext` VALUES ('sj11', '艺术实践课', '教学效果', '8', '0', '11', '通过本门课程的学习，调动了自己对专业学习的兴趣', NULL);
INSERT INTO `tb_pjcontext` VALUES ('sj12', '艺术实践课', '教学效果', '5', '0', '12', '通过本门课程的学习，收获了相当多的专业实践技能知识', NULL);
INSERT INTO `tb_pjcontext` VALUES ('sj13', '艺术实践课', '教学管理', '5', '0', '13', '严格要求，敢于管理，注重课堂纪律，坚持常规考勤', NULL);
INSERT INTO `tb_pjcontext` VALUES ('sj14', '艺术实践课', '教学管理', '5', '0', '14', '合理布置课外锻炼', NULL);
INSERT INTO `tb_pjcontext` VALUES ('sj2', '艺术实践课', '教学态度', '8', '0', '2', '遵守教学纪律，不迟到，不早退，课上不做与讲课无关的事情', NULL);
INSERT INTO `tb_pjcontext` VALUES ('sj3', '艺术实践课', '教学内容', '8', '0', '3', '语言表达清楚、准确、生动', NULL);
INSERT INTO `tb_pjcontext` VALUES ('sj4', '艺术实践课', '教学内容', '8', '0', '4', '教学过程中各环节完整，教学方法正确，示范动作准确', NULL);
INSERT INTO `tb_pjcontext` VALUES ('sj5', '艺术实践课', '教学内容', '8', '0', '5', '教学步骤合理，重点、难点突出', NULL);
INSERT INTO `tb_pjcontext` VALUES ('sj6', '艺术实践课', '教学内容', '8', '0', '6', '不断充实教学内容，专业动作新颖而不陈旧', NULL);
INSERT INTO `tb_pjcontext` VALUES ('sj7', '艺术实践课', '教学方法', '8', '0', '7', '因材施教，教法灵活，注重教学过程，讲解清楚', NULL);
INSERT INTO `tb_pjcontext` VALUES ('sj8', '艺术实践课', '教学方法', '8', '0', '8', '组织能力强，能有效驾驭课堂', NULL);
INSERT INTO `tb_pjcontext` VALUES ('sj9', '艺术实践课', '教学方法', '8', '0', '9', '对学生的实践操作能进行积极耐心有效的指导', NULL);

SET FOREIGN_KEY_CHECKS = 1;
