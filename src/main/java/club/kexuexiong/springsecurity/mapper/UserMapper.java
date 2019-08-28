package club.kexuexiong.springsecurity.mapper;

import club.kexuexiong.springsecurity.entities.VO.UserVO;

/**
 * @author hw
 */
public interface UserMapper {
    /**
     * 查找用户名的名字，密码，角色等
     * @param name
     * @return
     */
    UserVO findByUsername(String name);
}
