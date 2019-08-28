package club.kexuexiong.springsecurity.entities.VO;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author hw
 */
@Data
public class UserVO implements Serializable {
private  Integer id;
private  String username;
private  String password;
private List<String> roles;


}
