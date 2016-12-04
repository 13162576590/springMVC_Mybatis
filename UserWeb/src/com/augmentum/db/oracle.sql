--oracle

create table t_users(
	id number(5) primary key,
	name varchar2(20),
	address varchar2(40)
);

2�������Զ���������
 
 CREATE SEQUENCE t_users_Sequence
 INCREMENT BY 1   -- ÿ�μӼ���  
     START WITH 1     -- ��1��ʼ����  
     NOMAXVALUE       -- ���������ֵ  ���������ֵ��maxvalue 9999
     NOCYCLE          -- һֱ�ۼӣ���ѭ��  
     CACHE 10; 
 
3������������
 
CREATE TRIGGER t_users BEFORE
insert ON  t_users FOR EACH ROW          /*��ÿһ�ж�����Ƿ񴥷�*/
begin
select t_users_Sequence.nextval into:New.id from dual;
end;
/      
/*�˳�sqlplus�б༭*/
 
4���ύ
 
commit;
5������

col id for 9999;
col name for a10;
col address for a20;

 
insert into t_users(name, address) values('test', '���·');