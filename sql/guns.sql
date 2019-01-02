/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50638
Source Host           : localhost:3306
Source Database       : guns

Target Server Type    : MYSQL
Target Server Version : 50638
File Encoding         : 65001

Date: 2018-12-29 17:16:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for code_dbinfo
-- ----------------------------
DROP TABLE IF EXISTS `code_dbinfo`;
CREATE TABLE `code_dbinfo` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '别名',
  `db_driver` varchar(100) NOT NULL COMMENT '数据库驱动',
  `db_url` varchar(200) NOT NULL COMMENT '数据库地址',
  `db_user_name` varchar(100) NOT NULL COMMENT '数据库账户',
  `db_password` varchar(100) NOT NULL COMMENT '连接密码',
  `db_type` varchar(10) DEFAULT NULL COMMENT '数据库类型',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='数据库链接信息';

-- ----------------------------
-- Records of code_dbinfo
-- ----------------------------

-- ----------------------------
-- Table structure for p_adv_ad_info
-- ----------------------------
DROP TABLE IF EXISTS `p_adv_ad_info`;
CREATE TABLE `p_adv_ad_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ad_position_id` int(11) DEFAULT '0' COMMENT '广告位置id',
  `ad_sn` varchar(36) DEFAULT NULL COMMENT '广告位编号',
  `name` varchar(50) NOT NULL COMMENT '广告名称',
  `source` int(1) DEFAULT NULL COMMENT '数据来源',
  `type` int(1) NOT NULL DEFAULT '0' COMMENT '对象类型，0：无；1：产品；2：品牌店铺；3：外部链接',
  `object_id` int(11) DEFAULT NULL COMMENT '引用对象的id，',
  `start_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始时间',
  `end_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '结束时间',
  `main_title` varchar(100) DEFAULT '' COMMENT '主标题',
  `sub_heading` varchar(100) DEFAULT '' COMMENT '副标题',
  `image_src` varchar(255) NOT NULL DEFAULT '' COMMENT '图片',
  `image_alt` varchar(100) DEFAULT NULL COMMENT '图片属性',
  `background_color` varchar(20) DEFAULT NULL COMMENT '背景颜色',
  `url` varchar(255) DEFAULT '' COMMENT '链接URL',
  `status` int(1) DEFAULT '0' COMMENT '状态，0：未开始；1：进行中；2：已结束',
  `click_count` int(11) DEFAULT NULL COMMENT '点击数',
  `area` text COMMENT '区域编码',
  `is_all` int(1) DEFAULT NULL COMMENT '0:不是全部有效 1：全部有效',
  `sort_num` int(4) unsigned NOT NULL DEFAULT '0' COMMENT '排序',
  `remark` varchar(500) DEFAULT '' COMMENT '备注',
  `is_enable` int(1) NOT NULL DEFAULT '0' COMMENT '是否启用,0不启用，1启用',
  `creator` int(11) NOT NULL DEFAULT '0' COMMENT '创建人',
  `modifier` int(11) NOT NULL DEFAULT '0' COMMENT '修改人',
  `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后修改时间',
  `is_deleted` int(1) unsigned NOT NULL DEFAULT '0' COMMENT '0正常，1删除',
  `goods_cate_id` int(11) DEFAULT NULL COMMENT '关联的一级商品分类ID',
  `is_relate_goods_cate` int(1) DEFAULT NULL COMMENT '是否关联商品分类',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='广告信息记录表';

-- ----------------------------
-- Records of p_adv_ad_info
-- ----------------------------
INSERT INTO `p_adv_ad_info` VALUES ('3', '4', 'GG0000000003', '头部一个标题', '4', '0', null, '2018-12-26 10:23:04', '2018-12-26 10:23:04', '', '', '[\"http://resource.iwonly.com/shop-res/0bde998c-f795-42f4-9e06-ece285a109c8\"]', null, null, '', '0', '0', '[]', '1', '1', '', '0', '1', '1', '2018-12-26 10:22:56', '2018-12-26 10:22:56', '0', '78', '1');
INSERT INTO `p_adv_ad_info` VALUES ('4', '4', 'GG0000000004', '家乡山水', '4', '0', null, '2018-12-26 10:24:16', '2018-12-26 10:24:16', '', '', '[\"http://resource.iwonly.com/shop-res/60bca93d-98fd-4647-af60-6ab296d2b1e4\"]', null, null, '', '1', '0', '[{\"value\":\"340102\",\"name\":\"瑶海区\"},{\"value\":\"340121\",\"name\":\"长丰县\"},{\"value\":\"340122\",\"name\":\"肥东县\"}]', '0', '2', '', '1', '1', '1', '2018-12-26 10:24:09', '2018-12-26 10:24:09', '0', '81', '1');
INSERT INTO `p_adv_ad_info` VALUES ('5', '5', 'GG0000000005', '金牛', '4', '3', null, '2018-12-26 14:51:38', '2018-12-26 14:51:38', '', '', '[\"http://resource.iwonly.com/shop-res/e753b83f-c0e8-4b89-bff6-218e187eba4a\"]', null, null, 'http://app-verify.iwonly.com/admin/', '1', '0', '[]', '1', '2', '', '1', '1', '1', '2018-12-26 14:51:30', '2018-12-26 14:51:30', '0', '79', '1');

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `num` int(11) DEFAULT NULL COMMENT '排序',
  `pid` int(11) DEFAULT NULL COMMENT '父部门id',
  `pids` varchar(255) DEFAULT NULL COMMENT '父级ids',
  `simplename` varchar(45) DEFAULT NULL COMMENT '简称',
  `fullname` varchar(255) DEFAULT NULL COMMENT '全称',
  `tips` varchar(255) DEFAULT NULL COMMENT '提示',
  `version` int(11) DEFAULT NULL COMMENT '版本（乐观锁保留字段）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Records of sys_dept
-- ----------------------------
INSERT INTO `sys_dept` VALUES ('24', '1', '0', '[0],', '总公司', '总公司', '', null);
INSERT INTO `sys_dept` VALUES ('25', '2', '24', '[0],[24],', '开发部', '开发部', '', null);
INSERT INTO `sys_dept` VALUES ('26', '3', '24', '[0],[24],', '运营部', '运营部', '', null);
INSERT INTO `sys_dept` VALUES ('27', '4', '24', '[0],[24],', '战略部', '战略部', '', null);

-- ----------------------------
-- Table structure for sys_dict
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict`;
CREATE TABLE `sys_dict` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `num` int(11) DEFAULT NULL COMMENT '排序',
  `pid` int(11) DEFAULT NULL COMMENT '父级字典',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `tips` varchar(255) DEFAULT NULL COMMENT '提示',
  `code` varchar(255) DEFAULT NULL COMMENT '值',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='字典表';

-- ----------------------------
-- Records of sys_dict
-- ----------------------------
INSERT INTO `sys_dict` VALUES ('50', '0', '0', '性别', null, 'sys_sex');
INSERT INTO `sys_dict` VALUES ('51', '1', '50', '男', null, '1');
INSERT INTO `sys_dict` VALUES ('52', '2', '50', '女', null, '2');
INSERT INTO `sys_dict` VALUES ('53', '0', '0', '状态', null, 'sys_state');
INSERT INTO `sys_dict` VALUES ('54', '1', '53', '启用', null, '1');
INSERT INTO `sys_dict` VALUES ('55', '2', '53', '禁用', null, '2');
INSERT INTO `sys_dict` VALUES ('56', '0', '0', '账号状态', null, 'account_state');
INSERT INTO `sys_dict` VALUES ('57', '1', '56', '启用', null, '1');
INSERT INTO `sys_dict` VALUES ('58', '2', '56', '冻结', null, '2');
INSERT INTO `sys_dict` VALUES ('59', '3', '56', '已删除', null, '3');

-- ----------------------------
-- Table structure for sys_expense
-- ----------------------------
DROP TABLE IF EXISTS `sys_expense`;
CREATE TABLE `sys_expense` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `money` decimal(20,2) DEFAULT NULL COMMENT '报销金额',
  `desc` varchar(255) DEFAULT '' COMMENT '描述',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `state` int(11) DEFAULT NULL COMMENT '状态: 1.待提交  2:待审核   3.审核通过 4:驳回',
  `userid` int(11) DEFAULT NULL COMMENT '用户id',
  `processId` varchar(255) DEFAULT NULL COMMENT '流程定义id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='报销表';

-- ----------------------------
-- Records of sys_expense
-- ----------------------------

-- ----------------------------
-- Table structure for sys_login_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_login_log`;
CREATE TABLE `sys_login_log` (
  `id` int(65) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `logname` varchar(255) DEFAULT NULL COMMENT '日志名称',
  `userid` int(65) DEFAULT NULL COMMENT '管理员id',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `succeed` varchar(255) DEFAULT NULL COMMENT '是否执行成功',
  `message` text COMMENT '具体消息',
  `ip` varchar(255) DEFAULT NULL COMMENT '登录ip',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=235 DEFAULT CHARSET=utf8 COMMENT='登录记录';

-- ----------------------------
-- Records of sys_login_log
-- ----------------------------
INSERT INTO `sys_login_log` VALUES ('217', '登录失败日志', null, '2018-12-26 11:00:23', '成功', '账号:admin,账号密码错误', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('218', '登录日志', '1', '2018-12-26 11:00:28', '成功', null, '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('219', '登录失败日志', null, '2018-12-26 18:22:47', '成功', '账号:admin,账号密码错误', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('220', '登录日志', '1', '2018-12-26 18:22:51', '成功', null, '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('221', '登录失败日志', null, '2018-12-27 11:00:21', '成功', '账号:admin,账号密码错误', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('222', '登录失败日志', null, '2018-12-27 11:00:24', '成功', '账号:admin,账号密码错误', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('223', '登录日志', '1', '2018-12-27 11:00:28', '成功', null, '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('224', '登录日志', '1', '2018-12-27 11:00:28', '成功', null, '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('225', '登录日志', '1', '2018-12-27 11:23:53', '成功', null, '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('226', '登录日志', '1', '2018-12-27 11:23:53', '成功', null, '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('227', '登录日志', '1', '2018-12-27 11:44:59', '成功', null, '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('228', '登录失败日志', null, '2018-12-27 14:20:18', '成功', '账号:admin,账号密码错误', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('229', '登录失败日志', null, '2018-12-27 14:20:18', '成功', '账号:admin,账号密码错误', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('230', '登录失败日志', null, '2018-12-27 14:20:21', '成功', '账号:admin,账号密码错误', '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('231', '登录日志', '1', '2018-12-27 14:20:25', '成功', null, '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('232', '登录日志', '1', '2018-12-27 18:21:55', '成功', null, '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('233', '退出日志', '1', '2018-12-27 18:22:00', '成功', null, '0:0:0:0:0:0:0:1');
INSERT INTO `sys_login_log` VALUES ('234', '登录日志', '1', '2018-12-27 18:22:02', '成功', null, '0:0:0:0:0:0:0:1');

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `code` varchar(255) DEFAULT NULL COMMENT '菜单编号',
  `pcode` varchar(255) DEFAULT NULL COMMENT '菜单父编号',
  `pcodes` varchar(255) DEFAULT NULL COMMENT '当前菜单的所有父菜单编号',
  `name` varchar(255) DEFAULT NULL COMMENT '菜单名称',
  `icon` varchar(255) DEFAULT NULL COMMENT '菜单图标',
  `url` varchar(255) DEFAULT NULL COMMENT 'url地址',
  `num` int(65) DEFAULT NULL COMMENT '菜单排序号',
  `levels` int(65) DEFAULT NULL COMMENT '菜单层级',
  `ismenu` int(11) DEFAULT NULL COMMENT '是否是菜单（1：是  0：不是）',
  `tips` varchar(255) DEFAULT NULL COMMENT '备注',
  `status` int(65) DEFAULT NULL COMMENT '菜单状态 :  1:启用   0:不启用',
  `isopen` int(11) DEFAULT NULL COMMENT '是否打开:    1:打开   0:不打开',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=173 DEFAULT CHARSET=utf8 COMMENT='菜单表';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('105', 'system', '0', '[0],', '系统管理', 'fa-user', '#', '4', '1', '1', null, '1', '1');
INSERT INTO `sys_menu` VALUES ('106', 'mgr', 'system', '[0],[system],', '用户管理', '', '/mgr', '1', '2', '1', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('107', 'mgr_add', 'mgr', '[0],[system],[mgr],', '添加用户', null, '/mgr/add', '1', '3', '0', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('108', 'mgr_edit', 'mgr', '[0],[system],[mgr],', '修改用户', null, '/mgr/edit', '2', '3', '0', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('109', 'mgr_delete', 'mgr', '[0],[system],[mgr],', '删除用户', null, '/mgr/delete', '3', '3', '0', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('110', 'mgr_reset', 'mgr', '[0],[system],[mgr],', '重置密码', null, '/mgr/reset', '4', '3', '0', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('111', 'mgr_freeze', 'mgr', '[0],[system],[mgr],', '冻结用户', null, '/mgr/freeze', '5', '3', '0', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('112', 'mgr_unfreeze', 'mgr', '[0],[system],[mgr],', '解除冻结用户', null, '/mgr/unfreeze', '6', '3', '0', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('113', 'mgr_setRole', 'mgr', '[0],[system],[mgr],', '分配角色', null, '/mgr/setRole', '7', '3', '0', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('114', 'role', 'system', '[0],[system],', '角色管理', null, '/role', '2', '2', '1', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('115', 'role_add', 'role', '[0],[system],[role],', '添加角色', null, '/role/add', '1', '3', '0', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('116', 'role_edit', 'role', '[0],[system],[role],', '修改角色', null, '/role/edit', '2', '3', '0', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('117', 'role_remove', 'role', '[0],[system],[role],', '删除角色', null, '/role/remove', '3', '3', '0', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('118', 'role_setAuthority', 'role', '[0],[system],[role],', '配置权限', null, '/role/setAuthority', '4', '3', '0', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('119', 'menu', 'system', '[0],[system],', '菜单管理', null, '/menu', '4', '2', '1', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('120', 'menu_add', 'menu', '[0],[system],[menu],', '添加菜单', null, '/menu/add', '1', '3', '0', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('121', 'menu_edit', 'menu', '[0],[system],[menu],', '修改菜单', null, '/menu/edit', '2', '3', '0', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('122', 'menu_remove', 'menu', '[0],[system],[menu],', '删除菜单', null, '/menu/remove', '3', '3', '0', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('128', 'log', 'system', '[0],[system],', '业务日志', null, '/log', '6', '2', '1', null, '1', '0');
INSERT INTO `sys_menu` VALUES ('130', 'druid', 'system', '[0],[system],', '监控管理', null, '/druid', '7', '2', '1', null, '1', null);
INSERT INTO `sys_menu` VALUES ('131', 'dept', 'system', '[0],[system],', '部门管理', null, '/dept', '3', '2', '1', null, '1', null);
INSERT INTO `sys_menu` VALUES ('132', 'dict', 'system', '[0],[system],', '字典管理', null, '/dict', '4', '2', '1', null, '1', null);
INSERT INTO `sys_menu` VALUES ('133', 'loginLog', 'system', '[0],[system],', '登录日志', null, '/loginLog', '6', '2', '1', null, '1', null);
INSERT INTO `sys_menu` VALUES ('134', 'log_clean', 'log', '[0],[system],[log],', '清空日志', null, '/log/delLog', '3', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('135', 'dept_add', 'dept', '[0],[system],[dept],', '添加部门', null, '/dept/add', '1', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('136', 'dept_update', 'dept', '[0],[system],[dept],', '修改部门', null, '/dept/update', '1', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('137', 'dept_delete', 'dept', '[0],[system],[dept],', '删除部门', null, '/dept/delete', '1', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('138', 'dict_add', 'dict', '[0],[system],[dict],', '添加字典', null, '/dict/add', '1', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('139', 'dict_update', 'dict', '[0],[system],[dict],', '修改字典', null, '/dict/update', '1', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('140', 'dict_delete', 'dict', '[0],[system],[dict],', '删除字典', null, '/dict/delete', '1', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('141', 'notice', 'system', '[0],[system],', '通知管理', null, '/notice', '9', '2', '1', null, '1', null);
INSERT INTO `sys_menu` VALUES ('142', 'notice_add', 'notice', '[0],[system],[notice],', '添加通知', null, '/notice/add', '1', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('143', 'notice_update', 'notice', '[0],[system],[notice],', '修改通知', null, '/notice/update', '2', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('144', 'notice_delete', 'notice', '[0],[system],[notice],', '删除通知', null, '/notice/delete', '3', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('145', 'hello', '0', '[0],', '通知', 'fa-rocket', '/notice/hello', '1', '1', '1', null, '1', null);
INSERT INTO `sys_menu` VALUES ('148', 'code', '0', '[0],', '代码生成', 'fa-code', '/code', '3', '1', '1', null, '1', null);
INSERT INTO `sys_menu` VALUES ('149', 'api_mgr', '0', '[0],', '接口文档', 'fa-leaf', '/swagger-ui.html', '2', '1', '1', null, '1', null);
INSERT INTO `sys_menu` VALUES ('150', 'to_menu_edit', 'menu', '[0],[system],[menu],', '菜单编辑跳转', '', '/menu/menu_edit', '4', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('151', 'menu_list', 'menu', '[0],[system],[menu],', '菜单列表', '', '/menu/list', '5', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('152', 'to_dept_update', 'dept', '[0],[system],[dept],', '修改部门跳转', '', '/dept/dept_update', '4', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('153', 'dept_list', 'dept', '[0],[system],[dept],', '部门列表', '', '/dept/list', '5', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('154', 'dept_detail', 'dept', '[0],[system],[dept],', '部门详情', '', '/dept/detail', '6', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('155', 'to_dict_edit', 'dict', '[0],[system],[dict],', '修改菜单跳转', '', '/dict/dict_edit', '4', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('156', 'dict_list', 'dict', '[0],[system],[dict],', '字典列表', '', '/dict/list', '5', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('157', 'dict_detail', 'dict', '[0],[system],[dict],', '字典详情', '', '/dict/detail', '6', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('158', 'log_list', 'log', '[0],[system],[log],', '日志列表', '', '/log/list', '2', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('159', 'log_detail', 'log', '[0],[system],[log],', '日志详情', '', '/log/detail', '3', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('160', 'del_login_log', 'loginLog', '[0],[system],[loginLog],', '清空登录日志', '', '/loginLog/delLoginLog', '1', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('161', 'login_log_list', 'loginLog', '[0],[system],[loginLog],', '登录日志列表', '', '/loginLog/list', '2', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('162', 'to_role_edit', 'role', '[0],[system],[role],', '修改角色跳转', '', '/role/role_edit', '5', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('163', 'to_role_assign', 'role', '[0],[system],[role],', '角色分配跳转', '', '/role/role_assign', '6', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('164', 'role_list', 'role', '[0],[system],[role],', '角色列表', '', '/role/list', '7', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('165', 'to_assign_role', 'mgr', '[0],[system],[mgr],', '分配角色跳转', '', '/mgr/role_assign', '8', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('166', 'to_user_edit', 'mgr', '[0],[system],[mgr],', '编辑用户跳转', '', '/mgr/user_edit', '9', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('167', 'mgr_list', 'mgr', '[0],[system],[mgr],', '用户列表', '', '/mgr/list', '10', '3', '0', null, '1', null);
INSERT INTO `sys_menu` VALUES ('171', '/adv', '0', '[0],', '广告管理', '', '/adv', '10', '1', '1', null, '1', null);
INSERT INTO `sys_menu` VALUES ('172', '/pAdvAdInfo', '/adv', '[0],[/adv],', '广告信息', '', '/pAdvAdInfo', '1', '2', '1', null, '1', null);

-- ----------------------------
-- Table structure for sys_notice
-- ----------------------------
DROP TABLE IF EXISTS `sys_notice`;
CREATE TABLE `sys_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `content` text COMMENT '内容',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `creater` int(11) DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='通知表';

-- ----------------------------
-- Records of sys_notice
-- ----------------------------
INSERT INTO `sys_notice` VALUES ('6', '世界', '10', '欢迎使用Guns管理系统', '2017-01-11 08:53:20', '1');
INSERT INTO `sys_notice` VALUES ('8', '你好', null, '你好', '2017-05-10 19:28:57', '1');

-- ----------------------------
-- Table structure for sys_operation_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_operation_log`;
CREATE TABLE `sys_operation_log` (
  `id` int(65) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `logtype` varchar(255) DEFAULT NULL COMMENT '日志类型',
  `logname` varchar(255) DEFAULT NULL COMMENT '日志名称',
  `userid` int(65) DEFAULT NULL COMMENT '用户id',
  `classname` varchar(255) DEFAULT NULL COMMENT '类名称',
  `method` text COMMENT '方法名称',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `succeed` varchar(255) DEFAULT NULL COMMENT '是否成功',
  `message` text COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=560 DEFAULT CHARSET=utf8 COMMENT='操作日志';

-- ----------------------------
-- Records of sys_operation_log
-- ----------------------------
INSERT INTO `sys_operation_log` VALUES ('554', '业务日志', '修改管理员', '1', 'cn.stylefeng.guns.modular.system.controller.UserMgrController', 'edit', '2018-12-26 18:43:50', '成功', '账号=boss;;;字段名称:null,旧值:71887a5ad666a18f709e1d4e693d5a35,新值:;;;字段名称:名字,旧值:老板,新值:老板999;;;字段名称:性别,旧值:男,新值:女;;;字段名称:电子邮件,旧值:,新值:2437766749@qq.com;;;字段名称:电话,旧值:,新值:18895682833;;;字段名称:部门名称,旧值:总公司,新值:运营部');
INSERT INTO `sys_operation_log` VALUES ('555', '业务日志', '修改管理员', '1', 'cn.stylefeng.guns.modular.system.controller.UserMgrController', 'edit', '2018-12-26 18:56:35', '成功', '账号=boss;;;字段名称:null,旧值:71887a5ad666a18f709e1d4e693d5a35,新值:');
INSERT INTO `sys_operation_log` VALUES ('556', '业务日志', '菜单新增', '1', 'cn.stylefeng.guns.modular.system.controller.MenuController', 'add', '2018-12-27 11:03:35', '成功', '菜单名称=广告管理');
INSERT INTO `sys_operation_log` VALUES ('557', '业务日志', '配置权限', '1', 'cn.stylefeng.guns.modular.system.controller.RoleController', 'setAuthority', '2018-12-27 11:06:23', '成功', '角色名称=超级管理员,资源名称=系统管理,用户管理,添加用户,修改用户,删除用户,重置密码,冻结用户,解除冻结用户,分配角色,分配角色跳转,编辑用户跳转,用户列表,角色管理,添加角色,修改角色,删除角色,配置权限,修改角色跳转,角色分配跳转,角色列表,菜单管理,添加菜单,修改菜单,删除菜单,菜单编辑跳转,菜单列表,业务日志,清空日志,日志列表,日志详情,监控管理,部门管理,添加部门,修改部门,删除部门,修改部门跳转,部门列表,部门详情,字典管理,添加字典,修改字典,删除字典,修改菜单跳转,字典列表,字典详情,登录日志,清空登录日志,登录日志列表,通知管理,添加通知,修改通知,删除通知,通知,代码生成,接口文档,广告管理');
INSERT INTO `sys_operation_log` VALUES ('558', '业务日志', '菜单新增', '1', 'cn.stylefeng.guns.modular.system.controller.MenuController', 'add', '2018-12-27 11:26:36', '成功', '菜单名称=广告信息');
INSERT INTO `sys_operation_log` VALUES ('559', '业务日志', '配置权限', '1', 'cn.stylefeng.guns.modular.system.controller.RoleController', 'setAuthority', '2018-12-27 11:26:46', '成功', '角色名称=超级管理员,资源名称=系统管理,用户管理,添加用户,修改用户,删除用户,重置密码,冻结用户,解除冻结用户,分配角色,分配角色跳转,编辑用户跳转,用户列表,角色管理,添加角色,修改角色,删除角色,配置权限,修改角色跳转,角色分配跳转,角色列表,菜单管理,添加菜单,修改菜单,删除菜单,菜单编辑跳转,菜单列表,业务日志,清空日志,日志列表,日志详情,监控管理,部门管理,添加部门,修改部门,删除部门,修改部门跳转,部门列表,部门详情,字典管理,添加字典,修改字典,删除字典,修改菜单跳转,字典列表,字典详情,登录日志,清空登录日志,登录日志列表,通知管理,添加通知,修改通知,删除通知,通知,代码生成,接口文档,广告管理,广告信息');

-- ----------------------------
-- Table structure for sys_relation
-- ----------------------------
DROP TABLE IF EXISTS `sys_relation`;
CREATE TABLE `sys_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `menuid` bigint(11) DEFAULT NULL COMMENT '菜单id',
  `roleid` int(11) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3905 DEFAULT CHARSET=utf8 COMMENT='角色和菜单关联表';

-- ----------------------------
-- Records of sys_relation
-- ----------------------------
INSERT INTO `sys_relation` VALUES ('3377', '105', '5');
INSERT INTO `sys_relation` VALUES ('3378', '106', '5');
INSERT INTO `sys_relation` VALUES ('3379', '107', '5');
INSERT INTO `sys_relation` VALUES ('3380', '108', '5');
INSERT INTO `sys_relation` VALUES ('3381', '109', '5');
INSERT INTO `sys_relation` VALUES ('3382', '110', '5');
INSERT INTO `sys_relation` VALUES ('3383', '111', '5');
INSERT INTO `sys_relation` VALUES ('3384', '112', '5');
INSERT INTO `sys_relation` VALUES ('3385', '113', '5');
INSERT INTO `sys_relation` VALUES ('3386', '114', '5');
INSERT INTO `sys_relation` VALUES ('3387', '115', '5');
INSERT INTO `sys_relation` VALUES ('3388', '116', '5');
INSERT INTO `sys_relation` VALUES ('3389', '117', '5');
INSERT INTO `sys_relation` VALUES ('3390', '118', '5');
INSERT INTO `sys_relation` VALUES ('3391', '119', '5');
INSERT INTO `sys_relation` VALUES ('3392', '120', '5');
INSERT INTO `sys_relation` VALUES ('3393', '121', '5');
INSERT INTO `sys_relation` VALUES ('3394', '122', '5');
INSERT INTO `sys_relation` VALUES ('3395', '150', '5');
INSERT INTO `sys_relation` VALUES ('3396', '151', '5');
INSERT INTO `sys_relation` VALUES ('3848', '105', '1');
INSERT INTO `sys_relation` VALUES ('3849', '106', '1');
INSERT INTO `sys_relation` VALUES ('3850', '107', '1');
INSERT INTO `sys_relation` VALUES ('3851', '108', '1');
INSERT INTO `sys_relation` VALUES ('3852', '109', '1');
INSERT INTO `sys_relation` VALUES ('3853', '110', '1');
INSERT INTO `sys_relation` VALUES ('3854', '111', '1');
INSERT INTO `sys_relation` VALUES ('3855', '112', '1');
INSERT INTO `sys_relation` VALUES ('3856', '113', '1');
INSERT INTO `sys_relation` VALUES ('3857', '165', '1');
INSERT INTO `sys_relation` VALUES ('3858', '166', '1');
INSERT INTO `sys_relation` VALUES ('3859', '167', '1');
INSERT INTO `sys_relation` VALUES ('3860', '114', '1');
INSERT INTO `sys_relation` VALUES ('3861', '115', '1');
INSERT INTO `sys_relation` VALUES ('3862', '116', '1');
INSERT INTO `sys_relation` VALUES ('3863', '117', '1');
INSERT INTO `sys_relation` VALUES ('3864', '118', '1');
INSERT INTO `sys_relation` VALUES ('3865', '162', '1');
INSERT INTO `sys_relation` VALUES ('3866', '163', '1');
INSERT INTO `sys_relation` VALUES ('3867', '164', '1');
INSERT INTO `sys_relation` VALUES ('3868', '119', '1');
INSERT INTO `sys_relation` VALUES ('3869', '120', '1');
INSERT INTO `sys_relation` VALUES ('3870', '121', '1');
INSERT INTO `sys_relation` VALUES ('3871', '122', '1');
INSERT INTO `sys_relation` VALUES ('3872', '150', '1');
INSERT INTO `sys_relation` VALUES ('3873', '151', '1');
INSERT INTO `sys_relation` VALUES ('3874', '128', '1');
INSERT INTO `sys_relation` VALUES ('3875', '134', '1');
INSERT INTO `sys_relation` VALUES ('3876', '158', '1');
INSERT INTO `sys_relation` VALUES ('3877', '159', '1');
INSERT INTO `sys_relation` VALUES ('3878', '130', '1');
INSERT INTO `sys_relation` VALUES ('3879', '131', '1');
INSERT INTO `sys_relation` VALUES ('3880', '135', '1');
INSERT INTO `sys_relation` VALUES ('3881', '136', '1');
INSERT INTO `sys_relation` VALUES ('3882', '137', '1');
INSERT INTO `sys_relation` VALUES ('3883', '152', '1');
INSERT INTO `sys_relation` VALUES ('3884', '153', '1');
INSERT INTO `sys_relation` VALUES ('3885', '154', '1');
INSERT INTO `sys_relation` VALUES ('3886', '132', '1');
INSERT INTO `sys_relation` VALUES ('3887', '138', '1');
INSERT INTO `sys_relation` VALUES ('3888', '139', '1');
INSERT INTO `sys_relation` VALUES ('3889', '140', '1');
INSERT INTO `sys_relation` VALUES ('3890', '155', '1');
INSERT INTO `sys_relation` VALUES ('3891', '156', '1');
INSERT INTO `sys_relation` VALUES ('3892', '157', '1');
INSERT INTO `sys_relation` VALUES ('3893', '133', '1');
INSERT INTO `sys_relation` VALUES ('3894', '160', '1');
INSERT INTO `sys_relation` VALUES ('3895', '161', '1');
INSERT INTO `sys_relation` VALUES ('3896', '141', '1');
INSERT INTO `sys_relation` VALUES ('3897', '142', '1');
INSERT INTO `sys_relation` VALUES ('3898', '143', '1');
INSERT INTO `sys_relation` VALUES ('3899', '144', '1');
INSERT INTO `sys_relation` VALUES ('3900', '145', '1');
INSERT INTO `sys_relation` VALUES ('3901', '148', '1');
INSERT INTO `sys_relation` VALUES ('3902', '149', '1');
INSERT INTO `sys_relation` VALUES ('3903', '171', '1');
INSERT INTO `sys_relation` VALUES ('3904', '172', '1');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `num` int(11) DEFAULT NULL COMMENT '序号',
  `pid` int(11) DEFAULT NULL COMMENT '父角色id',
  `name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `deptid` int(11) DEFAULT NULL COMMENT '部门名称',
  `tips` varchar(255) DEFAULT NULL COMMENT '提示',
  `version` int(11) DEFAULT NULL COMMENT '保留字段(暂时没用）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '1', '0', '超级管理员', '24', 'administrator', '1');
INSERT INTO `sys_role` VALUES ('5', '2', '1', '临时', '26', 'temp', null);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像',
  `account` varchar(45) DEFAULT NULL COMMENT '账号',
  `password` varchar(45) DEFAULT NULL COMMENT '密码',
  `salt` varchar(45) DEFAULT NULL COMMENT 'md5密码盐',
  `name` varchar(45) DEFAULT NULL COMMENT '名字',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `sex` int(11) DEFAULT NULL COMMENT '性别（1：男 2：女）',
  `email` varchar(45) DEFAULT NULL COMMENT '电子邮件',
  `phone` varchar(45) DEFAULT NULL COMMENT '电话',
  `roleid` varchar(255) DEFAULT NULL COMMENT '角色id',
  `deptid` int(11) DEFAULT NULL COMMENT '部门id',
  `status` int(11) DEFAULT NULL COMMENT '状态(1：启用  2：冻结  3：删除）',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `version` int(11) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='管理员表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'girl.gif', 'admin', 'ecfadcde9305f8891bcfe5a1e28c253e', '8pgby', '张三', '2017-05-05 00:00:00', '2', 'sn93@qq.com', '18200000000', '1', '27', '1', '2016-01-29 08:49:53', '25');
INSERT INTO `sys_user` VALUES ('44', null, 'test', '45abb7879f6a8268f1ef600e6038ac73', 'ssts3', 'test', '2017-05-01 00:00:00', '1', 'abc@123.com', '', '5', '26', '3', '2017-05-16 20:33:37', null);
INSERT INTO `sys_user` VALUES ('45', null, 'boss', '71887a5ad666a18f709e1d4e693d5a35', '1f7bf', '老板999', '2017-12-04 00:00:00', '2', '2437766749@qq.com', '18895682833', '1', '26', '1', '2017-12-04 22:24:02', null);
INSERT INTO `sys_user` VALUES ('46', null, 'manager', 'b53cac62e7175637d4beb3b16b2f7915', 'j3cs9', '经理', '2017-12-04 00:00:00', '1', '', '', '1', '24', '1', '2017-12-04 22:24:24', null);
