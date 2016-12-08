/**
 * Project Name:security.basic
 * Package Name:cn.stackbox.demo.entity
 * Date: 2016-12-08 23:27
 */
package cn.stackbox.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * ClassName: Account <br/>
 * Reason: SomeReason <br/>
 * Date: 2016-12-08 23:27
 *
 * @author SRK.Lyu
 */
@Entity
@Table(name = "t_account")
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String telephone;

    @Column(unique = true)
    private String email;

    private String password;

    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
