package lk.mealmate.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
@Table(name = "recipe")
public class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipeId")
    private Long id;

    // @Column(unique = true)
    // private String recipeID;
    
    @Column(unique = true)
    private String recipeName;

    // @Column(unique = true)
    // private String userID;

    // @Column(unique = true)
    // private String adminId;

    @Column(unique = true)
    private String instructions;

    @Column(unique = true)
    private String ingredients;

    // relationships

    @ManyToOne
    @JoinColumn(name = "adminId")
    private Admin adminEntity;

    @ManyToOne
    @JoinColumn(name = "rateId")
    private RatingsEntity ratingsEntity;

    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity userEntity;
}