

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    `id` varchar(50) NOT NULL COMMENT '用户ID',
    `username` varchar(50) NOT NULL COMMENT '用户名',
    `password` varchar(50) NOT NULL COMMENT '密码',
    `avatar` varchar(100) NULL DEFAULT NULL COMMENT '头像',
    `phone` varchar(50) NULL DEFAULT NULL COMMENT '电话',
    `sex` tinyint(4)  NULL DEFAULT NULL COMMENT '性别(1.男 2.女)',
    `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
    `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    UNIQUE INDEX `phone`(`phone`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Compact;
