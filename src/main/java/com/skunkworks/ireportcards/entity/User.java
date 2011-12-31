package com.skunkworks.ireportcards.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.NotNull;

@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 8496087166198616020L;
    private String userId;
    private String userName;
    private Integer age;
 
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")

    public String getUserId() {
        return userId;
    }
    @NotNull
    public void setUserId(String userId) {
        this.userId = userId;
    }

	@Column(name = "USER_NAME", nullable=false)
    public String getUserName() {
        return userName;
    } 
	@NotNull
    public void setUserName(String userName) {
        this.userName = userName;
    }

	@Column(name = "AGE")
    public Integer getAge() {
        return age;
    }
	@NotNull
    public void setAge(Integer age) {
        this.age = age;
    }

}

