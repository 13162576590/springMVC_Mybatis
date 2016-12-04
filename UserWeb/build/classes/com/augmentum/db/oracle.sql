--oracle

create table t_users(
	id number(5) primary key,
	name varchar2(20),
	address varchar2(40)
);

2、创建自动增长序列
 
 CREATE SEQUENCE t_users_Sequence
 INCREMENT BY 1   -- 每次加几个  
     START WITH 1     -- 从1开始计数  
     NOMAXVALUE       -- 不设置最大值  ，设置最大值：maxvalue 9999
     NOCYCLE          -- 一直累加，不循环  
     CACHE 10; 
 
3、创建触发器
 
CREATE TRIGGER t_users BEFORE
insert ON  t_users FOR EACH ROW          /*对每一行都检测是否触发*/
begin
select t_users_Sequence.nextval into:New.id from dual;
end;
/      
/*退出sqlplus行编辑*/
 
4、提交
 
commit;
5、测试

col id for 9999;
col name for a10;
col address for a20;

 
insert into t_users(name, address) values('test', '金科路');