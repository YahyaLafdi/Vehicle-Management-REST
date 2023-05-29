package com.yahya.parkingmanaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })

public class ParkingManageingApplication {
/*
    private final UserRoleService userRoleService;
    private final UserService userService;

*/

    public static void main(String[] args) {
        SpringApplication.run(ParkingManageingApplication.class, args);
    }

  /*  @Override
    public void run(String... args) {
        userRoleService.save(new UserRole());
        managerRoleService.save(new ManagerRole());
        adminRoleService.save(new AdminRole());
        devRoleService.save(new DevRole());
        try {
            userService.saveAdmin();
            userService.saveDev();
            userService.saveManager();
            userService.saveDriver();
            log.info(CoreConstant.Success.USER_ROLE_CREATED_SUCCESSFULLY);
        } catch (ElementAlreadyExistException ex) {
            log.info(CoreConstant.Exception.ADMIN_ACCOUNT_ALREADY_CREATED);
        }

    }*/


}
