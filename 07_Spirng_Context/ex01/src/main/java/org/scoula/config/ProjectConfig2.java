package org.scoula.config;

@Configuration
public class ProjectConfig2 {
    @Bean
    Parrot parrot1()
    {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean
    Parrot parrot2()
    {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }
    @Bean
    Parrot parrot3()
    {
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }
}
