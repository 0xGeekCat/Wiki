drop table if exists `test`;

create table `test` (
    `id` bigint not null comment 'ID',
    `name` varchar(50) comment '名称',
    `password` varchar(50) comment '密码',
    primary key(`id`)
) engine=InnoDB default charset=utf8mb4 comment='测试';
