/*�����ͻ���*/
CREATE TABLE cst_customer
(	cust_id bigint(32) NOT null AUTO_INCREMENT COMMENT '�ͻ���ţ�������',
	cust_name varchar(32) NOT null COMMENT '�ͻ����ƣ���˾���ƣ�',
	cust_source VARCHAR(32) DEFAULT NULL COMMENT '�ͻ���Ϣ��Դ',
	cust_industry varchar(32)DEFAULT NULL COMMENT '�ͻ�������ҵ',
	cust_level varchar(32) DEFAULT NULL COMMENT '�ͻ�����',
	cust_address varchar(128) DEFAULT NULL COMMENT '�ͻ���ϵ��ַ',
	cust_phone varchar(64) DEFAULT NULL COMMENT '�ͻ���ϵ�绰',
	PRIMARY KEY (cust_id)
)ENGINE=InnoDB AUTO_INCREMENT=94 DEFAULT CHARSET=utf8;

/*������ϵ�˱�*/
CREATE TABLE cst_linkman
( lkm_id bigint(32) NOT NULL AUTO_INCREMENT COMMENT '��ϵ�˱�ţ�������',
	lkm_name varchar(16) DEFAULT NULL COMMENT '��ϵ������',
	lkm_gender char(1) DEFAULT NULL COMMENT '��ϵ���Ա�',
	lkm_phone varchar(16) DEFAULT NULL COMMENT '��ϵ�˰칫�绰',
	lkm_mobile varchar(16) DEFAULT NULL COMMENT '��ϵ���ֻ�',
	lkm_email varchar(64) DEFAULT NULL COMMENT '��ϵ������',
	lkm_position varchar(16) DEFAULT NULL COMMENT '��ϵ��ְλ',
	PRIMARY KEY (lkm_id)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=UTF8;