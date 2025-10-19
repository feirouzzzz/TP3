package com.example.presentation;

import com.example.metier.IMetier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = { "com.example.dao", "com.example.metier", "com.example.config" })
public class presentation2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        // Activer le profil dev pour DaoImpl2
        ctx.getEnvironment().setActiveProfiles("dev"); // <- ici

        ctx.register(presentation2.class);
        ctx.refresh();

        IMetier metier = ctx.getBean(IMetier.class);
        System.out.println("Résultat = " + metier.calcul());
        ctx.close();
    }
}
