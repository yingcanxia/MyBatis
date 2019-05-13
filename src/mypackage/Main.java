package mypackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Main {
	public static void main(String[] args) {
		try {
			UserMapper mapper = getSession().getMapper(UserMapper.class);
			User user=mapper.selectone("1");
			System.out.println(user.getUsername());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static SqlSession getSession() throws FileNotFoundException {
		InputStream configFile=new FileInputStream(new File("E:\\experiment\\MyBatis\\src\\conf\\mybatis-config.xml"));
		
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(configFile);
		return factory.openSession();
	}
}
