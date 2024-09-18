package com.levmin.springbootshiro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String userName;
    private String name;
    private String password;
    private String salt;
    private byte statu;
    @ManyToMany(fetch = FetchType.EAGER) // 立即从数据库中进行加载数据
    @JoinTable(name = "SysUserRole", joinColumns = {@JoinColumn(name = "uid")}, inverseJoinColumns = {@JoinColumn(name = "roleId")})
    private List<SysRole> roleList;

    public byte[] getCredentialsSalt() {
       return (userName+salt).getBytes();
    }
}
