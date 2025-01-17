package com.levmin.springbootshiro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SysPermission {
    @Id
    @GeneratedValue
    private Integer id; // 主键
    private String name; // 名称
    @Column(columnDefinition = "enum('menu','button')")
    private String resourceType; // 资源类型，[menu|button]
    private String url; // 资源路径
    private String permission; // 权限字符串
    // menu例子：role:*，button例子：role:create,role:update,role:delete,role:view
    private Long parentId; // 父编号
    private String parentIds; // 父编号列表
    private Boolean available = Boolean.FALSE;
    @ManyToMany
    @JoinTable(name = "SysRolePermission", joinColumns = {@JoinColumn(name = "permissionId")}, inverseJoinColumns = {@JoinColumn(name = "roleId")})
    private List<SysRole> roles;
}
