package com.boredapp.relational;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Optional;

import com.boredapp.relational.repositories.ActivityRepository;
import com.boredapp.relational.repositories.RatingRepository;
import com.boredapp.relational.repositories.UserRespository;
import com.boredapp.relational.tables.Activity;
import com.boredapp.relational.tables.User;
import com.boredapp.relational.tables.Rating;
import java.util.ArrayList;


@SpringBootApplication
public class TestSQL {
    private static final Logger log = LoggerFactory.getLogger(TestSQL.class);
    
    public static void main(String[] args) {
        SpringApplication.run(TestSQL.class, args);
    }

    @Bean
    public CommandLineRunner showActivities(ActivityRepository repository) {
    return (args) -> {
      
      // fetch all activities
      log.info("Activities found with findAll():");
      log.info("-------------------------------");
      repository.findAll().forEach((activity) -> {
        log.info(activity.toString());
      });
      log.info("-------------------------------");
    };
  }

  
  @Bean
  public CommandLineRunner addActivities(UserRespository usrRepo, ActivityRepository actRepo) {
    return (args) -> {
      log.info("Add...");
      log.info("-------------------------------");
      ArrayList<Activity> activities = new ArrayList<Activity>();
      actRepo.findAll().forEach((activity) -> {
        activities.add(activity);
      });
      
      Optional<User> user = usrRepo.findById((long)1);
      User u = user.orElse(new User());
      u.setActivities(activities);
      
      System.out.println("Here is the user and all the activities: " + u);
    };
  }

  @Bean
  public CommandLineRunner testRating(ActivityRepository actRepo, RatingRepository respository) {
    return (args) -> {
      log.info("Testing Rating...");
      log.info("-------------------------------");

      Activity activity = actRepo.getById((long)3);
      ArrayList<Rating> ratings = new ArrayList<Rating>();
      Rating r1 = new Rating();
      r1.setValue(3);
      Rating r2 = new Rating();
      r2.setValue(5);
      ratings.add(r1);
      ratings.add(r2);
      //activity.setRatings(ratings);

      System.out.println("Ratings: " + ratings);

    };
  }



  
  
}
