package com.boxing.boxingclub.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalTime;

/**
 * The @Entity make this class as a JPA entity, representing a database table
 * The {@code @Getter} annotations genrates a getter method for filed
 * The {@code @Setter} annotations genrates a setter method for field.
 * The {@code @NoArgsConstructor } annotations genrates a constructor with no parameters.
 * The {@code @Column} annotations allows the customization of column details, such as name and type.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name ="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *
     * <p>
     * Constraints
     * - Must not be empty
     * <p>
     */
    @NotBlank(message = "Username cannot be empty")
    private String userName;

    /**
     * <p>
     *  Constraints
     *-Must not be empty
     *<p>
     */
    @NotBlank(message = "Password can not be empty")
    private String password;

    /**
     * The local time of registration for the user.
     */
    @Column(name = "local_time",columnDefinition = "TIME")
    private LocalTime localTime=LocalTime.of(6,43,12);

    /**
     *
     * @param userName The username for creating the username
     * @param password The specific password for the user
     * @param localTime the local time for the registration of the user.
     */

    public User(String userName,String password,LocalTime localTime) {
    this.userName=userName;
    this.password=password;
    }

    /**
     * Gets the local time of registration for the user
     * @return the local time
     */
    public LocalTime getLocalTime() {
        return localTime;
    }

    /**
     * Sets the local time of registration for the user
     * @param localTime the local time to set.
     */

    public void setLocalTime(LocalTime localTime) {
        this.localTime=localTime;
    }



}
