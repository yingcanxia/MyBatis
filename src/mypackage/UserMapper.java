package mypackage;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	
	@Select("select * from user where id=#{id}")
	public User selectone(String id);
	
}
