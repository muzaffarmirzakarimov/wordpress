package com.example.examplewordpres.entity;

import com.example.examplewordpres.entity.enums.RoleEnum;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Employe {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @NotBlank(message = "Ismingizni to'liq kiriting")
    private String employename;

    @Size(max = 8,min = 6)
    private String employepassword;

    @Email
    private String employeemail;

    @Enumerated(EnumType.STRING)
    private RoleEnum roleEnum;

}
