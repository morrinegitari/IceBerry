package com.morrine.iceberry.repository

import com.morrine.iceberry.data.UserDao
import com.morrine.iceberry.model.User

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}