package com.fashion.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(nullable = false)
    private String customerName;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column
    private String gender;
    @Column
    private String preferredCategory;

}
