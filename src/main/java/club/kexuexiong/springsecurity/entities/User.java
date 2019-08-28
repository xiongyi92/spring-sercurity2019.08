package club.kexuexiong.springsecurity.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hw
 */
@Data
public class User implements Serializable {
   private Integer id;
   private String name;
   private  String password;

}
