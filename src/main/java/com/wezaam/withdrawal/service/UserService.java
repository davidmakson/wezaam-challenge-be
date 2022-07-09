package com.wezaam.withdrawal.service;

import com.wezaam.withdrawal.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {

  List<User> findAll();
  Optional<User> findById(Long id);

}
