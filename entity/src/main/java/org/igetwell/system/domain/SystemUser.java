package org.igetwell.system.domain;

import org.igetwell.common.core.SerializableModel;
import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.Date;

public class SystemUser extends SerializableModel implements CredentialsContainer {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户手机号
     */
    private Long phone;

    /**
     * 账户是否过期
     */
    private Boolean accountNonExpired;

    /**
     * 账户是否锁定
     */
    private Boolean accountNonLocked;

    /**
     * 凭证是否过期
     */
    private Boolean credentialsNonExpired;

    /**
     * 账户启用状态
     */
    private Boolean enabled;

    /**
     * 用户最后登录时间
     */
    private Date lastTime;

    /**
     * 登录次数大于3次锁定
     */
    private Integer attempts;

    /**
     * 职位编号
     */
    private Integer systemPositionId;

    //private Collection<? extends GrantedAuthority> authorities;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }



    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取用户邮箱
     *
     * @return email - 用户邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置用户邮箱
     *
     * @param email 用户邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取用户手机号
     *
     * @return phone - 用户手机号
     */
    public Long getPhone() {
        return phone;
    }

    /**
     * 设置用户手机号
     *
     * @param phone 用户手机号
     */
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    /**
     * 获取账户是否过期
     *
     * @return account_non_expired - 账户是否过期
     */
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    /**
     * 设置账户是否过期
     *
     * @param accountNonExpired 账户是否过期
     */
    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    /**
     * 获取账户是否锁定
     *
     * @return account_non_locked - 账户是否锁定
     */
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    /**
     * 设置账户是否锁定
     *
     * @param accountNonLocked 账户是否锁定
     */
    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    /**
     * 获取凭证是否过期
     *
     * @return credentials_non_expired - 凭证是否过期
     */
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    /**
     * 设置凭证是否过期
     *
     * @param credentialsNonExpired 凭证是否过期
     */
    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    /**
     * 获取账户启用状态
     *
     * @return enabled - 账户启用状态
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * 设置账户启用状态
     *
     * @param enabled 账户启用状态
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取用户最后登录时间
     *
     * @return last_time - 用户最后登录时间
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * 设置用户最后登录时间
     *
     * @param lastTime 用户最后登录时间
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * 获取登录次数大于3次锁定
     *
     * @return attempts - 登录次数大于3次锁定
     */
    public Integer getAttempts() {
        return attempts;
    }

    /**
     * 设置登录次数大于3次锁定
     *
     * @param attempts 登录次数大于3次锁定
     */
    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    /**
     * 获取职位编号
     *
     * @return system_position_id - 职位编号
     */
    public Integer getSystemPositionId() {
        return systemPositionId;
    }

    /**
     * 设置职位编号
     *
     * @param systemPositionId 职位编号
     */
    public void setSystemPositionId(Integer systemPositionId) {
        this.systemPositionId = systemPositionId;
    }

    /*@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
*/
    @Override
    public void eraseCredentials() {

    }

    public SystemUser() {
    }

    public SystemUser(Integer id, String username, String password, String email, Long phone, Boolean accountNonExpired, Boolean accountNonLocked, Boolean credentialsNonExpired, Boolean enabled, Date lastTime, Integer attempts) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.accountNonExpired = accountNonExpired;
        this.accountNonLocked = accountNonLocked;
        this.credentialsNonExpired = credentialsNonExpired;
        this.enabled = enabled;
        this.lastTime = lastTime;
        this.attempts = attempts;
    }

    public SystemUser(Integer id, String username, String password, boolean enabled,
                      boolean accountNonExpired, boolean credentialsNonExpired,
                      boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {

        if (((username == null) || "".equals(username)) || (password == null)) {
            throw new IllegalArgumentException(
                    "Cannot pass null or empty values to constructor");
        }
        this.id = id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.accountNonExpired = accountNonExpired;
        this.credentialsNonExpired = credentialsNonExpired;
        this.accountNonLocked = accountNonLocked;
        //this.authorities = authorities;
    }
}