package org.growUpToMiddle.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.annotations.NotFound;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "cars")
@ToString(exclude = "cars")
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    @NotEmpty(message = "Должно быть заполнено")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty(message = "Должно быть заполнено")
    private String lastName;

    @NotEmpty(message = "Должно быть заполнено")
    @Email
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.DETACH, orphanRemoval = true)
    private List<Car> cars;
}

