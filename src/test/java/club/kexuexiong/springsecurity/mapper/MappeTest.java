package club.kexuexiong.springsecurity.mapper;

import club.kexuexiong.springsecurity.entities.VO.UserVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MappeTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void findByusername(){
        UserVO vo = userMapper.findByUsername("lisi");

        System.err.println(vo);
    }
}
