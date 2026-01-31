package com.yukrant.ecommerce.service;

import com.yukrant.ecommerce.dto.request.RegisterRequest;
import com.yukrant.ecommerce.dto.response.UserResponse;

public interface UserService {

    UserResponse register(RegisterRequest request);
}
