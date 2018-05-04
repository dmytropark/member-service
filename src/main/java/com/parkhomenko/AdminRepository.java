/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parkhomenko;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author dmytro
 */
public interface AdminRepository extends MongoRepository<Admin, String> {
    Admin findByLogin(String login);
    Admin findByToken(String token);
}