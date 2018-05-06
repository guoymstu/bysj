
--显示数据库表
show tables
--查询教师用户
SELECT tuser.id, tuser.role, tuser.username, tuser.uid, tuser.block, 
	   teacher.sex, teacher.telnum, teacher.mail, teacher.address
FROM tb_teacher teacher LEFT JOIN tb_user tuser	ON teacher.id=tuser.uid
WHERE 1=1 AND teacher.id LIKE '%9980%' OR teacher.NAME LIKE '%9980%'
LIMIT 0,100;

--查询学生用户
SELECT tuser.id, tuser.role, tuser.username, tuser.uid, tuser.block, 
	   student.sex, student.telnum, student.mail, student.address
FROM tb_student student 
LEFT JOIN tb_user tuser	ON student.id=tuser.uid
WHERE 1=1 AND student.id LIKE '%9980%' OR student.NAME LIKE '%9980%'
LIMIT 0,100;
---删除前n条记录
DELETE FROM tb_user LIMIT 10
--查询一个表的所有字段
 select  COLUMN_NAME from information_schema.COLUMNS WHERE table_name='tb_course'
 --学生选课
SELECT	temp3.*,	teacher.name FROM	gx_teacourse gx
LEFT JOIN tb_teacher teacher ON teacher.id = gx.teaID
LEFT JOIN (SELECT	* FROM	(
	SELECT	course.*,	ifnull( countSel, 0 ) AS countsel,CASE	WHEN ifnull( countSel, 0 ) < countstu THEN '1' ELSE '0' END AS STATUS 
  FROM
	tb_course course
	LEFT JOIN ( SELECT courseID, count( courseID ) AS countSel FROM gx_stucourse GROUP BY courseID ) temp ON course.id = temp.courseID 
	) temp2 #
WHERE
	1 = 1 
	) temp3 ON gx.courseID = temp3.id
	where gx.courseid not in (
	SELECT courseId FROM gx_stucourse WHERE stuID = '5001140010' 
	)
	and temp3.id like '%vo4zlt2vjs%'
--学生自选课程
SELECT course.*,teacher.name FROM gx_stucourse gx left join tb_course course on course.id=gx.courseID
left join gx_teacourse gx2 on course.id=gx2.courseID
left join tb_teacher teacher on teacher.id=gx2.teaID
where gx.stuID='5001140010'