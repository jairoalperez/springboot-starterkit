package com.starterkit.springboot.brs;

import com.starterkit.springboot.brs.dto.mapper.BootcampMapper;
import com.starterkit.springboot.brs.model.bootcamp.Bootcamp;
import com.starterkit.springboot.brs.model.bootcamp.Technology;
import com.starterkit.springboot.brs.model.bus.*;
import com.starterkit.springboot.brs.model.user.*;
import com.starterkit.springboot.brs.repository.bootcamp.BootcampRepository;
import com.starterkit.springboot.brs.repository.bus.*;
import com.starterkit.springboot.brs.repository.user.ProfileRepository;
import com.starterkit.springboot.brs.repository.user.RoleRepository;
import com.starterkit.springboot.brs.repository.user.UserRepository;
import com.starterkit.springboot.brs.util.DateUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.*;

@SpringBootApplication
public class BusReservationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusReservationSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ProfileRepository profileRepository, BootcampRepository bootcampRepository, RoleRepository roleRepository, UserRepository userRepository,
                           StopRepository stopRepository, AgencyRepository agencyRepository,
                           BusRepository busRepository, TripRepository tripRepository,
                           TripScheduleRepository tripScheduleRepository) {


        return args -> {


            if(true){

                Technology technology = new Technology();



                List<Bootcamp> bootcamps =  bootcampRepository.findByName("Full Stack Java");
                if(bootcamps.size() < 1){
                    // we need to make one as it is zero
                    Bootcamp bootcamp = new Bootcamp();
                    bootcamp.setDescription("seome desc")
                            .setEndDate(new Date())
                            .setName("Full Stack Java")
                            .setLongHtml("some long html")
                            .setEndDate(new Date());



                }

            }


            if(false){

                Role participantRole = roleRepository.findByRole("PARTICIPANT");
                if (participantRole == null) {
                    participantRole = new Role();
                    participantRole.setRole("PARTICIPANT");
                    roleRepository.save(participantRole);
                }
                HashSet<Role> roles = new HashSet<>();
                roles.add(participantRole);
                   User user = new User();
                   HashSet<UserProfile> userProfiles =new HashSet<>();

                   UserProfile userProfile = new UserProfile();
                   userProfile.setName("dheeraj.singh@snva.com");


                HashSet<Experience> experiences = new HashSet<>();

                experiences.add(new Experience()
                        .setName("Software Developer Intern")
                        .setDescription("As a a developer i used to wbdkfkasjfkasfgsdjfklg")
                        .setYears(1.5f));

                HashSet<Education> educations = new HashSet<>();
                educations.add(
                        new Education()
                                .setName("HighSchool")
                                .setCity("Some city")
                                .setCountry("USA")
                                .setUniversity("Some University")
                                .setState("Some state")
                );

                HashSet<Skill> skills = new HashSet<>();
                skills.add(
                        new Skill()
                                .setSkillName("Java")
                                .setProficieny(5)
                                .setCertificationLink("some cert links")


                );
                HashSet<Project> projects= new HashSet<>();
                projects.add(
                        new Project()
                                .setName("The Apirio")
                                .setRoles("I was just a beginner i used to manage the docs")
                                .setTeamSize(5)
                                .setDetails("some lengthy details")
                                .setResponsibilities("Some responsibilities")
                                .setTechStack("MERN Stack")

                );

                userProfile.setSkills(skills);
                userProfile.setEducation(educations);
                userProfile.setProjects(projects);
                userProfile.setExperience(experiences);


                userProfile= profileRepository.save(userProfile);

                System.out.println("The Profile was created !!!!!!!!!!!!!");

                   user.setFirstName("Dheeraj");
                    user.setLastName("Singh");
                    user.setEmail("dheeraj.singh@snva.com");
                    user.setRoles(roles);
                    user.setMobileNumber("+1 111 11111");
                    user.setAddress("SOme Address USA ");
                    user.setPassword(new BCryptPasswordEncoder().encode("123456")) ;// "123456";
                    user.setProfilePicture("");
                    userProfiles.add(userProfile);
                    user.setUserProfiles(userProfiles);

                System.out.println("The User was created !!!!!!!!!!!!!"+ userRepository.save(user));
            }

            if (false){











                Role participantRole = roleRepository.findByRole("PARTICIPANT");
                if (participantRole == null) {
                    participantRole = new Role();
                    participantRole.setRole("PARTICIPANT");
                    roleRepository.save(participantRole);
                }
                User admin = userRepository.findByEmail("dheeraj1@gmail.com");
                if (admin == null) {

                    Set<UserProfile> userProfiles = new HashSet<>();
                    UserProfile userProfile = new UserProfile("dheeraj1@gmail.com");


                    Experience experience = new Experience();
                    experience.setYears(2);
                    experience.setName("Developer Experience");

                    Project project = new Project();
                    project.setResponsibilities("team lead developing prodctus");
                    project.setTechStack("SPRING BOOT REACT");
                    project.setRoles("Lead");
                    project.setResponsibilities("fjsfdlkjgfsldkjglksjfdg");
                    project.setDetails("some Details");


                    Education education = new Education();
                    education.setCity("education city");
                    education.setCountry("education country");
                    education.setName("Greaducation");
                    education.setUniversity("Some University");


                Set<Education> educations = new HashSet<>();
                Set<Experience> experiences = new HashSet<>();
                Set<Project> projects = new HashSet<>();

                educations.add(education);
                experiences.add(experience);
                projects.add(project);

                    Optional<UserProfile> userProfileOptional= profileRepository.findByName("dheeraj1@gmail.com"+"p1");
                    if (!userProfileOptional.isPresent()){
                         userProfile = new UserProfile("dheeraj1@gmail.com");
                        userProfile.setStackOverflow("Stack");
                        userProfile.setExperience(experiences);
                        userProfile.setGithub("github");
                        userProfile.setProjects(projects);
                        userProfile.setLinkedIn("Linked in ");
                        userProfile.setName("dheeraj1@gmail.com"+"p1");
                        userProfile.setEducation(educations);
                        userProfile = profileRepository.save(userProfile);
                    }
                    userProfiles.add(userProfile);
                    admin = new User()
                            .setEmail("dheeraj1@gmail.com")
                            .setPassword(new BCryptPasswordEncoder().encode("123456")) // "123456"
                            .setFirstName("Dheeraj")
                            .setLastName("Singh")
                            .setMobileNumber("123456789")
                            .setProfilePicture("https://avatars.githubusercontent.com/u/32265439?v=4")
                            .setUserProfiles(userProfiles)
                            .setRoles(new HashSet<>(Arrays.asList(participantRole)));
                    userRepository.save(admin);
                }




            }else {


                //Create Admin and Passenger Roles
                Role adminRole = roleRepository.findByRole("ADMIN");
                if (adminRole == null) {
                    adminRole = new Role();
                    adminRole.setRole("ADMIN");
                    roleRepository.save(adminRole);
                }



                Role userRole = roleRepository.findByRole("PASSENGER");
                if (userRole == null) {
                    userRole = new Role();
                    userRole.setRole("PASSENGER");
                    roleRepository.save(userRole);
                }

                //Create an Admin user
                User admin = userRepository.findByEmail("admin.agencya@gmail.com");
                if (admin == null) {
                    admin = new User()
                            .setEmail("admin.agencya@gmail.com")
                            .setPassword("$2a$10$7PtcjEnWb/ZkgyXyxY1/Iei2dGgGQUbqIIll/dt.qJ8l8nQBWMbYO") // "123456"
                            .setFirstName("John")
                            .setLastName("Doe")
                            .setMobileNumber("9425094250")
                            .setRoles(new HashSet<>(Arrays.asList(adminRole)));
                    userRepository.save(admin);
                }

                //Create four stops
                Stop stopA = stopRepository.findByCode("STPA");
                if (stopA == null) {
                    stopA = new Stop()
                            .setName("Stop A")
                            .setDetail("Near hills")
                            .setCode("STPA");
                    stopRepository.save(stopA);
                }

                Stop stopB = stopRepository.findByCode("STPB");
                if (stopB == null) {
                    stopB = new Stop()
                            .setName("Stop B")
                            .setDetail("Near river")
                            .setCode("STPB");
                    stopRepository.save(stopB);
                }

                Stop stopC = stopRepository.findByCode("STPC");
                if (stopC == null) {
                    stopC = new Stop()
                            .setName("Stop C")
                            .setDetail("Near desert")
                            .setCode("STPC");
                    stopRepository.save(stopC);
                }

                Stop stopD = stopRepository.findByCode("STPD");
                if (stopD == null) {
                    stopD = new Stop()
                            .setName("Stop D")
                            .setDetail("Near lake")
                            .setCode("STPD");
                    stopRepository.save(stopD);
                }

                //Create an Agency
                Agency agencyA = agencyRepository.findByCode("AGENCYA");
                if (agencyA == null) {
                    agencyA = new Agency()
                            .setName("Green Mile Agency")
                            .setCode("AGENCYA")
                            .setDetails("Reaching desitnations with ease")
                            .setOwner(admin);
                    agencyRepository.save(agencyA);
                }

                //Create a bus
                Bus busA = busRepository.findByCode("AGENCYA-1");
                if (busA == null) {
                    busA = new Bus()
                            .setCode("AGENCYA-1")
                            .setAgency(agencyA)
                            .setCapacity(60);
                    busRepository.save(busA);
                }

                //Add busA to set of buses owned by Agency 'AGENCYA'
                if (agencyA.getBuses() == null) {
                    Set<Bus> buses = new HashSet<>();
                    agencyA.setBuses(buses);
                    agencyA.getBuses().add(busA);
                    agencyRepository.save(agencyA);
                }

                //Create a Trip
                Trip trip = tripRepository.findBySourceStopAndDestStopAndBus(stopA, stopB, busA);
                if (trip == null) {
                    trip = new Trip()
                            .setSourceStop(stopA)
                            .setDestStop(stopB)
                            .setBus(busA)
                            .setAgency(agencyA)
                            .setFare(100)
                            .setJourneyTime(60);
                    tripRepository.save(trip);
                }

                //Create a trip schedule
                TripSchedule tripSchedule = tripScheduleRepository.findByTripDetailAndTripDate(trip, DateUtils.todayStr());
                if (tripSchedule == null) {
                    tripSchedule = new TripSchedule()
                            .setTripDetail(trip)
                            .setTripDate(DateUtils.todayStr())
                            .setAvailableSeats(trip.getBus().getCapacity());
                    tripScheduleRepository.save(tripSchedule);
                }
            }
        };
    }
}
