package com.springinaction.training.dao.sqlmap;import java.util.Set;import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;import com.springinaction.training.dao.CourseDao;import com.springinaction.training.model.Course;public class CourseDaoSqlMap extends SqlMapClientDaoSupport    implements CourseDao {	  public void save(Course course) {    throw new RuntimeException("Method not implemented yet.");	}	public Course findById(Integer id) {    throw new RuntimeException("Method not implemented yet.");	}	public void update(Course course) {    throw new RuntimeException("Method not implemented yet.");	}  public Set findAll() {    throw new RuntimeException("Method not implemented yet.");  }  public int getEnrollment(Course course) {    throw new RuntimeException("Method not implemented yet.");  }}